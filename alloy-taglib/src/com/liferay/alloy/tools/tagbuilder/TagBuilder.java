package com.liferay.alloy.tools.tagbuilder;

import com.liferay.alloy.tools.model.Attribute;
import com.liferay.alloy.tools.model.Component;
import com.liferay.alloy.util.TypeUtil;
import com.liferay.portal.freemarker.FreeMarkerUtil;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.xml.Document;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.kernel.xml.Node;
import com.liferay.portal.kernel.xml.SAXReaderUtil;
import com.liferay.portal.kernel.xml.XPath;
import com.liferay.portal.util.FileImpl;
import com.liferay.portal.util.PropsImpl;
import com.liferay.portal.xml.SAXReaderImpl;

import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="TagBuilder.java.html"><b><i>View Source</i></b></a>
 *
 * @author Eduardo Lundgren
 * @author Bruno Basto
 */
public class TagBuilder {

	public static final String[] DEFAULT_AUTHORS = new String[] {
		"Eduardo Lundgren", "Bruno Basto", "Nathan Cavanaugh"
	};

	public static void main(String[] args) throws Exception {
		String componentsXML = System.getProperty("tagbuilder.components.xml");
		String copyrightYear = System.getProperty("tagbuilder.copyright.year");
		String jspParentDir = System.getProperty("tagbuilder.jsp.parent.dir");
		String javaDir = System.getProperty("tagbuilder.java.dir");
		String javaPackage = System.getProperty("tagbuilder.java.package");
		String jspCommonInitPath = System.getProperty(
			"tagbuilder.jsp.common.init.path");
		String jspDir = System.getProperty("tagbuilder.jsp.dir");
		String OSGIModuleSymbolicName = System.getProperty(
			"tagbuilder.osgi.module.symbolic.name");
		String templatesDir = System.getProperty("tagbuilder.templates.dir");
		String tldDir = System.getProperty("tagbuilder.tld.dir");

		Calendar calendar = Calendar.getInstance();

		_copyrightYear = String.valueOf(calendar.get(Calendar.YEAR));

		if (Validator.isNotNull(copyrightYear)) {
			_copyrightYear = copyrightYear;
		}

		new TagBuilder(
			componentsXML, templatesDir, javaDir, jspParentDir, javaPackage,
			jspDir, jspCommonInitPath, OSGIModuleSymbolicName, tldDir);
	}

	public TagBuilder(
			String componentsXML, String templatesDir, String javaDir,
			String jspParentDir, String javaPackage, String jspDir,
			String jspCommonInitPath, String OSGIModuleSymbolicName,
			String tldDir)
		throws Exception {

		if (FileUtil.getFile() == null) {
			(new FileUtil()).setFile(new FileImpl());
		}

		if (PropsUtil.getProps() == null) {
			PropsUtil.setProps(new PropsImpl());
		}

		if (SAXReaderUtil.getSAXReader() == null) {
			(new SAXReaderUtil()).setSAXReader(new SAXReaderImpl());
		}

		_componentsXML = Arrays.asList(StringUtil.split(componentsXML));
		_templatesDir = templatesDir;
		_javaDir = javaDir;
		_jspParentDir = jspParentDir;
		_javaPackage = javaPackage;
		_jspDir = jspDir;
		_jspCommonInitPath = jspCommonInitPath;
		_OSGIModuleSymbolicName = OSGIModuleSymbolicName;
		_tldDir = tldDir;

		_tplCommonInitJsp = _templatesDir + "common_init_jsp.ftl";
		_tplEndJsp = _templatesDir + "end_jsp.ftl";
		_tplInitJsp = _templatesDir + "init_jsp.ftl";
		_tplJsp = _templatesDir + "jsp.ftl";
		_tplStartJsp = _templatesDir + "start_jsp.ftl";
		_tplServletContextUtil = _templatesDir + "servlet_context_util.ftl";
		_tplTag = _templatesDir + "tag.ftl";
		_tplTagBase = _templatesDir + "tag_base.ftl";
		_tplTld = _templatesDir + "tld.ftl";

		_componentsExtDoc = new ArrayList<Document>();

		for (String componentExtXML : _componentsXML) {
			File extFile = new File(componentExtXML);

			if (extFile.exists()) {
				_componentsExtDoc.add(SAXReaderUtil.read(extFile));
			}
		}

		_create();
	}

	protected List<Component> getAllComponents() throws Exception {
		Document doc = SAXReaderUtil.createDocument();

		Document taglibsDoc = SAXReaderUtil.read("<taglibs></taglibs>");

		Element root = taglibsDoc.getRootElement();

		for (Document extDoc : _componentsExtDoc) {
			Element extRoot = extDoc.getRootElement();

			boolean OSGIModule = GetterUtil.getBoolean(
				extRoot.attributeValue("osgi-module"));

			String extComponentTaglibOSGIModule = String.valueOf(OSGIModule);

			String defaultPackage = extRoot.attributeValue("short-name");
			List<Element> extComponentNodes = extRoot.elements("component");

			for (Element extComponent : extComponentNodes) {
				extComponent.addAttribute(
					"componentTaglibOSGIModule", extComponentTaglibOSGIModule);

				String extComponentPackage = GetterUtil.getString(
					extComponent.attributeValue("package"), defaultPackage);

				extComponent.addAttribute("package", extComponentPackage);
			}

			Document parentDoc = getComponentsDocByShortName(
				extDoc.getRootElement().attributeValue("extends"));

			if (parentDoc != null) {
				extDoc = mergeXMLAttributes(extDoc, parentDoc);
			}

			Element authors = extRoot.element(_AUTHORS);

			List<Element> components = extRoot.elements("component");

			for (Element component : components) {
				Element copy = component.createCopy();
				Element componentAuthors = copy.element("authors");

				if ((authors != null) && (componentAuthors == null)) {
					copy.add(authors.createCopy());
				}

				root.add(copy);
			}
		}

		doc.add(root.createCopy());

		return getComponents(doc);
	}

	protected List<Attribute> getAttributes(Element componentNode) {
		return getAttributes(componentNode, "attributes", "attribute");
	}

	protected List<Attribute> getAttributes(
		Element componentNode, String group, String nodeName) {

		List<Element> nodes = Collections.emptyList();

		List<Attribute> attributes = new ArrayList<Attribute>();

		Element node = componentNode.element(group);

		if (node != null) {
			nodes = node.elements(nodeName);
		}

		for (Element attributeNode : nodes) {
			String defaultValue = attributeNode.elementText("defaultValue");
			String description = attributeNode.elementText("description");
			String name = attributeNode.elementText("name");
			String type = GetterUtil.getString(
				attributeNode.elementText("type"), _DEFAULT_TYPE);
			String inputType = GetterUtil.getString(
				attributeNode.elementText("inputType"), type);
			String outputType = GetterUtil.getString(
				attributeNode.elementText("outputType"), type);

			boolean gettable = GetterUtil.getBoolean(
				attributeNode.elementText("gettable"), true);
			boolean required = GetterUtil.getBoolean(
				attributeNode.elementText("required"));
			boolean settable = GetterUtil.getBoolean(
				attributeNode.elementText("settable"), true);
			boolean writeInJSP = GetterUtil.getBoolean(
				attributeNode.elementText("writeInJSP"), true);

			Attribute attribute = new Attribute();

			attribute.setDefaultValue(defaultValue);
			attribute.setDescription(description);
			attribute.setGettable(gettable);
			attribute.setInputType(inputType);
			attribute.setName(name);
			attribute.setOutputType(outputType);
			attribute.setRequired(required);
			attribute.setSettable(settable);
			attribute.setWriteInJSP(writeInJSP);

			attributes.add(attribute);
		}

		return attributes;
	}

	protected String[] getAuthorList(Element element) {
		List<String> authors = new ArrayList<String>();

		if (element != null) {
			Element elAuthors = element.element(_AUTHORS);

			if (elAuthors != null) {
				List<Element> authorList = elAuthors.elements(_AUTHOR);

				for (Element author : authorList) {
					authors.add(author.getText());
				}
			}
		}

		if (authors.isEmpty()) {
			return DEFAULT_AUTHORS;
		}
		else {
			return authors.toArray(new String[authors.size()]);
		}
	}

	protected Element getComponentNode(Document doc, String name) {
		List<Element> components = doc.getRootElement().elements(_COMPONENT);

		for (Element component : components) {
			if (component.attributeValue("name").equals(name)) {
				return component;
			}
		}

		return null;
	}

	protected List<Component> getComponents(Document doc) throws Exception {
		Element root = doc.getRootElement();

		List<Component> components = new ArrayList<Component>();

		String defaultPackage = root.attributeValue("short-name");
		List<Element> allComponentNodes = root.elements("component");

		for (Element node : allComponentNodes) {
			boolean componentTaglibOSGIModule = GetterUtil.getBoolean(
				node.attributeValue("componentTaglibOSGIModule"));

			String componentPackage = GetterUtil.getString(
				node.attributeValue("package"), defaultPackage);

			String name = node.attributeValue("name");

			boolean alloyComponent = GetterUtil.getBoolean(
				node.attributeValue("alloyComponent"));

			boolean bodyContent = GetterUtil.getBoolean(
				node.attributeValue("bodyContent"));

			String className = GetterUtil.getString(
				node.attributeValue("className"));

			String description = node.elementText("description");

			boolean dynamicAttributes = GetterUtil.getBoolean(
				node.attributeValue("dynamicAttributes"), true);

			String module = GetterUtil.getString(node.attributeValue("module"));

			String parentClass = GetterUtil.getString(
				node.attributeValue("parentClass"), _DEFAULT_PARENT_CLASS);

			boolean writeEndJSP = GetterUtil.getBoolean(
				node.attributeValue("writeEndJSP"), true);

			boolean writeJSP = GetterUtil.getBoolean(
				node.attributeValue("writeJSP"), true);

			boolean writeStartJSP = GetterUtil.getBoolean(
				node.attributeValue("writeStartJSP"), true);

			String[] authors = getAuthorList(node);
			List<Attribute> attributes = getAttributes(node);
			List<Attribute> events = getPrefixedEvents(node);

			Component component = new Component();

			component.setAlloyComponent(alloyComponent);
			component.setAttributes(attributes);
			component.setAuthors(authors);
			component.setBodyContent(bodyContent);
			component.setClassName(className);
			component.setComponentTaglibOSGIModule(componentTaglibOSGIModule);
			component.setDescription(description);
			component.setDynamicAttributes(dynamicAttributes);
			component.setEvents(events);
			component.setModule(module);
			component.setName(name);
			component.setPackage(componentPackage);
			component.setParentClass(parentClass);
			component.setWriteEndJSP(writeEndJSP);
			component.setWriteJSP(writeJSP);
			component.setWriteStartJSP(writeStartJSP);

			components.add(component);
		}

		return components;
	}

	protected Document getComponentsDocByShortName(String name) {
		for (Document doc : _componentsExtDoc) {
			Element root = doc.getRootElement();

			if (root.attributeValue("short-name").equals(name)) {
				return doc;
			}
		}

		return null;
	}

	protected Map<String, Object> getDefaultTemplateContext() {
		Map<String, Object> context = new HashMap<String, Object>();

		context.put("copyrightYear", _copyrightYear);
		context.put("jspCommonInitPath", _jspCommonInitPath);
		context.put("jspDir", _jspDir);
		context.put("packagePath", _javaPackage);
		context.put("typeUtil", TypeUtil.getInstance());

		return context;
	}

	protected Element getElementByName(List<Element> elements, String name) {
		for (Element element : elements) {
			if (name.equals(element.elementText("name"))) {
				return element;
			}
		}

		return null;
	}

	protected String getJavaOutputBaseDir(Component component) {
		StringBuilder sb = new StringBuilder();

		sb.append(getJavaOutputDir(component));
		sb.append(_BASE);
		sb.append(StringPool.SLASH);

		return sb.toString();
	}

	protected String getJavaOutputDir(Component component) {
		StringBuilder sb = new StringBuilder();

		sb.append(_javaDir);

		if (component.isComponentTaglibOSGIModule()) {
			sb.append(_TAGLIB);
			sb.append(StringPool.SLASH);
		}
		else {
			sb.append(component.getPackage());
			sb.append(StringPool.SLASH);
		}

		return sb.toString();
	}

	protected String getJspDir(Component component) {
		StringBuilder sb = new StringBuilder();

		sb.append(_jspDir);

		if (!component.isComponentTaglibOSGIModule()) {
			sb.append(component.getPackage());
			sb.append(StringPool.SLASH);
		}

		return sb.toString();
	}

	protected String getJspOutputDir(Component component) {
		StringBuilder sb = new StringBuilder();

		if (Validator.isNotNull(_jspParentDir)) {
			sb.append(_jspParentDir);
			sb.append(StringPool.SLASH);
		}

		sb.append(getJspDir(component));

		return sb.toString();
	}

	protected List<Attribute> getPrefixedEvents(Element componentNode) {
		List<Attribute> afterEvents = getAttributes(
			componentNode, "events", "event");

		List<Attribute> onEvents = getAttributes(
			componentNode, "events", "event");

		List<Attribute> prefixedEvents = new ArrayList<Attribute>();

		for (Attribute event : afterEvents) {
			String name = _AFTER.concat(
				org.apache.commons.lang.StringUtils.capitalize(
					event.getSafeName()));

			event.setName(name);

			prefixedEvents.add(event);
		}

		for (Attribute event : onEvents) {
			String name = _ON.concat(
				org.apache.commons.lang.StringUtils.capitalize(
					event.getSafeName()));

			event.setName(name);

			prefixedEvents.add(event);
		}

		return prefixedEvents;
	}

	protected Map<String, Object> getTemplateContext(Component component) {
		Map<String, Object> context = getDefaultTemplateContext();

		String jspRelativePath = getJspDir(component).concat(
			component.getUncamelizedName(StringPool.UNDERLINE));

		context.put("component", component);
		context.put("namespace", component.getAttributeNamespace());
		context.put("jspRelativePath", jspRelativePath);

		return context;
	}

	protected Document mergeTlds(Document sourceDoc, Document targetDoc) {
		Element targetRoot = targetDoc.getRootElement();

		XPath xpathTags = SAXReaderUtil.createXPath(
			"//tld:tag", _TLD_XPATH_PREFIX, _TLD_XPATH_URI);

		List<Node> sources = xpathTags.selectNodes(sourceDoc);

		for (Node source : sources) {
			Element sourceElement = (Element)source;

			String sourceName = sourceElement.elementText("name");

			String xpathTagValue = "//tld:tag[tld:name='" + sourceName + "']";

			XPath xpathTag = SAXReaderUtil.createXPath(
				xpathTagValue, _TLD_XPATH_PREFIX, _TLD_XPATH_URI);

			List<Node> targets = xpathTag.selectNodes(targetDoc);

			if (targets.size() > 0) {
				Element targetElement = (Element)targets.get(0);

				XPath xpathAttributes = SAXReaderUtil.createXPath(
					xpathTagValue + "//tld:attribute", _TLD_XPATH_PREFIX,
					_TLD_XPATH_URI);

				List<Node> sourceAttributes = xpathAttributes.selectNodes(
					source);

				for (Node sourceAttribute : sourceAttributes) {
					Element sourceAttributeElement = (Element)sourceAttribute;

					String attributeName = sourceAttributeElement.elementText(
						"name");

					String xpathAttributeValue =
						"//tld:attribute[tld:name='" + attributeName + "']";

					XPath xpathAttribute = SAXReaderUtil.createXPath(
						xpathTagValue + xpathAttributeValue, _TLD_XPATH_PREFIX,
						_TLD_XPATH_URI);

					Node targetAttribute = xpathAttribute.selectSingleNode(
						targetElement);

					if (targetAttribute != null) {
						targetAttribute.detach();
					}

					targetElement.add(sourceAttributeElement.createCopy());
				}

				Element dynamicAttrElement = targetElement.element(
					"dynamic-attributes");

				if (dynamicAttrElement != null) {
					targetElement.add(dynamicAttrElement.detach());
				}
			}
			else {
				targetRoot.add(sourceElement.createCopy());
			}
		}

		return targetDoc;
	}

	protected Document mergeXMLAttributes(Document doc1, Document doc2) {
		Element doc1Root = doc1.getRootElement();

		Element docRoot = doc1Root.createCopy();
		docRoot.clearContent();

		Document doc = SAXReaderUtil.createDocument();
		doc.setRootElement(docRoot);

		List<Element> doc1Components = doc1Root.elements(_COMPONENT);

		for (Element doc1Component : doc1Components) {
			String name = doc1Component.attributeValue("name");

			Element doc2Component = getComponentNode(doc2, name);

			if (doc2Component != null) {
				Element doc2AttributesNode = doc2Component.element(_ATTRIBUTES);

				if (doc2AttributesNode != null) {
					List<Element> doc2Attributes = doc2AttributesNode.elements(
						_ATTRIBUTE);

					Element doc1AttributesNode = doc1Component.element(
						_ATTRIBUTES);

					for (Element doc2Attribute : doc2Attributes) {
						Element doc1Attribute = getElementByName(
							doc1AttributesNode.elements("attribute"),
							doc2Attribute.elementText("name"));

						if (doc1Attribute == null) {
							doc1AttributesNode.add(doc2Attribute.createCopy());
						}
					}
				}

				Element doc2EventsNode = doc2Component.element(_EVENTS);

				if (doc2EventsNode != null) {
					List<Element> doc2Events = doc2EventsNode.elements(_EVENT);

					Element doc1EventsNode = doc1Component.element(_EVENTS);

					for (Element doc2Event : doc2Events) {
						Element doc1Event = getElementByName(
							doc1EventsNode.elements("event"),
							doc2Event.elementText("name"));

						if (doc1Event == null) {
							doc1EventsNode.add(doc2Event.createCopy());
						}
					}
				}
			}

			doc.getRootElement().add(doc1Component.createCopy());
		}

		return doc;
	}

	protected String processTemplate(String name, Map<String, Object> context)
		throws Exception {

		return com.liferay.portal.kernel.util.StringUtil.replace(
			FreeMarkerUtil.process(name, context), '\r', StringPool.BLANK);
	}

	protected void writeFile(File file, String content) {
		writeFile(file, content, true);
	}

	protected void writeFile(File file, String content, boolean overwrite) {
		try {
			if (overwrite || !file.exists()) {
				String oldContent = StringPool.BLANK;

				if (file.exists()) {
					oldContent = FileUtil.read(file);
				}

				if (!file.exists() || !content.equals(oldContent)) {
					System.out.println("Writing " + file);

					FileUtil.write(file, content);
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void _create() throws Exception {
		List<Component> components = getAllComponents();

		for (Component component : components) {
			Map<String, Object> context = getTemplateContext(component);

			_createBaseTag(component, context);

			if (component.getWriteJSP()) {
				_createPageJSP(component, context);
			}

			_createTag(component, context);
		}

		_createCommonInitJSP();
		_createTld();
		_createServletContextUtil();
	}

	private void _createBaseTag(
			Component component, Map<String, Object> context)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(getJavaOutputBaseDir(component));
		sb.append(_BASE_CLASS_PREFIX);
		sb.append(component.getClassName());
		sb.append(_CLASS_SUFFIX);

		String content = processTemplate(_tplTagBase, context);

		File tagFile = new File(sb.toString());

		writeFile(tagFile, content);
	}

	private void _createCommonInitJSP() throws Exception {
		Map<String, Object> context = getDefaultTemplateContext();

		String contentCommonInitJsp = processTemplate(
			_tplCommonInitJsp, context);

		StringBuilder sb = new StringBuilder();

		if (Validator.isNotNull(_jspParentDir)) {
			sb.append(_jspParentDir);
			sb.append(StringPool.SLASH);
		}

		sb.append(_jspCommonInitPath);

		File commonInitFile = new File(sb.toString());

		writeFile(commonInitFile, contentCommonInitJsp, false);
	}

	private void _createPageJSP(
			Component component, Map<String, Object> context)
		throws Exception {

		String pathName = component.getUncamelizedName(StringPool.UNDERLINE);
		String path = getJspOutputDir(component).concat(pathName);

		String contentJsp = processTemplate(_tplJsp, context);
		String contentInitJsp = processTemplate(_tplInitJsp, context);

		File initFile = new File(path.concat(_INIT_PAGE));
		File initExtFile = new File(path.concat(_INIT_EXT_PAGE));

		writeFile(initFile, contentInitJsp);
		writeFile(initExtFile, StringPool.BLANK, false);

		if (component.isBodyContent()) {
			if (component.getWriteStartJSP()) {
				String contentStart = processTemplate(_tplStartJsp, context);

				File startFile = new File(path.concat(_START_PAGE));

				writeFile(startFile, contentStart, false);
			}

			if (component.getWriteEndJSP()) {
				String contentEnd = processTemplate(_tplEndJsp, context);

				File endFile = new File(path.concat(_END_PAGE));

				writeFile(endFile, contentEnd, false);
			}
		}
		else {
			File pageFile = new File(path.concat(_PAGE));

			writeFile(pageFile, contentJsp, false);
		}
	}

	private void _createServletContextUtil() throws Exception {
		for (Document doc : _componentsExtDoc) {
			Element root = doc.getRootElement();

			boolean OSGIModule = GetterUtil.getBoolean(
				root.attributeValue("osgi-module"));

			if (OSGIModule) {
				Map<String, Object> context = getDefaultTemplateContext();

				String OSGIModuleSymbolicName = GetterUtil.get(
					_OSGIModuleSymbolicName, StringPool.BLANK);

				context.put("OSGIModuleSymbolicName", OSGIModuleSymbolicName);
				context.put("taglibAuthors", getAuthorList(root));

				StringBuilder sb = new StringBuilder();

				int i = _javaDir.lastIndexOf("/servlet");

				if (i == -1) {
					sb.append(_javaDir);
				}
				else {
					sb.append(_javaDir, 0, i);
					sb.append("/internal/servlet/");
				}

				sb.append(_SERVLET_CONTEXT_UTIL);
				sb.append(_CLASS_SUFFIX);

				String content = processTemplate(
					_tplServletContextUtil, context);

				File servletContextUtilFile = new File(sb.toString());

				writeFile(servletContextUtilFile, content, false);

				if (servletContextUtilFile.exists()) {
					break;
				}
			}
		}
	}

	private void _createTag(Component component, Map<String, Object> context)
		throws Exception {

		StringBuilder sb = new StringBuilder();

		sb.append(getJavaOutputDir(component));
		sb.append(component.getClassName());
		sb.append(_CLASS_SUFFIX);

		String content = processTemplate(_tplTag, context);

		File tagFile = new File(sb.toString());

		writeFile(tagFile, content, false);
	}

	private void _createTld() throws Exception {
		_removeOldTld();

		Map<String, Object> context = getDefaultTemplateContext();

		for (Document doc : _componentsExtDoc) {
			Element root = doc.getRootElement();

			String description = GetterUtil.getString(
				root.elementText("description"), StringPool.BLANK);
			String shortName = GetterUtil.getString(
				root.attributeValue("short-name"), _DEFAULT_TAGLIB_SHORT_NAME);
			String uri = GetterUtil.getString(
				root.attributeValue("uri"), _DEFAULT_TAGLIB_URI);
			String version = GetterUtil.getString(
				root.attributeValue("tlib-version"), _DEFAULT_TAGLIB_VERSION);

			context.put("alloyComponent", shortName.equals(_DEFAULT_NAMESPACE));
			context.put("description", description);
			context.put("shortName", shortName);
			context.put("uri", uri);
			context.put("version", version);
			context.put("components", getComponents(doc));

			String tldFilePath = _tldDir.concat(
				_getTldFileName(shortName)).concat(_TLD_EXTENSION);

			File tldFile = new File(tldFilePath);

			String content = processTemplate(_tplTld, context);

			Document source = SAXReaderUtil.read(content);

			if (tldFile.exists()) {
				Document target = SAXReaderUtil.read(tldFile);

				source = mergeTlds(source, target);
			}

			writeFile(tldFile, source.formattedString());
		}
	}

	private String _getTldFileName(String tldFileName) {
		if (tldFileName.equals(_AUI)) {
			return tldFileName = _LIFERAY + StringPool.DASH + tldFileName;
		}
		else {
			return tldFileName;
		}
	}

	private void _removeOldTld() {
		for (Document doc : _componentsExtDoc) {
			Element root = doc.getRootElement();

			String shortName = GetterUtil.getString(
				root.attributeValue("short-name"), _DEFAULT_TAGLIB_SHORT_NAME);

			String tldFilePath = _tldDir.concat(
				_getTldFileName(shortName)).concat(_TLD_EXTENSION);

			File tldFile = new File(tldFilePath);

			if (tldFile.exists()) {
				FileUtil.delete(tldFile);
			}
		}
	}

	private static final String _AFTER = "after";

	private static final String _ATTRIBUTE = "attribute";

	private static final String _ATTRIBUTES = "attributes";

	private static final String _AUI = "aui";

	private static final String _AUTHOR = "author";

	private static final String _AUTHORS = "authors";

	private static final String _BASE = "base";

	private static final String _BASE_CLASS_PREFIX = "Base";

	private static final String _CLASS_SUFFIX = ".java";

	private static final String _COMPONENT = "component";

	private static final String _DEFAULT_NAMESPACE = "alloy";

	private static final String _DEFAULT_PARENT_CLASS =
		"com.liferay.taglib.util.IncludeTag";

	private static final String _DEFAULT_TAGLIB_SHORT_NAME = "alloy";

	private static final String _DEFAULT_TAGLIB_URI =
		"http://alloy.liferay.com/tld/alloy";

	private static final String _DEFAULT_TAGLIB_VERSION = "1.0";

	private static final String _DEFAULT_TYPE = "java.lang.Object";

	private static final String _END_PAGE = "/end.jsp";

	private static final String _EVENT = "event";

	private static final String _EVENTS = "events";

	private static final String _INIT_EXT_PAGE = "/init-ext.jspf";

	private static final String _INIT_PAGE = "/init.jsp";

	private static final String _LIFERAY = "liferay";

	private static final String _ON = "on";

	private static final String _PAGE = "/page.jsp";

	private static final String _SERVLET_CONTEXT_UTIL = "ServletContextUtil";

	private static final String _START_PAGE = "/start.jsp";

	private static final String _TAGLIB = "taglib";

	private static final String _TLD_EXTENSION = ".tld";

	private static final String _TLD_XPATH_PREFIX = "tld";

	private static final String _TLD_XPATH_URI =
		"http://java.sun.com/xml/ns/j2ee";

	private static String _copyrightYear;

	private List<Document> _componentsExtDoc;
	private List<String> _componentsXML;
	private String _javaDir;
	private String _javaPackage;
	private String _jspCommonInitPath;
	private String _jspDir;
	private String _jspParentDir;
	private String _OSGIModuleSymbolicName;
	private String _templatesDir;
	private String _tldDir;
	private String _tplCommonInitJsp;
	private String _tplEndJsp;
	private String _tplInitJsp;
	private String _tplJsp;
	private String _tplServletContextUtil;
	private String _tplStartJsp;
	private String _tplTag;
	private String _tplTagBase;
	private String _tplTld;

}
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.alloy.taglib.liferay.base;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;

/**
 * @author Eduardo Lundgren
 * @author Bruno Basto
 * @author Nathan Cavanaugh
 * @generated
 */
public abstract class BaseAutoCompleteTag extends com.liferay.taglib.util.IncludeTag {

	@Override
	public int doStartTag() throws JspException {
		setAttributeNamespace(_ATTRIBUTE_NAMESPACE);

		return super.doStartTag();
	}

	public java.lang.String getAlwaysShowContainer() {
		return _alwaysShowContainer;
	}

	public java.lang.String getTest() {
		return _test;
	}

	public boolean getApplyLocalFilter() {
		return _applyLocalFilter;
	}

	public boolean getAutoHighlight() {
		return _autoHighlight;
	}

	public java.lang.String getBoundingBox() {
		return _boundingBox;
	}

	public boolean getButton() {
		return _button;
	}

	public java.lang.String getContentBox() {
		return _contentBox;
	}

	public java.lang.String getCssClass() {
		return _cssClass;
	}

	public java.lang.Object getDataSource() {
		return _dataSource;
	}

	public java.lang.String getDataSourceType() {
		return _dataSourceType;
	}

	public java.lang.String getDelimChar() {
		return _delimChar;
	}

	public boolean getDestroyed() {
		return _destroyed;
	}

	public boolean getDisabled() {
		return _disabled;
	}

	public boolean getFocused() {
		return _focused;
	}

	public boolean getForceSelection() {
		return _forceSelection;
	}

	public java.lang.Object getHeight() {
		return _height;
	}

	public java.lang.String getHideClass() {
		return _hideClass;
	}

	public java.lang.String getAutocompleteId() {
		return _autocompleteId;
	}

	public boolean getInitialized() {
		return _initialized;
	}

	public java.lang.String getInput() {
		return _input;
	}

	public java.lang.Object getMatchKey() {
		return _matchKey;
	}

	public java.lang.Object getMaxResultsDisplayed() {
		return _maxResultsDisplayed;
	}

	public java.lang.Object getMinQueryLength() {
		return _minQueryLength;
	}

	public java.lang.Object getQueryDelay() {
		return _queryDelay;
	}

	public java.lang.Object getQueryInterval() {
		return _queryInterval;
	}

	public boolean getQueryMatchCase() {
		return _queryMatchCase;
	}

	public boolean getQueryMatchContains() {
		return _queryMatchContains;
	}

	public boolean getQueryQuestionMark() {
		return _queryQuestionMark;
	}

	public java.lang.Object getRender() {
		return _render;
	}

	public boolean getRendered() {
		return _rendered;
	}

	public java.lang.Object getSchema() {
		return _schema;
	}

	public java.lang.String getSchemaType() {
		return _schemaType;
	}

	public java.lang.String getSrcNode() {
		return _srcNode;
	}

	public java.lang.Object getStrings() {
		return _strings;
	}

	public boolean getSuppressInputUpdate() {
		return _suppressInputUpdate;
	}

	public java.lang.Object getTabIndex() {
		return _tabIndex;
	}

	public boolean getTypeAhead() {
		return _typeAhead;
	}

	public java.lang.Object getTypeAheadDelay() {
		return _typeAheadDelay;
	}

	public java.lang.String getUniqueName() {
		return _uniqueName;
	}

	public boolean getUseARIA() {
		return _useARIA;
	}

	public boolean getVisible() {
		return _visible;
	}

	public java.lang.Object getWidth() {
		return _width;
	}

	public java.lang.Object getAfterAlwaysShowContainerChange() {
		return _afterAlwaysShowContainerChange;
	}

	public java.lang.Object getAfterApplyLocalFilterChange() {
		return _afterApplyLocalFilterChange;
	}

	public java.lang.Object getAfterAutoHighlightChange() {
		return _afterAutoHighlightChange;
	}

	public java.lang.Object getAfterBoundingBoxChange() {
		return _afterBoundingBoxChange;
	}

	public java.lang.Object getAfterButtonChange() {
		return _afterButtonChange;
	}

	public java.lang.Object getAfterContainerCollapse() {
		return _afterContainerCollapse;
	}

	public java.lang.Object getAfterContainerExpand() {
		return _afterContainerExpand;
	}

	public java.lang.Object getAfterContainerPopulate() {
		return _afterContainerPopulate;
	}

	public java.lang.Object getAfterContentBoxChange() {
		return _afterContentBoxChange;
	}

	public java.lang.Object getAfterCssClassChange() {
		return _afterCssClassChange;
	}

	public java.lang.Object getAfterDataError() {
		return _afterDataError;
	}

	public java.lang.Object getAfterDataRequest() {
		return _afterDataRequest;
	}

	public java.lang.Object getAfterDataReturn() {
		return _afterDataReturn;
	}

	public java.lang.Object getAfterDataSourceChange() {
		return _afterDataSourceChange;
	}

	public java.lang.Object getAfterDataSourceTypeChange() {
		return _afterDataSourceTypeChange;
	}

	public java.lang.Object getAfterDelimCharChange() {
		return _afterDelimCharChange;
	}

	public java.lang.Object getAfterDestroy() {
		return _afterDestroy;
	}

	public java.lang.Object getAfterDestroyedChange() {
		return _afterDestroyedChange;
	}

	public java.lang.Object getAfterDisabledChange() {
		return _afterDisabledChange;
	}

	public java.lang.Object getAfterFocusedChange() {
		return _afterFocusedChange;
	}

	public java.lang.Object getAfterForceSelectionChange() {
		return _afterForceSelectionChange;
	}

	public java.lang.Object getAfterHeightChange() {
		return _afterHeightChange;
	}

	public java.lang.Object getAfterHideClassChange() {
		return _afterHideClassChange;
	}

	public java.lang.Object getAfterIdChange() {
		return _afterIdChange;
	}

	public java.lang.Object getAfterInit() {
		return _afterInit;
	}

	public java.lang.Object getAfterInitializedChange() {
		return _afterInitializedChange;
	}

	public java.lang.Object getAfterInputChange() {
		return _afterInputChange;
	}

	public java.lang.Object getAfterItemArrowFrom() {
		return _afterItemArrowFrom;
	}

	public java.lang.Object getAfterItemArrowTo() {
		return _afterItemArrowTo;
	}

	public java.lang.Object getAfterItemMouseOut() {
		return _afterItemMouseOut;
	}

	public java.lang.Object getAfterItemMouseOver() {
		return _afterItemMouseOver;
	}

	public java.lang.Object getAfterItemSelect() {
		return _afterItemSelect;
	}

	public java.lang.Object getAfterMatchKeyChange() {
		return _afterMatchKeyChange;
	}

	public java.lang.Object getAfterMaxResultsDisplayedChange() {
		return _afterMaxResultsDisplayedChange;
	}

	public java.lang.Object getAfterMinQueryLengthChange() {
		return _afterMinQueryLengthChange;
	}

	public java.lang.Object getAfterQueryDelayChange() {
		return _afterQueryDelayChange;
	}

	public java.lang.Object getAfterQueryIntervalChange() {
		return _afterQueryIntervalChange;
	}

	public java.lang.Object getAfterQueryMatchCaseChange() {
		return _afterQueryMatchCaseChange;
	}

	public java.lang.Object getAfterQueryMatchContainsChange() {
		return _afterQueryMatchContainsChange;
	}

	public java.lang.Object getAfterQueryQuestionMarkChange() {
		return _afterQueryQuestionMarkChange;
	}

	public java.lang.Object getAfterRenderChange() {
		return _afterRenderChange;
	}

	public java.lang.Object getAfterRenderedChange() {
		return _afterRenderedChange;
	}

	public java.lang.Object getAfterSchemaChange() {
		return _afterSchemaChange;
	}

	public java.lang.Object getAfterSchemaTypeChange() {
		return _afterSchemaTypeChange;
	}

	public java.lang.Object getAfterSelectionEnforce() {
		return _afterSelectionEnforce;
	}

	public java.lang.Object getAfterSrcNodeChange() {
		return _afterSrcNodeChange;
	}

	public java.lang.Object getAfterStringsChange() {
		return _afterStringsChange;
	}

	public java.lang.Object getAfterSuppressInputUpdateChange() {
		return _afterSuppressInputUpdateChange;
	}

	public java.lang.Object getAfterTabIndexChange() {
		return _afterTabIndexChange;
	}

	public java.lang.Object getAfterTextboxBlur() {
		return _afterTextboxBlur;
	}

	public java.lang.Object getAfterTextboxChange() {
		return _afterTextboxChange;
	}

	public java.lang.Object getAfterTextboxFocus() {
		return _afterTextboxFocus;
	}

	public java.lang.Object getAfterTextboxKey() {
		return _afterTextboxKey;
	}

	public java.lang.Object getAfterTypeAhead() {
		return _afterTypeAhead;
	}

	public java.lang.Object getAfterTypeAheadChange() {
		return _afterTypeAheadChange;
	}

	public java.lang.Object getAfterTypeAheadDelayChange() {
		return _afterTypeAheadDelayChange;
	}

	public java.lang.Object getAfterUniqueNameChange() {
		return _afterUniqueNameChange;
	}

	public java.lang.Object getAfterUnmatchedItemSelect() {
		return _afterUnmatchedItemSelect;
	}

	public java.lang.Object getAfterUseARIAChange() {
		return _afterUseARIAChange;
	}

	public java.lang.Object getAfterVisibleChange() {
		return _afterVisibleChange;
	}

	public java.lang.Object getAfterContentUpdate() {
		return _afterContentUpdate;
	}

	public java.lang.Object getAfterRender() {
		return _afterRender;
	}

	public java.lang.Object getAfterWidthChange() {
		return _afterWidthChange;
	}

	public java.lang.Object getOnAlwaysShowContainerChange() {
		return _onAlwaysShowContainerChange;
	}

	public java.lang.Object getOnApplyLocalFilterChange() {
		return _onApplyLocalFilterChange;
	}

	public java.lang.Object getOnAutoHighlightChange() {
		return _onAutoHighlightChange;
	}

	public java.lang.Object getOnBoundingBoxChange() {
		return _onBoundingBoxChange;
	}

	public java.lang.Object getOnButtonChange() {
		return _onButtonChange;
	}

	public java.lang.Object getOnContainerCollapse() {
		return _onContainerCollapse;
	}

	public java.lang.Object getOnContainerExpand() {
		return _onContainerExpand;
	}

	public java.lang.Object getOnContainerPopulate() {
		return _onContainerPopulate;
	}

	public java.lang.Object getOnContentBoxChange() {
		return _onContentBoxChange;
	}

	public java.lang.Object getOnCssClassChange() {
		return _onCssClassChange;
	}

	public java.lang.Object getOnDataError() {
		return _onDataError;
	}

	public java.lang.Object getOnDataRequest() {
		return _onDataRequest;
	}

	public java.lang.Object getOnDataReturn() {
		return _onDataReturn;
	}

	public java.lang.Object getOnDataSourceChange() {
		return _onDataSourceChange;
	}

	public java.lang.Object getOnDataSourceTypeChange() {
		return _onDataSourceTypeChange;
	}

	public java.lang.Object getOnDelimCharChange() {
		return _onDelimCharChange;
	}

	public java.lang.Object getOnDestroy() {
		return _onDestroy;
	}

	public java.lang.Object getOnDestroyedChange() {
		return _onDestroyedChange;
	}

	public java.lang.Object getOnDisabledChange() {
		return _onDisabledChange;
	}

	public java.lang.Object getOnFocusedChange() {
		return _onFocusedChange;
	}

	public java.lang.Object getOnForceSelectionChange() {
		return _onForceSelectionChange;
	}

	public java.lang.Object getOnHeightChange() {
		return _onHeightChange;
	}

	public java.lang.Object getOnHideClassChange() {
		return _onHideClassChange;
	}

	public java.lang.Object getOnIdChange() {
		return _onIdChange;
	}

	public java.lang.Object getOnInit() {
		return _onInit;
	}

	public java.lang.Object getOnInitializedChange() {
		return _onInitializedChange;
	}

	public java.lang.Object getOnInputChange() {
		return _onInputChange;
	}

	public java.lang.Object getOnItemArrowFrom() {
		return _onItemArrowFrom;
	}

	public java.lang.Object getOnItemArrowTo() {
		return _onItemArrowTo;
	}

	public java.lang.Object getOnItemMouseOut() {
		return _onItemMouseOut;
	}

	public java.lang.Object getOnItemMouseOver() {
		return _onItemMouseOver;
	}

	public java.lang.Object getOnItemSelect() {
		return _onItemSelect;
	}

	public java.lang.Object getOnMatchKeyChange() {
		return _onMatchKeyChange;
	}

	public java.lang.Object getOnMaxResultsDisplayedChange() {
		return _onMaxResultsDisplayedChange;
	}

	public java.lang.Object getOnMinQueryLengthChange() {
		return _onMinQueryLengthChange;
	}

	public java.lang.Object getOnQueryDelayChange() {
		return _onQueryDelayChange;
	}

	public java.lang.Object getOnQueryIntervalChange() {
		return _onQueryIntervalChange;
	}

	public java.lang.Object getOnQueryMatchCaseChange() {
		return _onQueryMatchCaseChange;
	}

	public java.lang.Object getOnQueryMatchContainsChange() {
		return _onQueryMatchContainsChange;
	}

	public java.lang.Object getOnQueryQuestionMarkChange() {
		return _onQueryQuestionMarkChange;
	}

	public java.lang.Object getOnRenderChange() {
		return _onRenderChange;
	}

	public java.lang.Object getOnRenderedChange() {
		return _onRenderedChange;
	}

	public java.lang.Object getOnSchemaChange() {
		return _onSchemaChange;
	}

	public java.lang.Object getOnSchemaTypeChange() {
		return _onSchemaTypeChange;
	}

	public java.lang.Object getOnSelectionEnforce() {
		return _onSelectionEnforce;
	}

	public java.lang.Object getOnSrcNodeChange() {
		return _onSrcNodeChange;
	}

	public java.lang.Object getOnStringsChange() {
		return _onStringsChange;
	}

	public java.lang.Object getOnSuppressInputUpdateChange() {
		return _onSuppressInputUpdateChange;
	}

	public java.lang.Object getOnTabIndexChange() {
		return _onTabIndexChange;
	}

	public java.lang.Object getOnTextboxBlur() {
		return _onTextboxBlur;
	}

	public java.lang.Object getOnTextboxChange() {
		return _onTextboxChange;
	}

	public java.lang.Object getOnTextboxFocus() {
		return _onTextboxFocus;
	}

	public java.lang.Object getOnTextboxKey() {
		return _onTextboxKey;
	}

	public java.lang.Object getOnTypeAhead() {
		return _onTypeAhead;
	}

	public java.lang.Object getOnTypeAheadChange() {
		return _onTypeAheadChange;
	}

	public java.lang.Object getOnTypeAheadDelayChange() {
		return _onTypeAheadDelayChange;
	}

	public java.lang.Object getOnUniqueNameChange() {
		return _onUniqueNameChange;
	}

	public java.lang.Object getOnUnmatchedItemSelect() {
		return _onUnmatchedItemSelect;
	}

	public java.lang.Object getOnUseARIAChange() {
		return _onUseARIAChange;
	}

	public java.lang.Object getOnVisibleChange() {
		return _onVisibleChange;
	}

	public java.lang.Object getOnContentUpdate() {
		return _onContentUpdate;
	}

	public java.lang.Object getOnRender() {
		return _onRender;
	}

	public java.lang.Object getOnWidthChange() {
		return _onWidthChange;
	}

	public void setAlwaysShowContainer(java.lang.String alwaysShowContainer) {
		_alwaysShowContainer = alwaysShowContainer;

		setScopedAttribute("alwaysShowContainer", alwaysShowContainer);
	}

	public void setTest(java.lang.String test) {
		_test = test;

		setScopedAttribute("test", test);
	}

	public void setApplyLocalFilter(boolean applyLocalFilter) {
		_applyLocalFilter = applyLocalFilter;

		setScopedAttribute("applyLocalFilter", applyLocalFilter);
	}

	public void setAutoHighlight(boolean autoHighlight) {
		_autoHighlight = autoHighlight;

		setScopedAttribute("autoHighlight", autoHighlight);
	}

	public void setBoundingBox(java.lang.String boundingBox) {
		_boundingBox = boundingBox;

		setScopedAttribute("boundingBox", boundingBox);
	}

	public void setButton(boolean button) {
		_button = button;

		setScopedAttribute("button", button);
	}

	public void setContentBox(java.lang.String contentBox) {
		_contentBox = contentBox;

		setScopedAttribute("contentBox", contentBox);
	}

	public void setCssClass(java.lang.String cssClass) {
		_cssClass = cssClass;

		setScopedAttribute("cssClass", cssClass);
	}

	public void setDataSource(java.lang.Object dataSource) {
		_dataSource = dataSource;

		setScopedAttribute("dataSource", dataSource);
	}

	public void setDataSourceType(java.lang.String dataSourceType) {
		_dataSourceType = dataSourceType;

		setScopedAttribute("dataSourceType", dataSourceType);
	}

	public void setDelimChar(java.lang.String delimChar) {
		_delimChar = delimChar;

		setScopedAttribute("delimChar", delimChar);
	}

	public void setDestroyed(boolean destroyed) {
		_destroyed = destroyed;

		setScopedAttribute("destroyed", destroyed);
	}

	public void setDisabled(boolean disabled) {
		_disabled = disabled;

		setScopedAttribute("disabled", disabled);
	}

	public void setFocused(boolean focused) {
		_focused = focused;

		setScopedAttribute("focused", focused);
	}

	public void setForceSelection(boolean forceSelection) {
		_forceSelection = forceSelection;

		setScopedAttribute("forceSelection", forceSelection);
	}

	public void setHeight(java.lang.Object height) {
		_height = height;

		setScopedAttribute("height", height);
	}

	public void setHideClass(java.lang.String hideClass) {
		_hideClass = hideClass;

		setScopedAttribute("hideClass", hideClass);
	}

	public void setAutocompleteId(java.lang.String autocompleteId) {
		_autocompleteId = autocompleteId;

		setScopedAttribute("autocompleteId", autocompleteId);
	}

	public void setInitialized(boolean initialized) {
		_initialized = initialized;

		setScopedAttribute("initialized", initialized);
	}

	public void setInput(java.lang.String input) {
		_input = input;

		setScopedAttribute("input", input);
	}

	public void setMatchKey(java.lang.Object matchKey) {
		_matchKey = matchKey;

		setScopedAttribute("matchKey", matchKey);
	}

	public void setMaxResultsDisplayed(java.lang.Object maxResultsDisplayed) {
		_maxResultsDisplayed = maxResultsDisplayed;

		setScopedAttribute("maxResultsDisplayed", maxResultsDisplayed);
	}

	public void setMinQueryLength(java.lang.Object minQueryLength) {
		_minQueryLength = minQueryLength;

		setScopedAttribute("minQueryLength", minQueryLength);
	}

	public void setQueryDelay(java.lang.Object queryDelay) {
		_queryDelay = queryDelay;

		setScopedAttribute("queryDelay", queryDelay);
	}

	public void setQueryInterval(java.lang.Object queryInterval) {
		_queryInterval = queryInterval;

		setScopedAttribute("queryInterval", queryInterval);
	}

	public void setQueryMatchCase(boolean queryMatchCase) {
		_queryMatchCase = queryMatchCase;

		setScopedAttribute("queryMatchCase", queryMatchCase);
	}

	public void setQueryMatchContains(boolean queryMatchContains) {
		_queryMatchContains = queryMatchContains;

		setScopedAttribute("queryMatchContains", queryMatchContains);
	}

	public void setQueryQuestionMark(boolean queryQuestionMark) {
		_queryQuestionMark = queryQuestionMark;

		setScopedAttribute("queryQuestionMark", queryQuestionMark);
	}

	public void setRender(java.lang.Object render) {
		_render = render;

		setScopedAttribute("render", render);
	}

	public void setRendered(boolean rendered) {
		_rendered = rendered;

		setScopedAttribute("rendered", rendered);
	}

	public void setSchema(java.lang.Object schema) {
		_schema = schema;

		setScopedAttribute("schema", schema);
	}

	public void setSchemaType(java.lang.String schemaType) {
		_schemaType = schemaType;

		setScopedAttribute("schemaType", schemaType);
	}

	public void setSrcNode(java.lang.String srcNode) {
		_srcNode = srcNode;

		setScopedAttribute("srcNode", srcNode);
	}

	public void setStrings(java.lang.Object strings) {
		_strings = strings;

		setScopedAttribute("strings", strings);
	}

	public void setSuppressInputUpdate(boolean suppressInputUpdate) {
		_suppressInputUpdate = suppressInputUpdate;

		setScopedAttribute("suppressInputUpdate", suppressInputUpdate);
	}

	public void setTabIndex(java.lang.Object tabIndex) {
		_tabIndex = tabIndex;

		setScopedAttribute("tabIndex", tabIndex);
	}

	public void setTypeAhead(boolean typeAhead) {
		_typeAhead = typeAhead;

		setScopedAttribute("typeAhead", typeAhead);
	}

	public void setTypeAheadDelay(java.lang.Object typeAheadDelay) {
		_typeAheadDelay = typeAheadDelay;

		setScopedAttribute("typeAheadDelay", typeAheadDelay);
	}

	public void setUniqueName(java.lang.String uniqueName) {
		_uniqueName = uniqueName;

		setScopedAttribute("uniqueName", uniqueName);
	}

	public void setUseARIA(boolean useARIA) {
		_useARIA = useARIA;

		setScopedAttribute("useARIA", useARIA);
	}

	public void setVisible(boolean visible) {
		_visible = visible;

		setScopedAttribute("visible", visible);
	}

	public void setWidth(java.lang.Object width) {
		_width = width;

		setScopedAttribute("width", width);
	}

	public void setAfterAlwaysShowContainerChange(java.lang.Object afterAlwaysShowContainerChange) {
		_afterAlwaysShowContainerChange = afterAlwaysShowContainerChange;

		setScopedAttribute("afterAlwaysShowContainerChange", afterAlwaysShowContainerChange);
	}

	public void setAfterApplyLocalFilterChange(java.lang.Object afterApplyLocalFilterChange) {
		_afterApplyLocalFilterChange = afterApplyLocalFilterChange;

		setScopedAttribute("afterApplyLocalFilterChange", afterApplyLocalFilterChange);
	}

	public void setAfterAutoHighlightChange(java.lang.Object afterAutoHighlightChange) {
		_afterAutoHighlightChange = afterAutoHighlightChange;

		setScopedAttribute("afterAutoHighlightChange", afterAutoHighlightChange);
	}

	public void setAfterBoundingBoxChange(java.lang.Object afterBoundingBoxChange) {
		_afterBoundingBoxChange = afterBoundingBoxChange;

		setScopedAttribute("afterBoundingBoxChange", afterBoundingBoxChange);
	}

	public void setAfterButtonChange(java.lang.Object afterButtonChange) {
		_afterButtonChange = afterButtonChange;

		setScopedAttribute("afterButtonChange", afterButtonChange);
	}

	public void setAfterContainerCollapse(java.lang.Object afterContainerCollapse) {
		_afterContainerCollapse = afterContainerCollapse;

		setScopedAttribute("afterContainerCollapse", afterContainerCollapse);
	}

	public void setAfterContainerExpand(java.lang.Object afterContainerExpand) {
		_afterContainerExpand = afterContainerExpand;

		setScopedAttribute("afterContainerExpand", afterContainerExpand);
	}

	public void setAfterContainerPopulate(java.lang.Object afterContainerPopulate) {
		_afterContainerPopulate = afterContainerPopulate;

		setScopedAttribute("afterContainerPopulate", afterContainerPopulate);
	}

	public void setAfterContentBoxChange(java.lang.Object afterContentBoxChange) {
		_afterContentBoxChange = afterContentBoxChange;

		setScopedAttribute("afterContentBoxChange", afterContentBoxChange);
	}

	public void setAfterCssClassChange(java.lang.Object afterCssClassChange) {
		_afterCssClassChange = afterCssClassChange;

		setScopedAttribute("afterCssClassChange", afterCssClassChange);
	}

	public void setAfterDataError(java.lang.Object afterDataError) {
		_afterDataError = afterDataError;

		setScopedAttribute("afterDataError", afterDataError);
	}

	public void setAfterDataRequest(java.lang.Object afterDataRequest) {
		_afterDataRequest = afterDataRequest;

		setScopedAttribute("afterDataRequest", afterDataRequest);
	}

	public void setAfterDataReturn(java.lang.Object afterDataReturn) {
		_afterDataReturn = afterDataReturn;

		setScopedAttribute("afterDataReturn", afterDataReturn);
	}

	public void setAfterDataSourceChange(java.lang.Object afterDataSourceChange) {
		_afterDataSourceChange = afterDataSourceChange;

		setScopedAttribute("afterDataSourceChange", afterDataSourceChange);
	}

	public void setAfterDataSourceTypeChange(java.lang.Object afterDataSourceTypeChange) {
		_afterDataSourceTypeChange = afterDataSourceTypeChange;

		setScopedAttribute("afterDataSourceTypeChange", afterDataSourceTypeChange);
	}

	public void setAfterDelimCharChange(java.lang.Object afterDelimCharChange) {
		_afterDelimCharChange = afterDelimCharChange;

		setScopedAttribute("afterDelimCharChange", afterDelimCharChange);
	}

	public void setAfterDestroy(java.lang.Object afterDestroy) {
		_afterDestroy = afterDestroy;

		setScopedAttribute("afterDestroy", afterDestroy);
	}

	public void setAfterDestroyedChange(java.lang.Object afterDestroyedChange) {
		_afterDestroyedChange = afterDestroyedChange;

		setScopedAttribute("afterDestroyedChange", afterDestroyedChange);
	}

	public void setAfterDisabledChange(java.lang.Object afterDisabledChange) {
		_afterDisabledChange = afterDisabledChange;

		setScopedAttribute("afterDisabledChange", afterDisabledChange);
	}

	public void setAfterFocusedChange(java.lang.Object afterFocusedChange) {
		_afterFocusedChange = afterFocusedChange;

		setScopedAttribute("afterFocusedChange", afterFocusedChange);
	}

	public void setAfterForceSelectionChange(java.lang.Object afterForceSelectionChange) {
		_afterForceSelectionChange = afterForceSelectionChange;

		setScopedAttribute("afterForceSelectionChange", afterForceSelectionChange);
	}

	public void setAfterHeightChange(java.lang.Object afterHeightChange) {
		_afterHeightChange = afterHeightChange;

		setScopedAttribute("afterHeightChange", afterHeightChange);
	}

	public void setAfterHideClassChange(java.lang.Object afterHideClassChange) {
		_afterHideClassChange = afterHideClassChange;

		setScopedAttribute("afterHideClassChange", afterHideClassChange);
	}

	public void setAfterIdChange(java.lang.Object afterIdChange) {
		_afterIdChange = afterIdChange;

		setScopedAttribute("afterIdChange", afterIdChange);
	}

	public void setAfterInit(java.lang.Object afterInit) {
		_afterInit = afterInit;

		setScopedAttribute("afterInit", afterInit);
	}

	public void setAfterInitializedChange(java.lang.Object afterInitializedChange) {
		_afterInitializedChange = afterInitializedChange;

		setScopedAttribute("afterInitializedChange", afterInitializedChange);
	}

	public void setAfterInputChange(java.lang.Object afterInputChange) {
		_afterInputChange = afterInputChange;

		setScopedAttribute("afterInputChange", afterInputChange);
	}

	public void setAfterItemArrowFrom(java.lang.Object afterItemArrowFrom) {
		_afterItemArrowFrom = afterItemArrowFrom;

		setScopedAttribute("afterItemArrowFrom", afterItemArrowFrom);
	}

	public void setAfterItemArrowTo(java.lang.Object afterItemArrowTo) {
		_afterItemArrowTo = afterItemArrowTo;

		setScopedAttribute("afterItemArrowTo", afterItemArrowTo);
	}

	public void setAfterItemMouseOut(java.lang.Object afterItemMouseOut) {
		_afterItemMouseOut = afterItemMouseOut;

		setScopedAttribute("afterItemMouseOut", afterItemMouseOut);
	}

	public void setAfterItemMouseOver(java.lang.Object afterItemMouseOver) {
		_afterItemMouseOver = afterItemMouseOver;

		setScopedAttribute("afterItemMouseOver", afterItemMouseOver);
	}

	public void setAfterItemSelect(java.lang.Object afterItemSelect) {
		_afterItemSelect = afterItemSelect;

		setScopedAttribute("afterItemSelect", afterItemSelect);
	}

	public void setAfterMatchKeyChange(java.lang.Object afterMatchKeyChange) {
		_afterMatchKeyChange = afterMatchKeyChange;

		setScopedAttribute("afterMatchKeyChange", afterMatchKeyChange);
	}

	public void setAfterMaxResultsDisplayedChange(java.lang.Object afterMaxResultsDisplayedChange) {
		_afterMaxResultsDisplayedChange = afterMaxResultsDisplayedChange;

		setScopedAttribute("afterMaxResultsDisplayedChange", afterMaxResultsDisplayedChange);
	}

	public void setAfterMinQueryLengthChange(java.lang.Object afterMinQueryLengthChange) {
		_afterMinQueryLengthChange = afterMinQueryLengthChange;

		setScopedAttribute("afterMinQueryLengthChange", afterMinQueryLengthChange);
	}

	public void setAfterQueryDelayChange(java.lang.Object afterQueryDelayChange) {
		_afterQueryDelayChange = afterQueryDelayChange;

		setScopedAttribute("afterQueryDelayChange", afterQueryDelayChange);
	}

	public void setAfterQueryIntervalChange(java.lang.Object afterQueryIntervalChange) {
		_afterQueryIntervalChange = afterQueryIntervalChange;

		setScopedAttribute("afterQueryIntervalChange", afterQueryIntervalChange);
	}

	public void setAfterQueryMatchCaseChange(java.lang.Object afterQueryMatchCaseChange) {
		_afterQueryMatchCaseChange = afterQueryMatchCaseChange;

		setScopedAttribute("afterQueryMatchCaseChange", afterQueryMatchCaseChange);
	}

	public void setAfterQueryMatchContainsChange(java.lang.Object afterQueryMatchContainsChange) {
		_afterQueryMatchContainsChange = afterQueryMatchContainsChange;

		setScopedAttribute("afterQueryMatchContainsChange", afterQueryMatchContainsChange);
	}

	public void setAfterQueryQuestionMarkChange(java.lang.Object afterQueryQuestionMarkChange) {
		_afterQueryQuestionMarkChange = afterQueryQuestionMarkChange;

		setScopedAttribute("afterQueryQuestionMarkChange", afterQueryQuestionMarkChange);
	}

	public void setAfterRenderChange(java.lang.Object afterRenderChange) {
		_afterRenderChange = afterRenderChange;

		setScopedAttribute("afterRenderChange", afterRenderChange);
	}

	public void setAfterRenderedChange(java.lang.Object afterRenderedChange) {
		_afterRenderedChange = afterRenderedChange;

		setScopedAttribute("afterRenderedChange", afterRenderedChange);
	}

	public void setAfterSchemaChange(java.lang.Object afterSchemaChange) {
		_afterSchemaChange = afterSchemaChange;

		setScopedAttribute("afterSchemaChange", afterSchemaChange);
	}

	public void setAfterSchemaTypeChange(java.lang.Object afterSchemaTypeChange) {
		_afterSchemaTypeChange = afterSchemaTypeChange;

		setScopedAttribute("afterSchemaTypeChange", afterSchemaTypeChange);
	}

	public void setAfterSelectionEnforce(java.lang.Object afterSelectionEnforce) {
		_afterSelectionEnforce = afterSelectionEnforce;

		setScopedAttribute("afterSelectionEnforce", afterSelectionEnforce);
	}

	public void setAfterSrcNodeChange(java.lang.Object afterSrcNodeChange) {
		_afterSrcNodeChange = afterSrcNodeChange;

		setScopedAttribute("afterSrcNodeChange", afterSrcNodeChange);
	}

	public void setAfterStringsChange(java.lang.Object afterStringsChange) {
		_afterStringsChange = afterStringsChange;

		setScopedAttribute("afterStringsChange", afterStringsChange);
	}

	public void setAfterSuppressInputUpdateChange(java.lang.Object afterSuppressInputUpdateChange) {
		_afterSuppressInputUpdateChange = afterSuppressInputUpdateChange;

		setScopedAttribute("afterSuppressInputUpdateChange", afterSuppressInputUpdateChange);
	}

	public void setAfterTabIndexChange(java.lang.Object afterTabIndexChange) {
		_afterTabIndexChange = afterTabIndexChange;

		setScopedAttribute("afterTabIndexChange", afterTabIndexChange);
	}

	public void setAfterTextboxBlur(java.lang.Object afterTextboxBlur) {
		_afterTextboxBlur = afterTextboxBlur;

		setScopedAttribute("afterTextboxBlur", afterTextboxBlur);
	}

	public void setAfterTextboxChange(java.lang.Object afterTextboxChange) {
		_afterTextboxChange = afterTextboxChange;

		setScopedAttribute("afterTextboxChange", afterTextboxChange);
	}

	public void setAfterTextboxFocus(java.lang.Object afterTextboxFocus) {
		_afterTextboxFocus = afterTextboxFocus;

		setScopedAttribute("afterTextboxFocus", afterTextboxFocus);
	}

	public void setAfterTextboxKey(java.lang.Object afterTextboxKey) {
		_afterTextboxKey = afterTextboxKey;

		setScopedAttribute("afterTextboxKey", afterTextboxKey);
	}

	public void setAfterTypeAhead(java.lang.Object afterTypeAhead) {
		_afterTypeAhead = afterTypeAhead;

		setScopedAttribute("afterTypeAhead", afterTypeAhead);
	}

	public void setAfterTypeAheadChange(java.lang.Object afterTypeAheadChange) {
		_afterTypeAheadChange = afterTypeAheadChange;

		setScopedAttribute("afterTypeAheadChange", afterTypeAheadChange);
	}

	public void setAfterTypeAheadDelayChange(java.lang.Object afterTypeAheadDelayChange) {
		_afterTypeAheadDelayChange = afterTypeAheadDelayChange;

		setScopedAttribute("afterTypeAheadDelayChange", afterTypeAheadDelayChange);
	}

	public void setAfterUniqueNameChange(java.lang.Object afterUniqueNameChange) {
		_afterUniqueNameChange = afterUniqueNameChange;

		setScopedAttribute("afterUniqueNameChange", afterUniqueNameChange);
	}

	public void setAfterUnmatchedItemSelect(java.lang.Object afterUnmatchedItemSelect) {
		_afterUnmatchedItemSelect = afterUnmatchedItemSelect;

		setScopedAttribute("afterUnmatchedItemSelect", afterUnmatchedItemSelect);
	}

	public void setAfterUseARIAChange(java.lang.Object afterUseARIAChange) {
		_afterUseARIAChange = afterUseARIAChange;

		setScopedAttribute("afterUseARIAChange", afterUseARIAChange);
	}

	public void setAfterVisibleChange(java.lang.Object afterVisibleChange) {
		_afterVisibleChange = afterVisibleChange;

		setScopedAttribute("afterVisibleChange", afterVisibleChange);
	}

	public void setAfterContentUpdate(java.lang.Object afterContentUpdate) {
		_afterContentUpdate = afterContentUpdate;

		setScopedAttribute("afterContentUpdate", afterContentUpdate);
	}

	public void setAfterRender(java.lang.Object afterRender) {
		_afterRender = afterRender;

		setScopedAttribute("afterRender", afterRender);
	}

	public void setAfterWidthChange(java.lang.Object afterWidthChange) {
		_afterWidthChange = afterWidthChange;

		setScopedAttribute("afterWidthChange", afterWidthChange);
	}

	public void setOnAlwaysShowContainerChange(java.lang.Object onAlwaysShowContainerChange) {
		_onAlwaysShowContainerChange = onAlwaysShowContainerChange;

		setScopedAttribute("onAlwaysShowContainerChange", onAlwaysShowContainerChange);
	}

	public void setOnApplyLocalFilterChange(java.lang.Object onApplyLocalFilterChange) {
		_onApplyLocalFilterChange = onApplyLocalFilterChange;

		setScopedAttribute("onApplyLocalFilterChange", onApplyLocalFilterChange);
	}

	public void setOnAutoHighlightChange(java.lang.Object onAutoHighlightChange) {
		_onAutoHighlightChange = onAutoHighlightChange;

		setScopedAttribute("onAutoHighlightChange", onAutoHighlightChange);
	}

	public void setOnBoundingBoxChange(java.lang.Object onBoundingBoxChange) {
		_onBoundingBoxChange = onBoundingBoxChange;

		setScopedAttribute("onBoundingBoxChange", onBoundingBoxChange);
	}

	public void setOnButtonChange(java.lang.Object onButtonChange) {
		_onButtonChange = onButtonChange;

		setScopedAttribute("onButtonChange", onButtonChange);
	}

	public void setOnContainerCollapse(java.lang.Object onContainerCollapse) {
		_onContainerCollapse = onContainerCollapse;

		setScopedAttribute("onContainerCollapse", onContainerCollapse);
	}

	public void setOnContainerExpand(java.lang.Object onContainerExpand) {
		_onContainerExpand = onContainerExpand;

		setScopedAttribute("onContainerExpand", onContainerExpand);
	}

	public void setOnContainerPopulate(java.lang.Object onContainerPopulate) {
		_onContainerPopulate = onContainerPopulate;

		setScopedAttribute("onContainerPopulate", onContainerPopulate);
	}

	public void setOnContentBoxChange(java.lang.Object onContentBoxChange) {
		_onContentBoxChange = onContentBoxChange;

		setScopedAttribute("onContentBoxChange", onContentBoxChange);
	}

	public void setOnCssClassChange(java.lang.Object onCssClassChange) {
		_onCssClassChange = onCssClassChange;

		setScopedAttribute("onCssClassChange", onCssClassChange);
	}

	public void setOnDataError(java.lang.Object onDataError) {
		_onDataError = onDataError;

		setScopedAttribute("onDataError", onDataError);
	}

	public void setOnDataRequest(java.lang.Object onDataRequest) {
		_onDataRequest = onDataRequest;

		setScopedAttribute("onDataRequest", onDataRequest);
	}

	public void setOnDataReturn(java.lang.Object onDataReturn) {
		_onDataReturn = onDataReturn;

		setScopedAttribute("onDataReturn", onDataReturn);
	}

	public void setOnDataSourceChange(java.lang.Object onDataSourceChange) {
		_onDataSourceChange = onDataSourceChange;

		setScopedAttribute("onDataSourceChange", onDataSourceChange);
	}

	public void setOnDataSourceTypeChange(java.lang.Object onDataSourceTypeChange) {
		_onDataSourceTypeChange = onDataSourceTypeChange;

		setScopedAttribute("onDataSourceTypeChange", onDataSourceTypeChange);
	}

	public void setOnDelimCharChange(java.lang.Object onDelimCharChange) {
		_onDelimCharChange = onDelimCharChange;

		setScopedAttribute("onDelimCharChange", onDelimCharChange);
	}

	public void setOnDestroy(java.lang.Object onDestroy) {
		_onDestroy = onDestroy;

		setScopedAttribute("onDestroy", onDestroy);
	}

	public void setOnDestroyedChange(java.lang.Object onDestroyedChange) {
		_onDestroyedChange = onDestroyedChange;

		setScopedAttribute("onDestroyedChange", onDestroyedChange);
	}

	public void setOnDisabledChange(java.lang.Object onDisabledChange) {
		_onDisabledChange = onDisabledChange;

		setScopedAttribute("onDisabledChange", onDisabledChange);
	}

	public void setOnFocusedChange(java.lang.Object onFocusedChange) {
		_onFocusedChange = onFocusedChange;

		setScopedAttribute("onFocusedChange", onFocusedChange);
	}

	public void setOnForceSelectionChange(java.lang.Object onForceSelectionChange) {
		_onForceSelectionChange = onForceSelectionChange;

		setScopedAttribute("onForceSelectionChange", onForceSelectionChange);
	}

	public void setOnHeightChange(java.lang.Object onHeightChange) {
		_onHeightChange = onHeightChange;

		setScopedAttribute("onHeightChange", onHeightChange);
	}

	public void setOnHideClassChange(java.lang.Object onHideClassChange) {
		_onHideClassChange = onHideClassChange;

		setScopedAttribute("onHideClassChange", onHideClassChange);
	}

	public void setOnIdChange(java.lang.Object onIdChange) {
		_onIdChange = onIdChange;

		setScopedAttribute("onIdChange", onIdChange);
	}

	public void setOnInit(java.lang.Object onInit) {
		_onInit = onInit;

		setScopedAttribute("onInit", onInit);
	}

	public void setOnInitializedChange(java.lang.Object onInitializedChange) {
		_onInitializedChange = onInitializedChange;

		setScopedAttribute("onInitializedChange", onInitializedChange);
	}

	public void setOnInputChange(java.lang.Object onInputChange) {
		_onInputChange = onInputChange;

		setScopedAttribute("onInputChange", onInputChange);
	}

	public void setOnItemArrowFrom(java.lang.Object onItemArrowFrom) {
		_onItemArrowFrom = onItemArrowFrom;

		setScopedAttribute("onItemArrowFrom", onItemArrowFrom);
	}

	public void setOnItemArrowTo(java.lang.Object onItemArrowTo) {
		_onItemArrowTo = onItemArrowTo;

		setScopedAttribute("onItemArrowTo", onItemArrowTo);
	}

	public void setOnItemMouseOut(java.lang.Object onItemMouseOut) {
		_onItemMouseOut = onItemMouseOut;

		setScopedAttribute("onItemMouseOut", onItemMouseOut);
	}

	public void setOnItemMouseOver(java.lang.Object onItemMouseOver) {
		_onItemMouseOver = onItemMouseOver;

		setScopedAttribute("onItemMouseOver", onItemMouseOver);
	}

	public void setOnItemSelect(java.lang.Object onItemSelect) {
		_onItemSelect = onItemSelect;

		setScopedAttribute("onItemSelect", onItemSelect);
	}

	public void setOnMatchKeyChange(java.lang.Object onMatchKeyChange) {
		_onMatchKeyChange = onMatchKeyChange;

		setScopedAttribute("onMatchKeyChange", onMatchKeyChange);
	}

	public void setOnMaxResultsDisplayedChange(java.lang.Object onMaxResultsDisplayedChange) {
		_onMaxResultsDisplayedChange = onMaxResultsDisplayedChange;

		setScopedAttribute("onMaxResultsDisplayedChange", onMaxResultsDisplayedChange);
	}

	public void setOnMinQueryLengthChange(java.lang.Object onMinQueryLengthChange) {
		_onMinQueryLengthChange = onMinQueryLengthChange;

		setScopedAttribute("onMinQueryLengthChange", onMinQueryLengthChange);
	}

	public void setOnQueryDelayChange(java.lang.Object onQueryDelayChange) {
		_onQueryDelayChange = onQueryDelayChange;

		setScopedAttribute("onQueryDelayChange", onQueryDelayChange);
	}

	public void setOnQueryIntervalChange(java.lang.Object onQueryIntervalChange) {
		_onQueryIntervalChange = onQueryIntervalChange;

		setScopedAttribute("onQueryIntervalChange", onQueryIntervalChange);
	}

	public void setOnQueryMatchCaseChange(java.lang.Object onQueryMatchCaseChange) {
		_onQueryMatchCaseChange = onQueryMatchCaseChange;

		setScopedAttribute("onQueryMatchCaseChange", onQueryMatchCaseChange);
	}

	public void setOnQueryMatchContainsChange(java.lang.Object onQueryMatchContainsChange) {
		_onQueryMatchContainsChange = onQueryMatchContainsChange;

		setScopedAttribute("onQueryMatchContainsChange", onQueryMatchContainsChange);
	}

	public void setOnQueryQuestionMarkChange(java.lang.Object onQueryQuestionMarkChange) {
		_onQueryQuestionMarkChange = onQueryQuestionMarkChange;

		setScopedAttribute("onQueryQuestionMarkChange", onQueryQuestionMarkChange);
	}

	public void setOnRenderChange(java.lang.Object onRenderChange) {
		_onRenderChange = onRenderChange;

		setScopedAttribute("onRenderChange", onRenderChange);
	}

	public void setOnRenderedChange(java.lang.Object onRenderedChange) {
		_onRenderedChange = onRenderedChange;

		setScopedAttribute("onRenderedChange", onRenderedChange);
	}

	public void setOnSchemaChange(java.lang.Object onSchemaChange) {
		_onSchemaChange = onSchemaChange;

		setScopedAttribute("onSchemaChange", onSchemaChange);
	}

	public void setOnSchemaTypeChange(java.lang.Object onSchemaTypeChange) {
		_onSchemaTypeChange = onSchemaTypeChange;

		setScopedAttribute("onSchemaTypeChange", onSchemaTypeChange);
	}

	public void setOnSelectionEnforce(java.lang.Object onSelectionEnforce) {
		_onSelectionEnforce = onSelectionEnforce;

		setScopedAttribute("onSelectionEnforce", onSelectionEnforce);
	}

	public void setOnSrcNodeChange(java.lang.Object onSrcNodeChange) {
		_onSrcNodeChange = onSrcNodeChange;

		setScopedAttribute("onSrcNodeChange", onSrcNodeChange);
	}

	public void setOnStringsChange(java.lang.Object onStringsChange) {
		_onStringsChange = onStringsChange;

		setScopedAttribute("onStringsChange", onStringsChange);
	}

	public void setOnSuppressInputUpdateChange(java.lang.Object onSuppressInputUpdateChange) {
		_onSuppressInputUpdateChange = onSuppressInputUpdateChange;

		setScopedAttribute("onSuppressInputUpdateChange", onSuppressInputUpdateChange);
	}

	public void setOnTabIndexChange(java.lang.Object onTabIndexChange) {
		_onTabIndexChange = onTabIndexChange;

		setScopedAttribute("onTabIndexChange", onTabIndexChange);
	}

	public void setOnTextboxBlur(java.lang.Object onTextboxBlur) {
		_onTextboxBlur = onTextboxBlur;

		setScopedAttribute("onTextboxBlur", onTextboxBlur);
	}

	public void setOnTextboxChange(java.lang.Object onTextboxChange) {
		_onTextboxChange = onTextboxChange;

		setScopedAttribute("onTextboxChange", onTextboxChange);
	}

	public void setOnTextboxFocus(java.lang.Object onTextboxFocus) {
		_onTextboxFocus = onTextboxFocus;

		setScopedAttribute("onTextboxFocus", onTextboxFocus);
	}

	public void setOnTextboxKey(java.lang.Object onTextboxKey) {
		_onTextboxKey = onTextboxKey;

		setScopedAttribute("onTextboxKey", onTextboxKey);
	}

	public void setOnTypeAhead(java.lang.Object onTypeAhead) {
		_onTypeAhead = onTypeAhead;

		setScopedAttribute("onTypeAhead", onTypeAhead);
	}

	public void setOnTypeAheadChange(java.lang.Object onTypeAheadChange) {
		_onTypeAheadChange = onTypeAheadChange;

		setScopedAttribute("onTypeAheadChange", onTypeAheadChange);
	}

	public void setOnTypeAheadDelayChange(java.lang.Object onTypeAheadDelayChange) {
		_onTypeAheadDelayChange = onTypeAheadDelayChange;

		setScopedAttribute("onTypeAheadDelayChange", onTypeAheadDelayChange);
	}

	public void setOnUniqueNameChange(java.lang.Object onUniqueNameChange) {
		_onUniqueNameChange = onUniqueNameChange;

		setScopedAttribute("onUniqueNameChange", onUniqueNameChange);
	}

	public void setOnUnmatchedItemSelect(java.lang.Object onUnmatchedItemSelect) {
		_onUnmatchedItemSelect = onUnmatchedItemSelect;

		setScopedAttribute("onUnmatchedItemSelect", onUnmatchedItemSelect);
	}

	public void setOnUseARIAChange(java.lang.Object onUseARIAChange) {
		_onUseARIAChange = onUseARIAChange;

		setScopedAttribute("onUseARIAChange", onUseARIAChange);
	}

	public void setOnVisibleChange(java.lang.Object onVisibleChange) {
		_onVisibleChange = onVisibleChange;

		setScopedAttribute("onVisibleChange", onVisibleChange);
	}

	public void setOnContentUpdate(java.lang.Object onContentUpdate) {
		_onContentUpdate = onContentUpdate;

		setScopedAttribute("onContentUpdate", onContentUpdate);
	}

	public void setOnRender(java.lang.Object onRender) {
		_onRender = onRender;

		setScopedAttribute("onRender", onRender);
	}

	public void setOnWidthChange(java.lang.Object onWidthChange) {
		_onWidthChange = onWidthChange;

		setScopedAttribute("onWidthChange", onWidthChange);
	}

	@Override
	protected void cleanUp() {
		super.cleanUp();

		_alwaysShowContainer = null;
		_test = null;
		_applyLocalFilter = true;
		_autoHighlight = true;
		_boundingBox = null;
		_button = true;
		_contentBox = null;
		_cssClass = null;
		_dataSource = null;
		_dataSourceType = null;
		_delimChar = null;
		_destroyed = false;
		_disabled = false;
		_focused = false;
		_forceSelection = false;
		_height = null;
		_hideClass = "aui-helper-hidden";
		_autocompleteId = null;
		_initialized = false;
		_input = null;
		_matchKey = null;
		_maxResultsDisplayed = 10;
		_minQueryLength = 1;
		_queryDelay = 0.2;
		_queryInterval = 0.5;
		_queryMatchCase = false;
		_queryMatchContains = false;
		_queryQuestionMark = true;
		_render = null;
		_rendered = false;
		_schema = null;
		_schemaType = "array";
		_srcNode = null;
		_strings = null;
		_suppressInputUpdate = false;
		_tabIndex = 0;
		_typeAhead = false;
		_typeAheadDelay = 0.2;
		_uniqueName = null;
		_useARIA = true;
		_visible = true;
		_width = null;
		_afterAlwaysShowContainerChange = null;
		_afterApplyLocalFilterChange = null;
		_afterAutoHighlightChange = null;
		_afterBoundingBoxChange = null;
		_afterButtonChange = null;
		_afterContainerCollapse = null;
		_afterContainerExpand = null;
		_afterContainerPopulate = null;
		_afterContentBoxChange = null;
		_afterCssClassChange = null;
		_afterDataError = null;
		_afterDataRequest = null;
		_afterDataReturn = null;
		_afterDataSourceChange = null;
		_afterDataSourceTypeChange = null;
		_afterDelimCharChange = null;
		_afterDestroy = null;
		_afterDestroyedChange = null;
		_afterDisabledChange = null;
		_afterFocusedChange = null;
		_afterForceSelectionChange = null;
		_afterHeightChange = null;
		_afterHideClassChange = null;
		_afterIdChange = null;
		_afterInit = null;
		_afterInitializedChange = null;
		_afterInputChange = null;
		_afterItemArrowFrom = null;
		_afterItemArrowTo = null;
		_afterItemMouseOut = null;
		_afterItemMouseOver = null;
		_afterItemSelect = null;
		_afterMatchKeyChange = null;
		_afterMaxResultsDisplayedChange = null;
		_afterMinQueryLengthChange = null;
		_afterQueryDelayChange = null;
		_afterQueryIntervalChange = null;
		_afterQueryMatchCaseChange = null;
		_afterQueryMatchContainsChange = null;
		_afterQueryQuestionMarkChange = null;
		_afterRenderChange = null;
		_afterRenderedChange = null;
		_afterSchemaChange = null;
		_afterSchemaTypeChange = null;
		_afterSelectionEnforce = null;
		_afterSrcNodeChange = null;
		_afterStringsChange = null;
		_afterSuppressInputUpdateChange = null;
		_afterTabIndexChange = null;
		_afterTextboxBlur = null;
		_afterTextboxChange = null;
		_afterTextboxFocus = null;
		_afterTextboxKey = null;
		_afterTypeAhead = null;
		_afterTypeAheadChange = null;
		_afterTypeAheadDelayChange = null;
		_afterUniqueNameChange = null;
		_afterUnmatchedItemSelect = null;
		_afterUseARIAChange = null;
		_afterVisibleChange = null;
		_afterContentUpdate = null;
		_afterRender = null;
		_afterWidthChange = null;
		_onAlwaysShowContainerChange = null;
		_onApplyLocalFilterChange = null;
		_onAutoHighlightChange = null;
		_onBoundingBoxChange = null;
		_onButtonChange = null;
		_onContainerCollapse = null;
		_onContainerExpand = null;
		_onContainerPopulate = null;
		_onContentBoxChange = null;
		_onCssClassChange = null;
		_onDataError = null;
		_onDataRequest = null;
		_onDataReturn = null;
		_onDataSourceChange = null;
		_onDataSourceTypeChange = null;
		_onDelimCharChange = null;
		_onDestroy = null;
		_onDestroyedChange = null;
		_onDisabledChange = null;
		_onFocusedChange = null;
		_onForceSelectionChange = null;
		_onHeightChange = null;
		_onHideClassChange = null;
		_onIdChange = null;
		_onInit = null;
		_onInitializedChange = null;
		_onInputChange = null;
		_onItemArrowFrom = null;
		_onItemArrowTo = null;
		_onItemMouseOut = null;
		_onItemMouseOver = null;
		_onItemSelect = null;
		_onMatchKeyChange = null;
		_onMaxResultsDisplayedChange = null;
		_onMinQueryLengthChange = null;
		_onQueryDelayChange = null;
		_onQueryIntervalChange = null;
		_onQueryMatchCaseChange = null;
		_onQueryMatchContainsChange = null;
		_onQueryQuestionMarkChange = null;
		_onRenderChange = null;
		_onRenderedChange = null;
		_onSchemaChange = null;
		_onSchemaTypeChange = null;
		_onSelectionEnforce = null;
		_onSrcNodeChange = null;
		_onStringsChange = null;
		_onSuppressInputUpdateChange = null;
		_onTabIndexChange = null;
		_onTextboxBlur = null;
		_onTextboxChange = null;
		_onTextboxFocus = null;
		_onTextboxKey = null;
		_onTypeAhead = null;
		_onTypeAheadChange = null;
		_onTypeAheadDelayChange = null;
		_onUniqueNameChange = null;
		_onUnmatchedItemSelect = null;
		_onUseARIAChange = null;
		_onVisibleChange = null;
		_onContentUpdate = null;
		_onRender = null;
		_onWidthChange = null;
	}

	@Override
	protected String getPage() {
		return _PAGE;
	}

	@Override
	protected void setAttributes(HttpServletRequest request) {
		request.setAttribute("liferay:auto-complete:alwaysShowContainer", _alwaysShowContainer);
		request.setAttribute("liferay:auto-complete:test", _test);
		request.setAttribute("liferay:auto-complete:applyLocalFilter", String.valueOf(_applyLocalFilter));
		request.setAttribute("liferay:auto-complete:autoHighlight", String.valueOf(_autoHighlight));
		request.setAttribute("liferay:auto-complete:boundingBox", _boundingBox);
		request.setAttribute("liferay:auto-complete:button", String.valueOf(_button));
		request.setAttribute("liferay:auto-complete:contentBox", _contentBox);
		request.setAttribute("liferay:auto-complete:cssClass", _cssClass);
		request.setAttribute("liferay:auto-complete:dataSource", _dataSource);
		request.setAttribute("liferay:auto-complete:dataSourceType", _dataSourceType);
		request.setAttribute("liferay:auto-complete:delimChar", _delimChar);
		request.setAttribute("liferay:auto-complete:destroyed", String.valueOf(_destroyed));
		request.setAttribute("liferay:auto-complete:disabled", String.valueOf(_disabled));
		request.setAttribute("liferay:auto-complete:focused", String.valueOf(_focused));
		request.setAttribute("liferay:auto-complete:forceSelection", String.valueOf(_forceSelection));
		request.setAttribute("liferay:auto-complete:height", _height);
		request.setAttribute("liferay:auto-complete:hideClass", _hideClass);
		request.setAttribute("liferay:auto-complete:id", _autocompleteId);
		request.setAttribute("liferay:auto-complete:initialized", String.valueOf(_initialized));
		request.setAttribute("liferay:auto-complete:input", _input);
		request.setAttribute("liferay:auto-complete:matchKey", _matchKey);
		request.setAttribute("liferay:auto-complete:maxResultsDisplayed", _maxResultsDisplayed);
		request.setAttribute("liferay:auto-complete:minQueryLength", _minQueryLength);
		request.setAttribute("liferay:auto-complete:queryDelay", _queryDelay);
		request.setAttribute("liferay:auto-complete:queryInterval", _queryInterval);
		request.setAttribute("liferay:auto-complete:queryMatchCase", String.valueOf(_queryMatchCase));
		request.setAttribute("liferay:auto-complete:queryMatchContains", String.valueOf(_queryMatchContains));
		request.setAttribute("liferay:auto-complete:queryQuestionMark", String.valueOf(_queryQuestionMark));
		request.setAttribute("liferay:auto-complete:render", _render);
		request.setAttribute("liferay:auto-complete:rendered", String.valueOf(_rendered));
		request.setAttribute("liferay:auto-complete:schema", _schema);
		request.setAttribute("liferay:auto-complete:schemaType", _schemaType);
		request.setAttribute("liferay:auto-complete:srcNode", _srcNode);
		request.setAttribute("liferay:auto-complete:strings", _strings);
		request.setAttribute("liferay:auto-complete:suppressInputUpdate", String.valueOf(_suppressInputUpdate));
		request.setAttribute("liferay:auto-complete:tabIndex", _tabIndex);
		request.setAttribute("liferay:auto-complete:typeAhead", String.valueOf(_typeAhead));
		request.setAttribute("liferay:auto-complete:typeAheadDelay", _typeAheadDelay);
		request.setAttribute("liferay:auto-complete:uniqueName", _uniqueName);
		request.setAttribute("liferay:auto-complete:useARIA", String.valueOf(_useARIA));
		request.setAttribute("liferay:auto-complete:visible", String.valueOf(_visible));
		request.setAttribute("liferay:auto-complete:width", _width);
		request.setAttribute("liferay:auto-complete:afterAlwaysShowContainerChange", _afterAlwaysShowContainerChange);
		request.setAttribute("liferay:auto-complete:afterApplyLocalFilterChange", _afterApplyLocalFilterChange);
		request.setAttribute("liferay:auto-complete:afterAutoHighlightChange", _afterAutoHighlightChange);
		request.setAttribute("liferay:auto-complete:afterBoundingBoxChange", _afterBoundingBoxChange);
		request.setAttribute("liferay:auto-complete:afterButtonChange", _afterButtonChange);
		request.setAttribute("liferay:auto-complete:afterContainerCollapse", _afterContainerCollapse);
		request.setAttribute("liferay:auto-complete:afterContainerExpand", _afterContainerExpand);
		request.setAttribute("liferay:auto-complete:afterContainerPopulate", _afterContainerPopulate);
		request.setAttribute("liferay:auto-complete:afterContentBoxChange", _afterContentBoxChange);
		request.setAttribute("liferay:auto-complete:afterCssClassChange", _afterCssClassChange);
		request.setAttribute("liferay:auto-complete:afterDataError", _afterDataError);
		request.setAttribute("liferay:auto-complete:afterDataRequest", _afterDataRequest);
		request.setAttribute("liferay:auto-complete:afterDataReturn", _afterDataReturn);
		request.setAttribute("liferay:auto-complete:afterDataSourceChange", _afterDataSourceChange);
		request.setAttribute("liferay:auto-complete:afterDataSourceTypeChange", _afterDataSourceTypeChange);
		request.setAttribute("liferay:auto-complete:afterDelimCharChange", _afterDelimCharChange);
		request.setAttribute("liferay:auto-complete:afterDestroy", _afterDestroy);
		request.setAttribute("liferay:auto-complete:afterDestroyedChange", _afterDestroyedChange);
		request.setAttribute("liferay:auto-complete:afterDisabledChange", _afterDisabledChange);
		request.setAttribute("liferay:auto-complete:afterFocusedChange", _afterFocusedChange);
		request.setAttribute("liferay:auto-complete:afterForceSelectionChange", _afterForceSelectionChange);
		request.setAttribute("liferay:auto-complete:afterHeightChange", _afterHeightChange);
		request.setAttribute("liferay:auto-complete:afterHideClassChange", _afterHideClassChange);
		request.setAttribute("liferay:auto-complete:afterIdChange", _afterIdChange);
		request.setAttribute("liferay:auto-complete:afterInit", _afterInit);
		request.setAttribute("liferay:auto-complete:afterInitializedChange", _afterInitializedChange);
		request.setAttribute("liferay:auto-complete:afterInputChange", _afterInputChange);
		request.setAttribute("liferay:auto-complete:afterItemArrowFrom", _afterItemArrowFrom);
		request.setAttribute("liferay:auto-complete:afterItemArrowTo", _afterItemArrowTo);
		request.setAttribute("liferay:auto-complete:afterItemMouseOut", _afterItemMouseOut);
		request.setAttribute("liferay:auto-complete:afterItemMouseOver", _afterItemMouseOver);
		request.setAttribute("liferay:auto-complete:afterItemSelect", _afterItemSelect);
		request.setAttribute("liferay:auto-complete:afterMatchKeyChange", _afterMatchKeyChange);
		request.setAttribute("liferay:auto-complete:afterMaxResultsDisplayedChange", _afterMaxResultsDisplayedChange);
		request.setAttribute("liferay:auto-complete:afterMinQueryLengthChange", _afterMinQueryLengthChange);
		request.setAttribute("liferay:auto-complete:afterQueryDelayChange", _afterQueryDelayChange);
		request.setAttribute("liferay:auto-complete:afterQueryIntervalChange", _afterQueryIntervalChange);
		request.setAttribute("liferay:auto-complete:afterQueryMatchCaseChange", _afterQueryMatchCaseChange);
		request.setAttribute("liferay:auto-complete:afterQueryMatchContainsChange", _afterQueryMatchContainsChange);
		request.setAttribute("liferay:auto-complete:afterQueryQuestionMarkChange", _afterQueryQuestionMarkChange);
		request.setAttribute("liferay:auto-complete:afterRenderChange", _afterRenderChange);
		request.setAttribute("liferay:auto-complete:afterRenderedChange", _afterRenderedChange);
		request.setAttribute("liferay:auto-complete:afterSchemaChange", _afterSchemaChange);
		request.setAttribute("liferay:auto-complete:afterSchemaTypeChange", _afterSchemaTypeChange);
		request.setAttribute("liferay:auto-complete:afterSelectionEnforce", _afterSelectionEnforce);
		request.setAttribute("liferay:auto-complete:afterSrcNodeChange", _afterSrcNodeChange);
		request.setAttribute("liferay:auto-complete:afterStringsChange", _afterStringsChange);
		request.setAttribute("liferay:auto-complete:afterSuppressInputUpdateChange", _afterSuppressInputUpdateChange);
		request.setAttribute("liferay:auto-complete:afterTabIndexChange", _afterTabIndexChange);
		request.setAttribute("liferay:auto-complete:afterTextboxBlur", _afterTextboxBlur);
		request.setAttribute("liferay:auto-complete:afterTextboxChange", _afterTextboxChange);
		request.setAttribute("liferay:auto-complete:afterTextboxFocus", _afterTextboxFocus);
		request.setAttribute("liferay:auto-complete:afterTextboxKey", _afterTextboxKey);
		request.setAttribute("liferay:auto-complete:afterTypeAhead", _afterTypeAhead);
		request.setAttribute("liferay:auto-complete:afterTypeAheadChange", _afterTypeAheadChange);
		request.setAttribute("liferay:auto-complete:afterTypeAheadDelayChange", _afterTypeAheadDelayChange);
		request.setAttribute("liferay:auto-complete:afterUniqueNameChange", _afterUniqueNameChange);
		request.setAttribute("liferay:auto-complete:afterUnmatchedItemSelect", _afterUnmatchedItemSelect);
		request.setAttribute("liferay:auto-complete:afterUseARIAChange", _afterUseARIAChange);
		request.setAttribute("liferay:auto-complete:afterVisibleChange", _afterVisibleChange);
		request.setAttribute("liferay:auto-complete:afterContentUpdate", _afterContentUpdate);
		request.setAttribute("liferay:auto-complete:afterRender", _afterRender);
		request.setAttribute("liferay:auto-complete:afterWidthChange", _afterWidthChange);
		request.setAttribute("liferay:auto-complete:onAlwaysShowContainerChange", _onAlwaysShowContainerChange);
		request.setAttribute("liferay:auto-complete:onApplyLocalFilterChange", _onApplyLocalFilterChange);
		request.setAttribute("liferay:auto-complete:onAutoHighlightChange", _onAutoHighlightChange);
		request.setAttribute("liferay:auto-complete:onBoundingBoxChange", _onBoundingBoxChange);
		request.setAttribute("liferay:auto-complete:onButtonChange", _onButtonChange);
		request.setAttribute("liferay:auto-complete:onContainerCollapse", _onContainerCollapse);
		request.setAttribute("liferay:auto-complete:onContainerExpand", _onContainerExpand);
		request.setAttribute("liferay:auto-complete:onContainerPopulate", _onContainerPopulate);
		request.setAttribute("liferay:auto-complete:onContentBoxChange", _onContentBoxChange);
		request.setAttribute("liferay:auto-complete:onCssClassChange", _onCssClassChange);
		request.setAttribute("liferay:auto-complete:onDataError", _onDataError);
		request.setAttribute("liferay:auto-complete:onDataRequest", _onDataRequest);
		request.setAttribute("liferay:auto-complete:onDataReturn", _onDataReturn);
		request.setAttribute("liferay:auto-complete:onDataSourceChange", _onDataSourceChange);
		request.setAttribute("liferay:auto-complete:onDataSourceTypeChange", _onDataSourceTypeChange);
		request.setAttribute("liferay:auto-complete:onDelimCharChange", _onDelimCharChange);
		request.setAttribute("liferay:auto-complete:onDestroy", _onDestroy);
		request.setAttribute("liferay:auto-complete:onDestroyedChange", _onDestroyedChange);
		request.setAttribute("liferay:auto-complete:onDisabledChange", _onDisabledChange);
		request.setAttribute("liferay:auto-complete:onFocusedChange", _onFocusedChange);
		request.setAttribute("liferay:auto-complete:onForceSelectionChange", _onForceSelectionChange);
		request.setAttribute("liferay:auto-complete:onHeightChange", _onHeightChange);
		request.setAttribute("liferay:auto-complete:onHideClassChange", _onHideClassChange);
		request.setAttribute("liferay:auto-complete:onIdChange", _onIdChange);
		request.setAttribute("liferay:auto-complete:onInit", _onInit);
		request.setAttribute("liferay:auto-complete:onInitializedChange", _onInitializedChange);
		request.setAttribute("liferay:auto-complete:onInputChange", _onInputChange);
		request.setAttribute("liferay:auto-complete:onItemArrowFrom", _onItemArrowFrom);
		request.setAttribute("liferay:auto-complete:onItemArrowTo", _onItemArrowTo);
		request.setAttribute("liferay:auto-complete:onItemMouseOut", _onItemMouseOut);
		request.setAttribute("liferay:auto-complete:onItemMouseOver", _onItemMouseOver);
		request.setAttribute("liferay:auto-complete:onItemSelect", _onItemSelect);
		request.setAttribute("liferay:auto-complete:onMatchKeyChange", _onMatchKeyChange);
		request.setAttribute("liferay:auto-complete:onMaxResultsDisplayedChange", _onMaxResultsDisplayedChange);
		request.setAttribute("liferay:auto-complete:onMinQueryLengthChange", _onMinQueryLengthChange);
		request.setAttribute("liferay:auto-complete:onQueryDelayChange", _onQueryDelayChange);
		request.setAttribute("liferay:auto-complete:onQueryIntervalChange", _onQueryIntervalChange);
		request.setAttribute("liferay:auto-complete:onQueryMatchCaseChange", _onQueryMatchCaseChange);
		request.setAttribute("liferay:auto-complete:onQueryMatchContainsChange", _onQueryMatchContainsChange);
		request.setAttribute("liferay:auto-complete:onQueryQuestionMarkChange", _onQueryQuestionMarkChange);
		request.setAttribute("liferay:auto-complete:onRenderChange", _onRenderChange);
		request.setAttribute("liferay:auto-complete:onRenderedChange", _onRenderedChange);
		request.setAttribute("liferay:auto-complete:onSchemaChange", _onSchemaChange);
		request.setAttribute("liferay:auto-complete:onSchemaTypeChange", _onSchemaTypeChange);
		request.setAttribute("liferay:auto-complete:onSelectionEnforce", _onSelectionEnforce);
		request.setAttribute("liferay:auto-complete:onSrcNodeChange", _onSrcNodeChange);
		request.setAttribute("liferay:auto-complete:onStringsChange", _onStringsChange);
		request.setAttribute("liferay:auto-complete:onSuppressInputUpdateChange", _onSuppressInputUpdateChange);
		request.setAttribute("liferay:auto-complete:onTabIndexChange", _onTabIndexChange);
		request.setAttribute("liferay:auto-complete:onTextboxBlur", _onTextboxBlur);
		request.setAttribute("liferay:auto-complete:onTextboxChange", _onTextboxChange);
		request.setAttribute("liferay:auto-complete:onTextboxFocus", _onTextboxFocus);
		request.setAttribute("liferay:auto-complete:onTextboxKey", _onTextboxKey);
		request.setAttribute("liferay:auto-complete:onTypeAhead", _onTypeAhead);
		request.setAttribute("liferay:auto-complete:onTypeAheadChange", _onTypeAheadChange);
		request.setAttribute("liferay:auto-complete:onTypeAheadDelayChange", _onTypeAheadDelayChange);
		request.setAttribute("liferay:auto-complete:onUniqueNameChange", _onUniqueNameChange);
		request.setAttribute("liferay:auto-complete:onUnmatchedItemSelect", _onUnmatchedItemSelect);
		request.setAttribute("liferay:auto-complete:onUseARIAChange", _onUseARIAChange);
		request.setAttribute("liferay:auto-complete:onVisibleChange", _onVisibleChange);
		request.setAttribute("liferay:auto-complete:onContentUpdate", _onContentUpdate);
		request.setAttribute("liferay:auto-complete:onRender", _onRender);
		request.setAttribute("liferay:auto-complete:onWidthChange", _onWidthChange);
	}

	protected static final String _ATTRIBUTE_NAMESPACE = "liferay:auto-complete:";

	private static final String _PAGE =
		"/html/taglib/liferay/auto_complete/page.jsp";

	private java.lang.String _alwaysShowContainer = null;
	private java.lang.String _test = null;
	private boolean _applyLocalFilter = true;
	private boolean _autoHighlight = true;
	private java.lang.String _boundingBox = null;
	private boolean _button = true;
	private java.lang.String _contentBox = null;
	private java.lang.String _cssClass = null;
	private java.lang.Object _dataSource = null;
	private java.lang.String _dataSourceType = null;
	private java.lang.String _delimChar = null;
	private boolean _destroyed = false;
	private boolean _disabled = false;
	private boolean _focused = false;
	private boolean _forceSelection = false;
	private java.lang.Object _height = null;
	private java.lang.String _hideClass = "aui-helper-hidden";
	private java.lang.String _autocompleteId = null;
	private boolean _initialized = false;
	private java.lang.String _input = null;
	private java.lang.Object _matchKey = null;
	private java.lang.Object _maxResultsDisplayed = 10;
	private java.lang.Object _minQueryLength = 1;
	private java.lang.Object _queryDelay = 0.2;
	private java.lang.Object _queryInterval = 0.5;
	private boolean _queryMatchCase = false;
	private boolean _queryMatchContains = false;
	private boolean _queryQuestionMark = true;
	private java.lang.Object _render = null;
	private boolean _rendered = false;
	private java.lang.Object _schema = null;
	private java.lang.String _schemaType = "array";
	private java.lang.String _srcNode = null;
	private java.lang.Object _strings = null;
	private boolean _suppressInputUpdate = false;
	private java.lang.Object _tabIndex = 0;
	private boolean _typeAhead = false;
	private java.lang.Object _typeAheadDelay = 0.2;
	private java.lang.String _uniqueName = null;
	private boolean _useARIA = true;
	private boolean _visible = true;
	private java.lang.Object _width = null;
	private java.lang.Object _afterAlwaysShowContainerChange = null;
	private java.lang.Object _afterApplyLocalFilterChange = null;
	private java.lang.Object _afterAutoHighlightChange = null;
	private java.lang.Object _afterBoundingBoxChange = null;
	private java.lang.Object _afterButtonChange = null;
	private java.lang.Object _afterContainerCollapse = null;
	private java.lang.Object _afterContainerExpand = null;
	private java.lang.Object _afterContainerPopulate = null;
	private java.lang.Object _afterContentBoxChange = null;
	private java.lang.Object _afterCssClassChange = null;
	private java.lang.Object _afterDataError = null;
	private java.lang.Object _afterDataRequest = null;
	private java.lang.Object _afterDataReturn = null;
	private java.lang.Object _afterDataSourceChange = null;
	private java.lang.Object _afterDataSourceTypeChange = null;
	private java.lang.Object _afterDelimCharChange = null;
	private java.lang.Object _afterDestroy = null;
	private java.lang.Object _afterDestroyedChange = null;
	private java.lang.Object _afterDisabledChange = null;
	private java.lang.Object _afterFocusedChange = null;
	private java.lang.Object _afterForceSelectionChange = null;
	private java.lang.Object _afterHeightChange = null;
	private java.lang.Object _afterHideClassChange = null;
	private java.lang.Object _afterIdChange = null;
	private java.lang.Object _afterInit = null;
	private java.lang.Object _afterInitializedChange = null;
	private java.lang.Object _afterInputChange = null;
	private java.lang.Object _afterItemArrowFrom = null;
	private java.lang.Object _afterItemArrowTo = null;
	private java.lang.Object _afterItemMouseOut = null;
	private java.lang.Object _afterItemMouseOver = null;
	private java.lang.Object _afterItemSelect = null;
	private java.lang.Object _afterMatchKeyChange = null;
	private java.lang.Object _afterMaxResultsDisplayedChange = null;
	private java.lang.Object _afterMinQueryLengthChange = null;
	private java.lang.Object _afterQueryDelayChange = null;
	private java.lang.Object _afterQueryIntervalChange = null;
	private java.lang.Object _afterQueryMatchCaseChange = null;
	private java.lang.Object _afterQueryMatchContainsChange = null;
	private java.lang.Object _afterQueryQuestionMarkChange = null;
	private java.lang.Object _afterRenderChange = null;
	private java.lang.Object _afterRenderedChange = null;
	private java.lang.Object _afterSchemaChange = null;
	private java.lang.Object _afterSchemaTypeChange = null;
	private java.lang.Object _afterSelectionEnforce = null;
	private java.lang.Object _afterSrcNodeChange = null;
	private java.lang.Object _afterStringsChange = null;
	private java.lang.Object _afterSuppressInputUpdateChange = null;
	private java.lang.Object _afterTabIndexChange = null;
	private java.lang.Object _afterTextboxBlur = null;
	private java.lang.Object _afterTextboxChange = null;
	private java.lang.Object _afterTextboxFocus = null;
	private java.lang.Object _afterTextboxKey = null;
	private java.lang.Object _afterTypeAhead = null;
	private java.lang.Object _afterTypeAheadChange = null;
	private java.lang.Object _afterTypeAheadDelayChange = null;
	private java.lang.Object _afterUniqueNameChange = null;
	private java.lang.Object _afterUnmatchedItemSelect = null;
	private java.lang.Object _afterUseARIAChange = null;
	private java.lang.Object _afterVisibleChange = null;
	private java.lang.Object _afterContentUpdate = null;
	private java.lang.Object _afterRender = null;
	private java.lang.Object _afterWidthChange = null;
	private java.lang.Object _onAlwaysShowContainerChange = null;
	private java.lang.Object _onApplyLocalFilterChange = null;
	private java.lang.Object _onAutoHighlightChange = null;
	private java.lang.Object _onBoundingBoxChange = null;
	private java.lang.Object _onButtonChange = null;
	private java.lang.Object _onContainerCollapse = null;
	private java.lang.Object _onContainerExpand = null;
	private java.lang.Object _onContainerPopulate = null;
	private java.lang.Object _onContentBoxChange = null;
	private java.lang.Object _onCssClassChange = null;
	private java.lang.Object _onDataError = null;
	private java.lang.Object _onDataRequest = null;
	private java.lang.Object _onDataReturn = null;
	private java.lang.Object _onDataSourceChange = null;
	private java.lang.Object _onDataSourceTypeChange = null;
	private java.lang.Object _onDelimCharChange = null;
	private java.lang.Object _onDestroy = null;
	private java.lang.Object _onDestroyedChange = null;
	private java.lang.Object _onDisabledChange = null;
	private java.lang.Object _onFocusedChange = null;
	private java.lang.Object _onForceSelectionChange = null;
	private java.lang.Object _onHeightChange = null;
	private java.lang.Object _onHideClassChange = null;
	private java.lang.Object _onIdChange = null;
	private java.lang.Object _onInit = null;
	private java.lang.Object _onInitializedChange = null;
	private java.lang.Object _onInputChange = null;
	private java.lang.Object _onItemArrowFrom = null;
	private java.lang.Object _onItemArrowTo = null;
	private java.lang.Object _onItemMouseOut = null;
	private java.lang.Object _onItemMouseOver = null;
	private java.lang.Object _onItemSelect = null;
	private java.lang.Object _onMatchKeyChange = null;
	private java.lang.Object _onMaxResultsDisplayedChange = null;
	private java.lang.Object _onMinQueryLengthChange = null;
	private java.lang.Object _onQueryDelayChange = null;
	private java.lang.Object _onQueryIntervalChange = null;
	private java.lang.Object _onQueryMatchCaseChange = null;
	private java.lang.Object _onQueryMatchContainsChange = null;
	private java.lang.Object _onQueryQuestionMarkChange = null;
	private java.lang.Object _onRenderChange = null;
	private java.lang.Object _onRenderedChange = null;
	private java.lang.Object _onSchemaChange = null;
	private java.lang.Object _onSchemaTypeChange = null;
	private java.lang.Object _onSelectionEnforce = null;
	private java.lang.Object _onSrcNodeChange = null;
	private java.lang.Object _onStringsChange = null;
	private java.lang.Object _onSuppressInputUpdateChange = null;
	private java.lang.Object _onTabIndexChange = null;
	private java.lang.Object _onTextboxBlur = null;
	private java.lang.Object _onTextboxChange = null;
	private java.lang.Object _onTextboxFocus = null;
	private java.lang.Object _onTextboxKey = null;
	private java.lang.Object _onTypeAhead = null;
	private java.lang.Object _onTypeAheadChange = null;
	private java.lang.Object _onTypeAheadDelayChange = null;
	private java.lang.Object _onUniqueNameChange = null;
	private java.lang.Object _onUnmatchedItemSelect = null;
	private java.lang.Object _onUseARIAChange = null;
	private java.lang.Object _onVisibleChange = null;
	private java.lang.Object _onContentUpdate = null;
	private java.lang.Object _onRender = null;
	private java.lang.Object _onWidthChange = null;

}
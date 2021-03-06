<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="atf" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="icons" tagdir="/WEB-INF/tags/icons"%>

<!-- ko if: editLayoutId()=="createExpectResult4DB"-->
<section data-for="createExpectResult4DB" style="color:gray">
	<!-- ko with: $root.resultVerify-->
	<div class="edit-layout-title">
		<span style="width:100%">添加预期结果</span>
		<button title="保存" data-bind="click:databaseConfig.saveResultLayout" class="edit-layout-save">
			<icons:icon_save></icons:icon_save>
		</button>
		<button title="关闭" data-bind="click:$root.closeEditLayout" class="edit-layout-close">
			<icons:icon_close></icons:icon_close>
		</button>
	</div>
	<div class="edit-layout-content">
		<!-- ko with: editConfig -->
		<atf:form_select text="选择服务器" bind="options:$parent.databaseConfig.verifyServers, optionsText: 'name', selectedOptions:server"></atf:form_select>
		<atf:form_text text="数据库名" bind="value: database, valueUpdate: 'afterkeydown'"></atf:form_text>
		<atf:form_textarea text="查询语句" bind="value: query, valueUpdate: 'afterkeydown'"></atf:form_textarea>
		<input style="margin-top:15px;font-size: 12px;" value="执行查询语句，生成预期结果" type="button">
		<atf:form_textarea text="预期结果" bind="value: text, valueUpdate: 'afterkeydown'"></atf:form_textarea>
		<!-- /ko -->
	</div>
	<!-- /ko -->
</section>
<!-- /ko -->
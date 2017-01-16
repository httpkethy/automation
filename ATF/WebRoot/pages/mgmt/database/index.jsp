<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="atf" tagdir="/WEB-INF/tags"%>
<div id="database" data-vm="mo.run">
	<!-- ko if: isLoadingData() -->
	<form:loading text="后台正在很努力的加载数据..."></form:loading>
	<!-- /ko -->
	<!-- ko if: !isLoadingData() -->
	<atf:form_text text="加载数据成功" bind=""  tip="数据不能超过255个字符，一个汉字算2个字符"></atf:form_text>
	<!-- /ko -->
</div>
<script>
    $.registVM();
</script>
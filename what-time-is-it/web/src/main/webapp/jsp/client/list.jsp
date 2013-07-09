<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<sj:head jqueryui="true" />

</head>
<body>
	<h3>Lista de usuarios</h3>

	<s:url var="jsonClientList" action="json" />

	<sjg:grid 
		gridModel="gridModel" 
		href="%{jsonClientList}"
		dataType="json" pager="true" rowNum="10" rowList="5, 10, 15"
		rownumbers="true" multiselect="true">
		<sjg:gridColumn name="clientName" title="clientName" />
		<sjg:gridColumn name="banco" title="banco" />
	</sjg:grid>









</body>
</html>
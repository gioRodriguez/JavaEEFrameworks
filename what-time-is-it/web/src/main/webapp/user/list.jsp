<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<sj:head jqueryui="true" />

</head>
<body>
	<header> Tecgurus </header>

	<s:url var="userListJson" action="json" />
	<s:url var="bankListJson" action="json" namespace="/bank"/>
	
	<sj:select list="bankMap" href="%{bankListJson}"/>
	
	<sjg:grid gridModel="gridModel" dataType="json" href="%{userListJson}"
		pager="true" gridModel="gridModel" rowList="10,15,20" rowNum="15"
		rownumbers="true">
		<sjg:gridColumn name="userEmail" title="userEmail" />
		<sjg:gridColumn name="userEmail" title="userName" />
	</sjg:grid>



	<footer>saludos a todos</footer>
</body>
</html>
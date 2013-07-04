<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<sj:head jqueryui="true"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add new user</title>

<link href="//resources/css/addUser.css" type="text/css" />

</head>
<body>

	<s:form method="post">
		<sj:textfield name="userFirstName" id="userNameTxt" label="Nombre de usuario"/>

		<sj:textfield id="userEmailTxt" name="userEmail" label="Email de usuario" />

		<sj:submit label="Aceptar"/>
	</s:form>
	
</body>
</html>
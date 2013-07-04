<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add new user</title>

<link href="//resources/css/addUser.css" type="text/css" />

</head>
<body>

	<s:form method="post">

		<s:textfield id="userNameTxt" name="userFirstName"
			label="Nombre de usuario" />

		<s:textfield id="userEmailTxt" name="userEmail"
			label="Email de usuario" />

		<s:submit label="Aceptar"></s:submit>
	</s:form>

	<!--<script type="text/javascript" src="resources/thirdparty/jquery/jquery-1.10.1.js"></script>-->
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"></script>
</body>
</html>
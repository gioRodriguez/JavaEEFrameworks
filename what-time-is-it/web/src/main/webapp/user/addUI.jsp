<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<sj:head jqueryui="true" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add new user</title>

<link href="//resources/css/addUser.css" type="text/css" />

</head>
<body>
	<header>
		<h3>Registro de usuario</h3>
	</header>
	<s:form method="post">
		<sj:textfield name="userFirstName" label="Nombre de usuario:"
			id="userNameTxt" title="por favor ingrese el nombre" />

		<sj:textfield id="userEmailTxt" label="Email de usuario:"
			name="userEmail" title="por favor ingrese el correo" />

		<sj:submit value="Aceptar" />
	</s:form>

</body>
</html>
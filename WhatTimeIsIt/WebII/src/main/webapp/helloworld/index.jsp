<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<s:form action="/holamundo/HolaATodos.action" method="post">
		Mayor?: <s:checkbox name="mayor" />		
		Nombre: <s:textfield name="nombre" />
		Sabores: <s:select 
					list="{'Limon', 'Pera', 'Chocolate'}" 
					name="sabores" 
					multiple="true"/>

		Nombre padre: <s:textfield name="padreModel.nombrePadre"/>
				
		<s:iterator value="padreModel.hijosModel" status="hijoStat" var="hijo">
			Nombre hijo: <s:textfield name="padreModel.hijosModel[%{#hijoStat.count-1}].nombreHijo"/>
		</s:iterator>							
			
		<s:submit value="Aceptar"></s:submit>
	</s:form>

	<div>
		<ul>
			<li>Hola <s:property value="nombre" />!!
			</li>
			<li>Mayor: <s:property value="mayor" /> <!-- texto --> <s:checkbox
					value="mayor" name="mayor" /> <!-- checkbox -->

			</li>
	
			<li style="font-weight: bold;">UserId: <s:property
					value="userId" /></li>
			<li><h4>Sabores</h4> <s:property value="sabores" /></li>		
			
			<li>Nombre padre: <s:property value="padreModel.nombrePadre"/></li>
			
			<s:iterator value="padreModel.hijosModel">
				<li>Nombre hijo: <s:property value="nombreHijo"/></li>
			</s:iterator>			
			
			<li>Caracteres nombre hijo: <s:property value="padreModel.hijosModel[0].nombreHijo.length()"/></li>
						
			<s:if test="'Chocolate' in sabores">
				<li> <a href="#">Compra un pastel de <s:property value="sabores"/> </a> </li>				
			</s:if>			
		</ul>
	</div>

</body>
</html>

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
	
	<sj:select list="bankMap" href="%{bankListJson}" id="bankMap"/>
	
	<sjg:grid id="userGrid"
		gridModel="gridModel" 
		dataType="json" 
		href="%{userListJson}"			
		rowList="5, 10, 15"
		rowNum="15"
		rownumbers="true" 
		multiselect="true"
		pager="true">
		<sjg:gridColumn name="userEmail" title="userEmail" />
		<sjg:gridColumn name="userName" title="userName" />
	</sjg:grid>

	<footer>saludos a todos</footer>
	<script type="text/javascript">
	function getBankSelectedId(){
		var bankSelected = $('#bankMap option:selected')[0];
		var bankId = $(bankSelected) && $(bankSelected).attr('value');
		return bankId;
	}
	
	$('#bankMap').change(function(){
		var bankId = getBankSelectedId();
		var oldUrl = $('#userGrid').jqGrid('getGridParam', 'url');
		var newUrl = oldUrl + $.param({'bankId':bankId});
		
		$('#userGrid').jqGrid('setGridParam', { url:newUrl });
		$("#userGrid").trigger("reloadGrid"); 
	});
	</script>
</body>
</html>
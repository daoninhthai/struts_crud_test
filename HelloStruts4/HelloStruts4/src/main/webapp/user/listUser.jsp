<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<html:link page="/add-user.html">
		<bean:message key="button.submit" />
	</html:link>
	<logic:empty name="userList">
		<p>
			<bean:message key="no.user" />
		</p>
	</logic:empty>
	<logic:notEmpty name="userList">
		<table>
			<tr>
				<th><bean:message key="user.id"/></th>
				<th><bean:message key="user.name"/></th>
				<th><bean:message key="user.age"/></th>
			</tr>
			<logic:iterate id="user" name ="userList">
			<tr>
				<td><bean:write name ="user" property="id" /></td>
				<td><bean:write name ="user" property="name" /></td>
				<td><bean:write name ="user" property="age" /></td>
				<td> <html:link page="/edit-user.html" paramId="userId" paramName="user" paramProperty="id"><bean:message key ="button.edit"/></html:link> </td>
				<td> <html:link page="/delete-user.html" paramId="userId" paramName="user" paramProperty="id"><bean:message key ="button.delete"/></html:link> </td>
				<td> <html:link page="/view-user.html" paramId="userId" paramName="user" paramProperty="id"><bean:message key ="button.view"/></html:link> </td>
			</tr>
			</logic:iterate>
		</table>
		</logic:notEmpty>
</body>
</html>
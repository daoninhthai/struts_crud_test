<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p style="color:red">
	<html:errors />
</p>
	<html:form action="/edit-user-post.html" method="post">
	<html:hidden property="id" name ="user"/>
		<p>
			<bean:message key="user.name" />
		</p>
		<html:messages id="name_error" property="user.name.required">
			<p style="color: red">
				<bean:write name="name_error" />
			</p>
		</html:messages>
		<html:text property="name" name="user"></html:text>

		<p>
			<bean:message key="user.age" />
		</p>
		<html:messages id="age_error" property="user.age.invalid">
			<p style="color: red">
				<bean:write name="age_error" />
			</p>
		</html:messages>
		<html:text property="age" name="user"></html:text>

		<html:submit>Submit</html:submit>
	</html:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Add/Edit Post</title>
</head>	
<body>

<h1>Add/Edit Post</h1>
<%--@elvariable id="u" type="com"--%>
<form:form modelAttribute="u" method="POST" action="../editok">
	<form:hidden path="seq"/>
	<table id="edit">
		<tr><td>Title</td><td><form:input path="title"/></td></tr>
		<tr><td>MName</td><td><form:input path="mname"/></td></tr>
		<tr><td>FName</td><td><form:input path="fname"/></td></tr>
		<tr><td>Picture</td><td><form:input path="picture"/></td></tr>
		<tr><td>Kind</td><td><form:input path="kind"/></td></tr>
		<tr><td>PNumber</td><td><form:input path="pnumber"/></td></tr>
		<tr><td>Comeday</td><td><form:input path="comeday"/></td></tr>
		<tr><td>Byeday</td><td><form:input path="byeday"/></td></tr>
		<tr><td>Regdate</td><td><form:input path="regdate"/></td></tr>
		<tr><td>Contents</td><td><form:input path="contents"/></td></tr>
	</table>
	<input type="submit" value="수정하기"/>
	<input type="button" value="취소하기" onclick="history.back()">
</form:form>

</body>
</html>

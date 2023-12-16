<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<h1>Add New Post</h1>
<form action="addok" method="post">
    <table id ="edit">
        <tr><td>주인이름:</td><td><input type="text" name="mname"/></td></tr>
        <tr><td>동물이름:</td><td><input type="text" name="pname"/></td></tr>
        <tr><td>종:</td><td><input type="text" name="kind"/></td></tr>
        <tr><td>휴대전화번호:</td><td><input type="text" name="pnumber"/></td></tr>
        <tr><td>입원날짜:</td><td><input type="date" name="comeday"/></td></tr>
        <tr><td>내용:</td><td><textarea cols="50" rows="5" name="contents"></textarea></td></tr>
    </table>
    <button type="button" onclick="location.href='list'">목록보기</button>
    <button type="submit">등록하기</button>
</form>

</body>
</html>
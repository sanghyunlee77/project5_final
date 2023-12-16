<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>

<h1>BOARD post</h1>
<img src="../img/img.png" width="300"/>
<div class="table-responsive">
    <table class="table table-striped table-sm">
        <tr>
            <th>Id</th>
            <th>주인 성함</th>
            <th>애완동물 이름</th>
            <th>사진</th>
            <th>종</th>
            <th>휴대전화 번호</th>
            <th>입원날짜</th>
            <th>퇴원날짜</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${list}" var="u">
            <tr>
                <td>${u.getSeq()}</td>
                <td>${u.getMname()}</td>
                <td>${u.getPname()}</td>
                <td>${u.getPicture()}</td>
                <td>${u.getKind()}</td>
                <td>${u.getPnumber()}</td>
                <td>${u.getComeday()}</td>
                <td>${u.getByeday()}</td>
                <td><a href="editpost/${u.getSeq()}">Edit</a></td>
                <td><a href="javascript:delete_ok('${u.getSeq()}')">Delete</a></td>
            </tr>
        </c:forEach>
    </table>
    <br/><a href="add">Add New Post</a>
</div>

</body>
<script>
    function delete_ok(id){
        var a = confirm("정말로 삭제하시겠습니까?");
        if(a) location.href='../deleteok/'+id;
    }
</script>
</html>

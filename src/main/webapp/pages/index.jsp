<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="/js/jquery-1.11.0.min.js"></script>
<title>学生信息</title>
</head>
<body>
<div align="center">
<table>
	<tr>
		<td>编号</td>
		<td>姓名</td>
	</tr>
	<c:forEach items="${studentList}" var="student" >
	<tr>
		<td>${student.id}</td>
		<td>${student.sname }</td>
	</tr>
	</c:forEach> 
	<tr>
	<td><form action="addStudent" method="post">
		<input type="text" name="sname">
		<input type="submit"value="添加">
	</form></td>
	</tr>
</table>
</div>
</body>
</html>
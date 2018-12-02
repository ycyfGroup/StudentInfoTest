<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<base href="<%=basePath%>">
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<title>学生个人信息</title>
</head>
<body>
	<div align="center">
		<table border="1px">
			<tr>
				<td>编号</td>
				<td>姓名</td>
			</tr>
			<c:forEach items="${studentList }" var="student">
				<tr>
					<td>${student.id }</td>
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="/js/jquery.min.js"></script>
</head>
<script type="text/javascript">
function del() {	
	$.ajax({
		url : '/delete/1',
		data : "id=1",
		type : 'delete',
		success : function(data) {			
				alert("删除用户信息成功....");							
		}
	});
}
</script>
<body>
<input type="button" onclick="del()" value="删除">

</body>
</html>
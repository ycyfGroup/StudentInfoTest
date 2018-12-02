function del(id) {	
	$.ajax({
		url : '/delete/' + id,
		data : "id="  + id,
		type : 'delete',
		success : function(data) {			
				alert("删除用户信息成功le....");							
		}
	});
}
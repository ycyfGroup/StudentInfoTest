function del(id) {	
	$.ajax({
		url : '/delete/' + id,
		data : "id="  + id,
		type : 'delete',
		success : function(data) {
			if(data.code == 1){
				alert("删除用户信息成功le....");	
				location.href="/all";
			}else{
				alert(data.errorMsg);
			}
										
		}
	});
}
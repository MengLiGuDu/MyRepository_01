<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String project = request.getContextPath();
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<input type="text" name="id"><br>
		<input type="password" name="password"><br>
		<button id="submit">提交</button>
	</form>
</body>
<script type="text/javascript" src="<%=project %>/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$('#submit').click(function(){
		var data = $(document.forms[0]).serialize();
		alert("data="+data);
		$.ajax({
			type:'post',
			data:data,
			url:'/Cross-project_Access/login.action',
			success:function(res){
				alert("res="+res);
			},
			error:function(res){
				alert("error");
			},
			async:true
		})
		return false;
	})
</script>
</html>
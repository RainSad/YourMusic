<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="public/plugin/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	function test(){
		var b = new Base64()
		var name = b.encode("恋人心");
		 $.ajax({
	            type:"POST",
	            url:"http://music.163.com/api/search/pc",
	            data:{
	            	s:"JXU2MDRCJXU0RUJBJXU1RkMz",
	            	offset:"1",
	            	limit:"20",
	            	type:'1'
	            },
	            datatype: "json",
	            success:function(data){
	           		alert(data);
	            
	            }          
	         });
	}
</script>
<title>Insert title here</title>
</head>
<body>
<button onclick="test()"></button>
</body>
</html>
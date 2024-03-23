<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
<style type="text/css">
   input {
	width: 400px;
	height: 40px;
  }
  form{
      text-align: center;
  }
</style>
</head>
<body>
<jsp:include page="home.jsp"></jsp:include>
<form name="frm" action="fUpdate" method="POST">
     <input type="hidden" name="id" value="${id}" ><br><br>
     <input type="text" name="name" value="${name}" ><br><br>
     <input type="text" name="email" value="${email}" ><br><br>
     <input type="text" name="sal" value="${sal}" ><br><br>
     <input type="submit" name="s" value="Updates Employee" ><br><br>
</form>
</body>
</html>
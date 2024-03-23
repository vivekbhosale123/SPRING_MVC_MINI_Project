<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
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
<form name="frm" action="saved" method="POST">
     <input type="text" name="name" value="" ><br><br>
     <input type="text" name="email" value="" ><br><br>
     <input type="text" name="sal" value="" ><br><br>
     <input type="submit" name="s" value="Add Employee" ><br><br>
     <h1>${msg}</h1>
</form>
</body>
</html>
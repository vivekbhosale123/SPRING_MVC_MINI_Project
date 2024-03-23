<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ViewEmployee</title>
<style type="text/css">
    input{
       width:660px;
       height: 40px;
    }
  table{
      margin-left: 280px;
  }
</style>
</head>
<body>
  <jsp:include page="home.jsp"></jsp:include>
    <table border="2" width="60%">
        <tr>
            <th>NAME</th>
            <th>EMAIL</th>
            <th>SALARY</th>
            <th>DELETE</th>
            <th>UPDATE</th>
        </tr>
        <c:forEach var="c" items="${view}">
           <tr>
             <td>${c.getName()}</td>
             <td>${c.getEmail()}</td>
             <td>${c.getSal()}</td>
             <td><a href="deleteEmployee?id=${c.getId()}">DELETE</a></td>
             <td><a href="updateEmployee?id=${c.getId()}&name=${c.getName()}&email=${c.getEmail()}&sal=${c.getSal()}">UPDATE</a></td>
           </tr>
        </c:forEach>
    </table>
</body>
</html>
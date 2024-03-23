<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <style type="text/css">
           ul{
              display:flex;
              width:1100px;
              height:60px;
              background-color:lime;
           }
           ul li {
             list-style: none;
             padding: 10px;
           }
           ul li a{
              text-decoration: none;
              color: white;
              margin: 20px;
              padding: 20px;
              font-size: 22px;
           }
           ul li a:hover{
              color: red;
           }
        </style>
    </head>
    <body>
      <center>
        <ul>
            <li><a href="addEmployee">Add Employee</a></li>
            <li><a href="viewEmployee">View Employee</a></li>
            <li><a href="searchEmployee">Search Employee</a></li>
            <li><a href="">Update Employee</a></li>
        </ul>
        </center>
    </body>
</html>

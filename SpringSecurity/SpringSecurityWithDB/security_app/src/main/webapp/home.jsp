<%@ page language ="java" contentType="text/html; charset=ISO-8859-1" pageEncoding ="ISO-8859-1" %>


<!DOCTYPE html>
<html>
<head>
<meta charset ="ISO-8859-1">
<title> Just a login Page here</title>
</head>
<body>
Welcome Gillians
  <h1> Body</h1
  ${SPRING_SECURITY_LAST_EXCEPTION.message}
  <form action ="login" method="POST">
  <table>
  <tr>
  <td>User></td>
  <td><input type='text' name ='username' value ='username'></td>
  </tr>
  <td>Password></td>
  <td><input type='password' name ='password' value ='username'></td>
  </tr>
  <tr>
  <td><input type='submit' name ='submit' value ='submit'></td>
  </tr>
  
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
 body{
 background-color:lightblue;
 }
</style>
</head>
<body>
	<div align="center">
		<h1>USER REGISTER FORM</h1>
		<form action="<%=request.getContextPath()%>/login" method="post">
			<table>
				<tr>
                    <td>USERNAME</td>
                    <td><input type="text" name="username"></td>
				</tr>
					<tr>
                    <td>PASSWORD</td>
                    <td><input type="password" name="password"></td>
				</tr>
			</table>
			<input type="submit" name="submit" value="submit">
			<input type="button" name="cancel" value="cancel"><br>
			<a href="signup.jsp">click for Signup</a>
		</form>
	</div>
</body>
</html>
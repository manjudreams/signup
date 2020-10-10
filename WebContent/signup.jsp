<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>USER SIGNUP PAGE</h3>
	<form action="<%=request.getContextPath()%>/signup" method="post">
		<table style="with: 100">
			<tr>
				<td>FIRST-NAME</td>
				<td><input type="text" name="firstname"></td>
			</tr>
			<tr>
				<td>LAST-NAME</td>
				<td><input type="text" name="lastname"></td>
			</tr>
			<tr>
				<td>USER-NAME</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>PASSWORD</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td>E-mail</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>MOBILE-NO</td>
				<td><input type="text" name="mobile"></td>
			</tr>
		</table>
		<input type="submit" name="submit">
	</form>
</body>
</html>
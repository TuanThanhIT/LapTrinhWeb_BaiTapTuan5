<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>/* Bordered form */
form {
	border: 3px solid #f1f1f1;
}

/* Full-width inputs */
input[type=text], input[type=password] {
	width: 100%;
	padding: 12px 20px;
	margin: 8px 0;
	display: inline-block;
	border: 1px solid #ccc;
	box-sizing: border-box;
}

/* Set a style for all buttons */
button {
	background-color: #04AA6D;
	color: white;
	padding: 14px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
}

/* Add a hover effect for buttons */
button:hover {
	opacity: 0.8;
}

/* Extra style for the cancel button (red) */
.cancelbtn {
	width: auto;
	padding: 10px 18px;
	background-color: #f44336;
}

/* Center the avatar image inside this container */
.imgcontainer {
	text-align: center;
	margin: 24px 0 12px 0;
}

/* Avatar image */
img.avatar {
	width: 40%;
	border-radius: 50%;
}

/* Add padding to containers */
.container {
	padding: 16px;
}

/* The "Forgot password" text */
span.psw {
	float: right;
	padding-top: 2px;
}

span.psp{
	float: left;
	padding-top: 2px;
}
/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
	span.psw {
		display: block;
		float: none;
	}
	.cancelbtn {
		width: 100%;
	}
	
}
</style>
</head>
<body>
	<c:if test="${alert !=null}">
		<h3 class="alert alertdanger">${alert}</h3>
	</c:if>
	<form action="login" method="post">
		<div class="imgcontainer">
			<img src="https://media.istockphoto.com/id/133876248/vi/anh/%C4%91%E1%BA%A3o-%C4%91%E1%BB%8Ba-trung-h%E1%BA%A3i.jpg?s=612x612&w=0&k=20&c=Cr4V4pr3od0iDrrVbU3pODATaavccwO6d7JcybLHV-0=" alt="Avatar" class="avatar">
		</div>

		<div class="container">
			<label for="uname"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="username"> <label
				for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password">

			<button type="submit">Login</button>

			<label> <input type="checkbox" name="remember">
				Remember me
			</label>
		</div>

		<div class="container" style="background-color: #f1f1f1">
			<span class="psw">Forgot <a href="http://localhost:8080/HelloWorld/forgotpass">password ?</a></span>
			<span class="psp">If you do not have an account on the system, please <a href="http://localhost:8080/HelloWorld/register">register.</a></span>
		</div>
		
	</form>
</body>
</html>
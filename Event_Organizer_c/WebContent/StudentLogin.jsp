<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="StudLog.css">
    <link rel="stylesheet" href="js/bootstrap.min.js">
    <title>user login</title>
</head>

<body>
    <div class="container">
        <div class="title">Student login</div>
        <form action="StudLogin" method = "get">
            <div class="user-details">
                <div class="input-box">
                    <div class="details">Username</div>
                    <input type="text" placeholder="User Name" name = "Student_name" required>
                </div>
                <div class="input-box">
                    <div class="details">Password</div>
                    <input type="text" placeholder="Password" name = "Password" required>
                </div>
            </div>
            <div class="login"><a href="#">Forgot password?</a></div>
            <div class="button">
                <input type="submit" value="Login">
            </div>
            <div class="register">Don't have account?<a href="StudentRegistration.jsp">Register</a></div>
        </form>
    </div>
</body>
<script type="text/javascript" src="js/query-2.1.4.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/script.js"></script>

</html>
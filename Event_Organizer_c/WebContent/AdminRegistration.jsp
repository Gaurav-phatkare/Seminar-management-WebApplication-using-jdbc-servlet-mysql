<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en" dir="ltr">

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="AdminReg.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

    <div class="container">
        <div class="title">Admin Registration</div>
        <div class="content">
            <form action="AdminRegServlet" method = "post">
                <div class="user-details">
                    <div class="input-box">
                        <span class="details">Admin Full Name</span>
                        <input type="text" placeholder=" Enter your full name" name = "Admin_name"required>
                    </div>
                    <div class="input-box">
                        <span class="details">Contact Number</span>
                        <input type="text" placeholder="Enter your phone number" name = "Contact" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Email</span>
                        <input type="email" placeholder="Enter your email" name = "Email" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Password</span>
                        <input type="password" placeholder="Create password" name = "Password" required>
                    </div>
                    <div class="input-box">
                        <span class="details">City</span>
                        <input type="text" placeholder="Enter your City" name = "City" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Qualification</span>
                        <input type="text" placeholder="Enter your qualification" name = "Qualification" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Field of interest</span>
                        <input type="text" placeholder="Enter Field of intrest" name = "Interest" required>
                    </div>
                </div>
                <div class="button">
                    <input type="submit" value="Register">
                </div>
                <div class="login">Already have account? <a href="AdminLogin.jsp">Login</a></div>
            </form>
        </div>
    </div>
    <script type="text/javascript" src="js/query-2.1.4.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/script.js"></script>
</body>

</html>
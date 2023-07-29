<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="MentReg.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
 
  <div class="container">
    <div class="title">Mentor Registration</div>
    <div class="content">
      <form action="MentRegServlet" method = "post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Full Name</span>
            <input type="text" placeholder=" Enter your name" name = "name" required>
          </div>
          <div class="input-box">
            <span class="details">Contact Number</span>
            <input type="number" placeholder="Enter your phone number" name = "contact" required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="email" placeholder="Enter your email" name = "email" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" placeholder="Create password" name = "password" required>
          </div>

          <div class="input-box">
            <span class="details">Age</span>
            <input type="number" placeholder="Enter your Age" name = "age" required>
          </div>
          <div class="input-box">
            <span class="details">Qualification</span>
            <input type="text" placeholder="Enter your qualification" name = "qualification" required>
          </div>
          <div class="input-box">
            <span class="details">Working Experience</span>
            <input type="text" placeholder="Enter your working experience(Yrs)" name = "work_experience" required>
          </div>
          <div class="input-box">
            <span class="details">Specialization</span>
            <input type="text" placeholder="Enter your Specialisation" name = "specialization" required>
          </div>
          
         
          <div class="input-box">
            <span class="details">City</span>
            <input type="text" placeholder="Enter your City" name = "city" required>
          </div>
        </div>
        <div class="button">
          <input type="submit" value="Register">
        </div>
        <div class="login">Already have account? <a href="MentorLogin.jsp">Login</a></div>
      </form>
    </div>
  </div>
  <script type="text/javascript" src="js/query-2.1.4.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/script.js"></script>
</body>
</html>
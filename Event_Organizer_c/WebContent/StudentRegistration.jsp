<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="js/bootstrap.min.css">
    <link rel="stylesheet" href="StudReg.css">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
   </head>
<body>
 
  <div class="container">
    <div class="title">Student Registration</div>
    <div class="content">
      <form action="StudRegServlet" method = "post">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Full Name</span>
            <input type="text" placeholder=" Enter your name" name = "Student_name" required>
          </div>
          <div class="input-box">
            <span class="details">College name</span>
            <input type="text" placeholder="Enter your college rname" name = "College_name" required>
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="text" placeholder="Enter your email" name = "Email"required>
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="text" placeholder="Enter your number" name = "Contact_no" required>
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="text" placeholder="Enter your password" name = Password required>
          </div>
          <div class="input-box">
            <span class="details">Branch</span>
            <input type="text" placeholder="ENter your Branch" name = "Branch" required>
          </div>
          <div class="input-box">
            <span class="details">Date of Birth</span>
            <input type="text" placeholder="Enter Date of Birth" name = "Date_of_Birth" required>
          </div>
          <div class="input-box">
            <span class="details">Intrested Topics</span>
            <input type="text" placeholder="Enter topics of Intrest" name = "Interested_topics" required>
          </div>
          <div class="input-box">
            <span class="details">Qualification</span>
            <input type="text" placeholder="Enter your qualification" name = "Qualification" required>
          </div>
          <div class="input-box">
            <span class="details">City</span>
            <input type="text" placeholder="Enter your City" name = "City" required>
          </div>
        </div>
        <div class="button" >
          <input type="submit" value="Register">
        </div>
        <div class="login">Already have account? <a href="StudentLogin.jsp">Login</a></div>
      </form>
    </div>
  </div>
  <script type="text/javascript" src="js/query-2.1.4.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/script.js"></script>
</body>
</html>
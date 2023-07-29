<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>IntroPage</title>
        <link rel="stylesheet" type="text/css" href="style.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/@fortawesome/fontawesome-free@5.15.4/css/fontawesome.min.css" integrity="sha384-jLKHWM3JRmfMU0A5x5AkjWkw/EYfGUAGagvnfryNV3F9VqM98XiIH7VBGVoxVSc7" crossorigin="anonymous">
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    </head>
<body>
    <div class="nav">
        <h2> Event Organizer</h2>
        <ul id = "item">
            <li><a href="#">Home</a></li>
            <li><a href="#about">About Us</a></li>
            <li><a href="#contact">Contact Us</a></li>
        </ul>
        <i id="bar" class="fas fa-bars" aria-hidden="true"></i>
    </div>
    <div class="back">
        <div class="overlay"></div>
    </div>    
    <div class="mid">
        <h2>WebApp For Maintaining <br>Seminars & Workshops</h2>
        <p>A unique system with a well-developed Database that will simplify event management procedures.Enterprises will be able to manage resources, dates and people well...</p>
        <div class="buttons">
            <a href="StudentRegistration.jsp">Student</a>
            <!-- <button>Register Here</button>
            <ul>
                <li><a href="#">Student</a></li>
                <li><a href="#">Mentor</a></li>
                <li><a href="#">Administrator</a></li>
            </ul> -->
            <a href="MentorRegistration.jsp">Mentor</a>
            <a href="AdminRegistration.jsp">Administrator</a>
            <!-- <button>Login Here</button>
            <ul>
                <li><a href="#">Student</a></li>
                <li><a href="#">Mentor</a></li>
                <li><a href="#">Administrator</a></li>
            </ul> -->
        </div>
    </div>
    <section class="about-area" id="about">
        <h3 class="section-title">About Us</h3>
        <ul class="about-content">
            <li class="about-left"></li>
            <li class="about-right">
                <h2>Key Features</h2>
                <p>Simple Web-application offers everything you need to manage your events
                    <br><br>Upcoming seminars easily on few clicks
                    <br><br>Support team will help you to plan and manage any event, seminar or workshop easily
                    <br><br>Level your skills by attending online seminars which will be presented by well educated & approved mentors</p>
            </li>
        </ul>
    </section>
    <div class="contact-section" id="contact">
        <h2>Feedback & Suggestions Accepted Here</h2>
        <div class="border"></div>
        <form class="contact-form" action="index.html" method="post">
            <input type="text" class="contact-form-text" placeholder="Your Name">
            <input type="email" class="contact-form-text" placeholder="Your Email">
            <input type="text" class="contact-form-text" placeholder="Your Phone Number">
            <textarea class="contact-form-text" placeholder="Your message"></textarea>
            <input type="submit" class="contact-form-btn" value ="Send">
        </form>
    </div>
    <script src = "script.js"></script>
</body>
</html>
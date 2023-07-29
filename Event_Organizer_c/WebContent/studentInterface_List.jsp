<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>

<head>
<title>Student Portal</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css">
<link
	href="https://fonts.googleapis.com/css2?family=Raleway:ital,wght@0,300;0,400;0,500;0,600;0,700;1,800&display=swap"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<link rel="stylesheet"
	href="path/to/font-awesome/css/font-awesome.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#filtertable').DataTable({
			"pageLength" : 5,
			language : {
				searchPlaceholder : "Search records",
				search : "",
			}
		});

	});
</script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#filtertable1').DataTable({
			"pageLength" : 5,
			language : {
				searchPlaceholder : "Search records",
				search : "",
			}
		});

	});
</script>
<script>
	function menuToggle() {
		const toggleMenu = document.querySelector('.menu');
		toggleMenu.classList.toggle('active')
	}
</script>
<script type="text/javascript">
        function toggle() {
            var blur = document.getElementById('blur');
            blur.classList.toggle('active')
            var popup = document.getElementById('popup');
            popup.classList.toggle('active')

        }
    </script>
<style>
body {
	font-family: 'Raleway', sans-serif;
	background-image:linear-gradient(to top, rgba(0,0,0,0.4), #000000), url(./Images/justin-buisson-hgezQgpaGG0-unsplash-01.jpeg);
	width: 100%;
    height: 100vh;
    background-size: cover;
    background-repeat: no-repeat;
    background-attachment: fixed;
    z-index: -1;
    justify-content: center;
    align-items: center;
   
}

.p-30 {
	padding: 10px;
}

.main-datatable {
	padding: 0px;
	border: 1px solid #f3f2f2;
	border-bottom: 0;
	box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.5);
}

.d-flex {
	display: flex;
	align-items: center;
	justify-content: space-between;
}

.card_body {
	background-color: white;
	border: 1px solid transparent;
	border-radius: 2px;
	-webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.05);
	box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
}

.main-datatable .row {
	margin: 0;
}

.createSegment a {
	margin-bottom: 10px;
	border-radius: 50px;
	background: #ffffff;
	border: 1px solid #007bff;
	color: #007bff;
	transition: all .4s ease;
}

.createSegment a:hover, .createSegment a:focus {
	transition: all .4s ease;
	background: #007bff;
	color: #fff;
}

.add_flex {
	display: flex;
	justify-content: flex-end;
	padding-right: 0px;
}

.main-datatable .dataTable.no-footer {
	border-bottom: 1px solid #eee;
}

.main-datatable .cust-datatable thead {
	background-color: #f9f9f9;
}

.main-datatable .cust-datatable>thead>tr>th {
	border-bottom-width: 0;
	color: #443f3f;
	font-weight: 600;
	padding: 16px 15px;
	vertical-align: middle;
	padding-left: 18px;
	text-align: center;
}

.dim_button {
	display: inline-block;
	color: #fff;
	text-decoration: none;
	text-transform: uppercase;
	text-align: center;
	padding-top: 6px;
	background: rgb(57, 85, 136);
	margin-right: 10px;
	position: relative;
	cursor: pointer;
	font-weight: 600;
	margin-bottom: 20px;
}

.main-datatable .cust-datatable>tbody td {
	padding: 10px 10px 10px 10px;
	color: #333232;
	font-size: 12px;
	font-weight: 500;
	word-break: break-word;
	border-color: #eee;
	text-align: center;
	vertical-align: middle;
}

.main-datatable .cust-datatable>tbody tr {
	border-top: none;
}

.main-datatable .table>tbody>tr:nth-child(even) {
	background: #d6f2f8;
}

.btn-group.open .dropdown-toggle {
	box-shadow: none;
}

.main-datatable .dropdown_icon {
	display: inline-block;
	color: #464545;
	font-size: 13px;
	border: 1px solid #d4d4d4;
	padding: 10px 11px;
	border-radius: 50%;
	cursor: pointer;
}

.btn-group i {
	color: #2e2e2e;
	margin: 2px;
}

.main-datatable .actionCust a {
	display: inline-block;
	color: #8a8a8a;
	font-size: 12px;
	border: 1px solid #d4d4d4;
	padding: 10px 11px;
	margin: -9px 3px;
	border-radius: 50%;
	cursor: pointer;
}

.main-datatable .actionCust a i {
	color: #8e8e8e;
	margin: 2px;
}

.main-datatable .dropdown-menu {
	padding: 0;
	border-radius: 4px;
	box-shadow: 10px 10px 20px #c8c8c8;
	margin-top: 10px;
	left: -65px;
	top: 32px;
}

.main-datatable .dropdown-menu>li>a {
	display: block;
	padding: 12px 20px;
	clear: both;
	font-weight: normal;
	line-height: 1.42857;
	color: #333333;
	white-space: nowrap;
	border-bottom: 1px solid #d4d4d4;
}

.main-datatable .dropdown-menu>li>a:hover, .main-datatable .dropdown-menu>li>a:focus
	{
	color: #fff;
	background: #007bff;
}

.main-datatable .dropdown-menu>li>a:hover i {
	color: #fff;
}

.main-datatable .dropdown-menu:before {
	position: absolute;
	top: -7px;
	left: 78px;
	display: inline-block;
	border-right: 7px solid transparent;
	border-bottom: 7px solid #d4d4d4;
	border-left: 7px solid transparent;
	border-bottom-color: #d4d4d4;
	content: '';
}

.main-datatable .dropdown-menu:after {
	position: absolute;
	top: -6px;
	left: 78px;
	display: inline-block;
	border-right: 6px solid transparent;
	border-bottom: 6px solid #ffffff;
	border-left: 6px solid transparent;
	content: '';
}

.dropdown-menu i {
	margin-right: 8px;
}

.main-datatable .dataTables_wrapper .dataTables_paginate .paginate_button
	{
	color: #999999 !important;
	background-color: #f6f6f6 !important;
	border-color: #d4d4d4 !important;
	border-radius: 40px;
	margin: 5px 3px;
}

.main-datatable .dataTables_wrapper .dataTables_paginate .paginate_button:hover
	{
	color: #fff !important;
	border: 1px solid #3d96f5 !important;
	background: #4da3ff !important;
	box-shadow: none;
}

.main-datatable .dataTables_wrapper .dataTables_paginate .paginate_button.current,
	.main-datatable .dataTables_wrapper .dataTables_paginate .paginate_button.current:hover
	{
	color: #fff !important;
	border-color: transparent !important;
	background: #007bff !important;
}

.main-datatable .dataTables_paginate {
	padding-top: 0 !important;
	margin: 15px 10px;
	float: right !important;
}

.mode {
	padding: 4px 10px;
	line-height: 13px;
	color: #fff;
	font-weight: 400;
	border-radius: 1rem;
	-webkit-border-radius: 1rem;
	-moz-border-radius: 1rem;
	-ms-border-radius: 1rem;
	-o-border-radius: 1rem;
	font-size: 11px;
	letter-spacing: 0.4px;
}

.mode_on {
	background-color: #09922d;
}

.mode_off {
	background-color: #8b9096;
}

.mode_process {
	background-color: #ff8000;
}

.mode_done {
	background-color: #03a9f3;
}

@media only screen and (max-width:1200px) {
	.overflow-x {
		overflow-x: scroll;
	}
	.overflow-x::-webkit-scrollbar {
		width: 5px;
		height: 6px;
	}
	.overflow-x::-webkit-scrollbar-thumb {
		background-color: #888;
	}
	.overflow-x::-webkit-scrollbar-track {
		background-color: #f1f1f1;
	}
}

.action {
	position: fixed;
	top: 20px;
	right: 30px;
}

.action .profile {
	position: relative;
	width: 60px;
	height: 60px;
	border-radius: 50%;
	overflow: hidden;
	cursor: pointer;
}

.action .profile img {
	position: absolute;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	object-fit: cover;
}

.action .menu {
	position: absolute;
	top: 120px;
	right: -10px;
	padding: 10px 20px;
	background: #fff;
	width: 200px;
	box-sizing: 0 5px 25px rgba(0, 0, 0, 0.1);
	border-radius: 15px;
	transition: 0.5s;
	visibility: hidden;
	opacity: 0;
	box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.5);
}

.action .menu.active {
	top: 80px;
	visibility: visible;
	opacity: 1;
	overflow: visible;
	position: absolute;
	grid: relative;
}

.action .menu::before {
	content: '';
	position: absolute;
	top: -5px;
	right: 28px;
	width: 20px;
	height: 20px;
	background: #fff;
	transform: rotate(45deg);
}

.action .menu h3 {
	width: 100%;
	text-align: center;
	font-size: 18px;
	padding: 20px 0;
	font-weight: 500;
	color: #555;
	line-height: 1.2em;
}

.action .menu h3 span {
	font-size: 14px;
	color: #c0c0c0;
	font-weight: 400;
}

.action .menu ul li {
	list-style: none;
	padding: 10px;
	border-top: 1px solid rgba(0, 0, 0, 0.05);
	display: flex;
	align-items: center;
	justify-content: center;
}

.action .menu ul li img {
	max-width: 20px;
	margin-right: 5px;
	opacity: 0.5;
	transition: 0.5s;
}

.action .menu ul li:hover img {
	opacity: 1;
}

.action .menu ul li a {
	display: inline-block;
	text-decoration: none;
	font-weight: 500;
	color: #555;
	transition: 0.5s;
}

.action .menu ul li:hover a {
	color: #ff5d94;
}



.container_blur#blur.active {
    filter: blur(10px);
    pointer-events: none;
    user-select: none;
}

.container_blur .content {
    position: relative;
    max-width: 800px;
    ;
}

#popup {
    position: fixed;
    top: 40%;
    left: 50%;
    transform: translate(-50%, -50%);
    width: 600px;
    padding: 50px;
    box-shadow: 0 5px 30px rgba(0, 0, 0, .30);
    background: #fff;
    visibility: hidden;
    opacity: 0;
    transition: 0.5s;
}

#popup.active {
    top: 50%;
    visibility: visible;
    opacity: 1;
    transition: 0.5s;
}

.tickerv-wrap {
    /* border-radius: 10%; */
    background: transparent;
    box-sizing: content-box;
    height: 100px;
    overflow: hidden;
    padding: 50px;
    max-width: 500px;
}

@keyframes tickerv {
    0% {
        margin-top: 0;
    }
    30% {
        margin-top: -20%;
    }
    60% {
        margin-top: -43%;
    }
    90% {
        margin-top: -65%;
    }
    100% {
        margin-top: 0;
    }
}

.tickerv-wrap ul {
    color: rgb(8, 8, 8);
    padding: 10;
    margin: 0;
    animation: tickerv 15s infinite;
    animation-timing-function: linear;
}

.tickerv-wrap ul:hover {
    animation-play-state: paused;
}

.tickerv-wrap ul li {
    /* padding: 4px 4px;
    margin: 0px; */
    /* border-bottom: 1px dotted #555; */
    padding: 5px;
    margin: 0px;
    list-style: none;
}
</style>
</head>




<body>
	<div class="container_blur" id="blur">

	<header>
	<br>
		<h1 style="position: relative;padding: 0;margin: 0;font-family: 'Comic Sans MS', 'Comic Sans', cursive; font-weight: 300;font-size: 40px;color: #e1e8f0;">
		<%
			if(session.getAttribute("Student_name") == null)
			{
				response.sendRedirect("StudentLogin.jsp");
			}
		%>
		Welcome, ${Student_name}
		</h1>
	</header>
	<br>
	<div class="container p-30">
		<div class="row">
			<div class="col-md-12 main-datatable">
				<div class="card_body">
					<div class="row d-flex">
						<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

						<div class="container">
							<h3 style = "font-family: 'Roboto', sans-serif;"><strong>Seminar List</strong></h3>
					
							<br>
							<div class="overflow-x">
								<table style="width: 100%;" id="filtertable"
									class="table cust-datatable dataTable no-footer">
									<thead>
										<tr>
											<th style="min-width: 50px;">Seminar_ID</th>
											<th style="min-width: 50px;">Topic</th>
											<th style="min-width: 50px;">MentorName</th>
											
											<th style="min-width: 50px;">Description</th>
											<th style="min-width: 50px;">date&Time</th>
											<th style="min-width: 50px;">Active Status</th>
											<th style="min-width: 50px;">Survey Link</th>
											<th style="min-width: 50px;">Seminar Link</th>
											<th style="min-width: 50px;">Documents</th>
											<!--<th style="min-width: 50px;">Feedback Form</th>-->
											
											<!--<th style="min-width: 100px;">Actions</th>-->
										</tr>
									</thead>
									<tbody>
										<!--   for (Todo todo: todos) {  -->
										<c:forEach var="studseminartable" items="${liststudseminartable}">

											<tr>
												<td><c:out value="${studseminartable.seminar_ID}" /></td>
												<td><c:out value="${studseminartable.topic}" /></td>
												<td><c:out value="${studseminartable.mentor_Name}" /></td>
											
												<td><c:out value="${studseminartable.description}" /></td>
												<td><c:out value="${studseminartable.date_Time}" /></td>
												<td><c:out value="${studseminartable.active_Status}" /></td>
												<td><a
													href="<c:out value="${studseminartable.survey_Link}" />" target = "blank">Survey
														Link</a></td>
												<td><a
													href="<c:out value="${studseminartable.seminar_Link}" />" target = "blank">Seminar
														Link</a></td>
														
												<td><a
													href="<c:out value="${studseminartable.documents}" />" target = "blank">Downloads</a></td>
												
														
												<!--<td><c:out value="${studseminartable.documents}" /></td>-->
												<!--<td><c:out value="${admintable.feedback_Form}" />Feedback Link</td> -->

												<!--<td><a
													href="<c:out value="${admintable.feedback_Form}" />">Feedback
														Link</a></td>-->






												






											
											</tr>
										</c:forEach>
										<!-- } -->
									</tbody>
								</table>
								
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<br>
	<div class="container p-30">
		<div class="row">
			<div class="col-md-12 main-datatable">
				<div class="card_body">
					<div class="row d-flex">
						<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

						<div class="container">
							<h3 style = "font-family: 'Roboto', sans-serif;"><strong>Past Seminar List</strong></h3>
					
							<br>
							<div class="overflow-x">
								<table style="width: 100%;" id="filtertable1"
									class="table cust-datatable dataTable no-footer">
									<thead>
										<tr>
											<th style="min-width: 50px;">Seminar_ID</th>
											<th style="min-width: 50px;">Topic</th>
											<th style="min-width: 50px;">MentorName</th>
											
											<!--<th style="min-width: 50px;">Description</th>-->
											<th style="min-width: 50px;">date&Time</th>
											<th style="min-width: 50px;">Active Status</th>
											<!--<th style="min-width: 50px;">Survey Link</th>
											<th style="min-width: 50px;">Seminar Link</th>-->
											<th style="min-width: 50px;">Documents</th>
											<th style="min-width: 50px;">Feedback Form</th>
											
											<!--<th style="min-width: 100px;">Actions</th>-->
										</tr>
									</thead>
									<tbody>
										<!--   for (Todo todo: todos) {  -->
										<c:forEach var="studseminartableT" items="${liststudseminartableT}">

											<tr>
												<td><c:out value="${studseminartableT.seminar_ID}" /></td>
												<td><c:out value="${studseminartableT.topic}" /></td>
												<td><c:out value="${studseminartableT.mentor_Name}" /></td>
											
												<!--<td><c:out value="${studseminartableT.description}" /></td>-->
												<td><c:out value="${studseminartableT.date_Time}" /></td>
												<td><c:out value="${studseminartableT.active_Status}" /></td>
												<!--<td><a
													href="<c:out value="${studseminartable.survey_Link}" />">Survey
														Link</a></td>
												<td><a
													href="<c:out value="${studseminartable.seminar_Link}" />">Seminar
														Link</a></td>-->
													
												<td><a
													href="<c:out value="${studseminartableT.documents}" />" target = "blank">Downloads</a></td>	
														
												<!--<td><c:out value="${studseminartableT.documents}" /></td>-->
												<!--<td><c:out value="${admintable.feedback_Form}" />Feedback Link</td> -->

												<td><a
													href="<c:out value="${studseminartableT.feedback_Form}" />" target = "blank">Feedback
														Link</a></td>






				






												
											</tr>
										</c:forEach>
										<!-- } -->
									</tbody>
								</table>
								<div class="action">
									<div class="profile" onclick="menuToggle();">
										<img
											src="https://cdn-icons-png.flaticon.com/512/3135/3135715.png">
										<!-- <i class="fa fa-user" aria-hidden="true"></i> -->
									</div>
									<div class="menu">
										<h3>
											Student<br><strong>
											${Student_name}</strong>
										</h3>
										<ul>
											<li><img
												src="https://cdn-icons-png.flaticon.com/512/5509/5509442.png"><a
												href="#">Edit Profile</a></li>
											<li><img src="https://cdn-icons-png.flaticon.com/512/630/630757.png"><a href="#" onclick="toggle()">Announcement</a></li>
											<li><img
												src="https://cdn-icons-png.flaticon.com/512/6396/6396225.png"><a
												href="#">Help</a></li>
											<li><img
												src="https://cdn-icons-png.flaticon.com/512/1828/1828490.png"><a
												href="http://localhost:9494/Event_Organizer_a/IndexPage.jsp">Logout</a></li>

										</ul>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
	</div>
	</div>
	<br> 
	<div id="popup">
        <h2 style ="font-weight: 600; margin-bottom: 10px;
    color: #333;">Updates & Announcements</h2>
        <div class="tickerv-wrap">
        <ul>
            <br></br>
            <li>New Event</li>
            <hr>
            <li>Great Weekend with elon Musk</li>
            <hr>
            <li>Doctor talks</li>
            <hr>
            <li>Learn to earn</li>
            <hr>
            <li>new Seminar</li>
            <hr>
            <li>One month workshop event</li>
            <hr>
            <li>Train yourself Online</li>
            <hr>
            <li>Great Friday evening with best Speaker</li>
        </ul>
    </div>
        <a href="#" onclick="toggle()" style = "position: relative;
    padding: 5px 20px;
    display: inline-block;
    margin-top: 20px;
    text-decoration: none;
    color: #fff;
    background: #111;">Close</a>

    </div>
	
</body>

</html>
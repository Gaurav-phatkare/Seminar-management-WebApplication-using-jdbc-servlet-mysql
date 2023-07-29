<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>

<title>submission
</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="stylesubmission.css">
<link rel="stylesheet" href="jquery.datetimepicker.min.css">
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<title>Document</title>
<script type="text/javascript">
        document.getElementById("mybutton1").onclick = function() {
            location.href = "https://meet.google.com/";

        };
    </script>

<script src="jquery.js"></script>
<script src="jquery.datetimepicker.full.min.js"></script>
<script type="text/javascript">
        $("#datepicker").datetimepicker({

            formatTime: 'H:i:i',

            step: 1

        });
    </script>

<style>
@import
	url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap')
	;

* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	background: linear-gradient(#3b7bce, rgb(255, 255, 255));
	display: flex;
	align-items: centre;
	justify-content: center;
	font-family: Arial, Helvetica, sans-serif;
}

.container {
	display: flex;
	flex-wrap: wrap;
	height: 100vh;
	display: flex;
	max-width: 700px;
	width: 100%;
	overflow-y: auto;
	background-color: #fff;
	padding: 50px 50px;
	border-radius: 5px;
	box-shadow: 0 25px 30px rgba(0, 0, 0, 0.918);
}

.container .heading {
	font-size: 25px;
	font-weight: 500;
	position: relative;
	text-decoration: underline 2px solid #3b7bce;
}

/*.container .heading::before{
  content: "";
  position: absolute;
  left: 0;
  bottom: 0;
  height: 3px;
  width: 217px;
  border-radius: 5px;
  background: linear-gradient(135deg,#0297fa, #1b1c1d );
}*/
.seminar form .seminar-details {
	display: flex;
	flex-wrap: wrap;
	justify-content: space-between;
	margin: 18px 0 12px 0;
	padding-top: 20px;
}

form .seminar-details .text-box {
	margin-bottom: 20px;
	width: calc(100%/ 2 - 20px);
}

form .text-box span.details {
	display: block;
	font-weight: 500;
	margin-bottom: 5px;
}

.seminar-details .text-box input {
	height: 42px;
	width: 100%;
	outline: none;
	font-size: 16px;
	border-radius: 5px;
	padding-left: 15px;
	border: 2px solid #ccc;
	border-bottom-width: 2px;
	transition: all 0.3s ease;
}

.seminar-detials .text-box input:focus, .seminar-detials .text-box input:valid
	{
	border-color: #3b7bce;
}

.seminar-details .text-box .d1:focus, .seminar-details .text-box .d1:valid
	{
	border-color: #3b7bce;
	box-shadow: #3b7bce;
}

.button1 {
	height: 45px;
	margin: 35px 0;
}

.button1 input {
	height: 100%;
	width: 100%;
	border-radius: 5px;
	border: none;
	background-color: #3b7bce;
	color: #fff;
	font-size: 18px;
	font-weight: 500;
	letter-spacing: 1px;
	cursor: pointer;
	transition: all 0.3s ease;
	background: linear-gradient();
}

.button:hover {
	background: #fff;
	color: #3b7bce;
	border-block-color: #3b7bce;
}

.active-status {
	background-color: #3b7bce;
	color: #fff;
	padding: 8px 12px;
	border-radius: 5px;
	margin-top: 9px;
}

.option {
	background-color: #3b7bce;
	color: #fff;
}

.file {
	padding: 8px;
}

.details {
	font-size: 17px;
}

#mybutton {
	background-color: #3b7bce;
	color: #fff;
	padding: 8px 12px;
	border-radius: 5px;
	margin-top: 9px;
	border: 1px solid black;
}

#mybutton1 {
	background-color: #3b7bce;
	color: #fff;
	padding: 8px 12px;
	border-radius: 5px;
	margin-top: 9px;
	border: 1px solid black;
}

@media screen and (max-width:1024px) {
	.container {
		max-width: 100%;
		max-height: 100%;
		overflow-x: scroll;
		overflow-y: scroll;
	}
	form .seminar-details .text-box {
		margin-bottom: 15px;
		width: 100%;
	}
	.seminar-detailst::-webkit-scrollbar {
		width: 5px;
	}
}

@media screen and (max-width:992px) {
	.container {
		max-width: 100%;
		max-height: 100%;
		overflow-y: scroll;
		overflow-x: scroll;
	}
	form .seminar-details .text-box {
		margin-bottom: 15px;
		width: 100%;
	}
	.seminar-detailst::-webkit-scrollbar {
		width: 5px;
	}
}

@media screen and (max-width:768px) {
	.container {
		max-width: 100%;
		max-height: 50%;
		overflow-y: scroll;
		overflow-x: scroll;
	}
	form .seminar-details .text-box {
		margin-bottom: 15px;
		width: 100%;
	}
	.seminar-detailst::-webkit-scrollbar {
		width: 5px;
	}
}

@media screen and (max-width:679px) {
	.container {
		max-width: 100%;
		max-height: 100%;
		overflow-y: scroll;
		overflow-x: scroll;
	}
	form .seminar-details .text-box {
		margin-bottom: 15px;
		width: 100%;
	}
	.seminar-detailst::-webkit-scrollbar {
		width: 5px;
	}
}

@media screen and (max-width:496px) {
	.container {
		max-width: 100%;
		max-height: 100%;
		overflow-y: scroll;
		overflow-x: scroll;
	}
	form .seminar-details .text-box {
		margin-bottom: 15px;
		width: 100%;
	}
	.seminar-detailst::-webkit-scrollbar {
		width: 5px;
	}
}

@media screen and (max-width:320px) {
	.container {
		max-width: 100%;
		max-height: 100%;
		overflow-y: scroll;
		overflow-x: scroll;
	}
	form .seminar-details .text-box {
		margin-bottom: 15px;
		width: 100%;
	}
	.seminar-detailst::-webkit-scrollbar {
		width: 5px;
	}
}


</style>
</head>

<body>
	<div class="container">
		<div class="seminar">
			<form action="#">
				<div class="seminar-details">
				<c:if test="${seminartable != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${seminartable == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${seminartable != null}">
                                    Edit Seminar
                                </c:if>
						<c:if test="${seminartable == null}">
                                    Add New Seminar
                                </c:if>
					</h2>
				</caption>
				<c:if test="${seminartable != null}">
					<input type="hidden" name="seminar_ID"
						value="<c:out value='${seminartable.seminar_ID}' />" />
				</c:if>
				
				
					<div class="text-box">
					
						<span class="details">Seminar Topic</span> <input type="text"
						value="<c:out value='${seminartable.topic}' />"
							placeholder=" Enter topic name" name="topic" class="d1" required>
					</div>
					<div class="text-box">
						<span class="details">Mentor name</span> <input type="text"
						value="<c:out value='${seminartable.mentor_Name}' />"
							placeholder="Enter your name" name="mentor_Name" class="d1" required>
					</div>
					<div class="text-box">
						<span class="details">Mentor ID</span> <input type="text"
						value="<c:out value='${seminartable.mentor_ID}' />"
							placeholder="Enter your ID" name="mentor_ID" class="d1" required>
					</div>
					<div class="text-box">
						<span class="details">Description</span> <input type="text"
						value="<c:out value='${seminartable.description}' />"
							placeholder="Enter description" name="description" class="d1" required>
					</div>
					<div class="text-box">
						<span class="details">Set Date and Time</span> <input type="text"
						value="<c:out value='${seminartable.date_Time}' />"
							id="datepicker" placeholder="YYYY-MM-DD HH:MM:SS" name="date_Time" class="d1"
							required>
					</div>
		
					<div class="text-box">
						<span class="details">Seminar link</span> <input type="text"
						value="<c:out value='${seminartable.seminar_Link}' />"
							placeholder="Paste your seminar link" class="d1" name="seminar_Link" required>
					</div>
					<div class="text-box">
						<span class="details">Documents</span> <input type="file"
							value="<c:out value='${seminartable.documents}' />" name="documents"  class="file">
					</div>
					<div class="text-box">
						<span class="details">Survey link</span> <input type="text"
						value="<c:out value='${seminartable.survey_Link}' />"
							placeholder="survey link" name="survey_Link" class="d1" required>
					</div>
					<div class="text-box">
						<span class="details">Active status</span> <select name="status"
							class="active-status">
							<option value="<c:out value='${seminartable.active_Status}' />" name="active_Status" class="option">Active
								Status</option>
							<option value="<c:out value='${seminartable.active_Status}' />" name="active_Status" class="option">Ongoing</option>
							<option value="<c:out value='${seminartable.active_Status}' />" name="active_Status" class="option">Upcoming</option>
							<option value="<c:out value='${seminartable.active_Status}' />"name="active_Status"  class="option">Past</option>
						</select>
					</div>
					
					<button type="submit" class="btn btn-success">Save</button>
			</form>

		</div>
	</div>
	</div>


</body>

</html>
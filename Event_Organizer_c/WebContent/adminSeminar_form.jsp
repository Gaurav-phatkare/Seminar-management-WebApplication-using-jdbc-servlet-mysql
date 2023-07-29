<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<head>
<title>Seminar Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

<body style = "background : black">

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: black">
			<div>
				<h3 class="navbar-brand">Event Manager</h3>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/listS"
					class="nav-link" style =" font-weight : 500">Seminars</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${admintable != null}">
					<form action="updateS" method="post">
				</c:if>
				<c:if test="${admintable == null}">
					<form action="insertS" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${admintable != null}">
                                    Edit Seminar
                                </c:if>
						<c:if test="${admintable == null}">
                                    Add New Seminar
                                </c:if>
					</h2>
				</caption>

				<c:if test="${admintable != null}">
					<input type="hidden" name="seminar_ID"
						value="<c:out value='${admintable.seminar_ID}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>Topic</label> <input type="text"
						value="<c:out value='${admintable.topic}' />" class="form-control"
						name="topic" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Mentor name</label> <input type="text"
						value="<c:out value='${admintable.mentor_Name}' />"
						class="form-control" name="mentor_Name" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Mentor ID</label> <input type="text"
						value="<c:out value='${admintable.mentor_ID}' />"
						class="form-control" name="mentor_ID" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Description</label> <input type="text"
						value="<c:out value='${admintable.description}' />"
						class="form-control" name="description" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Date&Time</label> <input type="text"
						value="<c:out value='${admintable.date_Time}' />"
						class="form-control" name="date_Time" required="required">
				</fieldset>








				<fieldset class="form-group">
					<label>active Status</label> <input type="text"
						value="<c:out value='${admintable.active_Status}' />"
						class="form-control" name="active_Status">
				</fieldset>

				<fieldset class="form-group">
					<label>survey_Link</label> <input type="text"
						value="<c:out value='${admintable.survey_Link}' />"
						class="form-control" name="survey_Link">
				</fieldset>

				<fieldset class="form-group">
					<label>seminar_Link</label> <input type="text"
						value="<c:out value='${admintable.seminar_Link}' />"
						class="form-control" name="seminar_Link">
				</fieldset>

				<fieldset class="form-group">
					<label>documents</label> <input type="file"
						value="<c:out value='${admintable.documents}' />"
						class="form-control" name="documents">
				</fieldset>
				<fieldset class="form-group">
					<label>Feedback Form</label> <input type="text"
						value="<c:out value='${admintable.feedback_Form}' />"
						class="form-control" name="feedback_Form">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>

</html>
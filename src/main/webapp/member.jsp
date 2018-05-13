<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
.add-button {
	border: 1px solid #666; 
	border-radius: 5px; 
	padding: 4px; 
	font-size: 12px;
	font-weight: bold;
	width: 120px; 
	padding: 5px 10px; 
	color: #000000;
	margin-bottom: 15px;
	background: #cccccc;
}
table {
    color: #000000;
    font-size: 12px;
}
th, td {
    text-align: left;
    padding: 8px;
}
* {
  box-sizing: border-box;
}
.menu {
  float:left;
  width:20%;
  text-align:center;
}
.menu a {
  text-decoration: none;
  background-color:#e5e5e5;
  padding:8px;
  margin-top:7px;
  display:block;
  width:100%;
  color:#0000FF;
}
.main {
  float:left;
  width:80%;
  padding:0 20px;
}
@media only screen and (max-width:620px) {
  /* For mobile phones: */
  .menu, .main {
    width:100%;
  }
}
</style>
</head>
<body style="background-color:#FFFFFF;font-family:Sans-serif;color:#0000FF;">
<div style="background-color:#e5e5e5;padding:15px;text-align:center;">
  <h1>QEA - UKI</h1>
</div>
<div style="overflow:auto">
  <div class="menu">
  	<a href="${pageContext.request.contextPath}/">Home</a>
    <a href="#">About</a>
    <a href="${pageContext.request.contextPath}/members">Members</a>
    <a href="#">Contact</a>
    <a href="#">Feedback</a>

  </div>
  <div class="main">
    <h2>Member Details</h2>
    		<form:form action="member" modelAttribute="member" method="POST">
			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />
			<table>
				<tbody>
				<c:if test="${empty member.firstName}">
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>
				</c:if>
				<c:if test="${not empty member.firstName}">
					<tr>
						<td><label>First name:</label></td>
						<td><form:hidden path="firstName" />${member.firstName}</td>
					</tr>
					<tr>
						<td><label>Last name:</label></td>
						<td><form:hidden path="lastName" />${member.lastName}</td>
					</tr>
				</c:if>
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="emailAddress" /></td>
					</tr>
					<tr>
						<td><label>Mobile:</label></td>
						<td><form:input path="mobileNumber" /></td>
					</tr>
				<c:if test="${empty member.firstName}">
					<tr>
						<td><label>Details:</label></td>
						<td><form:input path="shortDetails" /></td>
					</tr>
				</c:if>
				<c:if test="${not empty member.firstName}">
					<tr>
						<td><label>Details:</label></td>
						<td><form:hidden path="shortDetails" />${member.shortDetails}</td>
					</tr>
				</c:if>
					<tr>
						<td><label>Others:</label></td>
						<td><form:input path="otherDetails"/></td>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>
  </div>
</div>
<div style="background-color:#e5e5e5;text-align:center;padding:10px;margin-top:7px;font-size:10px;color:#FFFFFF;">SDET Demo</div>
</body>
</html>
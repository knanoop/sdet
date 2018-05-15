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
a:link {
    text-decoration: none;
}
table {
    border-collapse: collapse;
    border-spacing: 0;
    width: 100%;
    border: 1px solid #ddd;
    color: #000000;
    font-size: 12px;
}

th, td {
    text-align: left;
    padding: 8px;
}

tr:nth-child(even){background-color: #f2f2f2}

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
.alert {
    padding: 20px;
    background-color: #f44336;
    color: white;
    opacity: 1;
    transition: opacity 0.6s;
    margin-bottom: 15px;
}

.alert.success {background-color: #4CAF50;}
.alert.info {background-color: #2196F3;}
.alert.warning {background-color: #ff9800;}

.closebtn {
    margin-left: 15px;
    color: white;
    font-weight: bold;
    float: right;
    font-size: 22px;
    line-height: 20px;
    cursor: pointer;
    transition: 0.3s;
}

.closebtn:hover {
    color: black;
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
    <h2>Member Area</h2>
    <c:if test="${message}">
    	<div class="alert success">
  <span class="closebtn">&times;</span>  
  <strong>Success!</strong> {test}
</div>
</c:if>
<div style="overflow-x:auto;">
					<!-- construct an "delete" link with customer id -->
					<c:url var="addLink" value="/member">
					<c:param name="memberId" value="0" />
					</c:url>
			<table>
				<tr>
					<th colspan="10"><a href="${addLink}">Add Member</a></th>
				</tr>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Mobile</th>
					<th>Details</th>
					<th>Others</th>
					<th>Created</th>
					<th>Modified</th>
					<th colspan="2">Action</th>
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach var="member" items="${members}">
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/member">
						<c:param name="memberId" value="${member.id}" />
					</c:url>
					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/delete">
						<c:param name="memberId" value="${member.id}" />
					</c:url>					
					<tr>
						<td> ${member.firstName} </td>
						<td> ${member.lastName} </td>
						<td> ${member.emailAddress} </td>
						<td> ${member.mobileNumber} </td>
						<td> ${member.shortDetails} </td>
						<td> ${member.otherDetails} </td>
						<td> ${member.createdDate} </td>
						<td> ${member.modifiedDate} </td>
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							</td><td>
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this Member?'))) return false">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</table>
</div>
</div>
</div>
<div style="background-color:#e5e5e5;text-align:center;padding:10px;margin-top:7px;font-size:10px;color:#FFFFFF;">SDET Demo</div>
<script>
var close = document.getElementsByClassName("closebtn");
var i;

for (i = 0; i < close.length; i++) {
    close[i].onclick = function(){
        var div = this.parentElement;
        div.style.opacity = "0";
        setTimeout(function(){ div.style.display = "none"; }, 600);
    }
}
</script>
</body>
</html>

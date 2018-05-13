<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<style>
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
    <h2>Objective</h2>
    <p>To showcase strength to drive digital assurance and to enable better role allignment.</p>
  </div>
</div>
<div style="background-color:#e5e5e5;text-align:center;padding:10px;margin-top:7px;font-size:10px;color:#FFFFFF;">SDET Demo</div>
</body>
</html>
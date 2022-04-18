<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
     <%@include file="/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Update Users</title>
</head>
<body>

<div class="container mtb">
	<div class="row">
		<div class="col-lg-12">

<form action="${pageContext.request.contextPath}/SiteController" method="post">

<div class="form-group">
    <label for="name">Name:</label>
    <input type="text" class="form-control" id="name" name="name" value="${param.name}">
    </div>
    
     <div class="form-group">
    <label for="exampleInputPassword1">Designation:</label>
    <input type="text" class="form-control" id="design" name="design"  value="${param.designation}">
  </div>
 <div class="form-group">
    <label for="exampleInputPassword1">Email Address:</label>
    <input type="text" class="form-control" id="email" name="email"  value="${param.email}">
  </div>

<input type="hidden" name="sno" value="${param.sno}">
<input type="hidden" name="form" value="updateuser">
<button type="submit" class="btn btn-primary">Submit</button>
 </form>
 </div>
 </div>
 </div>
  <%@include file="/include/footer.jsp" %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored = "false" %>
    <%@include file="/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container mtb">
	<div class="row">
		<div class="col-lg-12">


<form action="${pageContext.request.contextPath}/SiteController" method="post">
  <div class="form-group">
    <label for="name">Name:</label>
    <input type="text" class="form-control" id="name" name="name" aria-describedby="emailHelp" placeholder="Enter Name" required>
    
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Designation:</label>
    <input type="text" class="form-control" id="design" name="design" placeholder="Enter Designation" required>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="email" name="email" aria-describedby="emailHelp" placeholder="Enter email">
    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  
  <input type="hidden" name="form" value="userop">
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</div>
</div>


 <%@include file="/include/footer.jsp" %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@page import="java.util.List" %>
<%@page import ="com.venkat.Entity.Users" %>
    <%@ page isELIgnored = "false" %>
    <%@include file="/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>ListUser</title>
</head>
<body>
<div class="container mtb">
	<div class="row">
		<div class="col-lg-12">
			<strong>Listing users</strong>
			<hr/>
			<table class="table table-striped" >
<thead>
<th>Sno</th>
<th>Name</th>
<th>Designation</th>
<th>Email Address</th>

<th>Operations</th>
</thead>

<%
//String update=out.print("<a href="${pageContext.request.contextPath)/SiteController?page=update"></a>");
String tempURL=null;
List<Users> list = (List)request.getAttribute("listuser"); 
String UpdateUrl,DeleteUrl;
for(int i=0; i<list.size();i++){
	out.print("<tr>");
	out.print("<td>"+list.get(i).getSno()+"</td>");
	out.print("<td>"+list.get(i).getName()+"</td>");
	out.print("<td>"+list.get(i).getDesignation()+"</td>");
	out.print("<td>" +list.get(i).getEmail()+"</td>");
	UpdateUrl = request.getContextPath()+"/SiteController?page=updateuser"+"&sno="
	+list.get(i).getSno()+"&name="+list.get(i).getName()+"&designation="+list.get(i).getDesignation()+"&email="+list.get(i).getEmail();
	DeleteUrl=request.getContextPath()+"/SiteController?page=DeleteUser"+"&sno="+list.get(i).getSno();
	
	out.print("<td><a href="+UpdateUrl+">Update</a>|<a href="+DeleteUrl+">Delete</a></td>");
	
	out.print("</tr>");
}

%>
</table>
</div>
</div>
</div>


<%@include file="/include/footer.jsp" %>
</body>
</html>
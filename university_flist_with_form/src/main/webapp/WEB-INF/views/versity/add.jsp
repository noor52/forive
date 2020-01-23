<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New University</title>
</head>
<body>
	

	<form:form action="${pageContext.request.contextPath }/versity/add"
		modelAttribute="universities">
		
	     <h4>University Name</h4>
		   <form:input path="name" /> <br><br>
		<h4>University Rank</h4>
			<form:input path="rank" /> <br><br>
		<h4>Number OF Department</h4>
		<form:input path="numOfDepartment" /> <br><br>
		
		
		
		<input type="submit" name="submit" value="Add University">
	</form:form>

</body>
</html>
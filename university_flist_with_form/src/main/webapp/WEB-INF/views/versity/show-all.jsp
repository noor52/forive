<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add New Course</title>
</head>


<body>
	<table>
		<tr>
			<th>ID</th>
			<th>University</th>
			<th> RANK</th>
			<th> NumberOfDepartment</th>
		</tr>
		<c:forEach items="${university_list }" var="university">
			<tr>
				<th>${ university.id }</th>
				<th>${ university.name }</th>
				<th>${ university.rank }</th>
				<th>${ university.numOfDepartment }</th>
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>
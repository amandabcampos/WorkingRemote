<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
</head>
<body>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">State</th>
				<th scope="col">City</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="obj" items="${selected}" >
			<tr>
				<th scope="row">${obj.state}</th>
				<td>${obj.city}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>





</body>
</html>
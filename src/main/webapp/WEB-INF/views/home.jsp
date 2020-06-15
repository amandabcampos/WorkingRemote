<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Moving Remote</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<link rel="stylesheet" href="/style.css" />
</head>
<body>
	<h1>TABLE1</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">State</th>
				<th scope="col">City</th>
				<th scope="col">Pop</th>
				<th scope="col">Crime</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${thisList1}" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.state}</td>
					<td>${item.city}</td>
					<td>${item.population}</td>
					<td>${item.crime}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	<h1>TABLE2</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">State</th>
				<th scope="col">County</th>
				<th scope="col">Political</th>
				<th scope="col">Education</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${thisList2}" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.state}</td>
					<td>${item.county}</td>
					<td>${item.political}</td>
					<td>${item.education}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>
	
	<h1>TABLE3</h1>
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Id</th>
				<th scope="col">State</th>
				<th scope="col">County</th>
				<th scope="col">City</th>
				<th scope="col">Density</th>
				<th scope="col">Timezone</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${thisList3}" var="item">
				<tr>
					<td>${item.id}</td>
					<td>${item.state}</td>
					<td>${item.county}</td>
					<td>${item.city}</td>
					<td>${item.density}</td>
					<td>${item.timezone}</td>
				</tr>
			</c:forEach>

		</tbody>
	</table>





</body>
</html>
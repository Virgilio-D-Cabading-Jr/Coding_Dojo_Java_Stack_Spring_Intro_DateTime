<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!--/////////////////////////////////////////////////////
//	INDEX JSP
///////////////////////////////////////////////////////// -->

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- ---- CSS LINKS --------------------------------- -->
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<title>Date Time</title>
</head>
<body>
    	<!-- //// HEADER //////// -->
	<header>
		<div class="navbar navbar-dark bg-dark box-shadow">
			<div class="container d-flex justify-content-between">
				<a href="/" class="navbar-brand d-flex align-items-center"> <strong
					class="text-warning">DATE TIME</strong>
				</a> <a class="btn btn-secondary " href="/">HOME</a>
			</div>
		</div>
	</header>

	<!-- //// MAIN AREA //////// -->
	<main role="main">
		<div class="container mt-4">
			<div class="row">
				<button type="button" class="btn btn-primary col">
					<h1>
						<a href="">Date Template</a>
					</h1>
				</button>
				<button type="button" class="btn btn-success col">
					<h1>
						<a href="">Time Template</a>
					</h1>
				</button>
			</div>
		</div>
	</main>


    <!-- ---- JAVASCRIPT LINKS ---------------------------- -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/app.js"></script>
</body>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resume</title>
<link href="vendor/bootstrap/css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h1>MY RESUME</h1>
				<p>=======================================</p>
				<div class="form-control">
					<h3>Name & Email</h3>
					<p>${myNameAndEmail}</p>
				</div>
				<div class="form-control">
					<h3>Education</h3>
					<p>${myEducation}</p>
				</div>
				<div class="form-control">
					<h3>Work</h3>
					<p>${myWork}</p>
				</div>
				<div class="form-control">
					<h3>Skills</h3>
					<p>${mySkills}</p>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
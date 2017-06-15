<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<h1>MY RESUME</h1>
<p>=======================================</p>
<h3>Education</h3>
<p>${myEducation}</p>

<h3>Work</h3>
<p>${myWork}</p>

<h3>Skills</h3>
<c:forEach items="${mySkills}" var="Skills">

		${Skills.skills_name}<br />


</c:forEach>
</head>
<body>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
<h1>Dojo Survey</h1>
<form action="/survey" method="POST">
<div>
<label for="name">Your Name:</label>	
<input type="text" name="name" id="name" />
</div>
		
<div>

<label for="location">Dojo Location::</label>	
<select name="location" id="location">
<option value = "San Jose">San Jose</option>
<option value = "Oakland">Oakland</option>
<option value = "Nevada">Nevada</option>
<option value = "Idaho">Idaho</option>
</select>
</div>

<div>

<label for="language">Language:</label>		
<select name="language">
<option value = "Python">Python</option>
<option value = "Java">Java</option>
<option value = "C#">C#</option>
<option value = "C++">C++</option>
</select>
</div>

<div>
<label for = "comment">Comment:</label>
<textarea name ="comment"></textarea>
</div>

<button>Submit</button>

</form>
</body>
</html>
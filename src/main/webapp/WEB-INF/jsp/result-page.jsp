<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Spring Boot JSP Example</title>
</head>
<body>
<div align="center">
<h1>The Election Result is: </h1><br/>
Candidate name : ${resultEntity.candidateName}<br/>

Result is : ${resultEntity.votes_count}
<br/>
<i>Congrats ${resultEntity.candidateName}. you won the election</i>
</div>
<br>
<br>
<br>


<a href="/login">Back to home</a>
</div>
</body>
</html>

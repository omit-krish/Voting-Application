<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Spring Boot JSP Example</title>
</head>
<body>
<div>
<h1>election page....</h1>
<br/>

<a href="/voter-page">Voter Voting page..</a>
&nbsp;&nbsp;&nbsp;&nbsp;
<sec:authorize access="hasRole('ADMIN')">
<a href="/find-result">final-result.</a>
 </sec:authorize>
 <sec:authorize access="!hasRole('ADMIN')">
        <p>Access denied. Only admins can view results.</p>
    </sec:authorize>


</div>
<a href="/login">Back to home</a>

</body>
</html>

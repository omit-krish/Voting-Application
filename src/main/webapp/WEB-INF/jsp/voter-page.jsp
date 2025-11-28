<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Spring Form Example</title>
</head>
<body>
    <h2>Voter_Form</h2>
    <form:form action="/submit-voter" method="post" modelAttribute="voterDTO">
        Voter_Name: <form:input path="voterName" /><br/>
        Aadhaar: <form:input path="aadhaarNo" /><br/>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>
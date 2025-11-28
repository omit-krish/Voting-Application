<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Spring Boot JSP Example</title>
</head>
<body>
<div align="center">
<i style="font-size:20px;"> Do vote for good society.....</i>
<br>
<br>
<c:forEach var="candidate" items="${allCandidates}">
    <a href="/do-vote?candidateName=${candidate.candidateName}">
        ${candidate.candidateName}
    </a><br/>
</c:forEach>

</div>
</body>
</html>

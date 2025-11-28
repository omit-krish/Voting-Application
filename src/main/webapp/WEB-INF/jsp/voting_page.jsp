<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Vote for a Candidate</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            /* Add your background image URL here */
            background-image: linear-gradient(rgba(240, 242, 245, 0.9), rgba(240, 242, 245, 0.9)), url('your-voting-image.jpg');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            text-align: center;
            background-color: rgba(255, 255, 255, 0.98);
            padding: 40px 50px;
            border-radius: 15px;
            box-shadow: 0 8px 16px rgba(0,0,0,0.15);
            width: 100%;
            max-width: 450px;
        }
        h2 {
            color: #1f2937;
            margin-bottom: 10px;
            font-size: 28px;
        }
        p {
            color: #4b5563;
            margin-bottom: 30px;
            font-size: 18px;
        }
        .candidate-list {
            display: flex;
            flex-direction: column;
            gap: 15px;
        }
        .candidate-link {
            display: block;
            padding: 15px;
            background-color: #3b82f6;
            color: #fff;
            text-decoration: none;
            border-radius: 8px;
            font-size: 18px;
            font-weight: 500;
            transition: background-color 0.3s, transform 0.2s;
        }
        .candidate-link:hover {
            background-color: #2563eb;
            transform: translateY(-2px);
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Choose Your Candidate</h2>
    <p>Do vote for a good society.</p>
    <div class="candidate-list">
        <c:forEach var="candidate" items="${allCandidates}">
            <a href="/do-vote?candidateName=${candidate.candidateName}" class="candidate-link">
                ${candidate.candidateName}
            </a>
        </c:forEach>
    </div>
</div>

</body>
</html>

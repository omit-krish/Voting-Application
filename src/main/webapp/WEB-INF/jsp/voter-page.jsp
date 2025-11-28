<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Cast Your Vote</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            /* Add your background image URL here */
            background-image: linear-gradient(rgba(240, 242, 245, 0.85), rgba(240, 242, 245, 0.85)), url('your-vote-symbol.png');
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
            max-width: 400px;
        }
        h2 {
            color: #1f2937;
            margin-bottom: 30px;
            font-size: 28px;
        }
        .form-group {
            margin-bottom: 20px;
            text-align: left;
        }
        .form-group label {
            display: block;
            margin-bottom: 8px;
            color: #374151;
            font-weight: 500;
        }
        .form-control {
            width: 100%;
            padding: 12px;
            border: 1px solid #d1d5db;
            border-radius: 8px;
            box-sizing: border-box; /* Important for padding and width */
            font-size: 16px;
        }
        .btn-submit {
            width: 100%;
            padding: 12px;
            background-color: #2563eb;
            color: #fff;
            text-decoration: none;
            border-radius: 8px;
            border: none;
            font-size: 18px;
            font-weight: 500;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.2s;
            margin-top: 10px;
        }
        .btn-submit:hover {
            background-color: #1d4ed8;
            transform: translateY(-2px);
        }
    </style>
</head>
<body>

<div class="container">
    <h2>Voter Form</h2>
    <form:form action="/submit-voter" method="post" modelAttribute="voterDTO">
        <div class="form-group">
            <label for="voterName">Voter Name:</label>
            <form:input path="voterName" id="voterName" cssClass="form-control" />
        </div>
        <div class="form-group">
            <label for="aadhaarNo">Aadhaar:</label>
            <form:input path="aadhaarNo" id="aadhaarNo" cssClass="form-control" />
        </div>
        <input type="submit" value="Submit Vote" class="btn-submit"/>
    </form:form>
</div>

</body>
</html>

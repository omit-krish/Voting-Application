<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Vote Submitted</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            /* Add your background image URL here */
            background-image: linear-gradient(rgba(240, 242, 245, 0.8), rgba(240, 242, 245, 0.8)), url('your-voter-image.jpg');
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
            background-color: rgba(255, 255, 255, 0.95); /* Slightly transparent white */
            padding: 50px;
            border-radius: 15px;
            box-shadow: 0 8px 16px rgba(0,0,0,0.2);
        }
        h1 {
            color: #16a34a; /* A vibrant green */
            font-size: 32px;
            font-weight: 600;
        }
        p {
            color: #1f2937; /* A darker gray for better readability */
            font-size: 20px;
        }
        a {
            display: inline-block;
            margin-top: 25px;
            padding: 12px 24px;
            background-color: #1d4ed8; /* A rich blue */
            color: #fff;
            text-decoration: none;
            border-radius: 8px;
            transition: background-color 0.3s, transform 0.2s;
            font-size: 16px;
            font-weight: 500;
        }
        a:hover {
            background-color: #1e40af; /* A darker blue on hover */
            transform: translateY(-2px);
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Vote Submitted Successfully!</h1>
    <p>Thank you for being a part of the election.</p>
    <a href="/welcome">Back to Home</a>
</div>

</body>
</html>

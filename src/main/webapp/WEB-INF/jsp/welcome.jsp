<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Welcome to the Election Portal</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            /* Add your background image URL here */
            background-image: linear-gradient(rgba(240, 242, 245, 0.9), rgba(240, 242, 245, 0.9)), url('your-election-image.jpg');
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
            padding: 50px;
            border-radius: 15px;
            box-shadow: 0 8px 16px rgba(0,0,0,0.15);
            width: 100%;
            max-width: 500px;
        }
        h1 {
            color: #1f2937;
            margin-bottom: 15px;
            font-size: 32px;
        }
        p {
            color: #4b5563;
            margin-bottom: 35px;
            font-size: 18px;
        }
        .action-links {
            display: flex;
            flex-direction: column;
            gap: 15px;
        }
        .btn {
            display: block;
            padding: 15px;
            text-decoration: none;
            border-radius: 8px;
            font-size: 18px;
            font-weight: 500;
            transition: background-color 0.3s, transform 0.2s;
        }
        .btn-primary {
            background-color: #2563eb;
            color: #fff;
        }
        .btn-primary:hover {
            background-color: #1d4ed8;
            transform: translateY(-2px);
        }
        .btn-secondary {
            background-color: #6b7280;
            color: #fff;
        }
        .btn-secondary:hover {
            background-color: #4b5563;
            transform: translateY(-2px);
        }
        .footer-link {
            margin-top: 30px;
        }
        .footer-link a {
            color: #6b7280;
            text-decoration: none;
            font-size: 14px;
        }
        .footer-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Election Portal</h1>
    <p>Your vote matters. Please proceed to cast your vote.</p>
    
    <div class="action-links">
        <a href="/voter-page" class="btn btn-primary">Cast Your Vote</a>
        
        <sec:authorize access="hasRole('ADMIN')">
            <a href="/find-result" class="btn btn-secondary">View Final Results</a>
        </sec:authorize>
    </div>


</div>

</body>
</html>

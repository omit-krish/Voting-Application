<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Election Results</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            /* Add your background image URL here */
            background-image: linear-gradient(rgba(240, 242, 245, 0.9), rgba(240, 242, 245, 0.9)), url('your-results-image.jpg');
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
            margin-bottom: 20px;
            font-size: 32px;
        }
        .winner-card {
            background-color: #fefce8; /* Light yellow, like gold */
            border: 2px solid #facc15; /* A strong gold color */
            padding: 30px;
            border-radius: 10px;
            margin: 30px 0;
        }
        .winner-card h2 {
            color: #ca8a04; /* Dark gold text */
            margin: 0 0 10px 0;
            font-size: 28px;
        }
        .winner-card p {
            color: #78350f; /* Brownish text */
            margin: 0;
            font-size: 20px;
            font-weight: 500;
        }
        .congrats-msg {
            color: #4b5563;
            font-size: 18px;
            font-style: italic;
        }
        .btn-home {
            display: inline-block;
            margin-top: 30px;
            padding: 12px 24px;
            background-color: #1d4ed8;
            color: #fff;
            text-decoration: none;
            border-radius: 8px;
            transition: background-color 0.3s, transform 0.2s;
            font-size: 16px;
        }
        .btn-home:hover {
            background-color: #1e40af;
            transform: translateY(-2px);
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Election Result</h1>
    
    <div class="winner-card">
        <h2>${resultEntity.candidateName}</h2>
        <p>Total Votes: ${resultEntity.votes_count}</p>
    </div>

    <p class="congrats-msg">Congratulations, ${resultEntity.candidateName}! You won the election.</p>

    <a href="/login" class="btn-home">Back to Home</a>
</div>

</body>
</html>

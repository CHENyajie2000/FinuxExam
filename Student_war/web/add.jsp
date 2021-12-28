<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>
<html>
<head>
    <title>添加</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <style type="text/css">
        input[type=text], select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type=password], select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=submit] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type=submit]:hover {
            background-color: #45a049;
        }
        input[type=reset] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type=reset]:hover {
            background-color: #45a049;
        }
        div {
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
        }
        h1 {
            text-align: center
        }

        body {
            width: 100%;
            height: 100%;
            min-width: 1000px;
            background-image: url("img/back.jpg");
            background-repeat: no-repeat;
            background-size: 100% 100%;
        }
    </style>
</head>

<body>
<h1>添加学生信息</h1>
<hr>
<div class="container">
    <form action="AddServlet" method="post">

        <label for="fname">学生帐号:</label>
        <input type="text" id="fname" name="id" placeholder="Your id..">

        <label for="lname">学生姓名:</label>
        <input type="text" id="lname" name="name" placeholder="Your name..">

        <label for="pwd">密码:</label>
        <input type="password" id="pwd" name="pwd" placeholder="Your password..">

        <label for="age1">年龄:</label>
        <input type="text" id="age1" name="age" placeholder="Your age..">

        <label for="addr">家庭地址:</label>
        <input type="text" id="addr" name="address" placeholder="Your address..">

        <input type="submit" value="Submit">
        <input type="reset" value="Clear">
    </form>
</div>
</body>
</html>
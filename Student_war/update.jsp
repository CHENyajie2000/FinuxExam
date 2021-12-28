<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<head>
    <title>修改</title>
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

        input[type=button] {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type=button]:hover {
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
<h1>修改学生信息</h1>
<hr>

<div class="container">
    <form action="UpdateServlet" method="post">

        <label for="fname">编号:</label>
        <input type="text" id="fname" name="id" value="${student.id}"/>

        <label for="lname">姓名:</label>
        <input type="text" id="lname" name="name" value="${student.name}"/>

        <label for="pwd">密码:</label>
        <input type="text" id="pwd" name="pwd" value="${student.pwd}"/>

        <label for="age1">年龄:</label>
        <input type="text" id="age1" name="age" value="${student.age}"/>

        <label for="addr">家庭地址:</label>
        <input type="text" id="addr" name="address" value="${student.address}"/>

        <input type="submit" value="Submit">
        <input type="button" value="返回" onclick="history.go(-1)"/>

    </form>
</div>
</body>
</html>

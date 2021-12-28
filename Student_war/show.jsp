<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>学生数据显示</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/css/bootstrap.min.css">
    <script src="https://cdn.staticfile.org/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.staticfile.org/popper.js/1.15.0/umd/popper.min.js"></script>
    <script src="https://cdn.staticfile.org/twitter-bootstrap/4.3.1/js/bootstrap.min.js"></script>
    <style type="text/css">
        body{
            width: 100%;
            height: 100%;
            min-width: 1000px;
            background-image: url("img/back.jpg");
            background-repeat: no-repeat;
            background-size: 100% 100%;

        }
        h1 {text-align:center;}
    </style>
</head>
<body>
<div class="header">
    <h1>学生信息数据显示</h1>
</div>
<hr>
<div class="container">
    <table class="table table-dark table-hover">
        <thead>
        <tr>
            <th>编号</th>
            <th>姓名</th>
            <th>密码</th>
            <th>年龄</th>
            <th>家庭地址</th>
            <th>后端操作</th>
        </tr>
        </thead>
        <c:forEach items="${list}" var="item">
            <tr class="tr1">
                <td>${item.id }</td>
                <td>${item.name }</td>
                <td>${item.pwd }</td>
                <td>${item.age }</td>
                <td>${item.address }</td>
                <td>
                    <a href="add.jsp">
                        <button type="button" class="btn btn-primary">添加学生信息</button>
                    </a>
                    <a href="UpdateServlet?id=${item.id }">
                        <button type="button" class="btn btn-success">修改</button>
                    </a>
                    <a href="DeleteServlet?id=${item.id }">
                        <button type="button" class="btn btn-danger">删除</button>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
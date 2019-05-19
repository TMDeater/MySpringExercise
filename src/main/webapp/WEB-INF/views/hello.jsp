<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello ${name}!</title>
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
</head>
<body>
<h2 class="hello-title">Hello ${name}!</h2>
<script src="<c:url value="/resources/js/main.js" />"></script>
</body>
</html>
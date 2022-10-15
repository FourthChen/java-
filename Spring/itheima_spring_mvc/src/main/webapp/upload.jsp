<%--
  Created by IntelliJ IDEA.
  User: CSH
  Date: 2021/2/7
  Time: 7:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/quick22" method="post" enctype="multipart/form-data">
        名称<input type="text" name="username"><br/>
        文件1<input type="file" name="uploadFile1"><br/>
        文件2<input type="file" name="uploadFile2"><br/>
        <input type="submit" value=按钮><br/>
    </form>
</body>
</html>

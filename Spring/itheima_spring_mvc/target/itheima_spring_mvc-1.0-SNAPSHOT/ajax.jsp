<%--
  Created by IntelliJ IDEA.
  User: CSH
  Date: 2021/2/5
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--表示请求路径--%>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script>
        var userlist=new Array();
        userlist.push({username:"zhangsan",age:18});
        userlist.push({username:"lisi",age:16});

        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/user/quick15",
            data:JSON.stringify(userlist),
            contentType:"application/json;charset=utf-8"
        });
    </script>
</head>
<body>

</body>
</html>

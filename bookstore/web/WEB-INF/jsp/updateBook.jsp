<%--
  Created by IntelliJ IDEA.
  User: CSH
  Date: 2021/7/25
  Time: 11:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改数据页面</title>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>

        <form action="${pageContext.request.contextPath}/book/updatebook" method="post">
            <%--出现的问题：我们提交了修改的SQL请求，但修改失败，初次考虑是事务问题，--%>
            <%--看一下SQL语句是否执行成功--%>

                <%--前端传递隐形域--%>
            <input type="hidden" name="bookID" value="${Qbooks.bookID}">

            <div class="form-group">
                <label >书籍名称：</label>
                <input type="text" name="bookName" class="form-control" value="${Qbooks.bookName}" required >
            </div>

            <div class="form-group">
                <label >书籍数量：</label>
                <input type="text" name="bookCounts" class="form-control" value="${Qbooks.bookCounts}" required >
            </div>
            <div class="form-group">
                <label >书籍详情：</label>
                <input type="text" name="detail" class="form-control" value="${Qbooks.detail}" required>
            </div>
            <div class="form-group">
                <input type="submit" class="form-control"  value="修改">
            </div>
        </form>
    </div>

</div>
</body>
</html>

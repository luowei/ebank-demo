<%--
  Created by IntelliJ IDEA.
  User: luowei
  Date: 2014/9/19
  Time: 17:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
    <title>修改签约</title>
</head>
<body>
<form action="${ctx}/corpbank/update.lz"
      <%--enctype="multipart/form-data"--%>
        >
    <input type="hidden" name="id" value="${corpo.id}">
    <input type="hidden" name="corpId" value="${corpo.corpId}">
    开户名称:<input name="corpName" value="${corpo.corpName}"><br/>
    银行:<select name="corpBankId">
            <option value="2">中国建设银行</option>
        </select><br/>
    开户行:<input name="corpOpeningBank" value="${corpo.corpOpeningBank}">
    银行账号:<input name="corpBankAccount" value="${corpo.corpBankAccount}"><br/>
    图片:<input type="file" name="file"> <input name="corpCertPicture" value="img/aaa.jpg">
    <input type="submit" value="修改">
</form>
</body>
</html>

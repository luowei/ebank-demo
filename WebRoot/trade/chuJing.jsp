<%@ page import="com.rootls.common.Config" %>
<%@ page import="java.util.Date" %>
<%--
  Created by IntelliJ IDEA.
  User: luowei
  Date: 2014/9/12
  Time: 18:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>出金</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap3/css/bootstrap.min.css' />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap3/css/bootstrap-theme.min.css' />"/>
    <script type="text/javascript" src="<c:url value='/resources/js/jquery/jquery-2.1.0.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/bootstrap3/js/bootstrap.min.js'/>"></script>
</head>
<body>
<div class="container" style="margin-top: 10px">

    <form action="${ctx}/chuJing.lz" target="_blank">
        <div class="from-group " style="margin-bottom: 10px">
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MCH_NO商户编号&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="mchNo" value="<%=Config.mch_no%>"/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">CURR_COD币别&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="currCod" value="01"/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">FLOW_NO出金申请流水号&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="flowNo" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">DRAWEE_ACCT_NO付款账号&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="draweeAcctNo" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">PAYEE_ACCT_NO收款帐号&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="payeeAcctNo" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">TX_AMT交易金额&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="txAmt" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">OUT_AMT_SIT_NO出金席位号&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="outAmtSitNo" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">AUDIT_STS审批结果&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="auditSit" value="1"/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">RMRK备注</span>
                        <input class="form-control" name="rmrk" value=""/><br/>
                    </div>
                </div>
            </div>

        </div>

        <input class="btn btn-primary" type="submit" value="出金">
    </form>

</div>

</body>
</html>

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
    <title>冻结/解冻</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap3/css/bootstrap.min.css' />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap3/css/bootstrap-theme.min.css' />"/>
    <script type="text/javascript" src="<c:url value='/resources/js/jquery/jquery-2.1.0.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/bootstrap3/js/bootstrap.min.js'/>"></script>
</head>
<body>
<div class="container" style="margin-top: 10px">

    <form action="${ctx}/dongJie.lz" target="_blank">
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
                        <span class="input-group-addon">FUNC_CODE功能号&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="funcCode" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">BUYER_SIT_NO买方席位号&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="buyerSitNo" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">SELLER_SIT_NO卖方席位号&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="sellerSitNo" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">CTRT_NO合同编号&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="ctrtNo" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">CTRT_AMT合同金额&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="ctrtAmt" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">BUYER_GUAR_PAY_AMT买方交易保证金金额</span>
                        <input class="form-control" name="buyerGuarPayAmt" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">SELLER_GUAR_PAY_AMT卖方交易保证金金额</span>
                        <input class="form-control" name="sellerGuarPayAmt" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">BUYER_SVC_AMT买方手续费保证金金额</span>
                        <input class="form-control" name="buyerSvcAmt" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">SELLER_SVC_AMT卖方手续费保证金金额</span>
                        <input class="form-control" name="sellerSvcAmt" value=""/><br/>
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
                        <span class="input-group-addon">FIN_FLG融资标志</span>
                        <input class="form-control" name="finFlg" value=""/><br/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">FIN_AMT融资金额&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="finAmt" value=""/><br/>
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

        <input class="btn btn-primary" type="submit" value="冻结/解冻">
    </form>

</div>

</body>
</html>

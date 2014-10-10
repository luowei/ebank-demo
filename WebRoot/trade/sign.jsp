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
    <title>签约</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap3/css/bootstrap.min.css' />"/>
    <link rel="stylesheet" type="text/css" href="<c:url value='/resources/bootstrap3/css/bootstrap-theme.min.css' />"/>
    <script type="text/javascript" src="<c:url value='/resources/js/jquery/jquery-2.1.0.min.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/resources/bootstrap3/js/bootstrap.min.js'/>"></script>
</head>
<body>
<div class="container" style="margin-top: 10px">

    <form action="${ctx}/queryYuE.lz" target="_blank">
        <div class="from-group " style="margin-bottom: 10px">
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">corpId企业Id&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="corpId" value="${corpId eq null ? '6100':corpId}"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MCH_NO商户编号&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="mchNo" value="<%=Config.mch_no%>"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MBR_CERT_TYPE会员证件类型&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="mbrCertType" value="P"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MBR_CERT_NO会员证件号码&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="mbrCertNo" value="666061408"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">SPOT_SIT_NO实时记账模式席位号</span>
                        <input class="form-control" name="spotSitNo" value="${spotSitNo eq null ? '1411715760148':spotSitNo}"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">FUTURE_SIT_NO日终清算模式席位号</span>
                        <input class="form-control" name="futureSitNo" value=""/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MBR_NAME会员名称&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="mbrName" value="公司一七"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MBR_SPE_ACCT_NO会员指定账号&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="mbrSpeAcctNo" value="31001509600050046562"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MBR_SPE_ACCT_BKID会员账号行别&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="mbrSpeAcctBkid" value="0"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MBR_CONTACT会员联系人</span>
                        <input class="form-control" name="mbrContact" value="张三"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MBR_PHONE_NUM会员联系方式</span>
                        <input class="form-control" name="mbrPhoneNum" value="02168532917"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MBR_ADDR会员地址</span>
                        <input class="form-control" name="mbrAddr" value="浦东大道1089号"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MBR_ANNUAL_FEE_AMT会员年费金额</span>
                        <input class="form-control" name="mbrAnnualFeeAmt" value="0.0"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MBR_INOUT_AMT_SVC_AMT会员出入金手续费金额</span>
                        <input class="form-control" name="mbrInoutAmtSvcAmt" value="0.0"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MBR_INOUT_AMT_SVC_DRAWEE会员出入金手续费付费方&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="mbrInoutAmtSvcDrawee" value="1"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">MBR_INOUT_AMT_SVC_RCV_STY会员出入金手续费收取方式&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="mbrInoutAmtSvcRcvSty" value="1"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">SIGNED_DATE签约日期&nbsp;<b style="color: red">*</b></span>
                        <input class="form-control" name="signedDate" value="20140927"/>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">DIS_SGN_DATE解约日期</span>
                        <input class="form-control" name="disSgnDate" value=""/>
                    </div>
                </div>
            </div>
            <%--<div class="row">--%>
                <%--<div class="col-md-6 ">--%>
                    <%--<div class="input-group ">--%>
                        <%--<span class="input-group-addon">MBR_STS会员状态&nbsp;<b style="color: red">*</b></span>--%>
                        <%--<input class="form-control" name="mbrSts" value="0"/>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
            <div class="row">
                <div class="col-md-6 ">
                    <div class="input-group ">
                        <span class="input-group-addon">RMRK备注</span>
                        <input class="form-control" name="rmrk" value=""/>
                    </div>
                </div>
            </div>

        </div>

        <input class="btn btn-primary" type="submit" value="签约">
    </form>

</div>

</body>
</html>

<!DOCTYPE HTML>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="<%=path %>/page/bootstrap-3.3.4/dist/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/page/resource/css/main.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/page/jquery-easyui-1.4.2/themes/default/easyui.css">
    <script type="text/javascript" src="<%=path %>/page/jquery-easyui-1.4.2/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path %>/page/jquery-easyui-1.4.2/jquery.easyui.min.js"></script>
</head>
  
  <body>
    <form class="form-horizontal" action="<%=path %>/oni/refundEditDone.action" method="post">
    	    	
    	<input type="hidden" name="refund.tid" value='<s:property value="#refund.tid"/>'/>
    	    	    	    	    	    	    	    	    	    	    	    	    	    	            	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">客户编码</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="kehuId" placeholder="客户编码" name="refund.kehuId" value='<s:property value="#refund.kehuId"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">退款金额</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="refundMoney" placeholder="退款金额" name="refund.refundMoney" value='<s:property value="#refund.refundMoney"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">退款方式</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="refundType" placeholder="退款方式" name="refund.refundType" value='<s:property value="#refund.refundType"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">单号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="refundCode" placeholder="单号" name="refund.refundCode" value='<s:property value="#refund.refundCode"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">退款日期</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="refundDate" placeholder="退款日期" name="refund.refundDate" value='<s:property value="#refund.refundDate"/>'/>
            </div>
        </div>
                
        <!--
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">用户性别</label>
            <div class="col-sm-10">
                <div class="select_border">
                    <div class="select_containers ">
                        <select class="select" name="oniUser.userSex" id="oniUser.userSex">
                        	<option value="">请选择</option>
                            <option value="男">男</option>
                            <option value="女">女</option>
                        </select>
                       
                    </div>
                </div>
            </div>
        </div>
        -->
        <input type="submit" value="保存"/>
        <input type="button" value="取消"/>
    </form>
  </body>
</html>

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
    <form class="form-horizontal" action="<%=path %>/oni/ordersEditDone.action" method="post">
    	    	
    	<input type="hidden" name="orders.tid" value='<s:property value="#orders.tid"/>'/>
    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	            	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">订单类型</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="type" placeholder="订单类型" name="orders.type" value='<s:property value="#orders.type"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">订单状态</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="state" placeholder="订单状态" name="orders.state" value='<s:property value="#orders.state"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">服务师编号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="fwsId" placeholder="服务师编号" name="orders.fwsId" value='<s:property value="#orders.fwsId"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">客户编码</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="kehuId" placeholder="客户编码" name="orders.kehuId" value='<s:property value="#orders.kehuId"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">门店编号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="mpcenterId" placeholder="门店编号" name="orders.mpcenterId" value='<s:property value="#orders.mpcenterId"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">开始日期</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="ksdate" placeholder="开始日期" name="orders.ksdate" value='<s:property value="#orders.ksdate"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">开始日期</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="jsdate" placeholder="开始日期" name="orders.jsdate" value='<s:property value="#orders.jsdate"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">总价</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="zj" placeholder="总价" name="orders.zj" value='<s:property value="#orders.zj"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">总时间</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="zsj" placeholder="总时间" name="orders.zsj" value='<s:property value="#orders.zsj"/>'/>
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

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
</head>
  
  <body>
    <form class="form-horizontal" action="<%=path %>/oni/orderinfoAddDone.action" method="post">
    	    	            	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">订单时间段id</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="sjId" placeholder="用户名称" name="orderinfo.sjId"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">服务项</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="project" placeholder="用户名称" name="orderinfo.project"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">服务内容</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="content" placeholder="用户名称" name="orderinfo.content"/>
            </div>
        </div>
                
        <!--
        <div class="form-group">
            <label for="inputPassword3" class="col-sm-2 control-label">用户性别</label>
            <div class="col-sm-10">
                <div class="select_border">
                    <div class="select_containers ">
                        <select class="select" name="oniUser.userSex">
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

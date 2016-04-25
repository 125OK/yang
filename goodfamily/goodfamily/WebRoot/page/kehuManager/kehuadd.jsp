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
    <form class="form-horizontal" action="<%=path %>/oni/kehuAddDone.action" method="post">
    	    	            	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" placeholder="用户名称" name="kehu.name"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">用户电话</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="phone" placeholder="用户名称" name="kehu.phone"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">用户地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="address" placeholder="用户名称" name="kehu.address"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">余额</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="yue" placeholder="用户名称" name="kehu.yue"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">房型</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="fx" placeholder="用户名称" name="kehu.fx"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">面积</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="mj" placeholder="用户名称" name="kehu.mj"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">状态</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="state" placeholder="用户名称" name="kehu.state"/>
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

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
    <form class="form-horizontal" action="<%=path %>/oni/mpcenterAddDone.action" method="post">
    	    	            	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">门店名称</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="mname" placeholder="用户名称" name="mpcenter.mname"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">门店地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="maddress" placeholder="用户名称" name="mpcenter.maddress"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">门店工资单价</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="mdj" placeholder="用户名称" name="mpcenter.mdj"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">服务师单价</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="fwsdj" placeholder="用户名称" name="mpcenter.fwsdj"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">培训中心名称</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pname" placeholder="用户名称" name="mpcenter.pname"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">培训中心地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="paddress" placeholder="用户名称" name="mpcenter.paddress"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">区域</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="quyu" placeholder="用户名称" name="mpcenter.quyu"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">联系方式</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="phone" placeholder="用户名称" name="mpcenter.phone"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">父级编码</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pid" placeholder="用户名称" name="mpcenter.pid"/>
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

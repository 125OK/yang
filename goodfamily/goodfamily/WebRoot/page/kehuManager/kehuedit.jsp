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
    <form class="form-horizontal" action="<%=path %>/oni/kehuEditDone.action" method="post">
    	    	
    	<input type="hidden" name="kehu.tid" value='<s:property value="#kehu.tid"/>'/>
    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	            	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" placeholder="姓名" name="kehu.name" value='<s:property value="#kehu.name"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">用户电话</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="phone" placeholder="用户电话" name="kehu.phone" value='<s:property value="#kehu.phone"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">用户地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="address" placeholder="用户地址" name="kehu.address" value='<s:property value="#kehu.address"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">余额</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="yue" placeholder="余额" name="kehu.yue" value='<s:property value="#kehu.yue"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">房型</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="fx" placeholder="房型" name="kehu.fx" value='<s:property value="#kehu.fx"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">面积</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="mj" placeholder="面积" name="kehu.mj" value='<s:property value="#kehu.mj"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">状态</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="state" placeholder="状态" name="kehu.state" value='<s:property value="#kehu.state"/>'/>
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

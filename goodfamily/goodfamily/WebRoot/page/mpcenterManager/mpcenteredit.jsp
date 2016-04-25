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
    <form class="form-horizontal" action="<%=path %>/oni/mpcenterEditDone.action" method="post">
    	    	
    	<input type="hidden" name="mpcenter.tid" value='<s:property value="#mpcenter.tid"/>'/>
    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	            	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">门店名称</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="mname" placeholder="门店名称" name="mpcenter.mname" value='<s:property value="#mpcenter.mname"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">门店地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="maddress" placeholder="门店地址" name="mpcenter.maddress" value='<s:property value="#mpcenter.maddress"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">门店工资单价</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="mdj" placeholder="门店工资单价" name="mpcenter.mdj" value='<s:property value="#mpcenter.mdj"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">服务师单价</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="fwsdj" placeholder="服务师单价" name="mpcenter.fwsdj" value='<s:property value="#mpcenter.fwsdj"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">培训中心名称</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pname" placeholder="培训中心名称" name="mpcenter.pname" value='<s:property value="#mpcenter.pname"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">培训中心地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="paddress" placeholder="培训中心地址" name="mpcenter.paddress" value='<s:property value="#mpcenter.paddress"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">区域</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="quyu" placeholder="区域" name="mpcenter.quyu" value='<s:property value="#mpcenter.quyu"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">联系方式</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="phone" placeholder="联系方式" name="mpcenter.phone" value='<s:property value="#mpcenter.phone"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">父级编码</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="pid" placeholder="父级编码" name="mpcenter.pid" value='<s:property value="#mpcenter.pid"/>'/>
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

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
    <form class="form-horizontal" action="<%=path %>/oni/recordEditDone.action" method="post">
    	    	
    	<input type="hidden" name="record.tid" value='<s:property value="#record.tid"/>'/>
    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	            	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">客户编码</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="kehuId" placeholder="客户编码" name="record.kehuId" value='<s:property value="#record.kehuId"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">服务师编号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="fwsId" placeholder="服务师编号" name="record.fwsId" value='<s:property value="#record.fwsId"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="address" placeholder="地址" name="record.address" value='<s:property value="#record.address"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">服务项</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="project" placeholder="服务项" name="record.project" value='<s:property value="#record.project"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">服务时间</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="fwsj" placeholder="服务时间" name="record.fwsj" value='<s:property value="#record.fwsj"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">总时间</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="fwhouse" placeholder="总时间" name="record.fwhouse" value='<s:property value="#record.fwhouse"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">客户意见</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="kehuyj" placeholder="客户意见" name="record.kehuyj" value='<s:property value="#record.kehuyj"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">客户签字</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="kehuqz" placeholder="客户签字" name="record.kehuqz" value='<s:property value="#record.kehuqz"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">财产确认</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="qr" placeholder="财产确认" name="record.qr" value='<s:property value="#record.qr"/>'/>
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

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
    <form class="form-horizontal" action="<%=path %>/oni/fwsjtEditDone.action" method="post">
    	    	
    	<input type="hidden" name="fwsjt.tid" value='<s:property value="#fwsjt.tid"/>'/>
    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	            	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">服务师编号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="fwsId" placeholder="服务师编号" name="fwsjt.fwsId" value='<s:property value="#fwsjt.fwsId"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">家庭成员</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="jtcy" placeholder="家庭成员" name="fwsjt.jtcy" value='<s:property value="#fwsjt.jtcy"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">联系方式</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="phone" placeholder="联系方式" name="fwsjt.phone" value='<s:property value="#fwsjt.phone"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">子女情况</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="zn" placeholder="子女情况" name="fwsjt.zn" value='<s:property value="#fwsjt.zn"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">有无老人赡养</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="ywlr" placeholder="有无老人赡养" name="fwsjt.ywlr" value='<s:property value="#fwsjt.ywlr"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">其他</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="qita" placeholder="其他" name="fwsjt.qita" value='<s:property value="#fwsjt.qita"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">人事部留言</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="rsb" placeholder="人事部留言" name="fwsjt.rsb" value='<s:property value="#fwsjt.rsb"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">备注</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="remark" placeholder="备注" name="fwsjt.remark" value='<s:property value="#fwsjt.remark"/>'/>
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

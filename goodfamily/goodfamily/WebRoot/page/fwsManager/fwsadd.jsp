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
    <form class="form-horizontal" action="<%=path %>/oni/fwsAddDone.action" method="post">
    	    	            	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">服务师名字</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" placeholder="用户名称" name="fws.name"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">年龄</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="age" placeholder="用户名称" name="fws.age"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">性别</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="sex" placeholder="用户名称" name="fws.sex"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">工作经验</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="gjy" placeholder="用户名称" name="fws.gjy"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">现住地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="xdz" placeholder="用户名称" name="fws.xdz"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">联系方式</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="phone" placeholder="用户名称" name="fws.phone"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">籍贯</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="jiguan" placeholder="用户名称" name="fws.jiguan"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">出生日期</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="birthday" placeholder="用户名称" name="fws.birthday"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">民族</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="mz" placeholder="用户名称" name="fws.mz"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">属相</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="sx" placeholder="用户名称" name="fws.sx"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">精通语言</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="yuyan" placeholder="用户名称" name="fws.yuyan"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">身高</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="shengao" placeholder="用户名称" name="fws.shengao"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">体重</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="tizhong" placeholder="用户名称" name="fws.tizhong"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">学历</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="xl" placeholder="用户名称" name="fws.xl"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">证书</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="zs" placeholder="用户名称" name="fws.zs"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">类型</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="lx" placeholder="用户名称" name="fws.lx"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">状态</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="state" placeholder="用户名称" name="fws.state"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">薪资要求</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="money" placeholder="用户名称" name="fws.money"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">身份证号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="sfzh" placeholder="用户名称" name="fws.sfzh"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">身份证地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="sfzdz" placeholder="用户名称" name="fws.sfzdz"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">工作类型</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="gzlx" placeholder="用户名称" name="fws.gzlx"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">经验介绍</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="des" placeholder="用户名称" name="fws.des"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">专业特长</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="techang" placeholder="用户名称" name="fws.techang"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">性格特点</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="xgtd" placeholder="用户名称" name="fws.xgtd"/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">备注</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="remark" placeholder="用户名称" name="fws.remark"/>
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

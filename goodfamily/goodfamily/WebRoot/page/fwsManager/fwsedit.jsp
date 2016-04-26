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
    <form class="form-horizontal" action="<%=path %>/oni/fwsEditDone.action" method="post">
    	    	
    	<input type="hidden" name="fws.tid" value='<s:property value="#fws.tid"/>'/>
    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	    	            	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">服务师名字</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="name" placeholder="服务师名字" name="fws.name" value='<s:property value="#fws.name"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">年龄</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="age" placeholder="年龄" name="fws.age" value='<s:property value="#fws.age"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">性别</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="sex" placeholder="性别" name="fws.sex" value='<s:property value="#fws.sex"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">工作经验</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="gjy" placeholder="工作经验" name="fws.gjy" value='<s:property value="#fws.gjy"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">现住地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="xdz" placeholder="现住地址" name="fws.xdz" value='<s:property value="#fws.xdz"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">联系方式</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="phone" placeholder="联系方式" name="fws.phone" value='<s:property value="#fws.phone"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">籍贯</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="jiguan" placeholder="籍贯" name="fws.jiguan" value='<s:property value="#fws.jiguan"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">出生日期</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="birthday" placeholder="出生日期" name="fws.birthday" value='<s:property value="#fws.birthday"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">民族</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="mz" placeholder="民族" name="fws.mz" value='<s:property value="#fws.mz"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">属相</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="sx" placeholder="属相" name="fws.sx" value='<s:property value="#fws.sx"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">精通语言</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="yuyan" placeholder="精通语言" name="fws.yuyan" value='<s:property value="#fws.yuyan"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">身高</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="shengao" placeholder="身高" name="fws.shengao" value='<s:property value="#fws.shengao"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">体重</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="tizhong" placeholder="体重" name="fws.tizhong" value='<s:property value="#fws.tizhong"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">学历</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="xl" placeholder="学历" name="fws.xl" value='<s:property value="#fws.xl"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">证书</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="zs" placeholder="证书" name="fws.zs" value='<s:property value="#fws.zs"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">类型</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="lx" placeholder="类型" name="fws.lx" value='<s:property value="#fws.lx"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">状态</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="state" placeholder="状态" name="fws.state" value='<s:property value="#fws.state"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">薪资要求</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="money" placeholder="薪资要求" name="fws.money" value='<s:property value="#fws.money"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">身份证号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="sfzh" placeholder="身份证号" name="fws.sfzh" value='<s:property value="#fws.sfzh"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">身份证地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="sfzdz" placeholder="身份证地址" name="fws.sfzdz" value='<s:property value="#fws.sfzdz"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">工作类型</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="gzlx" placeholder="工作类型" name="fws.gzlx" value='<s:property value="#fws.gzlx"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">经验介绍</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="des" placeholder="经验介绍" name="fws.des" value='<s:property value="#fws.des"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">专业特长</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="techang" placeholder="专业特长" name="fws.techang" value='<s:property value="#fws.techang"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">性格特点</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="xgtd" placeholder="性格特点" name="fws.xgtd" value='<s:property value="#fws.xgtd"/>'/>
            </div>
        </div>
                    	
        <div class="form-group">
            <label for="inputEmail3" class="col-sm-2 control-label">备注</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="remark" placeholder="备注" name="fws.remark" value='<s:property value="#fws.remark"/>'/>
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

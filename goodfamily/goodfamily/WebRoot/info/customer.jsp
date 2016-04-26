<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>客户信息管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.1/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.4.1/themes/default/easyui.css">
<script type="text/javascript" src="jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
  
  <body>
 <div id="yang" data-options="region:'center',title:'用户信息管理'">
		
		<div class="p5 bg-eee">
			<div class="box-tool">
			客户手机号/名称：<input type="text" name="name" id="name" />
			&nbsp;&nbsp;&nbsp;&nbsp;
			日期：<input id="riqi" type="text" class="easyui-datebox">&nbsp;&nbsp; -- &nbsp;&nbsp;<input id="phone" type="text" class="easyui-datebox">
			&nbsp;&nbsp;&nbsp;&nbsp;
			状态：<select id="state" class="easyui-combobox" name="state" style="width:180px;">
					    <option value="">全部</option>
					    <option value="订单客户">订单客户</option>
					    <option value="需求客户">需求客户</option>
				</select>
			<a id="btn" class="easyui-linkbutton btn-reset" onclick="querykehu()">查询</a>
			</div>
		</div>
		<div class="p5 bg-eee">
			<div class="box-tool">
				 <a id="btn" class="easyui-linkbutton btn-submit" onclick="addUser()">客户详情</a> 
				 <a id="btn" class="easyui-linkbutton btn-reset" onclick="updateUser()">修改</a>
				<a id="btn" class="easyui-linkbutton btn-red" onclick="deleteUser()">删除</a>
				<a id="btn" class="easyui-linkbutton btn-reset" onclick="refresh()">刷新</a>
			</div>
		</div>
	</div>
	<table id="dg"></table>
 <script type="text/javascript">
 var a= window.parent.document.getElementById("rightFrame").offsetHeight-document.getElementById("yang").offsetHeight;
	$(function() { 
		$('#dg').datagrid({
			url : "queryKehuList.do",
			height: a,
			rownumbers : true,//行号
			striped : true,
			pagination : true,
			singleSelect : false,
			autoRowHeight : false,
			fitColumns : false,
			checkOnSelect : true,
			selectOnCheck : true,
			frozenColumns : [ [ {
				field : 'tid',
				title : 'tid',
				width : 100,
				checkbox : true
			} ] ],
			columns : [ [ {
				field : 'name',
				title : '姓名',
				width : 100
			}, {
				field : 'fx',
				title : '房型',
				width : 100
			}, {
				field : 'mj',
				title : '面积',
				width : 100
			}, {
				field : 'yue',
				title : '余额',
				width : 100
			}, {
				field : 'state',
				title : '状态',
				width : 100
			}, {
				field : 'riqi',
				title : '日期',
				width : 100
			}] ]
		});
	});//结束
	
	function querykehu(){
		$('#dg').datagrid('load', {
			name:$("#name").val(),
			riqi:$("#riqi").datebox('getValue'),
			phone:$("#phone").datebox('getValue'),
			state:$("#state").combobox('getValue')
		});
		
	}
 </script>
  </body>
</html>

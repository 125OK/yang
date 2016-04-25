<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>用户管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
</head>
<body>
 
	<div id="yang" data-options="region:'center',title:'用户信息管理'">
		
		<div class="p5 bg-eee">
			<div class="box-tool">
				用户编号/名称：<input type="text" name="yhm" id="yhm" />
			<a id="btn" class="easyui-linkbutton btn-reset"
					onclick="queryUser()">查询</a>
				 <a id="btn" class="easyui-linkbutton btn-submit" onclick="addUser()">增加</a> 
				 <a id="btn" class="easyui-linkbutton btn-reset" onclick="updateUser()">修改</a>
				<a id="btn" class="easyui-linkbutton btn-red" onclick="deleteUser()">删除</a>
				<a id="btn" class="easyui-linkbutton btn-reset" onclick="refresh()">刷新</a>
			</div>
			<table id="roleDataGrid"></table>
		</div>
	</div>
	<table id="dg"></table>

	<!-- 添加功能 和修改功能-->
	<div id="dd" class="p10" style="display: none;">
		<form id="formid">
			<input type="text" id="mendianId" name="mendianId" style="display: none;">
			<table class="table-h32" style="width: 90%;height: 90%">
				<tbody>
					<tr>
						<td style="text-align: right;">门店编码：</td>
						<td><input type="text" id="mendianCode" name="mendianCode" readonly="readonly" /></td>
						<td style="text-align: right;">门店名称：</td>
						<td><input type="text" name="mendianName" id="mendianName" /></td>
					</tr>
					
					<tr>
						<td style="text-align: right;">门店工资单价：</td>
						<td>
						<input type="text" name="mendianPrice" id="mendianPrice" />
						</td>
						
						<td>门店服务师单价:</td>
						<td>
						<input type="text" name="mendianFwsPrice" id="mendianFwsPrice" />
						</td>
					</tr>
                      <tr>
						<td style="text-align: right;">门店地址：</td>
						<td colspan="3"><input type="text" name="mendianAddress" id="mendianAddress"  style="width: 400px;"/></td>
					  </tr>
				</tbody>
			</table>
		</form>
	</div>
	<script type="text/javascript">
	var a= window.parent.document.getElementById("rightFrame").offsetHeight-document.getElementById("yang").offsetHeight;
	
		$(function() { 
			$('#dg').datagrid({
				url : "queryLogin.do",
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
					field : 'code',
					title : '用户编码',
					width : 100
				}, {
					field : 'name',
					title : '用户名称',
					width : 100
				}, {
					field : 'pwd',
					title : '密码',
					width : 100
				}, {
					field : 'qx',
					title : '权限',
					width : 100
				}] ]
			});
		});
		//查询
		function queryUser() {
			$('#dg').datagrid('load', {
				name : $("#yhm").val(),
				code : $("#yhm").val()
			});
		}
		//刷新
		function refresh() {
			$('#dg').datagrid('reload');
			saveSuccess();
		}
		function saveSuccess() {
			$.messager.show({
				title : '温馨提示',
				msg : '操作成功！',
				timeout : 800,
				style : {
					right : '',
					top : document.body.scrollTop
							+ document.documentElement.scrollTop,
					bottom : ''
				}
			});
		}
		//新增
		function addUser() {
			$("#mendianCode").val(Date.parse(new Date()));
			$('#dd').css({
				'display' : 'block'
			});
			$('#dd').dialog(
					{
						title : '新增用户',
						width : 600,
						height : 300,
						closed : false,
						cache : false,
						modal : true,
						buttons : [
								{
									text : '保存',
									handler : function() {
										$.post("addMendain.do", $("#formid")
												.serializeArray(), function(
												data) {
											$("#dd").dialog('close');
											saveSuccess();
											refresh();
										});
									}
								}, {
									text : '取消',
									handler : function() {
										$("#dd").dialog('close');
									}
								} ]

					});

		}
		//编辑
		function updateUser() {
			var nn = $('#dg').datagrid('getSelections');
			if (nn.length != 1) {
				$.messager.alert('温馨提示', '请选择一条数据进行操作');
			} else {
				$("#mendianId").val(nn[0]['mendianId']);
				$("#mendianCode").val(nn[0]['mendianCode']);
				$("#mendianName").val(nn[0]['mendianName']);
				$("#mendianAddress").val(nn[0]['mendianAddress']);
				$("#mendianPrice").val(nn[0]['mendianPrice']);
				$("#mendianFwsPrice").val(nn[0]['mendianFwsPrice']);
				$('#dd').css({
					'display' : 'block'
				});
				$('#dd')
						.dialog(
								{
									title : '修改用户信息',
									width : 600,
									height : 300,
									closed : false,
									cache : false,
									modal : true,
									buttons : [
											{
												text : '保存',
												handler : function() {
													$
															.post(
																	"updateMendain.do",
																	$("#formid")
																			.serializeArray(),
																	function(
																			data) {
																		$("#dd")
																				.dialog(
																						'close');
																		saveSuccess();
																		refresh();
																	});
												}
											}, {
												text : '取消',
												handler : function() {
													$("#dd").dialog('close');
												}
											} ]

								});
			}
		}
		//删除
		function deleteUser() {
			var nn = $('#dg').datagrid('getSelections');
			if (nn.length == 0) {
				$.messager.alert('温馨提示', '请选择你要删除的数据');
			} else {
				$.messager.confirm('温馨提示', '确定要删除你选定的数据？', function(r) {
					if (r) {

						for ( var i = 0; i < nn.length; i++) {
							var tj = '';
							tj = nn[i]['mendianId'];
							$('#dg').datagrid('deleteRow',$('#dg').datagrid('getRowIndex', nn[i]));
							$.ajax({
								type : 'post',
								url : "deleteMendain.do",
								data : {
									mendianId : tj
								},
								success : function(data) {

								}
							});

						}
					}
				});
			}
		}

		//判断登录名是否重复
		function userPan() {
			if ($("#userDlm").val() == null || $("#userDlm").val() == "") {
				$.messager.alert('温馨提示', '请输入登录名');
			} else {
				$.post("userpan.do", $("#formid").serializeArray(), function(
						data) {
					if (data != "0") {
						$.messager.alert('温馨提示', '此登录名一被占用，请重新输入登录名');
					}
				});
			}
		}
	</script>
</body>
</html>

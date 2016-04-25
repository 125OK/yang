<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="main/css/style.css" rel="stylesheet" type="text/css" />
<script language="JavaScript" src="main/js/jquery.js"></script>

<script type="text/javascript">
$(function(){	
	//导航切换
	$(".menuson li").click(function(){
		$(".menuson li.active").removeClass("active")
		$(this).addClass("active");
	});
	
	$('.title').click(function(){
		var $ul = $(this).next('ul');
		$('dd').find('ul').slideUp();
		if($ul.is(':visible')){
			$(this).next('ul').slideUp();
		}else{
			$(this).next('ul').slideDown();
		}
	});
})	
</script>


</head>

<body style="background:#f0f9fd;">
	<div class="lefttop"><span></span>菜单导航</div>
    
    <dl class="leftmenu">
        
    <dd>
    <div class="title">
    <span><img src="main/images/leftico01.png" /></span>信息管理
    </div>
    	<ul class="menuson">
        <li><cite></cite><a href="customer/kehu.jsp" target="rightFrame">客户信息管理</a><i></i></li>
        <li><cite></cite><a href="customer/kehu.jsp" target="rightFrame">服务师信息管理</a><i></i></li>
        <li><cite></cite><a href="customer/kehu.jsp" target="rightFrame">培训中心信息管理</a><i></i></li>
        <li><cite></cite><a href="customer/kehu.jsp" target="rightFrame">门店信息管理</a><i></i></li>
        <li><cite></cite><a href="info/user.jsp" target="rightFrame">用户信息管理</a><i></i></li>
        </ul>    
    </dd>
    
    <dd>
    <div class="title">
    <span><img src="main/images/leftico02.png" /></span>客户需求
    </div>
    <ul class="menuson">
        <li><cite></cite><a href="fws/fws.jsp" target="rightFrame">需求客户信息管理</a><i></i></li>
        </ul>     
    </dd> 
    
    
    <dd><div class="title"><span><img src="main/images/leftico03.png" /></span>订单</div>
    <ul class="menuson">
        <li><cite></cite><a href="order/dingdan.jsp" target="rightFrame">订单信息管理</a><i></i></li>
    </ul>    
    </dd>  
    
    
    <dd><div class="title"><span><img src="main/images/leftico04.png" /></span>报表</div>
    <ul class="menuson">
         <li><cite></cite><a href="customer/kehu.jsp" target="rightFrame">当日报表</a><i></i></li>
         <li><cite></cite><a href="customer/kehu.jsp" target="rightFrame">服务师工资月报表</a><i></i></li>
         <li><cite></cite><a href="customer/kehu.jsp" target="rightFrame">客户对账单</a><i></i></li>
    </ul>
    
    </dd>  
   
    </dl>
  </body>
</html>

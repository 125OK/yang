<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>美好世家社区管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="main/css/style.css" rel="stylesheet" type="text/css" />
    <script language="JavaScript" src="main/js/jquery.js"></script>
    <script src="main/js/cloud.js" type="text/javascript"></script>
    <script src="main/js/pwd.js" type="text/javascript"></script>
		<script language="javascript">
	$(function(){
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
	$(window).resize(function(){  
    $('.loginbox').css({'position':'absolute','left':($(window).width()-692)/2});
    })  
}); 

 //用户登录
 function login(){
 //加密 $.encoding.digests.hexSha1Str(pw);
 var name=$("#name").val();
 var pwd=$("#pwd").val();
 if(pwd==null){
 pwd=" ";
 }
 //pwd=$.encoding.digests.hexSha1Str(pwd);
$.post("<%=request.getContextPath() %>/queryLoginList.do", { pwd: pwd, name: name},
   function(pd){
	debugger;
   //判断是否登录成功
   if(pd==1){
   window.location="main/main.jsp";
   }else{
   alert("用户名或密码有误，请重新输入");
   }
   });
 }
</script> 

</head>

<body style="background-color:#1c77ac; background-image:url(main/images/light.png); background-repeat:no-repeat; background-position:center top; overflow:hidden;">



    <div id="mainBody">
      <div id="cloud1" class="cloud"></div>
      <div id="cloud2" class="cloud"></div>
    </div>  


<div class="logintop">    
    <span>欢迎登录美好世家社区信息管理系统</span>       
    </div>
    
    <div class="loginbody">
    
    <span class="systemlogo"></span> 
       
    <div class="loginbox">
    
    <ul>
    <li><input name="name" id="name" type="text" class="loginuser" value="用户名" onclick="JavaScript:this.value=''"/></li>
    <li><input name="pwd" id="pwd" type="password" class="loginpwd" value="密码" onclick="JavaScript:this.value=''"/></li>
    <li>
    <input name="" type="button" class="loginbtn" value="登录"  onclick="login()"/>
    </li>
    </ul>
    </div>
    </div>
    <div class="loginbm">版权所有  2016  <a href="http://a071578.atobo.com.cn">上海决断高信息技术有限公司</a> </div>
	</body>
</html>

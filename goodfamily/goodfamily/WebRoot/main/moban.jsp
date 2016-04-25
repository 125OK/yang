<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>美好世家基础服务师技能考核表</title>

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
<table style="width: 90%;text-align: left;margin-left: 40px;" border="1">
<tr style="text-align: center;font-size: 16px">
<td colspan="3">美好世家基础服务师技能考核表</td>
</tr>

<tr>
<td>项目</td>
<td>内容</td>
<td>分值</td>
</tr>

<tr style="text-align: left">
<td colspan="3">一、礼仪（10分）</td>
</tr>

<tr>
<td>1、制服</td>
<td>穿工作服、工鞋，并保持干净整洁</td>
<td>
<input name="1.1" id="1.1" type="radio" value="1" />1
<input name="1.1" id="1.1" type="radio" value="2" />2
<input name="1.1" id="1.1" type="radio" value="3" />3
<input name="1.1" id="1.1" type="radio" value="4" />4
<input name="1.1" id="1.1" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>2、礼貌用语</td>
<td>上门问答六句话</td>
<td>
<input name="1.2" id="1.2" type="radio" value="1" />1
<input name="1.2" id="1.2" type="radio" value="2" />2
<input name="1.2" id="1.2" type="radio" value="3" />3
<input name="1.2" id="1.2" type="radio" value="4" />4
<input name="1.2" id="1.2" type="radio" value="5" />5
</td>
</tr>

<tr>
<td colspan="3">二、工具使用（10分）</td>
</tr>

<tr>
<td>1、熟悉工具</td>
<td>工具包清洁</td>
<td>
<input name="2.1" id="2.1" type="radio" value="1" />1
<input name="2.1" id="2.1" type="radio" value="2" />2
<input name="2.1" id="2.1" type="radio" value="3" />3
<input name="2.1" id="2.1" type="radio" value="4" />4
<input name="2.1" id="2.1" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>2、熟练阐述工具使用范围</td>
<td>工具的使用</td>
<td>
<input name="2.2" id="2.2" type="radio" value="1" />1
<input name="2.2" id="2.2" type="radio" value="2" />2
<input name="2.2" id="2.2" type="radio" value="3" />3
<input name="2.2" id="2.2" type="radio" value="4" />4
<input name="2.2" id="2.2" type="radio" value="5" />5
</td>
</tr>

<tr>
<td colspan="3">三、保洁流程考核</td>
</tr>

<tr>
<td>1、卧室清洁流程</td>
<td>背诵卧室保洁流程</td>
<td>
<input name="3.1" id="3.1" type="radio" value="1" />1
<input name="3.1" id="3.1" type="radio" value="2" />2
<input name="3.1" id="3.1" type="radio" value="3" />3
<input name="3.1" id="3.1" type="radio" value="4" />4
<input name="3.1" id="3.1" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>2、铺床</td>
<td>床铺整理，睡衣摆放整齐</td>
<td>
<input name="3.2" id="3.2" type="radio" value="1" />1
<input name="3.2" id="3.2" type="radio" value="2" />2
<input name="3.2" id="3.2" type="radio" value="3" />3
<input name="3.2" id="3.2" type="radio" value="4" />4
<input name="3.2" id="3.2" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>3、清洁隔夜物品</td>
<td>牛奶、茶、咖啡等</td>
<td>
<input name="3.3" id="3.3" type="radio" value="1" />1
<input name="3.3" id="3.3" type="radio" value="2" />2
<input name="3.3" id="3.3" type="radio" value="3" />3
<input name="3.3" id="3.3" type="radio" value="4" />4
<input name="3.3" id="3.3" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>4、家电家具清洁</td>
<td>电脑、电视屏幕，高档家具慎用清洁剂</td>
<td>
<input name="3.4" id="3.4" type="radio" value="1" />1
<input name="3.4" id="3.4" type="radio" value="2" />2
<input name="3.4" id="3.4" type="radio" value="3" />3
<input name="3.4" id="3.4" type="radio" value="4" />4
<input name="3.4" id="3.4" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>5、床头物品整理</td>
<td>遥控器摆放在床头柜1/3，发射器对准电视机</td>
<td>
<input name="3.5" id="3.5" type="radio" value="1" />1
<input name="3.5" id="3.5" type="radio" value="2" />2
<input name="3.5" id="3.5" type="radio" value="3" />3
<input name="3.5" id="3.5" type="radio" value="4" />4
<input name="3.5" id="3.5" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>6、整理其他物品</td>
<td>是否整理充电器</td>
<td>
<input name="3.6" id="3.6" type="radio" value="1" />1
<input name="3.6" id="3.6" type="radio" value="2" />2
<input name="3.6" id="3.6" type="radio" value="3" />3
<input name="3.6" id="3.6" type="radio" value="4" />4
<input name="3.6" id="3.6" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>7、卫生间清洁流程</td>
<td>背诵卫生间清洁流程</td>
<td>
<input name="3.7" id="3.7" type="radio" value="1" />1
<input name="3.7" id="3.7" type="radio" value="2" />2
<input name="3.7" id="3.7" type="radio" value="3" />3
<input name="3.7" id="3.7" type="radio" value="4" />4
<input name="3.7" id="3.7" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>8、卫生间清洁</td>
<td>毛发一定要清洁干净</td>
<td>
<input name="3.8" id="3.8" type="radio" value="1" />1
<input name="3.8" id="3.8" type="radio" value="2" />2
<input name="3.8" id="3.8" type="radio" value="3" />3
<input name="3.8" id="3.8" type="radio" value="4" />4
<input name="3.8" id="3.8" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>9、卫生间擦拭</td>
<td>洗漱台镜子重点擦拭</td>
<td>
<input name="3.9" id="3.9" type="radio" value="1" />1
<input name="3.9" id="3.9" type="radio" value="2" />2
<input name="3.9" id="3.9" type="radio" value="3" />3
<input name="3.9" id="3.9" type="radio" value="4" />4
<input name="3.9" id="3.9" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>10、卫生间整理</td>
<td>毛巾、浴巾、化妆品摆放整齐</td>
<td>
<input name="1.10" id="1.10" type="radio" value="1" />1
<input name="1.10" id="1.10" type="radio" value="2" />2
<input name="1.10" id="1.10" type="radio" value="3" />3
<input name="1.10" id="1.10" type="radio" value="4" />4
<input name="1.10" id="1.10" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>11、卫生间整理</td>
<td>卫生纸按标准折叠</td>
<td>
<input name="3.11" id="3.11" type="radio" value="1" />1
<input name="3.11" id="3.11" type="radio" value="2" />2
<input name="3.11" id="3.11" type="radio" value="3" />3
<input name="3.11" id="3.11" type="radio" value="4" />4
<input name="3.11" id="3.11" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>12、卫生间抛光</td>
<td>不秀钢龙头重点抛光</td>
<td>
<input name="3.12" id="3.12" type="radio" value="1" />1
<input name="3.12" id="3.12" type="radio" value="2" />2
<input name="3.12" id="3.12" type="radio" value="3" />3
<input name="3.12" id="3.12" type="radio" value="4" />4
<input name="3.12" id="3.12" type="radio" value="5" />5
</td>
</tr>


<tr>
<td>13、厨房清洁流程</td>
<td>背诵厨房清洁流程</td>
<td>
<input name="3.13" id="3.13" type="radio" value="1" />1
<input name="3.13" id="3.13" type="radio" value="2" />2
<input name="3.13" id="3.13" type="radio" value="3" />3
<input name="3.13" id="3.13" type="radio" value="4" />4
<input name="3.13" id="3.13" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>14、厨房清洁</td>
<td>脱牌油烟机表面、灶面，台面要求光滑整洁</td>
<td>
<input name="3.14" id="3.14" type="radio" value="1" />1
<input name="3.14" id="3.14" type="radio" value="2" />2
<input name="3.14" id="3.14" type="radio" value="3" />3
<input name="3.14" id="3.14" type="radio" value="4" />4
<input name="3.14" id="3.14" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>15、厨房整理</td>
<td>物品、整理摆放有序（碗筷、闲置蔬菜食品等）</td>
<td>
<input name="3.15" id="3.15" type="radio" value="1" />1
<input name="3.15" id="3.15" type="radio" value="2" />2
<input name="3.15" id="3.15" type="radio" value="3" />3
<input name="3.15" id="3.15" type="radio" value="4" />4
<input name="3.15" id="3.15" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>16、家电清洁</td>
<td>厨房家电表面严禁使用百洁布，钢丝球擦拭</td>
<td>
<input name="3.16" id="3.16" type="radio" value="1" />1
<input name="3.16" id="3.16" type="radio" value="2" />2
<input name="3.16" id="3.16" type="radio" value="3" />3
<input name="3.16" id="3.16" type="radio" value="4" />4
<input name="3.16" id="3.16" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>17、家电清洁</td>
<td>电器设备清洁必须保持干爽，断电清洁（除冰箱）</td>
<td>
<input name="3.17" id="3.17" type="radio" value="1" />1
<input name="3.17" id="3.17" type="radio" value="2" />2
<input name="3.17" id="3.17" type="radio" value="3" />3
<input name="3.17" id="3.17" type="radio" value="4" />4
<input name="3.17" id="3.17" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>18、水池清洁</td>
<td>水池一定要消毒</td>
<td>
<input name="3.18" id="3.18" type="radio" value="1" />1
<input name="3.18" id="3.18" type="radio" value="2" />2
<input name="3.18" id="3.18" type="radio" value="3" />3
<input name="3.18" id="3.18" type="radio" value="4" />4
<input name="3.18" id="3.18" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>19、客厅清洁流程</td>
<td>背诵客厅清洁流程</td>
<td>
<input name="3.19" id="3.19" type="radio" value="1" />1
<input name="3.19" id="3.19" type="radio" value="2" />2
<input name="3.19" id="3.19" type="radio" value="3" />3
<input name="3.19" id="3.19" type="radio" value="4" />4
<input name="3.19" id="3.19" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>20、家电清洁</td>
<td>电视机用干净的干抹布擦拭，遥控器消毒</td>
<td>
<input name="3.20" id="3.20" type="radio" value="1" />1
<input name="3.20" id="3.20" type="radio" value="2" />2
<input name="3.20" id="3.20" type="radio" value="3" />3
<input name="3.20" id="3.20" type="radio" value="4" />4
<input name="3.20" id="3.20" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>21、客厅家具清洁</td>
<td>真皮沙发用专用清洁剂擦拭</td>
<td>
<input name="3.21" id="3.21" type="radio" value="1" />1
<input name="3.21" id="3.21" type="radio" value="2" />2
<input name="3.21" id="3.21" type="radio" value="3" />3
<input name="3.21" id="3.21" type="radio" value="4" />4
<input name="3.21" id="3.21" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>22、客厅清洁中的禁忌</td>
<td>水晶灯、名贵字画、佛像禁止擦拭</td>
<td>
<input name="3.22" id="3.22" type="radio" value="1" />1
<input name="3.22" id="3.22" type="radio" value="2" />2
<input name="3.22" id="3.22" type="radio" value="3" />3
<input name="3.22" id="3.22" type="radio" value="4" />4
<input name="3.22" id="3.22" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>23、客厅地板清洁</td>
<td>地板擦先用干抹布擦拭，再用8成干的湿抹布擦拭</td>
<td>
<input name="3.23" id="3.23" type="radio" value="1" />1
<input name="3.23" id="3.23" type="radio" value="2" />2
<input name="3.23" id="3.23" type="radio" value="3" />3
<input name="3.23" id="3.23" type="radio" value="4" />4
<input name="3.23" id="3.23" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>24、垃圾回收</td>
<td>出门前交待带走的垃圾带</td>
<td>
<input name="3.24" id="3.24" type="radio" value="1" />1
<input name="3.24" id="3.24" type="radio" value="2" />2
<input name="3.24" id="3.24" type="radio" value="3" />3
<input name="3.24" id="3.24" type="radio" value="4" />4
<input name="3.24" id="3.24" type="radio" value="5" />5
</td>
</tr>

<tr>
<td colspan="3">四、特殊注意事项（10分）</td>
</tr>

<tr>
<td>1、洗衣流程</td>
<td>背诵机洗流程、手洗流程</td>
<td>
<input name="4.1" id="4.1" type="radio" value="1" />1
<input name="4.1" id="4.1" type="radio" value="2" />2
<input name="4.1" id="4.1" type="radio" value="3" />3
<input name="4.1" id="4.1" type="radio" value="4" />4
<input name="4.1" id="4.1" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>2、注意事项</td>
<td>背诵洗衣的注意事项</td>
<td>
<input name="4.2" id="4.2" type="radio" value="1" />1
<input name="4.2" id="4.2" type="radio" value="2" />2
<input name="4.2" id="4.2" type="radio" value="3" />3
<input name="4.2" id="4.2" type="radio" value="4" />4
<input name="4.2" id="4.2" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>五、服从工作安排（10分）</td>
<td>管家填写基本分*2</td>
<td>
<input name="5.1" id="5.1" type="radio" value="1" />1
<input name="5.1" id="5.1" type="radio" value="2" />2
<input name="5.1" id="5.1" type="radio" value="3" />3
<input name="5.1" id="5.1" type="radio" value="4" />4
<input name="5.1" id="5.1" type="radio" value="5" />5
</td>
</tr>

<tr>
<td>合计</td>
<td></td>
<td id="zf"></td>
</tr>
</table>

<script type="text/javascript">
var userCode=<%=request.getParameter("userCode") %>
$(function(){
//判断此服务师是否被考核过
	$.ajax({
			type : 'post',
			url : "queryUserCheckList.do",
			data : {
				userCode : userCode
			},
			success : function(data) {
			
               $.each(eval(data),function(index,p){
                $('input[name="'+p.checkTemplateId+'"][value="'+p.checkScore+'"]').attr("checked",true);
                if(eval(data).length==(index+1)){
                zongfen();
                $("input:radio").attr("disabled","disabled");
                }
               });
			} 
		});
							
							
//点选按钮点击事件
$("input").click( function () {
 zongfen();
 });

});
//计算总分
function zongfen(){
var zf=0;
 $('input:radio:checked').each(function(i,val){
		 if(val.id=='5.1'){
		 zf=parseInt(zf)+parseInt(val.value*2);
		 }else{
		  zf=parseInt(zf)+parseInt(val.value);
		 }
      }); 
      $("#zf").html(zf);
}
function panduan(){
return $('input:checked').length;
}
//保存所选中的分值及其对应的id
function saveInfo(){

$('input:radio:checked').each(function(i,val){
 $.ajax({
					type : 'post',
					url : "addUserCheck.do",
					data : {
						userCode : userCode,
						checkTemplateId:val.id,
						checkScore:val.value
					},
					success : function(data) {
		             
					} 
				});
		}); 
		
}
</script>
</body>
</html>

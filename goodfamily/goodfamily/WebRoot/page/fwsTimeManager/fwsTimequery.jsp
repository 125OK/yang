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
    <link rel="stylesheet" type="text/css" href="<%=path %>/page/resource/css/main.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/page/jquery-easyui-1.4.2/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/page/jquery-easyui-1.4.2/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="<%=path %>/page/jquery-easyui-1.4.2/demo.css">
    <script type="text/javascript" src="<%=path %>/page/jquery-easyui-1.4.2/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path %>/page/jquery-easyui-1.4.2/jquery.easyui.min.js"></script>
</head>
<body>
<div class="mt10" id="search_bar">
<form id="queryForm" action="<%=path %>/oni/fwsTimeQuery.action" method="post">

	<s:if test="%{fwsTime.beginIndex!=null}">
 		<input type="hidden" id="beginIndex" value='<s:property value="fwsTime.beginIndex"/>' name="fwsTime.beginIndex"/>
	</s:if>
 	<s:else>
 		<input type="hidden" id="beginIndex" value='1' name="fwsTime.beginIndex"/>
 	</s:else>
 	<input type="hidden" id="pageSize" value='<s:property value="#pageSize"/>' />
 	<input type="hidden" id="totalPage" value='<s:property value="#totalPage"/>' />
 	<input type="hidden" id="count" value='<s:property value="#count"/>' />
 	
    <div class="box">
        <div class="box_border">
            <div class="box_top"><b class="pl15">搜索</b></div>
            <div class="box_center pt10 pb10">
                <table cellspacing="0" cellpadding="0" border="0" class="form_table">
                    <tbody><tr>
                                        	                                        	                                        	                                        	                                           <!--
                       <td>性别</td>
                        <td>
                    <span class="fl">
                      <div class="select_border">
                          <div class="select_containers ">
                              <select class="select" name="oniUser.userSex">
                              	  <option value="">请选择</option>
                                  <option value="男">男</option>
                                  <option value="女">女</option>
                              </select>
                          </div>
                      </div>
                    </span>
                        </td>
                    </tr>
                    -->
                   
                    </tbody></table>
            </div>
            <div style="border-top:1px solid #dadada;" class="box_bottom pb5 pt5 pr10">
                <div style="text-align:left;" class="search_bar_btn">
                  	<input type="button" class="btn btn82 btn_save2" value="查询" onclick="firstPage()"/>
    				<input type="reset" class="btn btn82 btn_res" value="重置"/>
                </div>
            </div>
        </div>
    </div>
</form>
</div>
<div class="mt10" id="table">
    <div class="box span10 oh">
        <div class="CRC" style="width: 1105px;">
            <div class="CRG" style="left: 32px; height: 326px;">
                <div class="grip"></div>
                <div style="cursor:e-resize" class="CRZ"></div>
            </div>
            <div class="CRG" style="left: 133px; height: 326px;">
                <div class="grip"></div>
                <div style="cursor:e-resize" class="CRZ"></div>
            </div>
            <div class="CRG" style="left: 234px; height: 326px;">
                <div class="grip"></div>
                <div style="cursor:e-resize" class="CRZ"></div>
            </div>
            <div class="CRL" style="left: 1106px; height: 326px;"></div>
        </div>
        <table width="100%" cellspacing="0" cellpadding="0" border="0" class="list_table CRZ" id="CRZ0">
            <tbody>
            <tr>
                <th style="width: 30px;">#</th>
                                                                
                <th style="width: 100px;">服务师编号</th>
                                                
                <th style="width: 100px;">周编号</th>
                                                
                <th style="width: 100px;">时间编号</th>
                                     
            </tr>
            <s:iterator value="fwsTimeList" id="fwsTime">
           	<tr class="tr" style="background-color: rgb(255, 255, 255);">
                <td class="td_center"><input type="checkbox" name="selectCheckbox" value='<s:property value="#fwsTime.tid"/>'></td>
                                                                
                <td><s:property value="#fwsTime.fwsId"></s:property></td>
                                                
                <td><s:property value="#fwsTime.zhouId"></s:property></td>
                                                
                <td><s:property value="#fwsTime.timebId"></s:property></td>
                                
            </tr>
          	</s:iterator>
            </tbody>
        </table>
        <div class="page mt10 clearfix">
            <div class="fl mt20 mb20">
                <input type="button" class="btn btn82 btn_add" value="新增"/>
                <input type="button" class="btn btn82 btn_config" value="修改"/>
                <input type="button" class="btn btn82 btn_del" value="删除"/>
            </div>
            <div class="pagination fr">
                <ul>
                
                <s:if test="%{isFirst}">
                	<li class="disabled"><span>首页</span></li>
                    <li class="disabled"><span>上一页</span></li>
                </s:if>
                <s:else>
                	<li class="first-child"><a href="javascript:firstPage()">首页</a></li>
                    <li><a href="javascript:prewPage()">上一页</a></li>
                </s:else>
                    
                    <li class="active"><span>当前第<s:property value="#currentPage"/>/<s:property value="#totalPage"/>页，共<s:property value="#count"/>条数据</span></li>
                <s:if test="%{isLast}">
                	<li class="disabled"><span>下一页</span></li>
                    <li class="disabled"><span>末页</span></li>
                </s:if>
                <s:else>
                	<li><a href="javascript:nextPage()">下一页</a></li>
                    <li class="last-child"><a href="javascript:lastPage()">末页</a></li>
                </s:else>
                    
                </ul>
            </div>

        </div>
    </div>
</div>

<div id="w" class="easyui-window" title="表单提交" data-options="modal:true,closed:true,iconCls:'icon-save'"
     style="width:700px;height:500px;padding:20px;">
    <iframe id="frameframe" src="<%=path%>/page/fwsTimeManager/fwsTimeadd.jsp" style="width: 100%; height: 100%"></iframe>
</div>

<script type="text/javascript">
    $(document).ready(function () {
    	
        $(".btn_add").bind({
            click: function () {
            	$("#frameframe").attr("src","<%=path%>/page/fwsTimeManager/fwsTimeadd.jsp");
                $('#w').window('open');
            }
        });
        
        $(".btn_config").bind({
            click: function () {
            	
            	var selectCount=$('input:checkbox[name=selectCheckbox]:checked').length;
            	
            	if(selectCount==0)
           		{
           			alert("请选择一条记录");
           		}else if(selectCount>1)
           		{
           			alert("只能选择一条记录");
           		}else{
           			var value=$('input:checkbox[name=selectCheckbox]:checked').each(function(i){
           				
           		       if(0==i)
           		       {
           		        	var selectId = $(this).val();
           		     		
           		        	$("#frameframe").attr("src","<%=path%>/oni/fwsTimeEdit.action?fwsTime.tid="+selectId);
           	                $('#w').window('open');
           		       }
           			});
           		}
            }
        });
        
        $(".btn_del").bind({
            click: function () {
            	
            	var selectCount=$('input:checkbox[name=selectCheckbox]:checked').length;
            	
            	if(selectCount==0)
           		{
           			alert("请选择一条记录");
           		}else if(selectCount>1)
           		{
           			alert("只能选择一条记录");
           		}else{
           			var value=$('input:checkbox[name=selectCheckbox]:checked').each(function(i){
           				
           		       if(0==i)
           		       {
           		        	var selectId = $(this).val();
           		     		
           		        	$("#queryForm").attr("action","<%=path %>/oni/fwsTimeDeleteDone.action?fwsTime.tid="+selectId);
           		        	$("#queryForm").submit();
           		       }
           			});
           		}
            }
        });
        
        
        
    });
    
    function firstPage()
    {
    	$("#beginIndex").val(1);
    	
    	$("#queryForm").submit();
    }
    
    function prewPage()
    {
    	var beginIndex=Number($("#beginIndex").val());
    	var pageSize=Number($("#pageSize").val());
    	
    	$("#beginIndex").val(beginIndex-pageSize);
    	$("#queryForm").submit();
    }
    
    function nextPage()
    {
    	var beginIndex=Number($("#beginIndex").val());
    	var pageSize=Number($("#pageSize").val());
    	
    	$("#beginIndex").val(beginIndex+pageSize);
    	$("#queryForm").submit();
    }
    
    function lastPage()
    {
    	var pageSize=Number($("#pageSize").val());
    	var totalPage=Number($("#totalPage").val());
    	var count=Number($("#count").val());
    	
		$("#beginIndex").val(Math.floor(count/pageSize)*pageSize+1);
    	$("#queryForm").submit();
    }
</script>
</body>
</html>
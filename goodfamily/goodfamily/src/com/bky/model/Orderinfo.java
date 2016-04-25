package com.bky.model;

import java.util.Date;

public class Orderinfo implements java.io.Serializable{
  
     private String tid; //主键
  
     private String sjId; //订单时间段id
  
     private String project; //服务�?
  
     private String content; //服务内容
  
     private int page=1;//分页查询�?��
     
     private int rows=10;//分页查询结束
   
  	public void setTid(String tid){
     	this.tid=tid;
  	}
  
  	public String getTid(){
    	return  this.tid;
  	}
   
  	public void setSjId(String sjId){
     	this.sjId=sjId;
  	}
  
  	public String getSjId(){
    	return  this.sjId;
  	}
   
  	public void setProject(String project){
     	this.project=project;
  	}
  
  	public String getProject(){
    	return  this.project;
  	}
   
  	public void setContent(String content){
     	this.content=content;
  	}
  
  	public String getContent(){
    	return  this.content;
  	}
  
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getRows() {
		return rows;
	}
	
	public void setRows(int rows) {
		this.rows = rows;
	} 
}
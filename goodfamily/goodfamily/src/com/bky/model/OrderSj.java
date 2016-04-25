package com.bky.model;

import java.util.Date;

public class OrderSj implements java.io.Serializable{
  
     private String tid; //主键
  
     private String orderbId; //订单编号
  
     private String zhouId; //周编�?
  
     private String timebId; //时间编号
  
     private int page=1;//分页查询�?��
     
     private int rows=10;//分页查询结束
   
  	public void setTid(String tid){
     	this.tid=tid;
  	}
  
  	public String getTid(){
    	return  this.tid;
  	}
   
  	public void setOrderbId(String orderbId){
     	this.orderbId=orderbId;
  	}
  
  	public String getOrderbId(){
    	return  this.orderbId;
  	}
   
  	public void setZhouId(String zhouId){
     	this.zhouId=zhouId;
  	}
  
  	public String getZhouId(){
    	return  this.zhouId;
  	}
   
  	public void setTimebId(String timebId){
     	this.timebId=timebId;
  	}
  
  	public String getTimebId(){
    	return  this.timebId;
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
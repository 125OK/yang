package com.bky.model;

import java.util.Date;

public class Orderb implements java.io.Serializable{
  
     private String tid; //主键
  
     private String ordersId; //订单编号
  
     private String orderSjId; //订单时间段编�?
  
     private String orderinfoId; //服务项编�?
  
     private int page=1;//分页查询�?��
     
     private int rows=10;//分页查询结束
   
  	public void setTid(String tid){
     	this.tid=tid;
  	}
  
  	public String getTid(){
    	return  this.tid;
  	}
   
  	public void setOrdersId(String ordersId){
     	this.ordersId=ordersId;
  	}
  
  	public String getOrdersId(){
    	return  this.ordersId;
  	}
   
  	public void setOrderSjId(String orderSjId){
     	this.orderSjId=orderSjId;
  	}
  
  	public String getOrderSjId(){
    	return  this.orderSjId;
  	}
   
  	public void setOrderinfoId(String orderinfoId){
     	this.orderinfoId=orderinfoId;
  	}
  
  	public String getOrderinfoId(){
    	return  this.orderinfoId;
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
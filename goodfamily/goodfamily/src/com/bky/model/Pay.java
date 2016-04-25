package com.bky.model;

import java.util.Date;

public class Pay implements java.io.Serializable{
  
     private String tid; //主键
  
     private String kehuId; //客户编码
  
     private String payMoney; //充�?金额
  
     private String payType; //充�?方式
  
     private String payCode; //单号
  
     private String payDate; //充�?日期
  
     private int page=1;//分页查询�?��
     
     private int rows=10;//分页查询结束
   
  	public void setTid(String tid){
     	this.tid=tid;
  	}
  
  	public String getTid(){
    	return  this.tid;
  	}
   
  	public void setKehuId(String kehuId){
     	this.kehuId=kehuId;
  	}
  
  	public String getKehuId(){
    	return  this.kehuId;
  	}
   
  	public void setPayMoney(String payMoney){
     	this.payMoney=payMoney;
  	}
  
  	public String getPayMoney(){
    	return  this.payMoney;
  	}
   
  	public void setPayType(String payType){
     	this.payType=payType;
  	}
  
  	public String getPayType(){
    	return  this.payType;
  	}
   
  	public void setPayCode(String payCode){
     	this.payCode=payCode;
  	}
  
  	public String getPayCode(){
    	return  this.payCode;
  	}
   
  	public void setPayDate(String payDate){
     	this.payDate=payDate;
  	}
  
  	public String getPayDate(){
    	return  this.payDate;
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
package com.bky.model;

import java.util.Date;

public class Refund implements java.io.Serializable{
  
     private String tid; //主键
  
     private String kehuId; //客户编码
  
     private String refundMoney; //�?��金额
  
     private String refundType; //�?��方式
  
     private String refundCode; //单号
  
     private String refundDate; //�?��日期
  
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
   
  	public void setRefundMoney(String refundMoney){
     	this.refundMoney=refundMoney;
  	}
  
  	public String getRefundMoney(){
    	return  this.refundMoney;
  	}
   
  	public void setRefundType(String refundType){
     	this.refundType=refundType;
  	}
  
  	public String getRefundType(){
    	return  this.refundType;
  	}
   
  	public void setRefundCode(String refundCode){
     	this.refundCode=refundCode;
  	}
  
  	public String getRefundCode(){
    	return  this.refundCode;
  	}
   
  	public void setRefundDate(String refundDate){
     	this.refundDate=refundDate;
  	}
  
  	public String getRefundDate(){
    	return  this.refundDate;
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
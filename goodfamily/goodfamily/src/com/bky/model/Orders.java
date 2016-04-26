package com.bky.model;

import java.util.Date;

public class Orders implements java.io.Serializable{
  
     private String tid; //主键
  
     private String type; //订单类型
  
     private String state; //订单状�?
  
     private String fwsId; //服务师编�?
  
     private String kehuId; //客户编码
  
     private String mpcenterId; //门店编号
  
     private String ksdate; //�?��日期
  
     private String jsdate; //�?��日期
  
     private String zj; //总价
  
     private String zsj; //总时�?
  
     private int page=1;//分页查询�?��
     
     private int rows=10;//分页查询结束
   
  	public void setTid(String tid){
     	this.tid=tid;
  	}
  
  	public String getTid(){
    	return  this.tid;
  	}
   
  	public void setType(String type){
     	this.type=type;
  	}
  
  	public String getType(){
    	return  this.type;
  	}
   
  	public void setState(String state){
     	this.state=state;
  	}
  
  	public String getState(){
    	return  this.state;
  	}
   
  	public void setFwsId(String fwsId){
     	this.fwsId=fwsId;
  	}
  
  	public String getFwsId(){
    	return  this.fwsId;
  	}
   
  	public void setKehuId(String kehuId){
     	this.kehuId=kehuId;
  	}
  
  	public String getKehuId(){
    	return  this.kehuId;
  	}
   
  	public void setMpcenterId(String mpcenterId){
     	this.mpcenterId=mpcenterId;
  	}
  
  	public String getMpcenterId(){
    	return  this.mpcenterId;
  	}
   
  	public void setKsdate(String ksdate){
     	this.ksdate=ksdate;
  	}
  
  	public String getKsdate(){
    	return  this.ksdate;
  	}
   
  	public void setJsdate(String jsdate){
     	this.jsdate=jsdate;
  	}
  
  	public String getJsdate(){
    	return  this.jsdate;
  	}
   
  	public void setZj(String zj){
     	this.zj=zj;
  	}
  
  	public String getZj(){
    	return  this.zj;
  	}
   
  	public void setZsj(String zsj){
     	this.zsj=zsj;
  	}
  
  	public String getZsj(){
    	return  this.zsj;
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
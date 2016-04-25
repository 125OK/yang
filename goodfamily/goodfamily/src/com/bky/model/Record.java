package com.bky.model;

import java.util.Date;

public class Record implements java.io.Serializable{
  
     private String tid; //主键
  
     private String kehuId; //客户编码
  
     private String fwsId; //服务师编�?
  
     private String address; //地址
  
     private String project; //服务�?
  
     private String fwsj; //服务时间
  
     private String fwhouse; //总时�?
  
     private String kehuyj; //客户意见
  
     private String kehuqz; //客户签字
  
     private String qr; //财产确认
  
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
   
  	public void setFwsId(String fwsId){
     	this.fwsId=fwsId;
  	}
  
  	public String getFwsId(){
    	return  this.fwsId;
  	}
   
  	public void setAddress(String address){
     	this.address=address;
  	}
  
  	public String getAddress(){
    	return  this.address;
  	}
   
  	public void setProject(String project){
     	this.project=project;
  	}
  
  	public String getProject(){
    	return  this.project;
  	}
   
  	public void setFwsj(String fwsj){
     	this.fwsj=fwsj;
  	}
  
  	public String getFwsj(){
    	return  this.fwsj;
  	}
   
  	public void setFwhouse(String fwhouse){
     	this.fwhouse=fwhouse;
  	}
  
  	public String getFwhouse(){
    	return  this.fwhouse;
  	}
   
  	public void setKehuyj(String kehuyj){
     	this.kehuyj=kehuyj;
  	}
  
  	public String getKehuyj(){
    	return  this.kehuyj;
  	}
   
  	public void setKehuqz(String kehuqz){
     	this.kehuqz=kehuqz;
  	}
  
  	public String getKehuqz(){
    	return  this.kehuqz;
  	}
   
  	public void setQr(String qr){
     	this.qr=qr;
  	}
  
  	public String getQr(){
    	return  this.qr;
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
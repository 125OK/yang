package com.bky.model;

import java.util.Date;

public class Mpcenter implements java.io.Serializable{
  
     private String tid; //主键
  
     private String mname; //门店名称
  
     private String maddress; //门店地址
  
     private String mdj; //门店工资单价
  
     private String fwsdj; //服务师单�?
  
     private String pname; //培训中心名称
  
     private String paddress; //培训中心地址
  
     private String quyu; //区域
  
     private String phone; //联系方式
  
     private String pid; //父级编码
  
     private int page=1;//分页查询�?��
     
     private int rows=10;//分页查询结束
   
  	public void setTid(String tid){
     	this.tid=tid;
  	}
  
  	public String getTid(){
    	return  this.tid;
  	}
   
  	public void setMname(String mname){
     	this.mname=mname;
  	}
  
  	public String getMname(){
    	return  this.mname;
  	}
   
  	public void setMaddress(String maddress){
     	this.maddress=maddress;
  	}
  
  	public String getMaddress(){
    	return  this.maddress;
  	}
   
  	public void setMdj(String mdj){
     	this.mdj=mdj;
  	}
  
  	public String getMdj(){
    	return  this.mdj;
  	}
   
  	public void setFwsdj(String fwsdj){
     	this.fwsdj=fwsdj;
  	}
  
  	public String getFwsdj(){
    	return  this.fwsdj;
  	}
   
  	public void setPname(String pname){
     	this.pname=pname;
  	}
  
  	public String getPname(){
    	return  this.pname;
  	}
   
  	public void setPaddress(String paddress){
     	this.paddress=paddress;
  	}
  
  	public String getPaddress(){
    	return  this.paddress;
  	}
   
  	public void setQuyu(String quyu){
     	this.quyu=quyu;
  	}
  
  	public String getQuyu(){
    	return  this.quyu;
  	}
   
  	public void setPhone(String phone){
     	this.phone=phone;
  	}
  
  	public String getPhone(){
    	return  this.phone;
  	}
   
  	public void setPid(String pid){
     	this.pid=pid;
  	}
  
  	public String getPid(){
    	return  this.pid;
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
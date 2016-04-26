package com.bky.model;



public class Kehu implements java.io.Serializable{
  
     private String tid; //主键
  
     private String name; //姓名
  
     private String phone; //用户电话
  
     private String address; //用户地址
  
     private String yue; //余额
  
     private String fx; //房型
  
     private String mj; //面积
  
     private String state; //状�?
     
     private String riqi;
  
     private int page=1;//分页查询�?��
     
     private int rows=10;//分页查询结束
   
  	public void setTid(String tid){
     	this.tid=tid;
  	}
  
  	public String getTid(){
    	return  this.tid;
  	}
   
  	public void setName(String name){
     	this.name=name;
  	}
  
  	public String getName(){
    	return  this.name;
  	}
   
  	public void setPhone(String phone){
     	this.phone=phone;
  	}
  
  	public String getPhone(){
    	return  this.phone;
  	}
   
  	public void setAddress(String address){
     	this.address=address;
  	}
  
  	public String getAddress(){
    	return  this.address;
  	}
   
  	public void setYue(String yue){
     	this.yue=yue;
  	}
  
  	public String getYue(){
    	return  this.yue;
  	}
   
  	public void setFx(String fx){
     	this.fx=fx;
  	}
  
  	public String getFx(){
    	return  this.fx;
  	}
   
  	public void setMj(String mj){
     	this.mj=mj;
  	}
  
  	public String getMj(){
    	return  this.mj;
  	}
   
  	public void setState(String state){
     	this.state=state;
  	}
  
  	public String getState(){
    	return  this.state;
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

	public String getRiqi() {
		return riqi;
	}

	public void setRiqi(String riqi) {
		this.riqi = riqi;
	}

	
}
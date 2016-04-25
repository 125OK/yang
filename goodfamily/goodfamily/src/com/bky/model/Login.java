package com.bky.model;

import java.util.Date;

public class Login implements java.io.Serializable{
  
     private String tid; //主键
  
     private String code; //用户编码
  
     private String name; //用户名称
  
     private String pwd; //密码
  
     private String qx; //权限
  
     private int page=1;//分页查询�?��
     
     private int rows=10;//分页查询结束
   
  	public void setTid(String tid){
     	this.tid=tid;
  	}
  
  	public String getTid(){
    	return  this.tid;
  	}
   
  	public void setCode(String code){
     	this.code=code;
  	}
  
  	public String getCode(){
    	return  this.code;
  	}
   
  	public void setName(String name){
     	this.name=name;
  	}
  
  	public String getName(){
    	return  this.name;
  	}
   
  	public void setPwd(String pwd){
     	this.pwd=pwd;
  	}
  
  	public String getPwd(){
    	return  this.pwd;
  	}
   
  	public void setQx(String qx){
     	this.qx=qx;
  	}
  
  	public String getQx(){
    	return  this.qx;
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
package com.bky.model;

import java.util.Date;

public class Fwsjt implements java.io.Serializable{
  
     private String tid; //主键
  
     private String fwsId; //服务师编�?
  
     private String jtcy; //家庭成员
  
     private String phone; //联系方式
  
     private String zn; //子女情况
  
     private String ywlr; //有无老人赡养
  
     private String qita; //其他
  
     private String rsb; //人事部留�?
  
     private String remark; //备注
  
     private int page=1;//分页查询�?��
     
     private int rows=10;//分页查询结束
   
  	public void setTid(String tid){
     	this.tid=tid;
  	}
  
  	public String getTid(){
    	return  this.tid;
  	}
   
  	public void setFwsId(String fwsId){
     	this.fwsId=fwsId;
  	}
  
  	public String getFwsId(){
    	return  this.fwsId;
  	}
   
  	public void setJtcy(String jtcy){
     	this.jtcy=jtcy;
  	}
  
  	public String getJtcy(){
    	return  this.jtcy;
  	}
   
  	public void setPhone(String phone){
     	this.phone=phone;
  	}
  
  	public String getPhone(){
    	return  this.phone;
  	}
   
  	public void setZn(String zn){
     	this.zn=zn;
  	}
  
  	public String getZn(){
    	return  this.zn;
  	}
   
  	public void setYwlr(String ywlr){
     	this.ywlr=ywlr;
  	}
  
  	public String getYwlr(){
    	return  this.ywlr;
  	}
   
  	public void setQita(String qita){
     	this.qita=qita;
  	}
  
  	public String getQita(){
    	return  this.qita;
  	}
   
  	public void setRsb(String rsb){
     	this.rsb=rsb;
  	}
  
  	public String getRsb(){
    	return  this.rsb;
  	}
   
  	public void setRemark(String remark){
     	this.remark=remark;
  	}
  
  	public String getRemark(){
    	return  this.remark;
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
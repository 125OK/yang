package com.bky.model;

import java.util.Date;

public class FwsTime implements java.io.Serializable{
  
     private String tid; //主键
  
     private String fwsId; //服务师编�?
  
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
   
  	public void setFwsId(String fwsId){
     	this.fwsId=fwsId;
  	}
  
  	public String getFwsId(){
    	return  this.fwsId;
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
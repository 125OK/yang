package com.bky.model;

import java.util.Date;

public class Timeb implements java.io.Serializable{
  
     private String tid; //主键
  
     private String sj; //时间
  
     private int page=1;//分页查询�?��
     
     private int rows=10;//分页查询结束
   
  	public void setTid(String tid){
     	this.tid=tid;
  	}
  
  	public String getTid(){
    	return  this.tid;
  	}
   
  	public void setSj(String sj){
     	this.sj=sj;
  	}
  
  	public String getSj(){
    	return  this.sj;
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
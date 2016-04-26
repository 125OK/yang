package com.bky.model;

import java.util.Date;

public class Fws implements java.io.Serializable{
  
     private String tid; //主键
  
     private String name; //服务师名�?
  
     private String age; //年龄
  
     private String sex; //性别
  
     private String gjy; //工作经验
  
     private String xdz; //现住地址
  
     private String phone; //联系方式
  
     private String jiguan; //籍贯
  
     private String birthday; //出生日期
  
     private String mz; //民族
  
     private String sx; //属相
  
     private String yuyan; //精�?语言
  
     private String shengao; //身高
  
     private String tizhong; //体重
  
     private String xl; //学历
  
     private String zs; //证书
  
     private String lx; //类型
  
     private String state; //状�?
  
     private String money; //薪资要求
  
     private String sfzh; //身份证号
  
     private String sfzdz; //身份证地�?
  
     private String gzlx; //工作类型
  
     private String des; //经验介绍
  
     private String techang; //专业特长
  
     private String xgtd; //性格特点
  
     private String remark; //备注
  
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
   
  	public void setAge(String age){
     	this.age=age;
  	}
  
  	public String getAge(){
    	return  this.age;
  	}
   
  	public void setSex(String sex){
     	this.sex=sex;
  	}
  
  	public String getSex(){
    	return  this.sex;
  	}
   
  	public void setGjy(String gjy){
     	this.gjy=gjy;
  	}
  
  	public String getGjy(){
    	return  this.gjy;
  	}
   
  	public void setXdz(String xdz){
     	this.xdz=xdz;
  	}
  
  	public String getXdz(){
    	return  this.xdz;
  	}
   
  	public void setPhone(String phone){
     	this.phone=phone;
  	}
  
  	public String getPhone(){
    	return  this.phone;
  	}
   
  	public void setJiguan(String jiguan){
     	this.jiguan=jiguan;
  	}
  
  	public String getJiguan(){
    	return  this.jiguan;
  	}
   
  	public void setBirthday(String birthday){
     	this.birthday=birthday;
  	}
  
  	public String getBirthday(){
    	return  this.birthday;
  	}
   
  	public void setMz(String mz){
     	this.mz=mz;
  	}
  
  	public String getMz(){
    	return  this.mz;
  	}
   
  	public void setSx(String sx){
     	this.sx=sx;
  	}
  
  	public String getSx(){
    	return  this.sx;
  	}
   
  	public void setYuyan(String yuyan){
     	this.yuyan=yuyan;
  	}
  
  	public String getYuyan(){
    	return  this.yuyan;
  	}
   
  	public void setShengao(String shengao){
     	this.shengao=shengao;
  	}
  
  	public String getShengao(){
    	return  this.shengao;
  	}
   
  	public void setTizhong(String tizhong){
     	this.tizhong=tizhong;
  	}
  
  	public String getTizhong(){
    	return  this.tizhong;
  	}
   
  	public void setXl(String xl){
     	this.xl=xl;
  	}
  
  	public String getXl(){
    	return  this.xl;
  	}
   
  	public void setZs(String zs){
     	this.zs=zs;
  	}
  
  	public String getZs(){
    	return  this.zs;
  	}
   
  	public void setLx(String lx){
     	this.lx=lx;
  	}
  
  	public String getLx(){
    	return  this.lx;
  	}
   
  	public void setState(String state){
     	this.state=state;
  	}
  
  	public String getState(){
    	return  this.state;
  	}
   
  	public void setMoney(String money){
     	this.money=money;
  	}
  
  	public String getMoney(){
    	return  this.money;
  	}
   
  	public void setSfzh(String sfzh){
     	this.sfzh=sfzh;
  	}
  
  	public String getSfzh(){
    	return  this.sfzh;
  	}
   
  	public void setSfzdz(String sfzdz){
     	this.sfzdz=sfzdz;
  	}
  
  	public String getSfzdz(){
    	return  this.sfzdz;
  	}
   
  	public void setGzlx(String gzlx){
     	this.gzlx=gzlx;
  	}
  
  	public String getGzlx(){
    	return  this.gzlx;
  	}
   
  	public void setDes(String des){
     	this.des=des;
  	}
  
  	public String getDes(){
    	return  this.des;
  	}
   
  	public void setTechang(String techang){
     	this.techang=techang;
  	}
  
  	public String getTechang(){
    	return  this.techang;
  	}
   
  	public void setXgtd(String xgtd){
     	this.xgtd=xgtd;
  	}
  
  	public String getXgtd(){
    	return  this.xgtd;
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
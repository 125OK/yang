package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Kehu;
import com.bky.service.KehuService;
import com.bky.util.dg;




@Controller
public class KehuController {

	private KehuService kehuService;
	public KehuService getKehuService() {
		return kehuService;
	}
	@Autowired
		public void setKehuService(KehuService kehuService) {
		this.kehuService = kehuService;
	}


	
	
	@RequestMapping(value = "/queryKehuList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryKehuList(Kehu kehu,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			kehu.setRows(kehu.getPage()*kehu.getRows());
			kehu.setPage((kehu.getPage()-1)*kehu.getRows());
			d.setRows(kehuService.queryKehusByPage(kehu));
		    d.setTotal(kehuService.getKehuCount(kehu));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addKehu", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addKehu(Kehu kehu,HttpServletRequest request)
	{
		try {
			kehuService.insertKehu(kehu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editKehu", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editKehu(Kehu kehu,HttpServletRequest request)
	{
		try {
			kehuService.updateKehu(kehu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteKehu", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteKehu(Kehu kehu,HttpServletRequest request)
	{
		try {
			kehuService.deleteKehu(kehu);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Zhou;
import com.bky.service.ZhouService;
import com.bky.util.dg;




@Controller
public class ZhouController {

	private ZhouService zhouService;
	public ZhouService getZhouService() {
		return zhouService;
	}
	@Autowired
		public void setZhouService(ZhouService zhouService) {
		this.zhouService = zhouService;
	}


	
	
	@RequestMapping(value = "/queryZhouList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryZhouList(Zhou zhou,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			zhou.setRows(zhou.getPage()*zhou.getRows());
			zhou.setPage((zhou.getPage()-1)*zhou.getRows());
			d.setRows(zhouService.queryZhousByPage(zhou));
		    d.setTotal(zhouService.getZhouCount(zhou));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addZhou", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addZhou(Zhou zhou,HttpServletRequest request)
	{
		try {
			zhouService.insertZhou(zhou);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editZhou", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editZhou(Zhou zhou,HttpServletRequest request)
	{
		try {
			zhouService.updateZhou(zhou);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteZhou", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteZhou(Zhou zhou,HttpServletRequest request)
	{
		try {
			zhouService.deleteZhou(zhou);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

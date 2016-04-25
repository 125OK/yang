package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Fws;
import com.bky.service.FwsService;
import com.bky.util.dg;




@Controller
public class FwsController {

	private FwsService fwsService;
	public FwsService getFwsService() {
		return fwsService;
	}
	@Autowired
		public void setFwsService(FwsService fwsService) {
		this.fwsService = fwsService;
	}


	
	
	@RequestMapping(value = "/queryFwsList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryFwsList(Fws fws,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			d.setRows(fwsService.queryFwssByPage(fws));
		    d.setTotal(fwsService.getFwsCount(fws));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addFws", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addFws(Fws fws,HttpServletRequest request)
	{
		try {
			fwsService.insertFws(fws);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editFws", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editFws(Fws fws,HttpServletRequest request)
	{
		try {
			fwsService.updateFws(fws);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteFws", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteFws(Fws fws,HttpServletRequest request)
	{
		try {
			fwsService.deleteFws(fws);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

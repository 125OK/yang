package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Fwsjt;
import com.bky.service.FwsjtService;
import com.bky.util.dg;




@Controller
public class FwsjtController {

	private FwsjtService fwsjtService;
	public FwsjtService getFwsjtService() {
		return fwsjtService;
	}
	@Autowired
		public void setFwsjtService(FwsjtService fwsjtService) {
		this.fwsjtService = fwsjtService;
	}


	
	
	@RequestMapping(value = "/queryFwsjtList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryFwsjtList(Fwsjt fwsjt,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			d.setRows(fwsjtService.queryFwsjtsByPage(fwsjt));
		    d.setTotal(fwsjtService.getFwsjtCount(fwsjt));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addFwsjt", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addFwsjt(Fwsjt fwsjt,HttpServletRequest request)
	{
		try {
			fwsjtService.insertFwsjt(fwsjt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editFwsjt", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editFwsjt(Fwsjt fwsjt,HttpServletRequest request)
	{
		try {
			fwsjtService.updateFwsjt(fwsjt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteFwsjt", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteFwsjt(Fwsjt fwsjt,HttpServletRequest request)
	{
		try {
			fwsjtService.deleteFwsjt(fwsjt);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Timeb;
import com.bky.service.TimebService;
import com.bky.util.dg;




@Controller
public class TimebController {

	private TimebService timebService;
	public TimebService getTimebService() {
		return timebService;
	}
	@Autowired
		public void setTimebService(TimebService timebService) {
		this.timebService = timebService;
	}


	
	
	@RequestMapping(value = "/queryTimebList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryTimebList(Timeb timeb,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			timeb.setRows(timeb.getPage()*timeb.getRows());
			timeb.setPage((timeb.getPage()-1)*timeb.getRows());
			d.setRows(timebService.queryTimebsByPage(timeb));
		    d.setTotal(timebService.getTimebCount(timeb));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addTimeb", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addTimeb(Timeb timeb,HttpServletRequest request)
	{
		try {
			timebService.insertTimeb(timeb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editTimeb", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editTimeb(Timeb timeb,HttpServletRequest request)
	{
		try {
			timebService.updateTimeb(timeb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteTimeb", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteTimeb(Timeb timeb,HttpServletRequest request)
	{
		try {
			timebService.deleteTimeb(timeb);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

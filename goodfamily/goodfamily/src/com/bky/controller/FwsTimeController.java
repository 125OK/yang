package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.FwsTime;
import com.bky.service.FwsTimeService;
import com.bky.util.dg;




@Controller
public class FwsTimeController {

	private FwsTimeService fwsTimeService;
	public FwsTimeService getFwsTimeService() {
		return fwsTimeService;
	}
	@Autowired
		public void setFwsTimeService(FwsTimeService fwsTimeService) {
		this.fwsTimeService = fwsTimeService;
	}


	
	
	@RequestMapping(value = "/queryFwsTimeList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryFwsTimeList(FwsTime fwsTime,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			fwsTime.setRows(fwsTime.getPage()*fwsTime.getRows());
			fwsTime.setPage((fwsTime.getPage()-1)*fwsTime.getRows());
			d.setRows(fwsTimeService.queryFwsTimesByPage(fwsTime));
		    d.setTotal(fwsTimeService.getFwsTimeCount(fwsTime));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addFwsTime", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addFwsTime(FwsTime fwsTime,HttpServletRequest request)
	{
		try {
			fwsTimeService.insertFwsTime(fwsTime);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editFwsTime", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editFwsTime(FwsTime fwsTime,HttpServletRequest request)
	{
		try {
			fwsTimeService.updateFwsTime(fwsTime);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteFwsTime", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteFwsTime(FwsTime fwsTime,HttpServletRequest request)
	{
		try {
			fwsTimeService.deleteFwsTime(fwsTime);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

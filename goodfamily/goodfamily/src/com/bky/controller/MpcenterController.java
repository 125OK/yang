package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Mpcenter;
import com.bky.service.MpcenterService;
import com.bky.util.dg;




@Controller
public class MpcenterController {

	private MpcenterService mpcenterService;
	public MpcenterService getMpcenterService() {
		return mpcenterService;
	}
	@Autowired
		public void setMpcenterService(MpcenterService mpcenterService) {
		this.mpcenterService = mpcenterService;
	}


	
	
	@RequestMapping(value = "/queryMpcenterList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryMpcenterList(Mpcenter mpcenter,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			d.setRows(mpcenterService.queryMpcentersByPage(mpcenter));
		    d.setTotal(mpcenterService.getMpcenterCount(mpcenter));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addMpcenter", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addMpcenter(Mpcenter mpcenter,HttpServletRequest request)
	{
		try {
			mpcenterService.insertMpcenter(mpcenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editMpcenter", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editMpcenter(Mpcenter mpcenter,HttpServletRequest request)
	{
		try {
			mpcenterService.updateMpcenter(mpcenter);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteMpcenter", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteMpcenter(Mpcenter mpcenter,HttpServletRequest request)
	{
		try {
			mpcenterService.deleteMpcenter(mpcenter);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

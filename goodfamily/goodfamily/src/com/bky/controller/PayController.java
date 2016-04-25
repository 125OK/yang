package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Pay;
import com.bky.service.PayService;
import com.bky.util.dg;




@Controller
public class PayController {

	private PayService payService;
	public PayService getPayService() {
		return payService;
	}
	@Autowired
		public void setPayService(PayService payService) {
		this.payService = payService;
	}


	
	
	@RequestMapping(value = "/queryPayList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryPayList(Pay pay,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			d.setRows(payService.queryPaysByPage(pay));
		    d.setTotal(payService.getPayCount(pay));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addPay", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addPay(Pay pay,HttpServletRequest request)
	{
		try {
			payService.insertPay(pay);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editPay", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editPay(Pay pay,HttpServletRequest request)
	{
		try {
			payService.updatePay(pay);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deletePay", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deletePay(Pay pay,HttpServletRequest request)
	{
		try {
			payService.deletePay(pay);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

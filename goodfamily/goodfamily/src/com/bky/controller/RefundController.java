package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Refund;
import com.bky.service.RefundService;
import com.bky.util.dg;




@Controller
public class RefundController {

	private RefundService refundService;
	public RefundService getRefundService() {
		return refundService;
	}
	@Autowired
		public void setRefundService(RefundService refundService) {
		this.refundService = refundService;
	}


	
	
	@RequestMapping(value = "/queryRefundList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryRefundList(Refund refund,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			d.setRows(refundService.queryRefundsByPage(refund));
		    d.setTotal(refundService.getRefundCount(refund));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addRefund", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addRefund(Refund refund,HttpServletRequest request)
	{
		try {
			refundService.insertRefund(refund);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editRefund", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editRefund(Refund refund,HttpServletRequest request)
	{
		try {
			refundService.updateRefund(refund);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteRefund", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteRefund(Refund refund,HttpServletRequest request)
	{
		try {
			refundService.deleteRefund(refund);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

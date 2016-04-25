package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Orderinfo;
import com.bky.service.OrderinfoService;
import com.bky.util.dg;




@Controller
public class OrderinfoController {

	private OrderinfoService orderinfoService;
	public OrderinfoService getOrderinfoService() {
		return orderinfoService;
	}
	@Autowired
		public void setOrderinfoService(OrderinfoService orderinfoService) {
		this.orderinfoService = orderinfoService;
	}


	
	
	@RequestMapping(value = "/queryOrderinfoList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryOrderinfoList(Orderinfo orderinfo,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			d.setRows(orderinfoService.queryOrderinfosByPage(orderinfo));
		    d.setTotal(orderinfoService.getOrderinfoCount(orderinfo));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addOrderinfo", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addOrderinfo(Orderinfo orderinfo,HttpServletRequest request)
	{
		try {
			orderinfoService.insertOrderinfo(orderinfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editOrderinfo", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editOrderinfo(Orderinfo orderinfo,HttpServletRequest request)
	{
		try {
			orderinfoService.updateOrderinfo(orderinfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteOrderinfo", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteOrderinfo(Orderinfo orderinfo,HttpServletRequest request)
	{
		try {
			orderinfoService.deleteOrderinfo(orderinfo);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

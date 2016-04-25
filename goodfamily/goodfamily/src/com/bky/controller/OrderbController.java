package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Orderb;
import com.bky.service.OrderbService;
import com.bky.util.dg;




@Controller
public class OrderbController {

	private OrderbService orderbService;
	public OrderbService getOrderbService() {
		return orderbService;
	}
	@Autowired
		public void setOrderbService(OrderbService orderbService) {
		this.orderbService = orderbService;
	}


	
	
	@RequestMapping(value = "/queryOrderbList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryOrderbList(Orderb orderb,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			d.setRows(orderbService.queryOrderbsByPage(orderb));
		    d.setTotal(orderbService.getOrderbCount(orderb));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addOrderb", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addOrderb(Orderb orderb,HttpServletRequest request)
	{
		try {
			orderbService.insertOrderb(orderb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editOrderb", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editOrderb(Orderb orderb,HttpServletRequest request)
	{
		try {
			orderbService.updateOrderb(orderb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteOrderb", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteOrderb(Orderb orderb,HttpServletRequest request)
	{
		try {
			orderbService.deleteOrderb(orderb);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

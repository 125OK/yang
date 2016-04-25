package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.OrderSj;
import com.bky.service.OrderSjService;
import com.bky.util.dg;




@Controller
public class OrderSjController {

	private OrderSjService orderSjService;
	public OrderSjService getOrderSjService() {
		return orderSjService;
	}
	@Autowired
		public void setOrderSjService(OrderSjService orderSjService) {
		this.orderSjService = orderSjService;
	}


	
	
	@RequestMapping(value = "/queryOrderSjList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryOrderSjList(OrderSj orderSj,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			d.setRows(orderSjService.queryOrderSjsByPage(orderSj));
		    d.setTotal(orderSjService.getOrderSjCount(orderSj));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addOrderSj", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addOrderSj(OrderSj orderSj,HttpServletRequest request)
	{
		try {
			orderSjService.insertOrderSj(orderSj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editOrderSj", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editOrderSj(OrderSj orderSj,HttpServletRequest request)
	{
		try {
			orderSjService.updateOrderSj(orderSj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteOrderSj", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteOrderSj(OrderSj orderSj,HttpServletRequest request)
	{
		try {
			orderSjService.deleteOrderSj(orderSj);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

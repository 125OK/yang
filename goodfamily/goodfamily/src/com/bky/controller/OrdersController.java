package com.bky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Orders;
import com.bky.service.OrdersService;
import com.bky.util.dg;




@Controller
public class OrdersController {

	private OrdersService ordersService;
	public OrdersService getOrdersService() {
		return ordersService;
	}
	@Autowired
		public void setOrdersService(OrdersService ordersService) {
		this.ordersService = ordersService;
	}


	
	
	@RequestMapping(value = "/queryOrdersList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryOrdersList(Orders orders,HttpServletRequest request)
	{
		dg d = new dg();
		try {
			orders.setRows(orders.getPage()*orders.getRows());
			orders.setPage((orders.getPage()-1)*orders.getRows());
			d.setRows(ordersService.queryOrderssByPage(orders));
		    d.setTotal(ordersService.getOrdersCount(orders));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	@RequestMapping(value = "/addOrders", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addOrders(Orders orders,HttpServletRequest request)
	{
		try {
			ordersService.insertOrders(orders);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/editOrders", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editOrders(Orders orders,HttpServletRequest request)
	{
		try {
			ordersService.updateOrders(orders);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@RequestMapping(value = "/deleteOrders", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteOrders(Orders orders,HttpServletRequest request)
	{
		try {
			ordersService.deleteOrders(orders);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

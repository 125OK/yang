package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.OrdersMapper;
import com.bky.model.Orders;
import com.bky.service.OrdersService;



@Service("orders")
public class OrdersServiceImpl implements OrdersService {

	private OrdersMapper ordersMapper;
	
	
	public OrdersMapper getOrdersMapper() {
		return ordersMapper;
	}
     @Autowired
	public void setOrdersMapper(OrdersMapper ordersMapper) {
		this.ordersMapper = ordersMapper;
	}

	@Override
	public void insertOrders(Orders orders) throws DataAccessException
	{
		ordersMapper.insertOrders(orders);
		
		
	}
	
	@Override
	public void insertOrderss(List<Orders> orderss) throws DataAccessException
	{
		ordersMapper.insertOrderss(orderss);
	}
	
	@Override
	public void deleteOrders(Orders orders) throws DataAccessException
	{
		ordersMapper.deleteOrders(orders);
	}
	
	@Override
	public void updateOrders(Orders orders) throws DataAccessException
	{
		ordersMapper.updateOrders(orders);
	}
	
	@Override
	public List<Orders> queryOrderss(Orders orders) throws DataAccessException
	{
		return ordersMapper.queryOrderss(orders);
	}
	
	@Override
	public List<Orders> queryOrderssByPage(Orders orders) throws DataAccessException
	{
		return ordersMapper.queryOrderssByPage(orders);
	}
	
	@Override
	public Orders queryOrdersById(long ordersId) throws DataAccessException
	{
		return ordersMapper.queryOrdersById(ordersId);
	}

	@Override
	public int getOrdersCount(Orders orders) throws DataAccessException
	{
		return ordersMapper.getOrdersCount(orders);
	}
}

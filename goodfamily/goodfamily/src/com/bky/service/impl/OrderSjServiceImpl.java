package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.OrderSjMapper;
import com.bky.model.OrderSj;
import com.bky.service.OrderSjService;



@Service("orderSj")
public class OrderSjServiceImpl implements OrderSjService {

	private OrderSjMapper orderSjMapper;
	
	
	public OrderSjMapper getOrderSjMapper() {
		return orderSjMapper;
	}
     @Autowired
	public void setOrderSjMapper(OrderSjMapper orderSjMapper) {
		this.orderSjMapper = orderSjMapper;
	}

	@Override
	public void insertOrderSj(OrderSj orderSj) throws DataAccessException
	{
		orderSjMapper.insertOrderSj(orderSj);
		
		
	}
	
	@Override
	public void insertOrderSjs(List<OrderSj> orderSjs) throws DataAccessException
	{
		orderSjMapper.insertOrderSjs(orderSjs);
	}
	
	@Override
	public void deleteOrderSj(OrderSj orderSj) throws DataAccessException
	{
		orderSjMapper.deleteOrderSj(orderSj);
	}
	
	@Override
	public void updateOrderSj(OrderSj orderSj) throws DataAccessException
	{
		orderSjMapper.updateOrderSj(orderSj);
	}
	
	@Override
	public List<OrderSj> queryOrderSjs(OrderSj orderSj) throws DataAccessException
	{
		return orderSjMapper.queryOrderSjs(orderSj);
	}
	
	@Override
	public List<OrderSj> queryOrderSjsByPage(OrderSj orderSj) throws DataAccessException
	{
		return orderSjMapper.queryOrderSjsByPage(orderSj);
	}
	
	@Override
	public OrderSj queryOrderSjById(long orderSjId) throws DataAccessException
	{
		return orderSjMapper.queryOrderSjById(orderSjId);
	}

	@Override
	public int getOrderSjCount(OrderSj orderSj) throws DataAccessException
	{
		return orderSjMapper.getOrderSjCount(orderSj);
	}
}

package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.OrderbMapper;
import com.bky.model.Orderb;
import com.bky.service.OrderbService;



@Service("orderb")
public class OrderbServiceImpl implements OrderbService {

	private OrderbMapper orderbMapper;
	
	
	public OrderbMapper getOrderbMapper() {
		return orderbMapper;
	}
     @Autowired
	public void setOrderbMapper(OrderbMapper orderbMapper) {
		this.orderbMapper = orderbMapper;
	}

	@Override
	public void insertOrderb(Orderb orderb) throws DataAccessException
	{
		orderbMapper.insertOrderb(orderb);
		
		
	}
	
	@Override
	public void insertOrderbs(List<Orderb> orderbs) throws DataAccessException
	{
		orderbMapper.insertOrderbs(orderbs);
	}
	
	@Override
	public void deleteOrderb(Orderb orderb) throws DataAccessException
	{
		orderbMapper.deleteOrderb(orderb);
	}
	
	@Override
	public void updateOrderb(Orderb orderb) throws DataAccessException
	{
		orderbMapper.updateOrderb(orderb);
	}
	
	@Override
	public List<Orderb> queryOrderbs(Orderb orderb) throws DataAccessException
	{
		return orderbMapper.queryOrderbs(orderb);
	}
	
	@Override
	public List<Orderb> queryOrderbsByPage(Orderb orderb) throws DataAccessException
	{
		return orderbMapper.queryOrderbsByPage(orderb);
	}
	
	@Override
	public Orderb queryOrderbById(long orderbId) throws DataAccessException
	{
		return orderbMapper.queryOrderbById(orderbId);
	}

	@Override
	public int getOrderbCount(Orderb orderb) throws DataAccessException
	{
		return orderbMapper.getOrderbCount(orderb);
	}
}

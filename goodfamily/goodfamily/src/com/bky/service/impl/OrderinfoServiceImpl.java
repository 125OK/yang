package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.OrderinfoMapper;
import com.bky.model.Orderinfo;
import com.bky.service.OrderinfoService;



@Service("orderinfo")
public class OrderinfoServiceImpl implements OrderinfoService {

	private OrderinfoMapper orderinfoMapper;
	
	
	public OrderinfoMapper getOrderinfoMapper() {
		return orderinfoMapper;
	}
     @Autowired
	public void setOrderinfoMapper(OrderinfoMapper orderinfoMapper) {
		this.orderinfoMapper = orderinfoMapper;
	}

	@Override
	public void insertOrderinfo(Orderinfo orderinfo) throws DataAccessException
	{
		orderinfoMapper.insertOrderinfo(orderinfo);
		
		
	}
	
	@Override
	public void insertOrderinfos(List<Orderinfo> orderinfos) throws DataAccessException
	{
		orderinfoMapper.insertOrderinfos(orderinfos);
	}
	
	@Override
	public void deleteOrderinfo(Orderinfo orderinfo) throws DataAccessException
	{
		orderinfoMapper.deleteOrderinfo(orderinfo);
	}
	
	@Override
	public void updateOrderinfo(Orderinfo orderinfo) throws DataAccessException
	{
		orderinfoMapper.updateOrderinfo(orderinfo);
	}
	
	@Override
	public List<Orderinfo> queryOrderinfos(Orderinfo orderinfo) throws DataAccessException
	{
		return orderinfoMapper.queryOrderinfos(orderinfo);
	}
	
	@Override
	public List<Orderinfo> queryOrderinfosByPage(Orderinfo orderinfo) throws DataAccessException
	{
		return orderinfoMapper.queryOrderinfosByPage(orderinfo);
	}
	
	@Override
	public Orderinfo queryOrderinfoById(long orderinfoId) throws DataAccessException
	{
		return orderinfoMapper.queryOrderinfoById(orderinfoId);
	}

	@Override
	public int getOrderinfoCount(Orderinfo orderinfo) throws DataAccessException
	{
		return orderinfoMapper.getOrderinfoCount(orderinfo);
	}
}

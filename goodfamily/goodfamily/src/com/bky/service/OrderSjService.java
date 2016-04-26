package com.bky.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.OrderSj;



public interface OrderSjService {

	public void insertOrderSj(OrderSj orderSj) throws DataAccessException;
	
	public void insertOrderSjs(List<OrderSj> orderSjs) throws DataAccessException;
	
	public void deleteOrderSj(OrderSj orderSj) throws DataAccessException;
	
	public void updateOrderSj(OrderSj orderSj) throws DataAccessException;
	
	public List<OrderSj> queryOrderSjs(OrderSj orderSj) throws DataAccessException;
	
	public List<OrderSj> queryOrderSjsByPage(OrderSj orderSj) throws DataAccessException;
	
	public OrderSj queryOrderSjById(long orderSjId) throws DataAccessException;
	
	public int getOrderSjCount(OrderSj orderSj) throws DataAccessException;
}

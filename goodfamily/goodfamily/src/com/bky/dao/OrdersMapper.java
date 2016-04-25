package com.bky.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Orders;



public interface OrdersMapper {

	public int insertOrders(Orders orders) throws DataAccessException;
	
	public void insertOrderss(List<Orders> orderss) throws DataAccessException;
	
	public void deleteOrders(Orders orders) throws DataAccessException;
	
	public void updateOrders(Orders orders) throws DataAccessException;
	
	public List<Orders> queryOrderss(Orders orders) throws DataAccessException;
	
	public List<Orders> queryOrderssByPage(Orders orders) throws DataAccessException;
	
	public Orders queryOrdersById(long ordersId) throws DataAccessException;
	
	public int getOrdersCount(Orders orders) throws DataAccessException;
}

package com.bky.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Orderb;



public interface OrderbMapper {

	public int insertOrderb(Orderb orderb) throws DataAccessException;
	
	public void insertOrderbs(List<Orderb> orderbs) throws DataAccessException;
	
	public void deleteOrderb(Orderb orderb) throws DataAccessException;
	
	public void updateOrderb(Orderb orderb) throws DataAccessException;
	
	public List<Orderb> queryOrderbs(Orderb orderb) throws DataAccessException;
	
	public List<Orderb> queryOrderbsByPage(Orderb orderb) throws DataAccessException;
	
	public Orderb queryOrderbById(long orderbId) throws DataAccessException;
	
	public int getOrderbCount(Orderb orderb) throws DataAccessException;
}

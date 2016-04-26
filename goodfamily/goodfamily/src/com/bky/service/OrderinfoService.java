package com.bky.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Orderinfo;



public interface OrderinfoService {

	public void insertOrderinfo(Orderinfo orderinfo) throws DataAccessException;
	
	public void insertOrderinfos(List<Orderinfo> orderinfos) throws DataAccessException;
	
	public void deleteOrderinfo(Orderinfo orderinfo) throws DataAccessException;
	
	public void updateOrderinfo(Orderinfo orderinfo) throws DataAccessException;
	
	public List<Orderinfo> queryOrderinfos(Orderinfo orderinfo) throws DataAccessException;
	
	public List<Orderinfo> queryOrderinfosByPage(Orderinfo orderinfo) throws DataAccessException;
	
	public Orderinfo queryOrderinfoById(long orderinfoId) throws DataAccessException;
	
	public int getOrderinfoCount(Orderinfo orderinfo) throws DataAccessException;
}

package com.bky.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Pay;



public interface PayMapper {

	public int insertPay(Pay pay) throws DataAccessException;
	
	public void insertPays(List<Pay> pays) throws DataAccessException;
	
	public void deletePay(Pay pay) throws DataAccessException;
	
	public void updatePay(Pay pay) throws DataAccessException;
	
	public List<Pay> queryPays(Pay pay) throws DataAccessException;
	
	public List<Pay> queryPaysByPage(Pay pay) throws DataAccessException;
	
	public Pay queryPayById(long payId) throws DataAccessException;
	
	public int getPayCount(Pay pay) throws DataAccessException;
}

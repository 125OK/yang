package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.PayMapper;
import com.bky.model.Pay;
import com.bky.service.PayService;



@Service("pay")
public class PayServiceImpl implements PayService {

	private PayMapper payMapper;
	
	
	public PayMapper getPayMapper() {
		return payMapper;
	}
     @Autowired
	public void setPayMapper(PayMapper payMapper) {
		this.payMapper = payMapper;
	}

	@Override
	public void insertPay(Pay pay) throws DataAccessException
	{
		payMapper.insertPay(pay);
		
		
	}
	
	@Override
	public void insertPays(List<Pay> pays) throws DataAccessException
	{
		payMapper.insertPays(pays);
	}
	
	@Override
	public void deletePay(Pay pay) throws DataAccessException
	{
		payMapper.deletePay(pay);
	}
	
	@Override
	public void updatePay(Pay pay) throws DataAccessException
	{
		payMapper.updatePay(pay);
	}
	
	@Override
	public List<Pay> queryPays(Pay pay) throws DataAccessException
	{
		return payMapper.queryPays(pay);
	}
	
	@Override
	public List<Pay> queryPaysByPage(Pay pay) throws DataAccessException
	{
		return payMapper.queryPaysByPage(pay);
	}
	
	@Override
	public Pay queryPayById(long payId) throws DataAccessException
	{
		return payMapper.queryPayById(payId);
	}

	@Override
	public int getPayCount(Pay pay) throws DataAccessException
	{
		return payMapper.getPayCount(pay);
	}
}

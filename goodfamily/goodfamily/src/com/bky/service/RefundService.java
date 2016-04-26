package com.bky.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Refund;



public interface RefundService {

	public void insertRefund(Refund refund) throws DataAccessException;
	
	public void insertRefunds(List<Refund> refunds) throws DataAccessException;
	
	public void deleteRefund(Refund refund) throws DataAccessException;
	
	public void updateRefund(Refund refund) throws DataAccessException;
	
	public List<Refund> queryRefunds(Refund refund) throws DataAccessException;
	
	public List<Refund> queryRefundsByPage(Refund refund) throws DataAccessException;
	
	public Refund queryRefundById(long refundId) throws DataAccessException;
	
	public int getRefundCount(Refund refund) throws DataAccessException;
}

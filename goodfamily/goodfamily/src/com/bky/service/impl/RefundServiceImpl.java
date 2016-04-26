package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.RefundMapper;
import com.bky.model.Refund;
import com.bky.service.RefundService;



@Service("refund")
public class RefundServiceImpl implements RefundService {

	private RefundMapper refundMapper;
	
	
	public RefundMapper getRefundMapper() {
		return refundMapper;
	}
     @Autowired
	public void setRefundMapper(RefundMapper refundMapper) {
		this.refundMapper = refundMapper;
	}

	@Override
	public void insertRefund(Refund refund) throws DataAccessException
	{
		refundMapper.insertRefund(refund);
		
		
	}
	
	@Override
	public void insertRefunds(List<Refund> refunds) throws DataAccessException
	{
		refundMapper.insertRefunds(refunds);
	}
	
	@Override
	public void deleteRefund(Refund refund) throws DataAccessException
	{
		refundMapper.deleteRefund(refund);
	}
	
	@Override
	public void updateRefund(Refund refund) throws DataAccessException
	{
		refundMapper.updateRefund(refund);
	}
	
	@Override
	public List<Refund> queryRefunds(Refund refund) throws DataAccessException
	{
		return refundMapper.queryRefunds(refund);
	}
	
	@Override
	public List<Refund> queryRefundsByPage(Refund refund) throws DataAccessException
	{
		return refundMapper.queryRefundsByPage(refund);
	}
	
	@Override
	public Refund queryRefundById(long refundId) throws DataAccessException
	{
		return refundMapper.queryRefundById(refundId);
	}

	@Override
	public int getRefundCount(Refund refund) throws DataAccessException
	{
		return refundMapper.getRefundCount(refund);
	}
}

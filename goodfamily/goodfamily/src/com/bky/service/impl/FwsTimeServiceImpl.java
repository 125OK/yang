package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.FwsTimeMapper;
import com.bky.model.FwsTime;
import com.bky.service.FwsTimeService;



@Service("fwsTime")
public class FwsTimeServiceImpl implements FwsTimeService {

	private FwsTimeMapper fwsTimeMapper;
	
	
	public FwsTimeMapper getFwsTimeMapper() {
		return fwsTimeMapper;
	}
     @Autowired
	public void setFwsTimeMapper(FwsTimeMapper fwsTimeMapper) {
		this.fwsTimeMapper = fwsTimeMapper;
	}

	@Override
	public void insertFwsTime(FwsTime fwsTime) throws DataAccessException
	{
		fwsTimeMapper.insertFwsTime(fwsTime);
		
		
	}
	
	@Override
	public void insertFwsTimes(List<FwsTime> fwsTimes) throws DataAccessException
	{
		fwsTimeMapper.insertFwsTimes(fwsTimes);
	}
	
	@Override
	public void deleteFwsTime(FwsTime fwsTime) throws DataAccessException
	{
		fwsTimeMapper.deleteFwsTime(fwsTime);
	}
	
	@Override
	public void updateFwsTime(FwsTime fwsTime) throws DataAccessException
	{
		fwsTimeMapper.updateFwsTime(fwsTime);
	}
	
	@Override
	public List<FwsTime> queryFwsTimes(FwsTime fwsTime) throws DataAccessException
	{
		return fwsTimeMapper.queryFwsTimes(fwsTime);
	}
	
	@Override
	public List<FwsTime> queryFwsTimesByPage(FwsTime fwsTime) throws DataAccessException
	{
		return fwsTimeMapper.queryFwsTimesByPage(fwsTime);
	}
	
	@Override
	public FwsTime queryFwsTimeById(long fwsTimeId) throws DataAccessException
	{
		return fwsTimeMapper.queryFwsTimeById(fwsTimeId);
	}

	@Override
	public int getFwsTimeCount(FwsTime fwsTime) throws DataAccessException
	{
		return fwsTimeMapper.getFwsTimeCount(fwsTime);
	}
}

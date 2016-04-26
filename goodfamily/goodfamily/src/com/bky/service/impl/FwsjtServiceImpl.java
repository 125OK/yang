package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.FwsjtMapper;
import com.bky.model.Fwsjt;
import com.bky.service.FwsjtService;



@Service("fwsjt")
public class FwsjtServiceImpl implements FwsjtService {

	private FwsjtMapper fwsjtMapper;
	
	
	public FwsjtMapper getFwsjtMapper() {
		return fwsjtMapper;
	}
     @Autowired
	public void setFwsjtMapper(FwsjtMapper fwsjtMapper) {
		this.fwsjtMapper = fwsjtMapper;
	}

	@Override
	public void insertFwsjt(Fwsjt fwsjt) throws DataAccessException
	{
		fwsjtMapper.insertFwsjt(fwsjt);
		
		
	}
	
	@Override
	public void insertFwsjts(List<Fwsjt> fwsjts) throws DataAccessException
	{
		fwsjtMapper.insertFwsjts(fwsjts);
	}
	
	@Override
	public void deleteFwsjt(Fwsjt fwsjt) throws DataAccessException
	{
		fwsjtMapper.deleteFwsjt(fwsjt);
	}
	
	@Override
	public void updateFwsjt(Fwsjt fwsjt) throws DataAccessException
	{
		fwsjtMapper.updateFwsjt(fwsjt);
	}
	
	@Override
	public List<Fwsjt> queryFwsjts(Fwsjt fwsjt) throws DataAccessException
	{
		return fwsjtMapper.queryFwsjts(fwsjt);
	}
	
	@Override
	public List<Fwsjt> queryFwsjtsByPage(Fwsjt fwsjt) throws DataAccessException
	{
		return fwsjtMapper.queryFwsjtsByPage(fwsjt);
	}
	
	@Override
	public Fwsjt queryFwsjtById(long fwsjtId) throws DataAccessException
	{
		return fwsjtMapper.queryFwsjtById(fwsjtId);
	}

	@Override
	public int getFwsjtCount(Fwsjt fwsjt) throws DataAccessException
	{
		return fwsjtMapper.getFwsjtCount(fwsjt);
	}
}

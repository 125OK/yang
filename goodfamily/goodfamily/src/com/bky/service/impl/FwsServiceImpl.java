package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.FwsMapper;
import com.bky.model.Fws;
import com.bky.service.FwsService;



@Service("fws")
public class FwsServiceImpl implements FwsService {

	private FwsMapper fwsMapper;
	
	
	public FwsMapper getFwsMapper() {
		return fwsMapper;
	}
     @Autowired
	public void setFwsMapper(FwsMapper fwsMapper) {
		this.fwsMapper = fwsMapper;
	}

	@Override
	public void insertFws(Fws fws) throws DataAccessException
	{
		fwsMapper.insertFws(fws);
		
		
	}
	
	@Override
	public void insertFwss(List<Fws> fwss) throws DataAccessException
	{
		fwsMapper.insertFwss(fwss);
	}
	
	@Override
	public void deleteFws(Fws fws) throws DataAccessException
	{
		fwsMapper.deleteFws(fws);
	}
	
	@Override
	public void updateFws(Fws fws) throws DataAccessException
	{
		fwsMapper.updateFws(fws);
	}
	
	@Override
	public List<Fws> queryFwss(Fws fws) throws DataAccessException
	{
		return fwsMapper.queryFwss(fws);
	}
	
	@Override
	public List<Fws> queryFwssByPage(Fws fws) throws DataAccessException
	{
		return fwsMapper.queryFwssByPage(fws);
	}
	
	@Override
	public Fws queryFwsById(long fwsId) throws DataAccessException
	{
		return fwsMapper.queryFwsById(fwsId);
	}

	@Override
	public int getFwsCount(Fws fws) throws DataAccessException
	{
		return fwsMapper.getFwsCount(fws);
	}
}

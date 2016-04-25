package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.TimebMapper;
import com.bky.model.Timeb;
import com.bky.service.TimebService;



@Service("timeb")
public class TimebServiceImpl implements TimebService {

	private TimebMapper timebMapper;
	
	
	public TimebMapper getTimebMapper() {
		return timebMapper;
	}
     @Autowired
	public void setTimebMapper(TimebMapper timebMapper) {
		this.timebMapper = timebMapper;
	}

	@Override
	public void insertTimeb(Timeb timeb) throws DataAccessException
	{
		timebMapper.insertTimeb(timeb);
		
		
	}
	
	@Override
	public void insertTimebs(List<Timeb> timebs) throws DataAccessException
	{
		timebMapper.insertTimebs(timebs);
	}
	
	@Override
	public void deleteTimeb(Timeb timeb) throws DataAccessException
	{
		timebMapper.deleteTimeb(timeb);
	}
	
	@Override
	public void updateTimeb(Timeb timeb) throws DataAccessException
	{
		timebMapper.updateTimeb(timeb);
	}
	
	@Override
	public List<Timeb> queryTimebs(Timeb timeb) throws DataAccessException
	{
		return timebMapper.queryTimebs(timeb);
	}
	
	@Override
	public List<Timeb> queryTimebsByPage(Timeb timeb) throws DataAccessException
	{
		return timebMapper.queryTimebsByPage(timeb);
	}
	
	@Override
	public Timeb queryTimebById(long timebId) throws DataAccessException
	{
		return timebMapper.queryTimebById(timebId);
	}

	@Override
	public int getTimebCount(Timeb timeb) throws DataAccessException
	{
		return timebMapper.getTimebCount(timeb);
	}
}

package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.MpcenterMapper;
import com.bky.model.Mpcenter;
import com.bky.service.MpcenterService;



@Service("mpcenter")
public class MpcenterServiceImpl implements MpcenterService {

	private MpcenterMapper mpcenterMapper;
	
	
	public MpcenterMapper getMpcenterMapper() {
		return mpcenterMapper;
	}
     @Autowired
	public void setMpcenterMapper(MpcenterMapper mpcenterMapper) {
		this.mpcenterMapper = mpcenterMapper;
	}

	@Override
	public void insertMpcenter(Mpcenter mpcenter) throws DataAccessException
	{
		mpcenterMapper.insertMpcenter(mpcenter);
		
		
	}
	
	@Override
	public void insertMpcenters(List<Mpcenter> mpcenters) throws DataAccessException
	{
		mpcenterMapper.insertMpcenters(mpcenters);
	}
	
	@Override
	public void deleteMpcenter(Mpcenter mpcenter) throws DataAccessException
	{
		mpcenterMapper.deleteMpcenter(mpcenter);
	}
	
	@Override
	public void updateMpcenter(Mpcenter mpcenter) throws DataAccessException
	{
		mpcenterMapper.updateMpcenter(mpcenter);
	}
	
	@Override
	public List<Mpcenter> queryMpcenters(Mpcenter mpcenter) throws DataAccessException
	{
		return mpcenterMapper.queryMpcenters(mpcenter);
	}
	
	@Override
	public List<Mpcenter> queryMpcentersByPage(Mpcenter mpcenter) throws DataAccessException
	{
		return mpcenterMapper.queryMpcentersByPage(mpcenter);
	}
	
	@Override
	public Mpcenter queryMpcenterById(long mpcenterId) throws DataAccessException
	{
		return mpcenterMapper.queryMpcenterById(mpcenterId);
	}

	@Override
	public int getMpcenterCount(Mpcenter mpcenter) throws DataAccessException
	{
		return mpcenterMapper.getMpcenterCount(mpcenter);
	}
}

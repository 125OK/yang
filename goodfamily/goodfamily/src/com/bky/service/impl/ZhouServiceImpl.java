package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.ZhouMapper;
import com.bky.model.Zhou;
import com.bky.service.ZhouService;



@Service("zhou")
public class ZhouServiceImpl implements ZhouService {

	private ZhouMapper zhouMapper;
	
	
	public ZhouMapper getZhouMapper() {
		return zhouMapper;
	}
     @Autowired
	public void setZhouMapper(ZhouMapper zhouMapper) {
		this.zhouMapper = zhouMapper;
	}

	@Override
	public void insertZhou(Zhou zhou) throws DataAccessException
	{
		zhouMapper.insertZhou(zhou);
		
		
	}
	
	@Override
	public void insertZhous(List<Zhou> zhous) throws DataAccessException
	{
		zhouMapper.insertZhous(zhous);
	}
	
	@Override
	public void deleteZhou(Zhou zhou) throws DataAccessException
	{
		zhouMapper.deleteZhou(zhou);
	}
	
	@Override
	public void updateZhou(Zhou zhou) throws DataAccessException
	{
		zhouMapper.updateZhou(zhou);
	}
	
	@Override
	public List<Zhou> queryZhous(Zhou zhou) throws DataAccessException
	{
		return zhouMapper.queryZhous(zhou);
	}
	
	@Override
	public List<Zhou> queryZhousByPage(Zhou zhou) throws DataAccessException
	{
		return zhouMapper.queryZhousByPage(zhou);
	}
	
	@Override
	public Zhou queryZhouById(long zhouId) throws DataAccessException
	{
		return zhouMapper.queryZhouById(zhouId);
	}

	@Override
	public int getZhouCount(Zhou zhou) throws DataAccessException
	{
		return zhouMapper.getZhouCount(zhou);
	}
}

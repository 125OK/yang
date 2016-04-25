package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.KehuMapper;
import com.bky.model.Kehu;
import com.bky.service.KehuService;



@Service("kehu")
public class KehuServiceImpl implements KehuService {

	private KehuMapper kehuMapper;
	
	
	public KehuMapper getKehuMapper() {
		return kehuMapper;
	}
     @Autowired
	public void setKehuMapper(KehuMapper kehuMapper) {
		this.kehuMapper = kehuMapper;
	}

	@Override
	public void insertKehu(Kehu kehu) throws DataAccessException
	{
		kehuMapper.insertKehu(kehu);
		
		
	}
	
	@Override
	public void insertKehus(List<Kehu> kehus) throws DataAccessException
	{
		kehuMapper.insertKehus(kehus);
	}
	
	@Override
	public void deleteKehu(Kehu kehu) throws DataAccessException
	{
		kehuMapper.deleteKehu(kehu);
	}
	
	@Override
	public void updateKehu(Kehu kehu) throws DataAccessException
	{
		kehuMapper.updateKehu(kehu);
	}
	
	@Override
	public List<Kehu> queryKehus(Kehu kehu) throws DataAccessException
	{
		return kehuMapper.queryKehus(kehu);
	}
	
	@Override
	public List<Kehu> queryKehusByPage(Kehu kehu) throws DataAccessException
	{
		return kehuMapper.queryKehusByPage(kehu);
	}
	
	@Override
	public Kehu queryKehuById(long kehuId) throws DataAccessException
	{
		return kehuMapper.queryKehuById(kehuId);
	}

	@Override
	public int getKehuCount(Kehu kehu) throws DataAccessException
	{
		return kehuMapper.getKehuCount(kehu);
	}
}

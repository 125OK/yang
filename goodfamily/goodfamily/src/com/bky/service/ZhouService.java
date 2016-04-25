package com.bky.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Zhou;



public interface ZhouService {

	public void insertZhou(Zhou zhou) throws DataAccessException;
	
	public void insertZhous(List<Zhou> zhous) throws DataAccessException;
	
	public void deleteZhou(Zhou zhou) throws DataAccessException;
	
	public void updateZhou(Zhou zhou) throws DataAccessException;
	
	public List<Zhou> queryZhous(Zhou zhou) throws DataAccessException;
	
	public List<Zhou> queryZhousByPage(Zhou zhou) throws DataAccessException;
	
	public Zhou queryZhouById(long zhouId) throws DataAccessException;
	
	public int getZhouCount(Zhou zhou) throws DataAccessException;
}

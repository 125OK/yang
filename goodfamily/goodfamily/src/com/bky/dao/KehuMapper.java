package com.bky.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Kehu;



public interface KehuMapper {

	public int insertKehu(Kehu kehu) throws DataAccessException;
	
	public void insertKehus(List<Kehu> kehus) throws DataAccessException;
	
	public void deleteKehu(Kehu kehu) throws DataAccessException;
	
	public void updateKehu(Kehu kehu) throws DataAccessException;
	
	public List<Kehu> queryKehus(Kehu kehu) throws DataAccessException;
	
	public List<Kehu> queryKehusByPage(Kehu kehu) throws DataAccessException;
	
	public Kehu queryKehuById(long kehuId) throws DataAccessException;
	
	public int getKehuCount(Kehu kehu) throws DataAccessException;
}

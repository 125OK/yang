package com.bky.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Timeb;



public interface TimebMapper {

	public int insertTimeb(Timeb timeb) throws DataAccessException;
	
	public void insertTimebs(List<Timeb> timebs) throws DataAccessException;
	
	public void deleteTimeb(Timeb timeb) throws DataAccessException;
	
	public void updateTimeb(Timeb timeb) throws DataAccessException;
	
	public List<Timeb> queryTimebs(Timeb timeb) throws DataAccessException;
	
	public List<Timeb> queryTimebsByPage(Timeb timeb) throws DataAccessException;
	
	public Timeb queryTimebById(long timebId) throws DataAccessException;
	
	public int getTimebCount(Timeb timeb) throws DataAccessException;
}

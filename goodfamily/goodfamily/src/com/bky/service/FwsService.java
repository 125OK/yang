package com.bky.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Fws;



public interface FwsService {

	public void insertFws(Fws fws) throws DataAccessException;
	
	public void insertFwss(List<Fws> fwss) throws DataAccessException;
	
	public void deleteFws(Fws fws) throws DataAccessException;
	
	public void updateFws(Fws fws) throws DataAccessException;
	
	public List<Fws> queryFwss(Fws fws) throws DataAccessException;
	
	public List<Fws> queryFwssByPage(Fws fws) throws DataAccessException;
	
	public Fws queryFwsById(long fwsId) throws DataAccessException;
	
	public int getFwsCount(Fws fws) throws DataAccessException;
}

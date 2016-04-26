package com.bky.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Fwsjt;



public interface FwsjtService {

	public void insertFwsjt(Fwsjt fwsjt) throws DataAccessException;
	
	public void insertFwsjts(List<Fwsjt> fwsjts) throws DataAccessException;
	
	public void deleteFwsjt(Fwsjt fwsjt) throws DataAccessException;
	
	public void updateFwsjt(Fwsjt fwsjt) throws DataAccessException;
	
	public List<Fwsjt> queryFwsjts(Fwsjt fwsjt) throws DataAccessException;
	
	public List<Fwsjt> queryFwsjtsByPage(Fwsjt fwsjt) throws DataAccessException;
	
	public Fwsjt queryFwsjtById(long fwsjtId) throws DataAccessException;
	
	public int getFwsjtCount(Fwsjt fwsjt) throws DataAccessException;
}

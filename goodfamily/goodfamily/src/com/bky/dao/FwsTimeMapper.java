package com.bky.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.FwsTime;



public interface FwsTimeMapper {

	public int insertFwsTime(FwsTime fwsTime) throws DataAccessException;
	
	public void insertFwsTimes(List<FwsTime> fwsTimes) throws DataAccessException;
	
	public void deleteFwsTime(FwsTime fwsTime) throws DataAccessException;
	
	public void updateFwsTime(FwsTime fwsTime) throws DataAccessException;
	
	public List<FwsTime> queryFwsTimes(FwsTime fwsTime) throws DataAccessException;
	
	public List<FwsTime> queryFwsTimesByPage(FwsTime fwsTime) throws DataAccessException;
	
	public FwsTime queryFwsTimeById(long fwsTimeId) throws DataAccessException;
	
	public int getFwsTimeCount(FwsTime fwsTime) throws DataAccessException;
}

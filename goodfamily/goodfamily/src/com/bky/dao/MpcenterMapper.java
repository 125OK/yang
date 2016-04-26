package com.bky.dao;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Mpcenter;



public interface MpcenterMapper {

	public int insertMpcenter(Mpcenter mpcenter) throws DataAccessException;
	
	public void insertMpcenters(List<Mpcenter> mpcenters) throws DataAccessException;
	
	public void deleteMpcenter(Mpcenter mpcenter) throws DataAccessException;
	
	public void updateMpcenter(Mpcenter mpcenter) throws DataAccessException;
	
	public List<Mpcenter> queryMpcenters(Mpcenter mpcenter) throws DataAccessException;
	
	public List<Mpcenter> queryMpcentersByPage(Mpcenter mpcenter) throws DataAccessException;
	
	public Mpcenter queryMpcenterById(long mpcenterId) throws DataAccessException;
	
	public int getMpcenterCount(Mpcenter mpcenter) throws DataAccessException;
}

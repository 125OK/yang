package com.bky.service;

import java.util.List;
import org.springframework.dao.DataAccessException;

import com.bky.model.Login;



public interface LoginService {

	public void insertLogin(Login login) throws DataAccessException;
	
	public void insertLogins(List<Login> logins) throws DataAccessException;
	
	public void deleteLogin(Login login) throws DataAccessException;
	
	public void updateLogin(Login login) throws DataAccessException;
	
	public List<Login> queryLogins(Login login) throws DataAccessException;
	
	public List<Login> queryLoginsByPage(Login login) throws DataAccessException;
	
	public Login queryLoginById(long loginId) throws DataAccessException;
	
	public int getLoginCount(Login login) throws DataAccessException;
}

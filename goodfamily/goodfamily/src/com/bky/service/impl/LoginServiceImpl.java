package com.bky.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.bky.dao.LoginMapper;
import com.bky.model.Login;
import com.bky.service.LoginService;



@Service("login")
public class LoginServiceImpl implements LoginService {

	private LoginMapper loginMapper;
	
	
	public LoginMapper getLoginMapper() {
		return loginMapper;
	}
     @Autowired
	public void setLoginMapper(LoginMapper loginMapper) {
		this.loginMapper = loginMapper;
	}

	@Override
	public void insertLogin(Login login) throws DataAccessException
	{
		loginMapper.insertLogin(login);
		
		
	}
	
	@Override
	public void insertLogins(List<Login> logins) throws DataAccessException
	{
		loginMapper.insertLogins(logins);
	}
	
	@Override
	public void deleteLogin(Login login) throws DataAccessException
	{
		loginMapper.deleteLogin(login);
	}
	
	@Override
	public void updateLogin(Login login) throws DataAccessException
	{
		loginMapper.updateLogin(login);
	}
	
	@Override
	public List<Login> queryLogins(Login login) throws DataAccessException
	{
		return loginMapper.queryLogins(login);
	}
	
	@Override
	public List<Login> queryLoginsByPage(Login login) throws DataAccessException
	{
		return loginMapper.queryLoginsByPage(login);
	}
	
	@Override
	public Login queryLoginById(long loginId) throws DataAccessException
	{
		return loginMapper.queryLoginById(loginId);
	}

	@Override
	public int getLoginCount(Login login) throws DataAccessException
	{
		return loginMapper.getLoginCount(login);
	}
}

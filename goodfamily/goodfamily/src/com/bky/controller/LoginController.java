package com.bky.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.bky.model.Login;
import com.bky.service.LoginService;
import com.bky.util.dg;




@Controller
public class LoginController {

	private LoginService loginService;
	public LoginService getLoginService() {
		return loginService;
	}
	@Autowired
		public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}


	
	/*
	 * 用户登陆
	 */
	@RequestMapping(value = "/queryLoginList", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryLoginList(Login login,HttpServletRequest request)
	{
		int d=0;
		try {
			List<Login> list=loginService.queryLogins(login);
			d=list.size();
			//登陆成功将用户信息保存到session中
			if(d==1){
				request.getSession().setAttribute("username", list.get(0).getName());
				request.getSession().setAttribute("userpwd", list.get(0).getPwd());
				request.getSession().setAttribute("userqx", list.get(0).getQx());
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
/*
 * 用户信息列表
 */
	@RequestMapping(value = "/queryLogin", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String queryLogin(Login login,HttpServletRequest request)
	{
		Object info=request.getSession().getAttribute("userqx");
		dg d = new dg();
		login.setQx(info.toString());
		login.setRows(login.getPage()*login.getRows());
		login.setPage((login.getPage()-1)*login.getRows());
		
		try {
			d.setRows(loginService.queryLoginsByPage(login));
		    d.setTotal(loginService.getLoginCount(login));;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return JSON.toJSONString(d);
	}
	/*
	 * 用户增加
	 */
	@RequestMapping(value = "/addLogin", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void addLogin(Login login,HttpServletRequest request)
	{
		try {
			loginService.insertLogin(login);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/*
	 * 用户编辑
	 */
	@RequestMapping(value = "/editLogin", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void editLogin(Login login,HttpServletRequest request)
	{
		try {
			loginService.updateLogin(login);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * 用户删除
	 */
	@RequestMapping(value = "/deleteLogin", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public void deleteLogin(Login login,HttpServletRequest request)
	{
		try {
			loginService.deleteLogin(login);
             } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}

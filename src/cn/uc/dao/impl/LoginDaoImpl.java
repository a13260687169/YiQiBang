package cn.uc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cn.uc.bean.Admin;
import cn.uc.bean.User;
import cn.uc.dao.LoginDao;
import cn.uc.utils.Constants;

import cn.uc.utils.Result;

public class LoginDaoImpl extends BaseDaoImpl<User> implements LoginDao {

	@Override
	public Result userLogin(User user) {
		Result result=this.quertList(Constants.USERMAPPER_USERLOGIN, user);
		return result;
	}

	
	


	@Override
	public Result adminLogin(User user) {
		Result result =this.quertList(Constants.ADMINMAPPER_ADMINLOGIN, user);
		return null;
	}
	
	public static void main(String[] args) {
		User user=new User();
		user.setU_username("root");
		user.setU_password("root");
		LoginDao logDao=new LoginDaoImpl();
		
		System.out.println(logDao.adminLogin(user));
	}
	

}

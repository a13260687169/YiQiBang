package cn.uc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import cn.uc.bean.Admin;
import cn.uc.dao.AdminDao;
import cn.uc.utils.Result;


public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao{

	
	
	
	
	@Override
	public Result getAllObj() {

	
		return null;
	}

	@Override
	public Result insertObj(Admin obj) {
		
		return null;
	}

	@Override
	public Result deleteObj(int id) {
		
		Result result=new Result();
		
		return result;
	}

	@Override
	public Result updateObj(Admin obj) {
	
		Result result=new Result();
		return null;
	}

	@Override
	public Result queryByIdAndLevel(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

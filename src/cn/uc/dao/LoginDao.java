package cn.uc.dao;

import cn.uc.bean.Admin;
import cn.uc.bean.User;
import cn.uc.utils.Result;

public interface LoginDao {
	
	
	Result userLogin(User user);
	
	Result adminLogin(User user);

}

package cn.uc.dao;

import java.util.List;

import cn.uc.bean.Admin;
import cn.uc.bean.User;
import cn.uc.utils.Result;

public interface UserDao extends BaseDao<User>{
	
			Result queryBynickNameorUsername(User user);
	
		
	

}

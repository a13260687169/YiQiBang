package cn.uc.dao;

import cn.uc.bean.Admin;
import cn.uc.bean.User;
import cn.uc.utils.Result;

public interface AdminDao  extends BaseDao<Admin>{

	Result queryByIdAndLevel(Admin admin);
	
}

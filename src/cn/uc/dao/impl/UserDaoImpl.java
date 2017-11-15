package cn.uc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.uc.bean.Admin;
import cn.uc.bean.User;
import cn.uc.dao.UserDao;
import cn.uc.utils.Constants;
import cn.uc.utils.MyBatisUtils;
import cn.uc.utils.Result;


public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

	@Override
	public Result getAllObj() {
		Result result=this.quertList(Constants.userMapper_selectAll,"");
		return result;
	}

	@Override
	public Result insertObj(User obj) {
		Result result=this.insertObj(Constants.USERMAPPER_INSERTUSER,obj);		
		return result;
	}

	@Override
	public Result deleteObj(int id) {
		User user=new User();
		user.setId(id);
		Result result=this.deleteObj(Constants.userMapper_deleteUser,user);		
		return result;
	}

	@Override
	public Result updateObj(User obj) {
		Result result=this.updateObj(Constants.USERMAPPER_UPDATEUSER,obj);
		return result;
	}
	@Override
	public Result queryBynickNameorUsername(User user) {			
		Result result=this.quertList(Constants.USERMAPPER_SELECTUSERYNICKNAMEANDUSERNAME,user);		
		return result;
	}
	
	
public static void main(String[] args) {
	UserDao userDao=new UserDaoImpl();
	SimpleDateFormat str=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
	String date=str.format(new Date()).toString();
	User user =new User();
	user.setU_username("明明就3");
	user.setU_nickname("root");
	user.setU_password("root");
	user.setU_sex(true);
	user.setU_phonenum("1111");
	user.setU_email("222");
	user.setU_headimg("22");
	user.setU_state(false);
	user.setU_creatime("2017-6-9");
	user.setU_birthday("2016-11-7");
	user.setU_remark("滴滴滴");
	user.setU_update("2017-7-9");
	user.setU_provinceid(1);
	user.setU_cityid(1);
	user.setU_areaid(1);
	String  name="明明就";	
}

}

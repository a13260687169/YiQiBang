package cn.uc.dao;

import java.util.List;

import cn.uc.utils.Result;

public interface BaseDao<T>{
	
	//显示所有
	Result getAllObj();
	
	
	//添加方法
	
	Result insertObj(T obj);
	
	//根据ID删除方法
	Result deleteObj(int id);
	
	//修改方法
	
	Result updateObj(T obj);
	
//	//条件查询方法
//	
//	Result queryListByObj(T obj);
	

}

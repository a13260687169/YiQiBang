package cn.uc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.uc.utils.MyBatisUtils;
import cn.uc.utils.Result;

public class BaseDaoImpl<T> {
	
	
	
	public Result quertList(String statement,Object obj){
		Result result=new Result();		 
		SqlSession  session=MyBatisUtils.openSession();
		List<T> list=null;
		if("".equals(obj)){
			 list=session.selectList(statement);
		}else{		
			 list=session.selectList(statement,obj);			
		}
		session.close();
		if(list.isEmpty()){
			result.setRetCode(1);
			result.setRetmsg(false);
			result.setRetData(list);
		}else{
			result.setRetCode(0);
			result.setRetmsg(true);
			result.setRetData(list);
		}
		return result;
	}
	public Result deleteObj(String statement,Object obj){
		Result result=new Result();		 
		SqlSession  session=MyBatisUtils.openSession();
		int row=0;
		row=session.delete(statement, obj);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(0);
			result.setRetmsg(true);
			result.setRetData(true);
		}else{
			result.setRetCode(0);
			result.setRetmsg(false);
			result.setRetData(false);
		}
		return result;
	}
	public Result insertObj(String statement,Object obj){
		Result result=new Result();	
		System.out.println("222");
		SqlSession  session=MyBatisUtils.openSession();
		int row=0;
		row=session.insert(statement, obj);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(0);
			result.setRetmsg(true);
			result.setRetData(row);
		}else{
			result.setRetCode(1);
			result.setRetmsg(false);
			result.setRetData(row);
		}
		System.out.println(row);
		return result;
	}
	
	public Result updateObj(String statement,Object obj){
		Result result=new Result();		 
		SqlSession  session=MyBatisUtils.openSession();
		int row=0;
		row=session.update(statement,obj);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(0);
			result.setRetmsg(true);
			result.setRetData(true);
		}else{
			result.setRetCode(0);
			result.setRetmsg(false);
			result.setRetData(false);
		}
		return result;
		
	}

}

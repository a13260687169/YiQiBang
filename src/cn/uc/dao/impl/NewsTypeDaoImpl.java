package cn.uc.dao.impl;

import cn.uc.bean.NewsType;
import cn.uc.dao.NewsTypeDao;
import cn.uc.utils.Constants;
import cn.uc.utils.Result;

public class NewsTypeDaoImpl extends BaseDaoImpl<NewsType> implements NewsTypeDao {

	@Override
	public Result deleteByPrimaryKey(Integer id) {
		
		Result result=this.deleteObj(Constants.NEWSTYPEMAPPER_DELETEBYID, id);		
		return result;
	}

	@Override
	public Result insert(NewsType record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result insertNewsType(NewsType record) {
		
		Result result=this.insertObj(Constants.NEWSTYPEMAPPER_INSERTNEWTYPE, record);
		return result;
	}

	@Override
	public Result selectByPrimaryKey(Integer id) {
		
		Result result=this.quertList(Constants.NEWSTYPEMAPPER_SELECTBYID, id);
		return result;
	}

	@Override
	public Result updateByPrimaryKeySelective(NewsType record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result updateByPrimaryKey(NewsType record) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result selectAll() {
		Result result=this.quertList(Constants.NEWSTYPEMAPPER_SELECTALLTYPE, "");
		return result;
	}
		
	
	public static void main(String[] args) {
		NewsTypeDao tDao=new NewsTypeDaoImpl();
		NewsType newss=new NewsType();
		newss.setT_name("ÆäËû");
		System.out.println(tDao.insertNewsType(newss));
	}
	
	
}



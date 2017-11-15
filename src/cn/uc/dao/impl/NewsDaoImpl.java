package cn.uc.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import cn.uc.bean.NewsPost;
import cn.uc.bean.Pagination;

import cn.uc.dao.NewsDao;
import cn.uc.utils.Constants;
import cn.uc.utils.Result;


public class NewsDaoImpl extends BaseDaoImpl<NewsPost> implements NewsDao{

	
	
	@Override
	public Result insertNews(NewsPost news) {
		Result result=this.updateObj(Constants.NEWSMAPPER_INSERTNEWS, news);
		return result;
	}

	

	@Override
	public Result selectAllNewsCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result selectAllNews() {
		Result result=this.quertList(Constants.NEWSMAPPER_SELECTALLNEWS, "");
		return result;
	}



	@Override
	public Result selectNewsByLike(String likeStr) {
		Result result=this.quertList(Constants.NEWSMAPPER_SELECTBYLIKE, likeStr);
		return result;
	}

	@Override
	public Result addNewsPic(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result selectLimitAllNews(Pagination page) {
		Result result=new Result();
		String sql="select * from t_news limit ?,?";
			
		
		return result;
	}

	@Override
	public Result selectLimitNewsByCatId(int catId, Pagination page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result deleteNewsByPrimaryId(int id) {
		Result result=this.updateObj(Constants.NEWSMAPPER_DELETEBYPRIMARYKEY, id);
		return result;
	}

	@Override
	public Result selectNewsByTypeIdAndById(NewsPost id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Result updataNews(NewsPost news) {
		Result result=this.updateObj(Constants.NEWSMAPPER_UPDATANEWS, news);
		return result;
	}
	

	public static void main(String[] args) {
		NewsPost news=new NewsPost();
		news.setN_author("小明");
		news.setN_title("小明");
		news.setN_createtime(new Date());
		news.setT_t_id(1);
		news.setN_ifhot(false);
		news.setN_source("小明");
		news.setN_content("小明");
		NewsDao newDao=new NewsDaoImpl();
		
		System.out.println(newDao.selectNewsByLike("%小明%"));
	}
	
}

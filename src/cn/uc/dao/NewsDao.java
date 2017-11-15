package cn.uc.dao;

import javax.servlet.http.HttpServletRequest;

import cn.uc.bean.NewsPost;
import cn.uc.bean.Pagination;
import cn.uc.utils.Result;

public interface NewsDao  {

	//Dao核心，对着javabean的所有需要的操作都放在这里。给servlet控制器调用
	
	//将所有的Dao方法的返回值统一，然后响应给客户端的的对象都是同一个对象
	
	
	// 增加新闻
	Result insertNews(NewsPost news);
		
	//删除新闻
	Result deleteNewsByPrimaryId(int newsid);
	
	//查询新闻
	Result selectAllNewsCount();
	Result selectAllNews();
	
	Result selectNewsByTypeIdAndById(NewsPost id);
	

	//分页查询
	Result selectLimitAllNews(Pagination page);
	
	Result selectLimitNewsByCatId(int catId,Pagination page);
	//根据用户输入信息模糊查询新闻列表
	Result selectNewsByLike(String likeStr);
	
	//上传新闻图片
	Result addNewsPic(HttpServletRequest request);
	
	Result updataNews(NewsPost news);
}

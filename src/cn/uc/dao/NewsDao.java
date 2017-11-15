package cn.uc.dao;

import javax.servlet.http.HttpServletRequest;

import cn.uc.bean.NewsPost;
import cn.uc.bean.Pagination;
import cn.uc.utils.Result;

public interface NewsDao  {

	//Dao���ģ�����javabean��������Ҫ�Ĳ��������������servlet����������
	
	//�����е�Dao�����ķ���ֵͳһ��Ȼ����Ӧ���ͻ��˵ĵĶ�����ͬһ������
	
	
	// ��������
	Result insertNews(NewsPost news);
		
	//ɾ������
	Result deleteNewsByPrimaryId(int newsid);
	
	//��ѯ����
	Result selectAllNewsCount();
	Result selectAllNews();
	
	Result selectNewsByTypeIdAndById(NewsPost id);
	

	//��ҳ��ѯ
	Result selectLimitAllNews(Pagination page);
	
	Result selectLimitNewsByCatId(int catId,Pagination page);
	//�����û�������Ϣģ����ѯ�����б�
	Result selectNewsByLike(String likeStr);
	
	//�ϴ�����ͼƬ
	Result addNewsPic(HttpServletRequest request);
	
	Result updataNews(NewsPost news);
}

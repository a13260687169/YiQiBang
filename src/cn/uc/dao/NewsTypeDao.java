package cn.uc.dao;

import cn.uc.bean.NewsType;
import cn.uc.utils.Result;

public interface NewsTypeDao {
	
	
	  /**
     * 
     *����idɾ������
     */
    Result deleteByPrimaryKey(Integer id);

    /**
     *�������
     */
    Result insert(NewsType record);

    /**
     * �������
     */
    Result insertNewsType(NewsType record);

    /**
     * ����id������������
     * @param id
     * @return
     */
    Result selectByPrimaryKey(Integer id);

    /**
     * ��������
     * @param record
     * @return
     */
    Result updateByPrimaryKeySelective(NewsType record);

    /**
     * ����id��������
     * @param record
     * @return
     */
    Result updateByPrimaryKey(NewsType record);
    
    Result selectAll();

}

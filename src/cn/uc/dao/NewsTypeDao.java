package cn.uc.dao;

import cn.uc.bean.NewsType;
import cn.uc.utils.Result;

public interface NewsTypeDao {
	
	
	  /**
     * 
     *根据id删除类型
     */
    Result deleteByPrimaryKey(Integer id);

    /**
     *添加类型
     */
    Result insert(NewsType record);

    /**
     * 添加类型
     */
    Result insertNewsType(NewsType record);

    /**
     * 根据id查找类型详情
     * @param id
     * @return
     */
    Result selectByPrimaryKey(Integer id);

    /**
     * 更新类型
     * @param record
     * @return
     */
    Result updateByPrimaryKeySelective(NewsType record);

    /**
     * 根据id更新类型
     * @param record
     * @return
     */
    Result updateByPrimaryKey(NewsType record);
    
    Result selectAll();

}

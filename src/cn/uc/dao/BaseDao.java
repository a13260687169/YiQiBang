package cn.uc.dao;

import java.util.List;

import cn.uc.utils.Result;

public interface BaseDao<T>{
	
	//��ʾ����
	Result getAllObj();
	
	
	//��ӷ���
	
	Result insertObj(T obj);
	
	//����IDɾ������
	Result deleteObj(int id);
	
	//�޸ķ���
	
	Result updateObj(T obj);
	
//	//������ѯ����
//	
//	Result queryListByObj(T obj);
	

}

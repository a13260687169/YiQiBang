package cn.uc.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	//����ģʽ
	static SqlSessionFactory factory=null;
	static String config="config.xml";	//���������ļ�������
	
	private  static SqlSessionFactory factory(){
		if(factory==null){		
			//���������ļ�
			InputStream is=MyBatisUtils.class.getClassLoader().getResourceAsStream(config);
			//����sqlSession����   --ͨ��SqlSessionFactoryBuilder��������sqlSession��������
			 factory= new SqlSessionFactoryBuilder().build(is);					
			}
		return factory;
	}
	
	//ʹ��factory�����һ��SqlSession����(����ִ�����ݿ����)��
	public static SqlSession openSession(){				
		return factory() .openSession();
	}
		
}

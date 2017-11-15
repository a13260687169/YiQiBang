package cn.uc.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	//懒汉模式
	static SqlSessionFactory factory=null;
	static String config="config.xml";	//声明配置文件的名称
	
	private  static SqlSessionFactory factory(){
		if(factory==null){		
			//加载配置文件
			InputStream is=MyBatisUtils.class.getClassLoader().getResourceAsStream(config);
			//创建sqlSession工厂   --通过SqlSessionFactoryBuilder工厂创建sqlSession工厂对象
			 factory= new SqlSessionFactoryBuilder().build(is);					
			}
		return factory;
	}
	
	//使用factory对象打开一个SqlSession对象(用来执行数据库操作)。
	public static SqlSession openSession(){				
		return factory() .openSession();
	}
		
}

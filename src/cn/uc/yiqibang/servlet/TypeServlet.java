package cn.uc.yiqibang.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Results;

import cn.uc.bean.NewsType;
import cn.uc.dao.NewsTypeDao;
import cn.uc.dao.impl.NewsTypeDaoImpl;
import cn.uc.utils.Result;
import cn.uc.utils.WriteResultToClient;



/**
 * Servlet implementation class TypeServlet
 */
@WebServlet("/TypeServlet")
public class TypeServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
		NewsTypeDao typeDao=new NewsTypeDaoImpl();
	
	
	public void adminGetTypeById(HttpServletRequest request,HttpServletResponse response){
		int typeid=Integer.parseInt(request.getParameter("id"));
		Result result = typeDao.selectByPrimaryKey(typeid);
		WriteResultToClient.writeMethod(result, response);
	}
	
	public void adminGetAllTypes(HttpServletRequest request,HttpServletResponse response){
		Result result = typeDao.selectAll();		
		WriteResultToClient.writeMethod(result, response);
	}
	
	public void adminDeleteNewsTypeById(HttpServletRequest request,HttpServletResponse response){
		int id=Integer.parseInt(request.getParameter("id"));
		
		Result result=typeDao.deleteByPrimaryKey(id);
		System.out.println(result);
		WriteResultToClient.writeMethod(result, response);
	}
	
	
	public void adminInsertNewsType(HttpServletRequest request,HttpServletResponse response){
		String typeName=request.getParameter("typeName");
		NewsType record=new NewsType();
		record.setT_name(typeName);
		Result result=typeDao.insertNewsType(record);
		WriteResultToClient.writeMethod(result, response);
	}
}

package cn.uc.yiqibang.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.uc.dao.CommentDao;
import cn.uc.dao.impl.CommentDaoImp;
import cn.uc.utils.Result;
import net.sf.json.JSONObject;

/**
 * Servlet implementation class CommentServlet
 */
@WebServlet("/CommentServlet")
public class CommentServlet extends BaseServlet {
	
	CommentDao commentDao=new CommentDaoImp();
	
		
	 public void adminGetAllComment(HttpServletRequest request,HttpServletResponse response){
	    	System.out.println("请求获取所有的评论");
	    	Result result = commentDao.getAllObj();
	    	PrintWriter out=null;
	    	try {
				out = response.getWriter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	String jsonResult = JSONObject.fromObject(result).toString();
	    	out.println(jsonResult);
	    }
	
	public void insertComment(HttpServletRequest request,HttpServletResponse response){
		//要处理用户的插入请求，需要用到传入过来request的参数以及响应给客户端的respone
		//从请求对象中获取评论参数
		String content=request.getParameter("content");
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		String reldate=sdf.format(date);
		PrintWriter out=null;
	try {
		 out=response.getWriter();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	out.println("插入成功");
	}
	
	public void deleteComment(HttpServletRequest request,HttpServletResponse response){
		//要处理用户的插入请求，需要用到传入过来request的参数以及响应给客户端的respone
		//从请求对象中获取评论参数
		String content=request.getParameter("content");
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		String reldate=sdf.format(date);
		PrintWriter out=null;
		try {
			out=response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("删除成功");
	}
}

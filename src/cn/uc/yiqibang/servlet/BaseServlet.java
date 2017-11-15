package cn.uc.yiqibang.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseServlet
 */
@WebServlet("/BaseServlet")
public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//获取请求的action参数，判断是哪一种操作(方法)
			String action=request.getParameter("action");
			if(action==null||"".equals(action)){//说明用户请求的时候，用户没有添加action参数
				response.getWriter().println("请求参数非法,必须携带action表明");
						
			}else{
				System.out.println("用户要进行的操作"+action);
				//在BaseServlet的子类中，已经声明了相关的操作方法，在这里需要根据action进行调用
				
				//使用反射机制，获取action方法
				try {
				Method method=this.getClass().getMethod(action, HttpServletRequest.class,HttpServletResponse.class);
				if(method!=null){
					//方法调用
					method.invoke(this,request,response);
				}else{
					response.getWriter().println("请求参数非法,必须携带action表明");

				}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

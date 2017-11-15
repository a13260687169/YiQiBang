package cn.uc.yiqibang.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.uc.bean.User;
import cn.uc.dao.LoginDao;
import cn.uc.dao.impl.LoginDaoImpl;
import cn.uc.utils.Result;

/**
 * Servlet implementation class LoginServlet1
 */
@WebServlet("/BackLoginServlet")
public class BackLoginServlet extends BaseServlet {
	
		LoginDao loginDao=new LoginDaoImpl();
		Result result=new Result();
		User user=new User();
		
		public void managerLogin(HttpServletRequest request,HttpServletResponse response){
		HttpSession session=request.getSession();
		String path=request.getContextPath();
		String account=request.getParameter("username");
		String pwd=request.getParameter("password");
		String yanzhengma=request.getParameter("code");		
		String relyanzhengma=(String) session.getAttribute("ccode");	
		try{
		if(relyanzhengma.equals(yanzhengma)){		
				user.setU_username(account);
				user.setU_password(pwd);
			 result=loginDao.adminLogin(user);	 	
		 if(result.isRetmsg()){		 		
		 			session.setAttribute("username", account);
		 			session.setAttribute("password", pwd);
		 			response.sendRedirect(path+"/backFrame.html");		 		
		 	}else{		
		 			session.setAttribute("tishi", "’À∫≈ªÚ√‹¬Î¥ÌŒÛ");
		 			response.sendRedirect(path+"/managerLogin.jsp");		 			
		 			}		
			}else{		
					session.setAttribute("tishi", "—È÷§¬Î ‰»Î¥ÌŒÛ");
					response.sendRedirect(path+"/managerLogin.jsp");				
			}
		}catch(Exception e){
			
		}
	}
	


}

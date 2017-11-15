package cn.uc.yiqibang.servlet;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class FileUpLoadServlet
 */
@WebServlet("/FileUpLoadServlet")
public class FileUpLoadServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
	 public void addUserPhoto(HttpServletRequest request,HttpServletResponse response){
		   //当用户请求FileUploadServlet，并且请求的action=addUserPhoto时调用
		   
		   //对于文件的处理，我们不能使用request.getParameter()来接收文件，需要使用磁盘工厂和文件上传类
		   
		   //首先创建磁盘工厂
		   DiskFileItemFactory factory=new DiskFileItemFactory();
		   factory.setRepository(new File("D://"));//设置磁盘工厂的库--本地的一个文件夹
		   factory.setSizeThreshold(50*1024*1024);//50M--缓存磁盘的大小--以byte为单位

		   //创建文件上传的servlet工具类对象
		   ServletFileUpload upload=new ServletFileUpload(factory);
		   upload.setFileSizeMax(-1);//上传的单个文件的大小    -1表示无限制
		   upload.setHeaderEncoding("UTF-8");
		   upload.setSizeMax(50*1024*1024);//单次上传所有文件的总大小
		   boolean result=false;
		   String relName="";
		   try {
			   //这里的fileItem类型指的是请求参数==文件+属性
			List<FileItem> files = upload.parseRequest(request);//从请求里面获取所有的参数（属性+文件）
			Iterator<FileItem> it = files.iterator();
			while(it.hasNext()){
				FileItem file=it.next();
				if(file.isFormField()){//通过file.isFormFild()判断该参数是不是数值属性，如果是文件参数，返回false
					System.out.println("数值参数："+file.getFieldName());//通过file.getFieldName()获取属性名
				    System.out.println(file.getString("UTF-8"));//file.getString("UTF-8")以固定编码格式获取属性值
				}else{
//					String fileName=new File(file.getName()).getName();
					String fileName=file.getName();
//					if(fileName!=null){
						long time=System.currentTimeMillis();
					String uploadPath=request.getServletContext().getRealPath("img");
					String nextFix=fileName.substring(fileName.lastIndexOf("."));
					if(nextFix.equals(".png")){
						
						relName=time+nextFix;
						String fileRelPath=uploadPath+File.separator+relName;
						File file1=new File(fileRelPath);
						file.write(file1);//将file的文件数据写入对应的文件目录对应的文件中
						
						result=true;
					}else{
						
					}
//					}
					}
					} 
				}catch (Exception e) {
			// TODO Auto-generated catch block
					e.printStackTrace();
		} 
	 
		
			   try {
				response.getWriter().println("{\"retMsg\":\""+result+"\",\"imgName\":\""+relName+"\"}");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
	 }
	 }

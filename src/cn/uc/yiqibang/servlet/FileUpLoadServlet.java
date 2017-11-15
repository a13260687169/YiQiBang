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
		   //���û�����FileUploadServlet�����������action=addUserPhotoʱ����
		   
		   //�����ļ��Ĵ������ǲ���ʹ��request.getParameter()�������ļ�����Ҫʹ�ô��̹������ļ��ϴ���
		   
		   //���ȴ������̹���
		   DiskFileItemFactory factory=new DiskFileItemFactory();
		   factory.setRepository(new File("D://"));//���ô��̹����Ŀ�--���ص�һ���ļ���
		   factory.setSizeThreshold(50*1024*1024);//50M--������̵Ĵ�С--��byteΪ��λ

		   //�����ļ��ϴ���servlet���������
		   ServletFileUpload upload=new ServletFileUpload(factory);
		   upload.setFileSizeMax(-1);//�ϴ��ĵ����ļ��Ĵ�С    -1��ʾ������
		   upload.setHeaderEncoding("UTF-8");
		   upload.setSizeMax(50*1024*1024);//�����ϴ������ļ����ܴ�С
		   boolean result=false;
		   String relName="";
		   try {
			   //�����fileItem����ָ�����������==�ļ�+����
			List<FileItem> files = upload.parseRequest(request);//�����������ȡ���еĲ���������+�ļ���
			Iterator<FileItem> it = files.iterator();
			while(it.hasNext()){
				FileItem file=it.next();
				if(file.isFormField()){//ͨ��file.isFormFild()�жϸò����ǲ�����ֵ���ԣ�������ļ�����������false
					System.out.println("��ֵ������"+file.getFieldName());//ͨ��file.getFieldName()��ȡ������
				    System.out.println(file.getString("UTF-8"));//file.getString("UTF-8")�Թ̶������ʽ��ȡ����ֵ
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
						file.write(file1);//��file���ļ�����д���Ӧ���ļ�Ŀ¼��Ӧ���ļ���
						
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

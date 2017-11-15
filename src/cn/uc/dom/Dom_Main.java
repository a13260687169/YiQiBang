package cn.uc.dom;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Dom_Main {

	
	public static void main(String[] args) {
		//documentBuilder类创建的工厂类    
		DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
		//document对象的创建类
		DocumentBuilder builder= null;
		//加载classes.xml文件
		Document document=null;
		//查找根元素 
		NodeList  nodeList=null;//返回NodeList
		try {
			//document对象的创建类
			 builder= factory.newDocumentBuilder();
			//加载classes.xml文件
			 document=builder.parse(Dom_Main.class.getResourceAsStream("/classes.xml"));
			//查找根元素 
			  nodeList= document.getElementsByTagName("class");//返回NodeList
			 
			Node node=	nodeList.item(0);
			NodeList stuList=node.getChildNodes();
			for (int i = 0; i < stuList.getLength(); i++) {
				System.out.println(stuList.item(i).getNodeName());
				System.out.println(stuList.item(i).getNodeValue());
			
				//节点分类:元素节点  文本节点。
				//使用节点 。getNodeType可以获取某个节点类型
				if(stuList.item(i).getNodeType()==1){
					NodeList attList=stuList.item(i).getChildNodes();
					for (int j = 0; j < attList.getLength(); j++) {
						System.out.println(attList.item(j).getNodeName());
						System.out.println(attList.item(j).getTextContent());

					}
					
				}
				
			}
			
		
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Node node1=document.createElement("student");
		Node name=document.createElement("name");
		name.setTextContent("滴滴滴");
		node1.appendChild(name);
		Node sex=document.createElement("sex");
		sex.setTextContent("女");
		node1.appendChild(sex);
		Node height=document.createElement("height");
		height.setTextContent("1.55");
		node1.appendChild(height);
		
		document.getElementsByTagName("class").item(0).appendChild(node1);
		
	}
}

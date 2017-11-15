<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	
    	String tishi=(String)session.getAttribute("tishi");
    	session.removeAttribute("tishi");
   		 if(tishi==null){
    		tishi="";
    		}
    	
    
    %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="BootStrap/bootstrap-3.3.7/dist/css/bootstrap.min.css">
    <script src="jquery/jquery-3.2.1.min.js"></script>
    <script src="BootStrap/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
 <style>
        body{
            background: #1e314b;
        }
        #login{
            width: 500px;
            height: 500px;
            background: #162435;
            margin: 10% 30%;
        }
        #logo{
           
            text-align: center;
        }
        label{
            color: white;
            font-size: 16px;
            font-weight: 500;
        }
        #yanzhengma img {
            height: 40px;
        }
        #yanzhengma input {
            height: 30px;
            border-radius: 5px;
            margin-left: 15px;
            padding: 5px;
            
        }
        form{
       	margin-top: 15px;
       	
        }
        form button:first-child{
            margin-left: 150px;
        }
        form button:last-child{
            margin-left: 40px;

        }
        p{
        color: red;
        font-size: 16px;
        }
    </style>
</head>
<body>
    <div class="container" id="login">
        <div id="logo">
            <img src="img/logo.png">
        </div>
        <form action="BackLoginServlet" onsubmit="return checkIpt()" >
            <div class="form-group">
                <label for="username">用户名:</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="请输入您的账号">
            </div>
            <div class="form-group">
                <label for="pasaword">密码:</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="请输入您的密码">
            </div>
            <div class="form-group">
                <label>验证码:</label>
                <div id="yanzhengma">
                   <img src="validate.jsp" onclick="refreshCode()" id="123">
               	  <input type="text" id="code" name="code"  placeholder="请输入验证码">
           		 </div>
            
            
            </div>
            <div class="form-group">
             	<p id="tishi"><%=tishi %></p>
            </div>
            <button type="submit"  name="action" value="managerLogin" class="btn btn-default" >登录</button> 
            <button type="button" class="btn btn-default">忘记密码</button>
        </form>

    </div>
</body>
<script type="text/javascript">
        function  refreshCode() {
            $("#123").attr("src","validate.jsp?abc="+Math.random());
            
        }
      	
        function checkIpt(){
        	var username=$("#username").val();
        	var password=$("#password").val();

       	 	var yanzhengma=$("#code").val();
       	 	
			if(username==""||password==""||yanzhengma==""){		
				
			$("#tishi").text("*用户名、密码或验证码不能为空");
				return false;
			}else{
				
				return true;
		}
        	
        }
        
       
</script>
</html>
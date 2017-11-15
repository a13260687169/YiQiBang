<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
 	String path=request.getContextPath();
	/* request.getRequestDispatcher("LoginServlet").forward(request, response); */
    
    %>
<!DOCTYPE html >
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="BootStrap/bootstrap-3.3.7/dist/css/bootstrap.min.css">
    <script src="jquery/jquery-3.2.1.min.js"></script>
    <script src="BootStrap/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>

    <style>
        *{
            padding: 0px;
            margin: 0px;
        }



        #mylogin{
            margin: 80px 500px;
            width: 400px;
            height:400px;
            background: lightgray;
        }
        #myhead{
            height: 50px;
            background: deepskyblue;
            text-align: center;
            line-height: 50px;
        }
        #myhead p{
            font-size: 20px;
        }
        .loginBtn button{
            width: 100%;
            height: 100%;
            background: slateblue;

        }
        .myfoot{
            margin-top: 250px;
            text-align: center;
            border-top: 1px solid gray;
        }
        .myfoot a{
            margin: 15px;
        }
        .loginSelect>div{
            position: relative;

        }
        #row>div{
            margin: 50px;
        }

        #account{
            position: absolute;
        }
        #emile{
            position: absolute;
            margin-top: 20px;
        }
        #account{
            display: none;
            margin-top: 20px;
        }

    </style>
  
    <script>
        $(function () {
            $(".loginSelect div").click(function () {
                $(".loginSelect div>button").css("background","white");



                $("#account").css("display","none");
                $("#emile").css("display","none");
                var i=parseInt($(this).index());
              if(i==0){
                  $("#1").css({"background":"deepskyblue"});
                  $("#account").css("display","block");
              }else {
                  $("#2").css({"background":"deepskyblue"})
                  $("#emile").css("display","block");
              }
                
            });
                
            
            
        });
    </script>
    <script type="text/javascript">
    window.onload=function(){
    	function getCookieValue(key){
    		var cookies=document.cookie;
    		
    		var cookieArr=cookies.split(";");//将字符串按照分号进行分割成数组
    		for(var i=0;i<cookieArr.length;i++){
    			//对分割后的数组进行遍历
    			var cookieI=cookieArr[i];
    			var cookieIArr=cookieI.split("=");
    			if(cookieIArr[0]==key){
    				return cookieIArr[1];
    			}
    		}
    		}
    	var cookieValue=getCookieValue("username");
    	document.getElementById("username").innerText=cookieValue;
    	
    	
    }
    </script>



</head>
<body>
<div id="mylogin">
    <div id="myhead">
        <p>登录账户</p>
    </div>
    <div class="row">
        <div class="col-lg-8 col-md-offset-2">
            <div class="btn-group btn-group-justified loginSelect" role="group" aria-label="...">
                <div class="btn-group " role="group">
                    <button type="button" id="1" class="btn btn-default">账号登录</button>

                </div>
                <div class="btn-group " role="group">
                    <button type="button" id="2" class="btn btn-default">短信登录</button>
                </div>

            </div>
            <div id="account">
            <form action="LoginServlet" >
                <div class="form-group">

                    <input type="text" class="form-control " id="username" name="username" placeholder="请输入您的账号">
                </div>
                <div class="form-group">

                    <input type="password" class="form-control" name="password" placeholder="请输入您的密码">
                </div>

                <div class="checkbox">
                    <label>
                        <input type="checkbox" name="checked">记住密码
                    </label>
                    <label>
                        <input type="checkbox">自动登录
                    </label>
                    <a href="#">
                        <label>注册账号?</label>
                    </a>
                </div>
                <div class="loginBtn">
                <button type="submit" class="btn btn-default">登录</button>
                </div>
            </form>
            </div>
            <div id="emile">
                <form action="/LoginServlet">
                    <div class="form-group">

                        <input type="text" class="form-control" id="Mobile" placeholder="请输入您的手机号">
                    </div>
                    <div class="form-group">

                        <div >
                            <input type="password" class="form-control" name="password" id="yanzhengma" placeholder="请输入验证码">

                        </div>
                        <div >
                            <input type="button" class="form-control " name="password" value="点击获取(60s内发送   )">

                        </div>

                    </div>

                    <div class="checkbox">
                        <label>
                            <input type="checkbox">记住密码
                        </label>
                        <label>
                            <input type="checkbox">自动登录
                        </label>
                        <a href="#">
                            <label>注册账号?</label>
                        </a>
                    </div>
                    <div class="loginBtn">
                        <button type="submit" class="btn btn-default">登录</button>
                    </div>
                </form>
            </div>


        </div>
        <div class="col-lg-8 col-md-offset-2 myfoot">

            <p>其他账号登录</p>
            <a href="#"> <img src="zhenwenImg/qq.png"></a>
            <a href="#"> <img src="zhenwenImg/weixin.png"></a>
            <a href="#"> <img src="zhenwenImg/xinlang.png"></a>
        </div>
</div>
</div>

</body>
</html>
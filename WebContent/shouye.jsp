<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%
    if(session.getAttribute("username")==null){
    	 response.sendRedirect(request.getContextPath()+"/login.jsp");

    }

    
  
  %>>  
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="BootStrap/bootstrap-3.3.7/dist/css/bootstrap.min.css">
    <script src="jquery/jquery-3.2.1.min.js"></script>
    <script src="BootStrap/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
     <style>


        #search {
            margin-left: 300px;
            width: 500px;
            height: 30px;

        }

      /*  #search input {
            border-radius: 3px;
            width: 400px;
            height: 30px;
        }
        #search button{
            width: 80px;
            height: 30px;
            background:orange;
        }*/
        .row1{
            margin-top: 40px;
        }


        .row>div:nth-child(1) button{
            width: 140px;
        }
        .row>div:nth-child(1) button:hover {
            background: deepskyblue;
        }

        .newss{
            background: lightgrey;


        }
        .newss a{
            color: black;
        }

        .myBody{
            margin-top: 40px;
            background: lightgrey;

        }
        .myBody a{
            color: black;
        }
        #sousou{
            background: deepskyblue;
        }
        #carousel-example-generic .active{
            background: deepskyblue;
        }

    </style>
</head>
<body>
<nav class="navbar navbar-default ">
    <div class="container">

        <div class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><img src="img/logo.png" alt="图片加载失败" class="img-rounded"></li>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"  data-toggle="popover" title="Example popover"><p id="loginState" name="0">登录</p></a></li>
                <li><a href="#"><p>下载APP</p></a></li>
                <li><a href="#"><p>反馈</p></a></li>

            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<div class="container">

    <div class="col-md-7 col-md-offset-2">
        <div class="input-group">
            <input type="text" class="form-control" placeholder="Search for...">
      <span class="input-group-btn">
        <button class="btn btn-default" id="sousou" type="button"><img src="images/sousuo.png"></button>
      </span>
        </div><!-- /input-group -->
    </div><!-- /.col-lg-6 -->



    <div class="row row1">
        <div class="col-md-2">
            <div class="btn-group-vertical" role="group">
                <button type="button" class="btn btn-default">推荐</button>
                <button type="button" class="btn btn-default">热点</button>
                <button type="button" class="btn btn-default">图片</button>
                <button type="button" class="btn btn-default">科技</button>
                <button type="button" class="btn btn-default">社会</button>
                <button type="button" class="btn btn-default">娱乐</button>
                <button type="button" class="btn btn-default">体育</button>
                <button type="button" class="btn btn-default">游戏</button>

            </div>
        </div>
        <div class="col-md-7">
            <div id="carousel-example-generic" class="carousel slide mycarousel" data-ride="carousel">
                <!-- Indicators  指示器小圆点 -->
                <ol class="carousel-indicators">
                    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
                </ol>

                <!-- Wrapper for slides 轮播图片层-->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img src="images/banner.jpg" alt="加载路径错误">
                        <div class="carousel-caption">

                        </div>
                    </div>
                    <div class="item">
                        <img src="images/banner.jpg" alt="加载路径错误">
                        <div class="carousel-caption">

                        </div>
                    </div>
                    <div class="item">
                        <img src="images/banner.jpg" alt="加载路径错误">
                        <div class="carousel-caption">

                        </div>
                    </div>
                </div>

                <!-- Controls 控制器--左右箭头-->
                <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
            <div class="row">
                <div class="col-md-12">
                <h3><a href="#">实拍德国的真是农村，百闻不如一见</a></h3>
                 </div>
                <div class="col-md-4">
                    <a href="#" class="thumbnail">
                        <img src="images/content_tu_02_13.jpg" alt="...">
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="#" class="thumbnail">
                        <img src="images/content_tu_02_13.jpg" alt="...">
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="#" class="thumbnail">
                        <img src="images/content_tu_02_13.jpg" alt="...">
                    </a>
                </div>
                <div class="col-md-12">
                    <a href="#">XX·30分钟前·评论XX次</a></h3>
                </div>
            </div>
            <hr>
            <div class="row">
                <div class="col-md-12">
                    <h3><a href="#">实拍德国的真是农村，百闻不如一见</a></h3>
                </div>
                <div class="col-md-4">
                    <a href="#" class="thumbnail">
                        <img src="images/content_tu_02_13.jpg" alt="...">
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="#" class="thumbnail">
                        <img src="images/content_tu_02_13.jpg" alt="...">
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="#" class="thumbnail">
                        <img src="images/content_tu_02_13.jpg" alt="...">
                    </a>
                </div>
                <div class="col-md-12">
                    <a href="#">XX·30分钟前·评论XX次</a></h3>
                </div>
            </div>
            <hr>
            <div class="row">
                <div class="col-md-12">
                    <h3><a href="#">实拍德国的真是农村，百闻不如一见</a></h3>
                </div>
                <div class="col-md-4">
                    <a href="#" class="thumbnail">
                        <img src="images/content_tu_02_13.jpg" alt="...">
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="#" class="thumbnail">
                        <img src="images/content_tu_02_13.jpg" alt="...">
                    </a>
                </div>
                <div class="col-md-4">
                    <a href="#" class="thumbnail">
                        <img src="images/content_tu_02_13.jpg" alt="...">
                    </a>
                </div>
                <div class="col-md-12">
                    <a href="#">XX·30分钟前·评论XX次</a></h3>
                </div>
            </div>


        </div>
        <div class="col-md-3">
            <div class="newss">
            <h3>24小时热闻</h3>
                <hr>
            <div class="media">
                <div class="media-left media-middle">
                    <a href="#">
                        <img class="media-object" src="images/right_tu_01_03.jpg" alt="...">
                    </a>
                </div>
                <div class="media-body">
                    <a class="media-heading">笑死人不偿命的一百种作死的方式，你知道几种?</a>
                </div>
            </div>
                <hr>
                <div class="media">
                    <div class="media-left media-middle">
                        <a href="#">
                            <img class="media-object" src="images/right_tu_02_06.jpg" alt="...">
                        </a>
                    </div>
                    <div class="media-body">
                        <a class="media-heading">笑死人不偿命的一百种作死的方式，你知道几种?</a>
                    </div>
                </div>
                <hr>
                <div class="media">
                    <div class="media-left media-middle">
                        <a href="#">
                            <img class="media-object" src="images/right_tu_03_08.jpg" alt="...">
                        </a>
                    </div>
                    <div class="media-body">
                        <a class="media-heading">笑死人不偿命的一百种作死的方式，你知道几种?</a>
                    </div>
                </div>
            </div>


            <div  class="myBody">
                <h3>精彩图片</h3>
                <hr>
                <div class="media">
                    <div class="media-left media-middle">
                        <a href="#">
                            <img class="media-object" src="images/right_tu_01_03.jpg" alt="...">
                        </a>
                    </div>
                    <div class="media-body">
                        <p class="media-heading">笑死人不偿命的一百种作死的方式，你知道几种?</p>
                    </div>
                </div>
                <hr>
                <div class="media">
                    <div class="media-left media-middle">
                        <a href="#">
                            <img class="media-object" src="images/right_tu_02_06.jpg" alt="...">
                        </a>
                    </div>
                    <div class="media-body">
                        <p class="media-heading">笑死人不偿命的一百种作死的方式，你知道几种?</p>
                    </div>
                </div>
                <hr>
                <div class="media">
                    <div class="media-left media-middle">
                        <a href="#">
                            <img class="media-object" src="images/right_tu_03_08.jpg" alt="...">
                        </a>
                    </div>
                    <div class="media-body">
                        <p class="media-heading">笑死人不偿命的一百种作死的方式，你知道几种?</p>
                    </div>
                </div>
            </div>
        </div>

    </div>

</div>

</body>
<script>
    $('.carousel').carousel({
        interval:2000,/*自动轮播时间*/
        pause:"hover",/*鼠标移入事件，null表示继续轮，hover表示停止*/
        wrap:true, /*是否从头轮*/
        keyboard:true/*键盘控制是否开启-先点一下*/

    });



</script>

</html>
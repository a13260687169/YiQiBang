<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
		String path=request.getContextPath();
	
	%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="BootStrap/bootstrap-3.3.7/dist/css/bootstrap.min.css">
    <script src="jquery/jquery-3.2.1.min.js"></script>
    <script src="BootStrap/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>
    <script>
    $(function(){
    	$("#upTxBtn").click(function(){
    		var result=checkImg();
    		if(result){
    			var formData=new FormData(document.getElementById("headForm"));
    			$.ajax({
    				url:"/YiQiBang/FileUpLoadServlet?action=addUserPhoto",
    				type:"post",
    				data:formData,
    				processData:false,
    				 contentType:false,
    				success:function(data){
    					console.log(data);
    					var result1=JSON.parse(data);
    					console.log(result1.retMsg+"*"+result1.imgName);
    					if(result1.retMsg){
    						alert("22");
    						$("#myHead").attr("src","/YiQiBang/img/"+result1.imgName);
    						
    					}
    				},
    				error:function(e){
  					  console.log(data);
  				  }
    			});
    		}
    	});
    });
    
    </script>
</head>
<body>
	<div id="page">
		<div class="container_fluid">
			<div class="row">
				<div class="col-md-2 col-md-offset-5">
					<!-- 面板 -->
					<div class="panel panel-danger">
						<div class="panel-heading">
							<h3 class="panel-title">上传头像</h3>
						</div>
						<div class="panel-body">
							<div class="row">
								<div class="col-sm-12">
									<!-- 缩略图 -->

									<div class="thumbnail">
										<img id="myHead" src="/YiQiBang/img/logo.png">

										<form id="headForm"
											enctype="multipart/form-data" method="post"
											onsubmit="return checkImg()">
											<div class="caption">
												<p class="">
												    <input type="text" placeholder="请输入用户名" name="username">
													<input type="file" name="myfile" id="fileIpt">
													<button type="button" id="upTxBtn">上传头像</button>
												</p>
											</div>
										</form>
									</div>

									<script type="text/javascript">
										function checkImg() {
											if ($("#fileIpt").val() == "") {//文件选择器没有选择文件
												alert("请选择文件");
												return false;
											} else {
												return true;
											}

										}
									</script>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
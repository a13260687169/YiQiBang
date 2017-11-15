<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新闻管理</title>
<link rel="stylesheet"
	href="../BootStrap/bootstrap-3.3.7/dist/css/bootstrap.min.css">
<script type="text/javascript" src="../jquery/jquery-3.2.1.min.js"></script>
<script src="../js/date1.js"></script>
<script src="../BootStrap/bootstrap-3.3.7/dist/js/bootstrap.min.js"></script>

<!-- eEditor -->
<!-- 配置文件 -->
<script type="text/javascript" src="js/uEditer/ueditor.config.js"></script>
<!-- 编辑器源码文件 -->
<script type="text/javascript" src="js/uEditer/ueditor.all.js"></script>

<style>


#header nav {
	margin-bottom: 0;
}


#content .list-group a {
	border-radius: 0;
}

#content .right_box {
	padding: 0px;
	position:relative
	
	
}
#content .right_box>div{
position: absolute;
	
}
#content .right_box .panel, #content .right_box .panel-heading {
	border-radius: 0;
}

table thead tr th {
	text-align: center;
}

.icon_row .row {
	margin: 0;
}

.icon_row .row span {
	font-size: 20px;
}

.icon_row .row span:hover {
	color: red;
}

.news_tr>td {
	max-width: 200px;
	text-over: ellipsis;
	white-space: nowrap;
	overflow: hidden;
}

.cop_row>div>.input-group {
	margin-top: 3px;
}

.cop_row>div>button {
	margin-top: 4.5px;
}

#addNewsModal {
	padding-bottom: 100px;
	overflow: scroll;
}

@media ( min-width :768px) {
	#addNewsModal .modal-dialog {
		width: 70%;
	}
}

.upload_btn {
	margin-top: 10px;
}

.edui-popup-content.edui-default {
	height: auto !important;
}

</style>
<script type="text/javascript">

   

</script>
<script>
	$(function() {
		getAllNews();
		getAllTypes();
		$(".right_box>div:not(:first)").css("display","none");
		 $(".left_box>div>a").click(function () {
			 $(".left_box>div>a").removeClass("active");
			 $(this).addClass("active");
				$(".right_box>div").css("display","none");		
				  $(".right_box>div").eq($(this).index()).css("display","block")
		    });

	});
	function getAllNews() {
		$('#myModal').modal('show');
		$.getJSON("/YiQiBang/NewsServlet", {
			action : "getAllNews"
		}, function(data) {
			showNewsData(data);
		});
	}

	function showNewsData(data) {

		if (data.retCode == 0) {
			$("#newsList_body").html("");
			var newslist = data.retData;

			for (var i = 0; i < newslist.length; i++) {
				var news = newslist[i];
				console.log(news);
				$("#newsList_body")
						.append(
								'<tr align="center" class="news_tr">' + '<td>'
										+ (i + 1)
										+ '</td>'
										+ '<td id="type'+i+'"></td>'
										+ '<td>'
										+ news.n_title
										+ '</td>'
										+ '<td>'
										+ news.n_source
										+ '</td>'
										+ '<td>'
										+ news.n_author
										+ '</td>'
										+ '<td>'
										+ news.n_content
										+ '</td>'
										+ '<td>'
										+ getStrDate(news.n_createtime.time)
										+ '</td>'
										+ '<td>'
										+ news.n_commcount
										+ '</td>'
										+ '<td>'
										+ news.n_readcount
										+ '</td>'
										+ '<td>'
										+ (news.n_ifhot ? "是" : "否")
										+ '</td>'
										+ '<td>'
										+ (news.n_ifreport ? "是" : "否")
										+ '</td>'

										+ '<td class="icon_row">'
										+ '<div class="row">'
										+ '<div class="col-md-6 text-center">'
										+ '<span class="glyphicon glyphicon-cog cofigBtn" id="configBtn'
										+ i+'"></span>'
										+ '</div>'
										+ '<div class="col-md-6 text-center">'
										+ '<span class="glyphicon glyphicon-trash" id="deleteBtn'
										+ i + '" onclick="deleteNew(' + news.id
										+ ')"></span>' + '</div>' + '</div>'
										+ '</td>' + '</tr>');
			
				getTypeById(news.t_t_id, i);
			}
			$(".cofigBtn").each(function(index) {
				$("#configBtn" + index).click(function() {
					var news = newslist[index];
					//1.把模态框放出来
					$("#addNewsModal").modal('show');
					//2.将模态框里面显示的数据变成news对象里面的数据
					$("#myModalLabel").text("修改新闻");//修改模态框标题
					$("#addNewsModal #typeid").val(news.t_t_id);
					$("#addNewsModal #title").val(news.n_title);
					$("#addNewsModal #source").val(news.n_source);
					$("#addNewsModal #author").val(news.n_author);
					
					$("#newsId").val(news.id);
					//3.修改确定按钮 事件
					var ue = UE.getEditor('editor',{ 
						initialFrameWidth : 700,
                		initialFrameHeight : 300
					});
					ue.setContent(news.n_content);
					console.log(news);
					if (news.nIfhot) {
						$("#yes").attr("checked", true);
						$("#no").removeAttr("checked");
					} else {
						$("#yes").removeAttr("checked");
						$("#no").attr("checked", true);
					}

				});
			});
			$('#myModal').modal('hide');
		}
	}
	/*根据id删除新闻*/
	function deleteNew(newsId) {

		$.ajax({
			url : "/YiQiBang/NewsServlet",//请求url地址 
			data : { //请求参数对象
				action : "adminDeleteNewsById",
				id : newsId
			},
			timeout : 5000,//请求超时时间，以ms为单位
			type : "post",//请求方式
			beforesend : function() { //请求开始发送之前的回掉方法
				$('#myModal').modal('show');
			},
			success : function(data) {//请求成功回掉函数
				var objData = JSON.parse(data);
				if (objData.retCode == 0) {
					location.reload();
				}
			},
			error : function(e) {//请求失败回掉函数
				alert("类型获取异常" + e);
			},
			complete : function() {//请求完成时候的回调函数
				$('#myModal').modal('hide');
			}
		});
	}
	
	/*根据类型id获取类型*/
	function getTypeById(typeId, index) {
		$.ajax({
			url : "/YiQiBang/TypeServlet",//请求url地址
			data : { //请求参数对象
				action : "adminGetTypeById",
				id : typeId
			},
			timeout : 5000,//请求超时时间，以ms为单位
			type : "get",//请求方式
			beforesend : function() { //请求开始发送之前的回掉方法
				$('#myModal').modal('show');
			},
			success : function(data) {//请求成功回掉函数
				var objData = JSON.parse(data);//将字符串对象转化为js的Object对象

				if (objData.retCode == 0) {
					$("#type" + index).text(objData.retData[0].t_name);

				}
			},
			error : function(e) {//请求失败回掉函数
				alert("类型获取异常" + e);
			},
			complete : function() {//请求完成时候的回调函数
				$('#myModal').modal('hide');
			}
		});
	}
	/**
	 * 获取所有类型
	 */
	function getAllTypes() {
		$.ajax({
			url : "/YiQiBang/TypeServlet",
			data : {
				action : "adminGetAllTypes"
			},
			type : "get",
			timeout : 5000,
			beforesend : function() {
				$('#myModal').modal('show');
			},
			success : function(data) {
			
				var jsData = JSON.parse(data);
				
				$("#typeid").html("");
				for (var i = 0; i < jsData.retData.length; i++) {

					var type = jsData.retData[i];

					$("#typeid").append(
							'<option value="'+type.id+'">' + type.t_name
									+ '</option>');
				}
				}
			,
			error : function(e) {
				alert("上传失败");
			},
			complete : function() {
				$('#myModal').modal('hide');
			}
		});
	}

	function addNewsBtn() {
		$("#myModalLabel").text("添加新闻");
		$("#addNewsModal #typeid").val(null);
		$("#addNewsModal #title").val(null);
		$("#addNewsModal #source").val(null);
		$("#addNewsModal #author").val(null);
		$("#addNewsModal").modal('show');
	}

	function searchNewsByLike() {
		var searchTv = $("#searchTv").val();
		if (searchTv == "") {
			getAllNews();
		} else {
			$.ajax({
				url : "/YiQiBang/NewsServlet",
				data : {
					action : "adminGetNewsByLike",
					likeStr : searchTv
				},
				type : "get",
				timeout : 5000,
				beforesend : function() {
					$('#myModal').modal('show');
				},
				success : function(data) {
					var datas = JSON.parse(data);
					showNewsData(datas);
				},
				error : function(e) {
					alert("上传失败");
				},
				complete : function() {
					$('#myModal').modal('hide');
				}
			});
		}

	}
</script>
</head>
<body>
	<div id="newsBody">
		<div id="header">
			<%@include file="header.jsp"%>	
		</div>
		<div class="container_fluid" id="content">
			<div class="row">
				<div class="col-md-2 left_box">
					<%@include file="left.jsp"%>
				</div>
				<div class="col-md-10 right_box">
					<div class="panel panel-primary">
						<div class="panel-heading">
							<div class="row cop_row">
								<div class="col-md-2">
									<h4>新闻列表</h4>
								</div>
								<div class="col-md-offset-2 col-md-3">
									<div class="input-group">
										<input type="text" class="form-control"
											placeholder="标题/内容/时间/来源" id="searchTv"> <span
											class="input-group-btn">
											<button class="btn btn-default" type="button"
												onclick="searchNewsByLike()">
												<span class="glyphicon glyphicon-search"></span>
											</button>
										</span>
									</div>
								</div>
								<div class="col-md-offset-3 col-md-2">
									<button type="button" class="btn btn-default btn-sm"
										onclick="addNewsBtn()">
										<span class="glyphicon glyphicon-plus-sign" aria-hidden="true"></span>
										添加
									</button>
								</div>
							</div>


						</div>
						<div class="panel-body">
							<table class="table table-bordered table-stripted">
								<thead>
									<tr>
										<th>序号</th>
										<th>类型</th>
										<th>标题</th>
										<th>来源</th>
										<th>作者</th>
										<th>内容</th>
										<th>时间</th>
										<th>评论</th>
										<th>浏览</th>
										<th>是否热点</th>
										<th>是否被举报</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody id="newsList_body">
								</tbody>
							</table>
						</div>
						<div class="panel-footer text-center">
							<nav aria-label="Page navigation">
								<ul class="pagination">
									<li><a href="#" aria-label="Previous"> <span
											aria-hidden="true">&laquo;</span>
									</a></li>
									<li class="active"><a href="#">1</a></li>
									<li><a href="#">2</a></li>
									<li><a href="#">3</a></li>
									<li><a href="#">4</a></li>
									<li><a href="#">5</a></li>
									<li><a href="#" aria-label="Next"> <span
											aria-hidden="true">&raquo;</span>
									</a></li>
								</ul>
							</nav>
						</div>
					</div>
				<%@include file="NewsTypeManager.jsp"%>
				<%@include file="NewsTypeManager.jsp"%>
				</div>
				
				
				
			</div>
		</div>


		<!-- Modal -->
		<div class="modal fade" id="addNewsModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title" id="myModalLabel">添加新闻</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" id="addNewsForm"
							action="/YiQiBang/NewsServlet?action=adminInsertNews"
							method="post">
							<div class="form-group">
								<label class="col-sm-2 control-label">类型</label>
								<div class="col-sm-8">
									<select id="typeid" name="typeid" class="form-control"></select>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">标题</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="title" name="title"
										placeholder="请输入标题">
										 <input type="hidden" id="newsId"
										name="newsId">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">来源</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="source"
										name="source" placeholder="请标明新闻来源">
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">作者</label>
								<div class="col-sm-8">
									<input type="text" class="form-control" id="author"
										name="author" placeholder="请表明新闻作者"">
								</div>
							</div>

							<div class="form-group">
								<label class="col-sm-2 control-label">内容</label>
								<div class="col-sm-9">
									<div>
										<script id="editor" type="text/plain"></script>
									</div>
								</div>
							</div>
							<div class="form-group">
								<label class="col-sm-2 control-label">是否为热点</label>
								<div class="col-sm-8">
									<label class="radio-inline"> <input type="radio"
										name="ifHot" id="yes" value="true" checked>是
									</label> <label class="radio-inline"> <input type="radio"
										name="ifHot" id="no" value="false"> 否
									</label>

								</div>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="button" class="btn btn-primary"
							onclick="addNewsSure()">确定</button>
					</div>
				</div>
			</div>
			
		</div>
		<jsp:include page="progress.jsp"></jsp:include>
	</div>
</body>


<script type="text/javascript">
	$("#myModal").modal('show');

	//实例化编辑器
	var ue = UE.getEditor('editor', {
		//focus时自动清空初始化时的内容
		autoClearinitialContent : true,
		//关闭字数统计
		wordCount : false,
		//关闭elementPath
		elementPathEnabled : false,
		//默认的编辑区域高度
		initialFrameWidth : 700,
		initialFrameHeight : 300
	//更多其他参数，请参考ueditor.config.js中的配置项
	});
	//添加新闻按钮点击事件
	function addNewsSure() {
		var xxx = $("#myModalLabel").text();
		var title = $("#title").val();
		var source = $('#source').val();
		var author = $("#author").val();
		var content = ue.getContent();
		var type = $("#typeid").val();
		var newId = $("#newsId").val();
		var ifHot = $("#yes").prop("checked") ? true : false;
		var data = {
			title : title,
			typeid : type,
			content : content,
			source : source,
			author : author,
			ifHot : ifHot
		};
		if (title == "" || source == "" || author == "" || content == "") {
			alert("请输入内容");
			return;
		}
		if (xxx == "修改新闻") {
			data.action = "adminUpdateNews",
			data.id = newId
			
		} else {
			data.action = "adminInsertNews"
		}
		$.ajax({
			url : "/YiQiBang/NewsServlet",
			data : data,
			type : "post",
			timeout : 5000,
			beforesend : function() {
				$('#myModal').modal('show');
			},
			success : function(data) {
				console.log(data);
				var jsData = JSON.parse(data);
				if (jsData.retCode == 0) {
					location.reload();
				}
			},
			error : function(e) {
				alert("上传失败");
			},
			complete : function() {
				$('#myModal').modal('hide');
				$("#addNewsModal").modal('hide');
			}
		});
		/**/
	}
</script>
</html>
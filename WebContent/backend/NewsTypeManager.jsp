<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <style>
    #addNewsTypeModal {
	padding-bottom: 100px;
	height:500px;
}

@media ( min-width :400px) {
	#addNewsTypeModal .modal-dialog {
		width: 40%;
		
	}
}
    </style>
    <script>
   function addNewsTypeBtn(){
	
		$("#addNewsTypeModal").modal('show');
   }
   
   function addNewsTypeSure(){
	   var TypeX = $("#addNewTypeModalLaber").text();
	   var TypeName=$("#TypeName").val();
	   var newTypeId = $("#newsTypeId").val();
	   alert(TypeX);
	   var data1={
			   source : "xxx",		   
	   }
	   if(TypeName==""){
		   alert("请输入类型名称");
		   return;
	   }
	   if(TypeX=="添加新闻类型"){
		   alert(TypeName);
		   data1.action = "adminInsertNewsType";
		   data1.typeName=TypeName;
	   }else{
		   data1.action = "adminUpdataNewsTypeById";
		   data1.id=newTypeId;
		   data1.typeName=TypeName;
	   }
	   $.ajax({
			url : "/YiQiBang/TypeServlet",
			data : data1,
			type : "post",
			timeout : 5000,
			beforesend : function() {
				$('#myModal').modal('show');
			},
			success : function(data) {
				console.log(data);
				var jsData = JSON.parse(data);
				if (jsData.retCode == 0) {
					getAllNewType();
				}
			},
			error : function(e) {
				alert("上传失败");
			},
			complete : function() {
				$('#myModal').modal('hide');
				$("#addNewsTypeModal").modal('hide');
			}
		});
	   
   }
    function deleteNewType(NewsTypeId){
    	
    	$.ajax({
			url : "/YiQiBang/TypeServlet",//请求url地址 
			data : { //请求参数对象
				action : "adminDeleteNewsTypeById",
				id : NewsTypeId
			},
			timeout : 5000,//请求超时时间，以ms为单位
			type : "post",//请求方式
			beforesend : function() { //请求开始发送之前的回掉方法
				$('#myModal').modal('show');
			},
			success : function(data) {//请求成功回掉函数
				var objData = JSON.parse(data);
				if (objData.retCode == 0) {
					getAllNewType();
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
    function showNewsTypeData(data){
    	
    	
    	if (data.retCode == 0) {
			$("#newsTypeList_body").html("");
			var newsTypelist = data.retData;
			
			for (var i = 0; i < newsTypelist.length; i++) {
				var newsType = newsTypelist[i];
				$("#newsTypeList_body")
						.append(
								'<tr align="center" class="news_tr">' + '<td>'
										+ (i + 1)
										+ '</td>'
										+ '<td>'+newsType.t_name+'</td>'										
										+ '<td class="icon_row">'
										+ '<div class="row">'
										+ '<div class="col-md-6 text-center">'
										+ '<span class="glyphicon glyphicon-cog cofigBtn" id="configTypeBtn'
										+ i+'"></span>'
										+ '</div>'
										+ '<div class="col-md-6 text-center">'
										+ '<span class="glyphicon glyphicon-trash" id="deleteBtn'
										+ i + '" onclick="deleteNewType(' + newsType.id
										+ ')"></span>' + '</div>' + '</div>'
										+ '</td>' + '</tr>');
			
				
			}
			$("#configTypeBtn").each(function(index) {
				$("#configTypeBtn" + index).click(function() {
					/* alert("222")
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
					console.log(news);  */
					

				});
			});
			$('#myModal').modal('hide');
		} 
	
    	
    }
    </script>
    
<div class="panel panel-primary">
						<div class="panel-heading">
							<div class="row cop_row">
								<div class="col-md-2">
									<h4>新闻类型管理</h4>
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
										onclick="addNewsTypeBtn()">
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
										<th>操作</th>
									</tr>
								</thead>
								<tbody id="newsTypeList_body">
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
					<!-- Modal -->
		<div class="modal fade" id="addNewsTypeModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel">
			<div class="modal-dialog" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title" id="addNewTypeModalLaber">添加新闻类型</h4>
					</div>
					<div class="modal-body">
						<form class="form-horizontal" id="addNewsTypeForm"
							action="/YiQiBang/TypeServlet?action=adminInsertNewsType"
							method="post">
							<div class="form-group">
								<label class="col-sm-2 control-label">类型</label>
								<div class="col-sm-8">
									<input type="text" id="TypeName" name="TypeName" class="form-control" placeholder="请输入您要添加的类型名称">
									<input type="hidden" id="newsTypeId" name="newsTypeId">
								</div>
							</div>
							
							
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
						<button type="button" class="btn btn-primary"
							onclick="addNewsTypeSure()">确定</button>
					</div>
				</div>
			</div>
			
		</div>
		
	
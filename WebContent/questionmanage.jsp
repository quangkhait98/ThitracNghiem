<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang = "vi">
	<title>Thi trắc nghiệm</title>
	<meta charset = "UTF-8" />
	<!-- Bootstrap -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<!-- Latest compiled JavaScript -->
	<script src="js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/mainframe.css">

	<link rel="stylesheet" href="fontawesome/fontawesome-free-5.3.1-web/css/all.min.css">
	
	<script src="js/jquery-3.3.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/questionmanage.css">
	<script src="js/mainframe.js"></script>
</head>
<body>		
	<div class="canvas">
		<div class="header">
			<div class="cover-header">
				<div class="software-name">
					<h3>LUYỆN THI TRẮC NGHIỆM</h3>
				</div>
				
				<div class="toggle-info">
					<img id="toggle-img" src="images/user-icon-logout.png" alt="">
					<span class="user-name">Hải Nguyễn</span>
					<div class="info">
						<div class="myinfo item-info">
							<span>Thông tin cá nhân</span>
						</div>
						<div class="logout item-info">
							<i class="fas fa-sign-out-alt"></i><span>Đăng xuất</span>
						</div>
					</div>
				</div>				
			</div>		
		</div>
		<div class="body">
			<div class="sidebar">
				<div class="sidebar-header">
					<p>MENU</p>
				</div>
				<div class="sidebar-menu">
					<ul>
						<li class="sidebar-feature">
							<a href="#">
								<i class="fas fa-user-graduate"></i>
								<span>Quản lý câu hỏi</span>
							</a>
						</li>
						<li class="sidebar-feature">
							<a href="addquestion.jsp">
								<i class="fas fa-user-graduate"></i>
								<span>Thêm câu hỏi</span>
							</a>
						</li>
						<li class="sidebar-feature">
							<a href="profile.jsp">
								<i class="fas fa-info"></i>
								<span>Thông tin cá nhân</span>
							</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="container-main">
				<!-- Editable table -->
				<div class="row filter-search">
		  			<div class="col-sm-3">
						<label >Chọn môn</label><br>
						<select class="form-control">
							<option>Toán</option>
							<option>Văn</option>
							<option>Anh</option>
						</select>
					</div>
					<div class="col-sm-3">
						<label>Chọn loại </label><br>
						<select class="form-control">
							<option>1</option>
							<option>2</option>
							<option>3</option>
						</select>
					</div>
					<div class="col-sm-30">
						<label>Nhập câu hỏi: </label><br>
						<input type="text" name="" style="height: 39px;width: 350px;"
						class="form-control">
					</div>
					<div class="col-sm-3">
						<button type="button" class="btn btn-info search" style="width: 250px;margin-left: 40px;">Tìm kiếm</button>
					</div>
		  		</div>
				<div class="card">
				  	<div class="card-body">
					    <div id="table" class="table-editable" style="overflow: inherit">
							<span class="table-add float-right mb-3 mr-2">
						    	<a href="#!" class="text-success">
						    		<i class="fa fa-plus fa-2x" aria-hidden="true"></i>
						        </a>
						    </span>

					        <table class="table table-bordered table-responsive-md table-striped text-center">
						        <tr>
						          <th class="text-center">STT</th>
						          <th class="text-center">Mã câu hỏi</th>
						          <th class="text-center">Nội dung</th>
						          <th class="text-center">Đáp án</th>
						          <th class="text-center">Thời gian thêm</th>
						          <th class="text-center">Chức năng</th>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">1</td>
						          <td class="pt-2-half" contenteditable="false">CH1</td>
						          <td class="pt-2-half" contenteditable="false">Each of us must take ______ for our own actions</td>
						          <td class="pt-1-half" contenteditable="false">Responsibility</td>
						          <td class="pt-2-half" contenteditable="false">20/7/2018</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">2</td>
						          <td class="pt-2-half" contenteditable="false">CH2</td>
						          <td class="pt-2-half" contenteditable="false">Each of us must take ______ for our own actions</td>
						          <td class="pt-1-half" contenteditable="false">Responsibility</td>
						          <td class="pt-2-half" contenteditable="false">20/7/2018</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">3</td>
						          <td class="pt-2-half" contenteditable="false">CH3</td>
						          <td class="pt-2-half" contenteditable="false">Each of us must take ______ for our own actions</td>
						          <td class="pt-1-half" contenteditable="false">Responsibility</td>
						          <td class="pt-2-half" contenteditable="false">20/7/2018</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">4</td>
						          <td class="pt-2-half" contenteditable="false">CH4</td>
						          <td class="pt-2-half" contenteditable="false">Each of us must take ______ for our own actions</td>
						          <td class="pt-1-half" contenteditable="false">Responsibility</td>
						          <td class="pt-2-half" contenteditable="false">20/7/2018</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">5</td>
						          <td class="pt-2-half" contenteditable="false">CH5</td>
						          <td class="pt-2-half" contenteditable="false">Each of us must take ______ for our own actions</td>
						          <td class="pt-1-half" contenteditable="false">Responsibility</td>
						          <td class="pt-2-half" contenteditable="false">20/7/2018</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">6</td>
						          <td class="pt-2-half" contenteditable="false">CH6</td>
						          <td class="pt-2-half" contenteditable="false">Each of us must take ______ for our own actions</td>
						          <td class="pt-1-half" contenteditable="false">Responsibility</td>
						          <td class="pt-2-half" contenteditable="false">20/7/2018</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">7</td>
						          <td class="pt-2-half" contenteditable="false">CH7</td>
						          <td class="pt-2-half" contenteditable="false">Each of us must take ______ for our own actions</td>
						          <td class="pt-1-half" contenteditable="false">Responsibility</td>
						          <td class="pt-2-half" contenteditable="false">20/7/2018</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">8</td>
						          <td class="pt-2-half" contenteditable="false">CH8</td>
						          <td class="pt-2-half" contenteditable="false">Each of us must take ______ for our own actions</td>
						          <td class="pt-1-half" contenteditable="false">Responsibility</td>
						          <td class="pt-2-half" contenteditable="false">20/7/2018</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						          </td>
						        </tr>
	       
					      </table>
					    </div>
					    
				  	</div>
				</div>
				<nav class="pagination-bot" aria-label="Page navigation example">
				  <ul class="pagination">
				    <li class="page-item"><a class="page-link" href="#">Trước</a></li>
				    <li class="page-item"><a class="page-link" href="#">1</a></li>
				    <li class="page-item"><a class="page-link" href="#">2</a></li>
				    <li class="page-item"><a class="page-link" href="#">3</a></li>
				    <li class="page-item"><a class="page-link" href="#">Sau</a></li>
				  </ul>
				</nav>
				<!-- Card table -->
			</div>
			<!-- end container -->
		</div>
	</div>
</body>
</html>
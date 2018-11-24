<%@page import="java.util.ArrayList"%>
<%@page import="model.monhoc"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<script src="js/jquery321.js"></script>
	<link rel="stylesheet" type="text/css" href="css/questionmanage.css">
	<script src="js/mainframe.js"></script>
	<script src="jsf/viewquestion.js"></script>
	
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
								<select class="form-control" name="chonmon" id="chonmon" style="width: 90%" required>									
										<c:forEach items="${chonmon}" var="item">
											<option value="${item.mamon}">${item.tenmon}</option>
										</c:forEach>						
								</select>
					</div>
					<div class="col-sm-3">
						<label>Chọn loại </label><br>
								<select class="form-control" name="chonloai" id="chonloai" style="width: 90%" required>
									<option value="kho">Khó</option>
									<option value="trungbinh">Trung Bình</option>
									<option value="de">Dễ</option>
								</select>
					</div>
					<div class="col-sm-30">
						<label>Nhập câu hỏi: </label><br>
						<input type="text" name="search" id="search" style="height: 39px;width: 350px;"
						class="form-control">
					</div>
					<div class="col-sm-3">
						<button type="button" id="searchBut" style="width: 250px;margin-left: 40px;">tim kiem</button>
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
							
					        <table id="question_table" class="table table-bordered table-responsive-md table-striped text-center">
					        <caption id="question_table_cap">Trang 1</caption>
					        <thead>
						        <tr>
						          <th class="text-center">STT</th>
						          <th class="text-center">Mã câu hỏi</th>
						          <th class="text-center">Nội dung</th>
						          <th class="text-center">Đáp án</th>						       
						          <th class="text-center">Chức năng</th>
						        </tr>
						        </thead>
								<tbody>							
								</tbody>
					      </table>
					    </div>
					    
				  	</div>
				</div>
				<div class="col-sm-3" >
				<button type="button" id="backBut" style="width: 50px;margin-left: 40px;">A</button>		
				<button type="button" id="forwardBut" style="width: 50px;">B</button>
				</div>
				<!-- Card table -->
			</div>
			<!-- end container -->
		</div>
	</div>
</body>
</html>
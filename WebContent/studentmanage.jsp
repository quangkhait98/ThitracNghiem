<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head lang = "vi">
	<title>Thi trắc nghiệm</title>
	<meta charset = "UTF-8" />
	<!-- Bootstrap -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<!-- Latest compiled JavaScript -->
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/mainframe.css">
	<link rel="stylesheet" href="fontawesome/fontawesome-free-5.3.1-web/css/all.min.css">
	<link rel="stylesheet" href="css/studentmanage.css">
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/studentmanage.js" type="text/javascript"></script>
<script src="jsf/studentofclass.js"></script>

</head>
<body>		
	<div class="canvas">
		<div class="popup-remove">
								
		</div>

		<t:header>
		</t:header>
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
								<span>Quản lý thí sinh</span>
							</a>
						</li>
						<li class="sidebar-feature">
							<a href="#">
								<i class="fas fa-users"></i>
								<span>Quản lý lớp học</span>
							</a>
						</li>
						<li class="sidebar-feature">
							<a href="friend-list.html">
								<i class="fas fa-info"></i>
								<span>Thông tin cá nhân</span>
							</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="container-main">
			<div id="report_result">
				<c:import url="Success.jsp" />
				<c:import url="Errors.jsp" />
			</div>
				<div class="card">
				  	<div class="card-body">
					    <div id="table" class="table-editable">
					    <div class="row">
								<div class="col-50" style="margin-left: 50px;">
								<label >Chọn Lớp</label><br>
								<select class="form-control" name="chonlop" id="chonlop" style="width: 90%" required>									
										<c:forEach items="${chonlop}" var="item">
											<option value="${item.malop}">${item.tenlop}</option>
										</c:forEach>						
								</select>          
							</div>
							<div class="col-50" style="margin-left: 50px;">
								<label >Chọn sinh viên</label><br>
								<select class="form-control" name="chonsv" id="chonsv" style="width: 90%" >									
								<c:forEach items="${chonsv}" var="item" >
									<option value="${item.manguoidung}">${item.tennguoidung}</option>
									</c:forEach> 									
								</select>          
							</div>
							</div>
							 
							<span class="table-add float-right mb-3 mr-2">
						    	  <button class="btn" id="addst" >Popup</button>
						    </span>

					        <table id="testing_table" class="table table-bordered table-responsive-md table-striped text-center">
						     <thead>
						        <tr>
						          <th class="text-center">STT</th>
						          <th class="text-center">Mã sinh viên</th>
						          <th class="text-center">Họ và tên</th>
						          <th class="text-center">Thi </th>						         
						        </tr>
								</thead>	
						       <tbody>	
						       <% int i=1; %>
											<c:forEach items="${studenta}"  var="item" >
										<tr>
											<td><%= (i++) %></td>
											<td>${item.manguoidung}</td>	
											<td>${item.tennguoidung}</td>
											<td>
												<span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
											</td>
										</tr>
										</c:forEach>
								</tbody>
					      </table>
					    </div>
					    <!-- end idtable -->

					    <nav class="pagination-bot" aria-label="Page navigation example">
						  <ul class="pagination">
						    <li class="page-item"><a class="page-link" href="#">Trước</a></li>
						    <li class="page-item"><a class="page-link" href="#">1</a></li>
						    <li class="page-item"><a class="page-link" href="#">2</a></li>
						    <li class="page-item"><a class="page-link" href="#">3</a></li>
						    <li class="page-item"><a class="page-link" href="#">Sau</a></li>
						  </ul>
						</nav>
				  	</div>
				</div>
				<!-- Editable table -->
			</div>
			<!-- end container -->
		</div>
	</div>
</body>
</html>
 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head lang = "vi">
	<title>Thi trắc nghiệm</title>
	<meta charset = "UTF-8" />
	<!-- Bootstrap -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<!-- Latest compiled JavaScript -->
	
	<link rel="stylesheet" type="text/css" href="css/mainframe.css">

	<link rel="stylesheet" href="fontawesome/fontawesome-free-5.3.1-web/css/all.min.css">
	<link rel="stylesheet" href="css/classmanage.css">
	
	

	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/popper.min.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

	<script src="js/mainframe.js"></script>

	<script type="text/javascript">
		
	</script>
</head>
<body>		
	<div class="canvas">
		<div class="popup-remove">
								
		</div>

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
							<a href="studentmanage.jsp">
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
							<a href="#">
								<i class="fas fa-info"></i>
								<span>Thông tin cá nhân</span>
							</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="container-main">

				<div class="card">
				  	<div class="card-body">
					    <div id="table" class="table-editable">
							<span class="table-add float-right mb-3 mr-2">
						    	<a href="#" class="text-success">
						    		<i class="fa fa-plus fa-2x" aria-hidden="true"></i>
						        </a>
						    </span>

					        <table class="table table-bordered table-responsive-md table-striped text-center">
						        <tr>
						          <th class="text-center">Mã lớp</th>
						          <th class="text-center">Tên lớp</th>
						          <th class="text-center">Số lượng sinh viên</th>
						          <th class="text-center">Ngày bắt đầu</th>
						          <th class="text-center">Ngày kết thúc</th>
						          <th class="text-center">Chức năng</th>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">161101A</td>
						          <td class="pt-2-half" contenteditable="false">Toeic 1</td>
						          <td class="pt-2-half" contenteditable="false">59/60</td>
						          <td class="pt-1-half" contenteditable="false">20/10/2018</td>
						          <td class="pt-1-half" contenteditable="false">30/2/2019</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						           	  <span class="table-addstudent"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Thêm sinh viên</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">161101A</td>
						          <td class="pt-2-half" contenteditable="false">Toeic 1</td>
						          <td class="pt-2-half" contenteditable="false">59/60</td>
						          <td class="pt-1-half" contenteditable="false">20/10/2018</td>
						          <td class="pt-1-half" contenteditable="false">30/2/2019</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						           	  <span class="table-addstudent"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Thêm sinh viên</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">161101A</td>
						          <td class="pt-2-half" contenteditable="false">Toeic 1</td>
						          <td class="pt-2-half" contenteditable="false">59/60</td>
						          <td class="pt-1-half" contenteditable="false">20/10/2018</td>
						          <td class="pt-1-half" contenteditable="false">30/2/2019</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						           	  <span class="table-addstudent"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Thêm sinh viên</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">161101A</td>
						          <td class="pt-2-half" contenteditable="false">Toeic 1</td>
						          <td class="pt-2-half" contenteditable="false">59/60</td>
						          <td class="pt-1-half" contenteditable="false">20/10/2018</td>
						          <td class="pt-1-half" contenteditable="false">30/2/2019</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						           	  <span class="table-addstudent"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Thêm sinh viên</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">161101A</td>
						          <td class="pt-2-half" contenteditable="false">Toeic 1</td>
						          <td class="pt-2-half" contenteditable="false">59/60</td>
						          <td class="pt-1-half" contenteditable="false">20/10/2018</td>
						          <td class="pt-1-half" contenteditable="false">30/2/2019</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						           	  <span class="table-addstudent"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Thêm sinh viên</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">161101A</td>
						          <td class="pt-2-half" contenteditable="false">Toeic 1</td>
						          <td class="pt-2-half" contenteditable="false">59/60</td>
						          <td class="pt-1-half" contenteditable="false">20/10/2018</td>
						          <td class="pt-1-half" contenteditable="false">30/2/2019</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						           	  <span class="table-addstudent"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Thêm sinh viên</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">161101A</td>
						          <td class="pt-2-half" contenteditable="false">Toeic 1</td>
						          <td class="pt-2-half" contenteditable="false">59/60</td>
						          <td class="pt-1-half" contenteditable="false">20/10/2018</td>
						          <td class="pt-1-half" contenteditable="false">30/2/2019</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						           	  <span class="table-addstudent"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Thêm sinh viên</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">161101A</td>
						          <td class="pt-2-half" contenteditable="false">Toeic 1</td>
						          <td class="pt-2-half" contenteditable="false">59/60</td>
						          <td class="pt-1-half" contenteditable="false">20/10/2018</td>
						          <td class="pt-1-half" contenteditable="false">30/2/2019</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						           	  <span class="table-addstudent"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Thêm sinh viên</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">161101A</td>
						          <td class="pt-2-half" contenteditable="false">Toeic 1</td>
						          <td class="pt-2-half" contenteditable="false">59/60</td>
						          <td class="pt-1-half" contenteditable="false">20/10/2018</td>
						          <td class="pt-1-half" contenteditable="false">30/2/2019</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						           	  <span class="table-addstudent"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Thêm sinh viên</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">161101A</td>
						          <td class="pt-2-half" contenteditable="false">Toeic 1</td>
						          <td class="pt-2-half" contenteditable="false">59/60</td>
						          <td class="pt-1-half" contenteditable="false">20/10/2018</td>
						          <td class="pt-1-half" contenteditable="false">30/2/2019</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						           	  <span class="table-addstudent"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Thêm sinh viên</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">161101A</td>
						          <td class="pt-2-half" contenteditable="false">Toeic 1</td>
						          <td class="pt-2-half" contenteditable="false">59/60</td>
						          <td class="pt-1-half" contenteditable="false">20/10/2018</td>
						          <td class="pt-1-half" contenteditable="false">30/2/2019</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						           	  <span class="table-addstudent"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Thêm sinh viên</button></span>
						          </td>
						        </tr>

						        <tr>
						          <td class="pt-1-half" contenteditable="false">161101A</td>
						          <td class="pt-2-half" contenteditable="false">Toeic 1</td>
						          <td class="pt-2-half" contenteditable="false">59/60</td>
						          <td class="pt-1-half" contenteditable="false">20/10/2018</td>
						          <td class="pt-1-half" contenteditable="false">30/2/2019</td>
						          <td>
						          	  <span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
						           	  <span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
						           	  <span class="table-addstudent"><button type="button" class="btn btn-success btn-rounded btn-sm my-0">Thêm sinh viên</button></span>
						          </td>
						        </tr>
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
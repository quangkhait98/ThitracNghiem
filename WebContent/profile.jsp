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
	<link rel="stylesheet" href="css/profile.css">
	
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/mainframe.js"></script>

</head>
<body>		
	<div class="canvas">
		<div class="header">
			<div class="cover-header">
				<div class="software-name">
					<h3>LUYỆN THI TRẮC NGHIỆM</h3>
				</div>
				<div class="logo-inline"></div>
				
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
				<div class="container">
				    <div class="row">
				  		<div class="col-sm-3 left-profile"><!--left col-->
				  		    <div class="text-center"><h1>User name</h1></div>
					      	<div class="text-center">
						        <img src="http://ssl.gstatic.com/accounts/ui/avatar_2x.png" class="avatar img-circle img-thumbnail" alt="avatar">
						        <h6>Upload a different photo...</h6>
						        <input type="file" class="text-center center-block file-upload">
					      	</div>
				        </div><!--/col-3-->
					
				    	<div class="col-sm-9 right-profile">          
							<div class="tab-content">
			        			<form class="form" action="##" method="post" id="registrationForm">
			                      	<div class="form-group">			                          
			                         	 <div class="col-xs-6">
			                            	<label for="last_name"><h3>Họ và tên</h3></label>
			                              	<input type="text" class="form-control" name="last_name" id="last_name" placeholder="Nguyễn Văn A" title="Nhập vào tên của bạn">
			                          	 </div>
			                      	</div>
			          
			                     	<div class="form-group">				                          
			                          	<div class="col-xs-6">
			                              	<label for="phone"><h3>Số điện thoại</h3></label>
			                              	<input type="text" class="form-control" name="phone" id="phone" placeholder="09xxxxxxxx" title="enter your phone number if any.">
			                          	</div>
			                      	</div>
			                      	<div class="form-group">
			                          
			                          <div class="col-xs-6">
			                              <label for="email"><h3>Email</h3></label>
			                              <input type="email" class="form-control" name="email" id="email" placeholder="you@email.com" title="enter your email.">
			                          </div>
			                      	</div>
			                      	<div class="form-group">			                          
			                          <div class="col-xs-6">
			                              <label for="email"><h3>Tài khoản</h3></label>
			                              <input type="email" class="form-control" id="location" placeholder="hainguyenkt98" title="enter a location">
			                          </div>
			                      	</div>
			                      	<div class="form-group">
			                          
			                          <div class="col-xs-6">
			                              <label for="password"><h3>Password</h3></label>
			                              <input type="password" class="form-control" name="password" id="password" placeholder="**********" title="enter your password.">
			                          </div>
			                      	</div>
			                      	<div class="form-group">
			                           <div class="col-xs-12">
			                                <br>
			                              	<button class="btn btn-lg btn-success"> Lưu</button>
			                               	<button class="btn btn-lg" >Hủy</button>
			                            </div>
			                      	</div>
			              		</form>
				        	</div> <!-- tab-content -->
				    	</div><!--/col-9-->
					</div>	<!-- row -->			
				</div>
				<!-- end container -->
			</div>
		</div>
	</div>
</body>
</html>
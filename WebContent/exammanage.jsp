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
	<link rel="stylesheet" type="text/css" href="css/exam-manage.css">

	<link rel="stylesheet" href="fontawesome/fontawesome-free-5.3.1-web/css/all.min.css">
	<script src="js/jquery-3.3.1.min.js"></script>
	<script src="js/studentmanage.js"></script>

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
				<div class="sidebar-menu">
					<ul>
						<li class="sidebar-feature">
							<a href="find-friend.html">
								<i class="fas fa-file-signature"></i>
								<span>Ra đề</span>
							</a>
						</li>

						<li class="sidebar-feature">
							<a href="find-friend.html">
								<i class="fas fa-book"></i>
								<span>Quản lý đề</span>
							</a>
						</li>
						<li class="sidebar-feature">
							<a href="mainframe.html">
								<i class="fas fa-info"></i>
								<span>Thông tin cá nhân</span>
							</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="container-main">
				<div class="manager-form">
					<form action="/action_page.php">
						<div class="form-group">
							<div class="form-item">
								<label class="item-title">Ngày mở đề: </label>
								<select class="form-control">
									<option>1</option>
									<option>3</option>
									<option>6</option>
									<option>9</option>
									<option>12</option>
									<option>15</option>
									<option>18</option>
									<option>21</option>
									<option>24</option>
								</select>
								<label>h </label>
								<select class="form-control">
									<option>00</option>
									<option>15</option>
									<option>30</option>
									<option>45</option>
								</select>
								<select class="form-control">
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
									<option>6</option>
									<option>7</option>
									<option>8</option>
									<option>9</option>
									<option>10</option>
								</select>
								<select class="form-control">
									<option>Tháng 1</option>
									<option>Tháng 2</option>
									<option>Tháng 3</option>
									<option>Tháng 4</option>
								</select>
								<select class="form-control">
									<option>2015</option>
									<option>2016</option>
									<option>2017</option>
									<option>2018</option>
								</select>
							</div>
							<div class="form-item">
								<label class="item-title">Ngày đóng đề: </label>
								<select class="form-control">
									<option>1</option>
									<option>3</option>
									<option>6</option>
									<option>9</option>
									<option>12</option>
									<option>15</option>
									<option>18</option>
									<option>21</option>
									<option>24</option>
								</select>
								<label>h </label>
								<select class="form-control">
									<option>00</option>
									<option>15</option>
									<option>30</option>
									<option>45</option>
								</select>
								<select class="form-control">
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
									<option>6</option>
									<option>7</option>
									<option>8</option>
									<option>9</option>
									<option>10</option>
								</select>
								<select class="form-control">
									<option>Tháng 1</option>
									<option>Tháng 2</option>
									<option>Tháng 3</option>
									<option>Tháng 4</option>
								</select>
								<select class="form-control">
									<option>2015</option>
									<option>2016</option>
									<option>2017</option>
									<option>2018</option>
								</select>
							</div>
							<div class="form-item">
								<label class="item-title">Thời gian làm bài: </label>
								<select class="form-control">
									<option>1</option>
									<option>1</option>
									<option>20</option>
								</select>
								<label>h </label>
								<select class="form-control">
									<option>00</option>
									<option>15</option>
									<option>30</option>
									<option>45</option>
								</select>
							</div>
							<div class="form-item">
								<label class="item-title">Chọn lớp giao đề: </label>
								<select class="form-control">
									<option>Lớp Toán</option>
									<option>Lớp Lý</option>
									<option>Lớp Hóa</option>
									<option>Lớp Sinh</option>
								</select>
								<button type="submit" class="btn btn-primary">Thêm lớp</button>
							</div>
							<div class="form-item">
								<label class="item-title">Loại câu hỏi: </label>
								<select class="form-control" style="margin-right: 6px;">
									<option>Dễ</option>
									<option>Khó</option>
									<option>Cực khó</option>
									<option>Cực kỳ khó</option>
								</select>
								<label style="margin-right: 10px;">Số lượng: </label>
								<input type="text" class="form-control" style="width: 50px;">
								<button type="submit" class="btn btn-primary">Thêm câu hỏi</button>							
							</div>
							<div class="form-item">
								<ul class="list-group">
									<li class="list-group-item d-flex justify-content-between align-items-center">
										Khó
										<div>
										<span class="badge badge-primary badge-pill">25</span>
										<span class="btn badge badge-primary badge-pill"><i class="fas fa-times"></i></span>
										</div>
									</li>
									<li class="list-group-item d-flex justify-content-between align-items-center">
										Dễ
										<div>
										<span class="badge badge-primary badge-pill">50</span>
										<span class="btn badge badge-primary badge-pill"><i class="fas fa-times"></i></span>
										</div>
									</li>
									<li class="list-group-item d-flex justify-content-between align-items-center">
										Cực Dễ
										<div>
										<span class="badge badge-primary badge-pill">90</span>
										<span class="btn badge badge-primary badge-pill"><i class="fas fa-times"></i></span>
										</div>
									</li>
								</ul>
							</div>
						</div>
						<div class="review-btn">
							<button type="submit" class="btn btn-primary">Xem trước</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
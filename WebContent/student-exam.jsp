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
	<link rel="stylesheet" type="text/css" href="css/form-style.css">

	<link rel="stylesheet" href="fontawesome/fontawesome-free-5.3.1-web/css/all.min.css">
	<script src="js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/mainframe.js"></script>
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
<<<<<<< HEAD
							<a href="student-exam.jsp">
=======
							<a href="find-friend.html">
>>>>>>> parent of 660be74... Merge branch 'master' of https://github.com/quangkhait98/thitracnghiem
								<i class="fas fa-book-open"></i>
								<span>Xem các bài kiểm tra</span>
							</a>
						</li>
						<li class="sidebar-feature">
							<a href="mainframe.html">
								<i class="fas fa-star-half-alt"></i>
								<span>Xem điểm kiểm tra</span>
							</a>
						</li>
<<<<<<< HEAD
=======
						<li class="sidebar-feature">
							<a href="friend-list.html">
								<i class="fas fa-info"></i>
								<span>Thông tin cá nhân</span>
							</a>
						</li>
>>>>>>> parent of 660be74... Merge branch 'master' of https://github.com/quangkhait98/thitracnghiem
					</ul>
				</div>
			</div>
			<div class="container-main">
				<div id="accordion" class="exam-list">
					<div class="card">
						<div class="card-header">
							<a class="card-link" data-toggle="collapse" href="#collapseOne">
								Môn Toán
							</a>
						</div>
						<div id="collapseOne" class="collapse">
							<div class="list-group list-group-flush exams">
								<a href="#" class="list-group-item list-group-item-action">Toán A1</a>
								<a href="#" class="list-group-item list-group-item-action">Toán A2</a>
								<a href="#" class="list-group-item list-group-item-action">Toán A3</a>
							</div>
						</div>
					</div>
					<div class="card">
						<div class="card-header">
							<a class="collapsed card-link" data-toggle="collapse" href="#collapseTwo">
								Môn Lý
							</a>
						</div>
						<div id="collapseTwo" class="collapse">
							<div class="list-group list-group-flush exams">
								<a href="#" class="list-group-item list-group-item-action">Vật lý đại cương 1</a>
								<a href="#" class="list-group-item list-group-item-action">Vật lý đại cương 2</a>
								<a href="#" class="list-group-item list-group-item-action">Thí nghiệm vật lý</a>
							</div>
						</div>
					</div>
					<div class="card">
						<div class="card-header">
							<a class="collapsed card-link" data-toggle="collapse" href="#collapseThree">
								Môn Anh Văn
							</a>
						</div>
						<div id="collapseThree" class="collapse">
							<div class="list-group list-group-flush exams">
								<a href="studentview.jsp" class="list-group-item list-group-item-action">Anh văn 1</a>
								<a href="#" class="list-group-item list-group-item-action">Anh văn 2</a>
								<a href="#" class="list-group-item list-group-item-action">Anh văn 3</a>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
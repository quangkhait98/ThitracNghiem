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
	<link rel="stylesheet" type="text/css" href="css/form-style.css">

	<link rel="stylesheet" href="fontawesome/fontawesome-free-5.3.1-web/css/all.min.css">
	<script src="js/jquery-3.3.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/mainframe.js"></script>
	<link rel="stylesheet" href="fullcalendar/fullcalendar.css" />
  <script src="fullcalendar/lib/jquery.min.js"></script>
  <script src="fullcalendar/lib/moment.min.js"></script>
  <script src="fullcalendar/fullcalendar.js"></script>
  <script src='fullcalendar/lang/es.js'></script>
	<script src="jsf/calendarjs.js"></script>
	<script src="jsf/homepage.js"></script>
	<script src='fullcalendar/locale/vi.js'></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"> </script>
	 <style type="text/css">
	 #calendar {
 width: 80%;
 display: block;
 margin-left: auto;
 margin-right: auto;
}
.fc-toolbar .fc-left {
    float: left;
    margin: auto;
    margin-left: 30%;
    }
.fc-toolbar .fc-right {
    float: left;
    margin-left: 10%;
}
.centered {
 text-align: center;
 }
 .modal-header {
    margin: auto;
    background-color: deepskyblue;
    width: 100%;
 }
 .modal-title{
 margin-left: 39%;
 }
 .modal-body {
 text-align: center;
 }
	 </style>
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
							<a href="find-friend.html">
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
				<div id="accordion" class="exam-list">
				 <div class="col-sm-5" style="float:left;margin-left: 5%;margin-top: 5%;">
					<c:forEach items="${lophoc}"  var="item" >
					<div class="card">
						<div class="card-header">
							<a class="card-link" data-toggle="collapse" href="#collapseOne">
								${item.tenlop}
							</a>
						</div>
						<c:forEach  items="${dethi}"  var="itema">
						<c:if test="${item.malop==itema.malop }">
						<div id="collapseOne" class="collapse">
							<div class="list-group list-group-flush exams">
								<a href="#" class="list-group-item list-group-item-action" id="lop">${itema.tenbode} 	
								<input type="hidden" id="maLop" value="${itema.malop}" />
								<input type="hidden" id="tenLop" value="${itema.tenlop}" />
								<input type="hidden" id="mabode" value="${itema.mabode}" />
								<input type="hidden" id="tenbode" value="${itema.tenbode}" />				
								<input type="hidden" id="tgbd" value="${itema.thoigianbatdau}" />
								<input type="hidden" id="tgkt" value="${itema.thoigianketthuc}" />
								<input type="hidden" id="tglb" value="${itema.thoigianlambai}" />
								</a>
							</div>
						</div>
						</c:if>
						</c:forEach>
					</div>
					</c:forEach>
							
					</div>
					<div class="col-sm-6" style="float: right;margin-right: 0%; margin-top: 5%;">
					<div  id="calendar"></div>
					
					</div>
				</div>
			</div>
		</div>
	</div>
</body>

<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Bài kiểm tra</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <form action="testf" method="POST">
      <div class="modal-body">
	      <h5 class="lop">Lớp : </h5>
		  <hr>
		  <h5 class="tenbaithi">Tên bài thi : </h5>
		  <hr>
		  <h5 class="thoigianbatdau">Thời gian bắt đầu : </h5>
		  <hr>
		  <h5 class="thoigianketthuc">Thời gian kêt thúc : </h5>
		  <hr>
		  <h5 class="thoigianlambai">Thời gian làm bài : </h5>
		  <input type="hidden" id="mabd" name="mabd">
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal" >Hủy</button>
        <input type="submit" class="btn btn-primary" id="" value="Thi">
      </div>
      </form>
    </div>
  </div>
</div>
</html>


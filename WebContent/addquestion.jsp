<%@page import="java.util.ArrayList"%>
<%@page import="model.monhoc"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Thi trắc nghiệm</title>
	<meta charset = "UTF-8" />
	<!-- Bootstrap -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<!-- Latest compiled JavaScript -->
	<script src="js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/mainframe.css">
	<link rel="stylesheet" href="fontawesome/fontawesome-free-5.3.1-web/css/all.min.css">
	<script src="js/jquery-3.3.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/addquestion.css">
	<script src="js/mainframe.js"></script>
	<script type="text/javascript">
</script>
</head>
<body>	
<%

String err="";
if(request.getAttribute("err")!=null)
{
    err=(String) request.getAttribute("err"); 
}
%>
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
							<a href="#">
								<i class="fas fa-users"></i>
								<span>Thêm câu hỏi</span>
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
			<p style="color:red"><%=err  %></p>
				<div class="row main col-sm-12">
					<div class="col-sm-2"></div>
					<div class="col-sm-8 ">
						<form action="AddQuestion" method="POST" >
							<div class="row">
								<div class="col-50">
								<label >Chọn môn</label><br>
								<select class="form-control" name="chonmon" id="chonmon" style="width: 90%" required>									
										<c:forEach items="${chonmon}" var="item">
											<option value="${item.mamon}">${item.tenmon}</option>
										</c:forEach>						
								</select>
							</div>
							<div class="col-50">
								<label>Chọn loại </label><br>
								<select class="form-control" name="chonloai" id="chonloai" style="width: 90%" required>
									<option value="kho">Khó</option>
									<option value="trungbinh">Trung Bình</option>
									<option value="de">Dễ</option>
								</select>
							</div>
							</div>
							<div class="row">
								<div class="col-100">
									<label>Nhập câu hỏi</label><br>
									<textarea class="form-control" name="cauhoi" rows="4" id="cauhoi" style="max-width: 95%"></textarea>
								</div>		
							</div>
							<div class="row">
								<div class="col-50">
									<label>Câu trả lời A</label><br>
									<textarea class="form-control" name="dapan1" rows="2" id="dapan1" style="width:90%;"></textarea>
								</div>
								<div class="col-50">
									<label>Câu trả lời B</label><br>
									<textarea class="form-control" name="dapan2" rows="2" id="dapan2"style="width:90%;"></textarea>
								</div>
								<div class="col-50">
									<label>Câu trả lời C</label><br>
									<textarea class="form-control" name="dapan3" rows="2" id="dapan3"style="width:90%;"></textarea>
								</div>
								<div class="col-50">
									<label>Câu trả lời D</label><br>
									<textarea class="form-control" name="dapan4" rows="2" id="dapan4"style="width:90%;"></textarea>
								</div>
								<div class="col-100"><label>đáp án đúng </label><br>
								<select class="form-control" name="dapandung" style="width: 20%;display: inline;"  id="dapandung">
									<option value="1">A</option>
									<option value="2">B</option>
									<option value="3">C</option>
									<option value="4">D</option>
								</select>
									<button type="submit" class="btn btn-info " id="addquestion" style="margin-left: 17%;width: 20%;margin-top: 2px">Thêm</button>
									
								</div>
							</div>
						</form>
					</div>
					<div class="col-sm-2"></div>	
				 </div>

				 <hr>
				 <div class="row addfile-mode"><h2>Thêm bằng file excel</h2> </div>
				 <div class="row main col-sm-12">
				 	<div class="col-sm-1"></div>
					<div class="col-sm-10 ">
						<form action="AddQuestionFromExcel" method="POST" enctype="multipart/form-data" >
							<div class="row">
								<div class="col-sm-4" >
									<input type="file" name="fileexcel" style="margin-top: 7px;">
								</div>
								<div class="col-sm-8" >
									<button type="submit" name="addexcel" class="btn btn-info btn-block" id="add" >Thêm</button>
								</div>
							</div>
						</form>
					</div>
					<div class="col-sm-1"></div>
				 </div>
			</div>
		</div>
	</div>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head lang="vi">
<title>Thi trắc nghiệm</title>
<meta charset="UTF-8" />
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Latest compiled JavaScript -->

<link rel="stylesheet" type="text/css" href="css/mainframe.css">

<link rel="stylesheet"
	href="fontawesome/fontawesome-free-5.3.1-web/css/all.min.css">
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
		<div class="popup-remove"></div>

		<t:header>
		</t:header>
		<div class="body">
			<div class="sidebar">
				<div class="sidebar-header">
					<p>MENU</p>
				</div>
				<div class="sidebar-menu">
					<ul>
						<li class="sidebar-feature"><a href="studentmanage.jsp">
								<i class="fas fa-user-graduate"></i> <span>Quản lý thí
									sinh</span>
						</a></li>
						<li class="sidebar-feature"><a href="#"> <i
								class="fas fa-users"></i> <span>Quản lý lớp học</span>
						</a></li>
					</ul>
				</div>
			</div>
			<div class="container-main">

				<div class="card">
					<div class="card-body">
						<div class="form-item">
							<label class="item-title">Tên Lớp: </label> <input type="text"
								class="form-control" name="tenlop" required />
						</div>
						<div id="table" class="table-editable">
							<span class="table-add float-right mb-3 mr-2"> <a href="#"
								class="text-success"> <i class="fa fa-plus fa-2x"
									aria-hidden="true"></i>
							</a>
							</span>

							<table
								class="table table-bordered table-responsive-md table-striped text-center">
								<tr>
									<th class="text-center">Mã lớp</th>
									<th class="text-center">Tên lớp</th>
									<th class="text-center">Chức năng</th>
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
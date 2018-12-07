<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html>
<head lang="vi">
<title>Thi trắc nghiệm</title>
<meta charset="UTF-8" />
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Latest compiled JavaScript -->
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/mainframe.css">
<link rel="stylesheet" type="text/css" href="css/form-style.css">

<link rel="stylesheet"
	href="fontawesome/fontawesome-free-5.3.1-web/css/all.min.css">
<script src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="js/timer.js"></script>
<script type="text/javascript" src="js/exam.js"></script>
<script type="text/javascript" src="js/mainframe.js"></script>
<script src="js/exammanage.js" charset="UTF-8"></script>
</head>
<body>
	<div class="canvas">
		<t:header>
		</t:header>
		<div class="body">
			<a href="javascript:void(0);" class="icon" id="menubtn"> <i
				class="fa fa-bars"></i>
			</a>
			<div class="sidebar" id="mySidebar">
				<div class="sidebar-header">
					<p>MENU</p>
				</div>
				<div class="sidebar-menu">
					<ul>
						<li class="sidebar-feature"><a href="find-friend.html"> <i
								class="fas fa-file-signature"></i> <span>Ra đề</span>
						</a></li>
						<li class="sidebar-feature"><a href="find-friend.html"> <i
								class="fas fa-book"></i> <span>Quản lý đề</span>
						</a></li>
					</ul>
				</div>
			</div>
			<div class="container-main" id="myContainer">
				<form id="form_online_test" class="online-test">
					<ol class="questions" id="questions-table">
						<c:import url="questionlist.jsp" />
					</ol>
					<div class="submit">
						<button type="button" class="btn" id="abc">Prev</button>
						<button type="button" class="btn" id="xyz">Next</button>
						<button type="button" class="btn" id="def">Save</button>
						<button type="button" class="btn" id="jkl">Cancel</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>
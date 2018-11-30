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
				<form id="form_online_test" class="online-test" method="post"
					action="#">
					<ol class="questions">
						<c:forEach items = "${question}" var = "i">
							<li class="question" id="question${i}"><label
							class="questionLabel" id="question_2_${i}" for="question_${i}">${i + 1}.
								${i.noidung}</label>
							<div class="answerSet">
								<span> <input id="question_${i}_1" name="question_${i}"
									class="element radio" type="radio" value="1"> <label
									class="choice" id="question_3_${i}" for="question_${i}_1">${i.dapan1}</label>
								</span> <span> <input id="questioni_${i}_2" name="question_${i}"
									class="element radio" type="radio" value="2"> <label
									class="choice" id="question_4_${i}" for="question_${i}_2">${i.dapan2}</label>
								</span> <span> <input id="questioni_${i}_3" name="question_${i}"
									class="element radio" type="radio" value="3"> <label
									class="choice" id="question_5_${i}" for="question_${i}_3">${i.dapan3}</label>
								</span> <span> <input id="questioni_${i}_4" name="question_${i}"
									class="element radio" type="radio" value="4"> <label
									class="choice" id="question_6_${i}" for="question_${i}_4">${i.dapan4}</label>
								</span>
							</div></li> <br/>
						</c:forEach>						
					</ol>
					<div class="submit">
						<button type="submit" class="btn">Basic</button>
					</div>
				</form>
				<div class="indexer" style="display: inline-grid;">
					<div id="clock">09:00:00</div>
					<ul class="list-inline question-index">
						<li class="question-num list-inline-item" id="question-1"><a
							class="question-link" href="#">1</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
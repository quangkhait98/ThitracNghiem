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
<script>
	<script type="text/javascript">
	function myFunction() {
		var x = document.getElementById("mySidebar");
		if (x.className === "sidebar") {
			x.className += " responsive";
		} else {
			x.className = "sidebar";
		}
		var y = document.getElementById("myContainer");
		if (y.className === "container-main") {
			y.className += " responsive";
		} else {
			y.className = "container-main";
		}
	}
</script>
</head>
<body>
	<div class="canvas">
		<t:header>
		</t:header>
		<div class="body">
			<a href="javascript:void(0);" class="icon" onclick="myFunction()">
				<i class="fa fa-bars"></i>
			</a>
			<div class="sidebar" id="mySidebar">
				<div class="sidebar-header">
					<p>MENU</p>
				</div>
				<div class="sidebar-menu">
					<ul>
						<li class="sidebar-feature"><a href="find-friend.html"> <i
								class="fas fa-book-open"></i> <span>Xem các bài kiểm tra</span>
						</a></li>
						<li class="sidebar-feature"><a href="mainframe.html"> <i
								class="fas fa-star-half-alt"></i> <span>Xem điểm kiểm tra</span>
						</a></li>
					</ul>
				</div>
			</div>
			<div class="container-main">
				<form id="form_online_test" class="online-test" method="post"
					action="#">
					<ol class="questions">
						<li class="question" id="question0"><label
							class="questionLabel" id="question_2_0" for="question_0">1.
								Jenny ___________ tired.</label>
							<div class="answerSet">
								<span> <input id="questioni_0_1" name="question_0"
									class="element radio" type="radio" value="1"> <label
									class="choice" id="question_3_0" for="question_0_1">be</label>
								</span> <span> <input id="questioni_0_2" name="question_0"
									class="element radio" type="radio" value="2"> <label
									class="choice" id="question_4_0" for="question_0_2">is</label>
								</span> <span> <input id="questioni_0_3" name="question_0"
									class="element radio" type="radio" value="3"> <label
									class="choice" id="question_5_0" for="question_0_3">has</label>
								</span> <span> <input id="questioni_0_4" name="question_0"
									class="element radio" type="radio" value="4"> <label
									class="choice" id="question_6_0" for="question_0_4">have</label>
								</span>
							</div></li>
						<li class="question" id="question1"><label
							class="questionLabel" id="question_2_1" for="question_1">2.
								" ___________ is she?" "She's my friend from London"</label>
							<div class="answerSet">
								<span> <input id="questioni_1_1" name="question_1"
									class="element radio" type="radio" value="1"> <label
									class="choice" id="question_3_1" for="question_1_1">Who</label>
								</span> <span> <input id="questioni_1_2" name="question_1"
									class="element radio" type="radio" value="2"> <label
									class="choice" id="question_4_1" for="question_1_2">Why</label>
								</span> <span> <input id="questioni_1_3" name="question_1"
									class="element radio" type="radio" value="3"> <label
									class="choice" id="question_5_1" for="question_1_3">Which</label>
								</span> <span> <input id="questioni_1_4" name="question_1"
									class="element radio" type="radio" value="4"> <label
									class="choice" id="question_6_1" for="question_1_4">What</label>
								</span>
							</div></li>
						<li class="question" id="question2"><label
							class="questionLabel" id="question_2_2" for="question_2">3.
								Today is Wednesday. Yesterday it ___________ Tuesday.</label>
							<div class="answerSet">
								<span> <input id="questioni_2_1" name="question_2"
									class="element radio" type="radio" value="1"> <label
									class="choice" id="question_3_2" for="question_2_1">were</label>
								</span> <span> <input id="questioni_2_2" name="question_2"
									class="element radio" type="radio" value="2"> <label
									class="choice" id="question_4_2" for="question_2_2">is</label>
								</span> <span> <input id="questioni_2_3" name="question_2"
									class="element radio" type="radio" value="3"> <label
									class="choice" id="question_5_2" for="question_2_3">be</label>
								</span> <span> <input id="questioni_2_4" name="question_2"
									class="element radio" type="radio" value="4"> <label
									class="choice" id="question_6_2" for="question_2_4">was</label>
								</span>
							</div></li>
						<li class="question" id="question3"><label
							class="questionLabel" id="question_2_3" for="question_3">4.
								It's Thursday today. Tomorrow it ___________ Friday.</label>
							<div class="answerSet">
								<span> <input id="questioni_3_1" name="question_3"
									class="element radio" type="radio" value="1"> <label
									class="choice" id="question_3_3" for="question_3_1">be</label>
								</span> <span> <input id="questioni_3_2" name="question_3"
									class="element radio" type="radio" value="2"> <label
									class="choice" id="question_4_3" for="question_3_2">was</label>
								</span> <span> <input id="questioni_3_3" name="question_3"
									class="element radio" type="radio" value="3"> <label
									class="choice" id="question_5_3" for="question_3_3">will
										be</label>
								</span> <span> <input id="questioni_3_4" name="question_3"
									class="element radio" type="radio" value="4"> <label
									class="choice" id="question_6_3" for="question_3_4">will</label>
								</span>
							</div></li>
						<li class="question" id="question4"><label
							class="questionLabel" id="question_2_4" for="question_4">5.
								___________ lots of animals in the zoo.</label>
							<div class="answerSet">
								<span> <input id="questioni_4_1" name="question_4"
									class="element radio" type="radio" value="1"> <label
									class="choice" id="question_3_4" for="question_4_1">There</label>
								</span> <span> <input id="questioni_4_2" name="question_4"
									class="element radio" type="radio" value="2"> <label
									class="choice" id="question_4_4" for="question_4_2">There
										is</label>
								</span> <span> <input id="questioni_4_3" name="question_4"
									class="element radio" type="radio" value="3"> <label
									class="choice" id="question_5_4" for="question_4_3">There
										are</label>
								</span> <span> <input id="questioni_4_4" name="question_4"
									class="element radio" type="radio" value="4"> <label
									class="choice" id="question_6_4" for="question_4_4">There
										aren't</label>
								</span>
							</div></li>
						<li class="question" id="question5"><label
							class="questionLabel" id="question_2_5" for="question_5">6.
								How many people ___________ in your family?</label>
							<div class="answerSet">
								<span> <input id="questioni_5_1" name="question_5"
									class="element radio" type="radio" value="1"> <label
									class="choice" id="question_3_5" for="question_5_1">are
										there</label>
								</span> <span> <input id="questioni_5_2" name="question_5"
									class="element radio" type="radio" value="2"> <label
									class="choice" id="question_4_5" for="question_5_2">is
										there</label>
								</span> <span> <input id="questioni_5_3" name="question_5"
									class="element radio" type="radio" value="3"> <label
									class="choice" id="question_5_5" for="question_5_3">there
										are</label>
								</span> <span> <input id="questioni_5_4" name="question_5"
									class="element radio" type="radio" value="4"> <label
									class="choice" id="question_6_5" for="question_5_4">there</label>
								</span>
							</div></li>
						<li class="question" id="question6"><label
							class="questionLabel" id="question_2_6" for="question_6">7.
								"Has Steve got a sister?" "No, he ___________, but he's got 2
								brothers."</label>
							<div class="answerSet">
								<span> <input id="questioni_6_1" name="question_6"
									class="element radio" type="radio" value="1"> <label
									class="choice" id="question_3_6" for="question_6_1">has</label>
								</span> <span> <input id="questioni_6_2" name="question_6"
									class="element radio" type="radio" value="2"> <label
									class="choice" id="question_4_6" for="question_6_2">hasn't</label>
								</span> <span> <input id="questioni_6_3" name="question_6"
									class="element radio" type="radio" value="3"> <label
									class="choice" id="question_5_6" for="question_6_3">haven't</label>
								</span> <span> <input id="questioni_6_4" name="question_6"
									class="element radio" type="radio" value="4"> <label
									class="choice" id="question_6_6" for="question_6_4">not</label>
								</span>
							</div></li>
						<li class="question" id="question7"><label
							class="questionLabel" id="question_2_7" for="question_7">8.
								Where ___________ Sarah live?</label>
							<div class="answerSet">
								<span> <input id="questioni_7_1" name="question_7"
									class="element radio" type="radio" value="1"> <label
									class="choice" id="question_3_7" for="question_7_1">are</label>
								</span> <span> <input id="questioni_7_2" name="question_7"
									class="element radio" type="radio" value="2"> <label
									class="choice" id="question_4_7" for="question_7_2">is</label>
								</span> <span> <input id="questioni_7_3" name="question_7"
									class="element radio" type="radio" value="3"> <label
									class="choice" id="question_5_7" for="question_7_3">do</label>
								</span> <span> <input id="questioni_7_4" name="question_7"
									class="element radio" type="radio" value="4"> <label
									class="choice" id="question_6_7" for="question_7_4">does</label>
								</span>
							</div></li>
						<li class="question" id="question8"><label
							class="questionLabel" id="question_2_8" for="question_8">9.
								___________ to London on the train yesterday?</label>
							<div class="answerSet">
								<span> <input id="questioni_8_1" name="question_8"
									class="element radio" type="radio" value="1"> <label
									class="choice" id="question_3_8" for="question_8_1">Did
										Mary went</label>
								</span> <span> <input id="questioni_8_2" name="question_8"
									class="element radio" type="radio" value="2"> <label
									class="choice" id="question_4_8" for="question_8_2">Did
										Mary go</label>
								</span> <span> <input id="questioni_8_3" name="question_8"
									class="element radio" type="radio" value="3"> <label
									class="choice" id="question_5_8" for="question_8_3">Mary
										go</label>
								</span> <span> <input id="questioni_8_4" name="question_8"
									class="element radio" type="radio" value="4"> <label
									class="choice" id="question_6_8" for="question_8_4">Mary
										goes</label>
								</span>
							</div></li>
						<li class="question" id="question9"><label
							class="questionLabel" id="question_2_9" for="question_9">10.
								Jack ___________ English, Spanish and a bit of French.</label>
							<div class="answerSet">
								<span> <input id="questioni_9_1" name="question_9"
									class="element radio" type="radio" value="1"> <label
									class="choice" id="question_3_9" for="question_9_1">speaks</label>
								</span> <span> <input id="questioni_9_2" name="question_9"
									class="element radio" type="radio" value="2"> <label
									class="choice" id="question_4_9" for="question_9_2">speak</label>
								</span> <span> <input id="questioni_9_3" name="question_9"
									class="element radio" type="radio" value="3"> <label
									class="choice" id="question_5_9" for="question_9_3">speaking</label>
								</span> <span> <input id="questioni_9_4" name="question_9"
									class="element radio" type="radio" value="4"> <label
									class="choice" id="question_6_9" for="question_9_4">is
										speaking</label>
								</span>
							</div></li>
					</ol>
					<div class="submit">
						<button type="submit" class="btn">Basic</button>
					</div>
					<ul class="pagination justify-content-center">
						<li class="page-item"><a class="page-link" href="#">Previous</a></li>
						<li class="page-item active"><a class="page-link" href="#">1</a></li>
						<li class="page-item"><a class="page-link" href="#">2</a></li>
						<li class="page-item"><a class="page-link" href="#">3</a></li>
						<li class="page-item"><a class="page-link" href="#">Next</a></li>
					</ul>
				</form>
				<div class="indexer" style="display: inline-grid;">
					<div id="clock">
						<div id="hours">9</div>
						:
						<div id="minutes">00</div>
						:
						<div id="seconds">00</div>
					</div>
					<ul class="list-inline question-index">
						<li class="question-num list-inline-item"><a
							class="question-link" href="#">1</a></li>
						<li class="question-num list-inline-item"><a
							class="question-link" href="#">2</a></li>
						<li class="question-num list-inline-item"><a
							class="question-link" href="#">3</a></li>
						<li class="question-num list-inline-item"><a
							class="question-link" href="#">4</a></li>
						<li class="question-num list-inline-item"><a
							class="question-link" href="#question9">25</a></li>
						<li class="question-num list-inline-item"><a
							class="question-link" href="#question9">62</a></li>
						<li class="question-num list-inline-item"><a
							class="question-link" href="#question9">72</a></li>
						<li class="question-num list-inline-item"><a
							class="question-link" href="#question9">82</a></li>
						<li class="question-num list-inline-item"><a
							class="question-link" href="#question9">9</a></li>
						<li class="question-num list-inline-item"><a
							class="question-link" href="#">10</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
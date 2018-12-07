<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags"%>

<div class="row">
	<div class="col-sm-3"></div>
	<div class="col-sm-6">
		<div class="body-function">
			<div class="socaudung">
				<h4 class="socaudung-title">Số câu đúng : ${soCauDung}/${soCau}</h4>
			</div>

			<div class="diem">
				<h4 class="diem-title">Điểm : ${diem}/10</h4>
			</div>

			<div class="thoigianlambai">
				<h4 class="thoigianlambai-title">Thời gian làm bài : 40 phút</h4>
			</div>
			<div class="thoigiannop">
				<h4 class="thoigiannop-title">Thời gian hoàn thành : 22/2/2018</h4>
			</div>
			<div class="row">
				<div class="col-sm-5"></div>
				<div class="col-sm-2">
					<button type="button" class="btn btn-primary">Quay về</button>
				</div>
				<div class="col-sm-5"></div>
			</div>
		</div>
		<div class="col-sm-3"></div>
	</div>
</div>
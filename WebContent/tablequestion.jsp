<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<c:set var="count" value="${question.size()-1}" />
	<c:forEach var="i" begin="0" step="1" end="${count}">
		<tr>
			<td>${i+1}</td>
			<td>${question[i].macauhoi}</td>
			<td>${question[i].noidung}</td>
			<td>${question[i].dapandung}</td>
			<td>
				<span class="table-edit"><button type="button" class="btn btn-primary btn-rounded btn-sm my-0">Sửa</button></span>
				<span class="table-remove"><button type="button" class="btn btn-danger btn-rounded btn-sm my-0">Xóa</button></span>
			</td>
		</tr>
	</c:forEach>
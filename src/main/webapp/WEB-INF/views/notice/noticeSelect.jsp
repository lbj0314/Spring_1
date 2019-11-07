<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>\
<c:import url="../layout/bootStrap.jsp" />
</head>
<body>
<c:import url="../layout/nav.jsp" />
	<h1>Notice Select Page</h1>
	<div class="container">
	<table class="table">
			
			<tr>
			<th>NUM</th>
			<th width="60%">TITLE</th>
			<th>WRITER</th>
			<th>DATE</th>
			<th>HIT</th>
			</tr>
		
			<tr>
					<td>${ requestScope.dto.num } </td>
					<td>${ requestScope.dto.title }</td>
					<td>${ requestScope.dto.writer}</td>
					<td>${ requestScope.dto.reg_date }</td>
					<td>${ requestScope.dto.hit } </td>
				</tr>
			
	</table>
	<div>
		<textarea rows="30" cols="154" readonly="readonly">${ requestScope.dto.contents } </textarea>
	</div>
		<div>
	<%-- <%if(memberDTO !=null && memberDTO.getId().equals(noticeDTO.getWriter()) ){ %>
			<a href="./noticeUpdate.jsp?num=<%= noticeDTO.getNum() %>" class="btn btn-danger">Update</a>
			<a href="./noticeDeleteResult.jsp?num=<%= noticeDTO.getNum() %>" class="btn btn-primary">Delete</a>
		<% }%> --%>
			<a href="./noticeList" class="btn btn-primary">List</a>
		</div>
	</div>
</body>
</html>
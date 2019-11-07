<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootStrap.jsp" />
</head>
<body>
	<c:import url="../layout/nav.jsp" />
	<h1>Notice List Page</h1>
	<div class="container">
		<table class="table ">

			<tr>
				<th>NUM</th>
				<th width="60%">TITLE</th>
				<th>WRITER</th>
				<th>DATE</th>
				<th>HIT</th>
			</tr>

			<c:forEach items="${requestScope.list}" var="dto">
				<tr>
					<td>${ pageScope.dto.num }</td>
					<td><a href="noticeSelect?num=${ pageScope.dto.num }">${ pageScope.dto.title }</a></td>
					<td>${ pageScope.dto.writer }</td>
					<td>${ pageScope.dto.reg_date }</td>
					<td>${ pageScope.dto.hit }</td>
				</tr>
			</c:forEach>
		</table>
		<div>
				<c:forEach begin="1" end="10" var="i">
					${ pageScope.i } | ${st.last }
				</c:forEach>
			</div>
		<!-- session member, memberDTO -->
		<c:if test="${ empty sessionScope.member  }">
			<button type="button" class="btn btn-info" id="btn_write">WRITE</button>
		</c:if>
	</div>
<script type="text/javascript">
	$("#btn_write").click(function() {
		location.href = "noticeWrite";
	});
</script>
</body>
</html>
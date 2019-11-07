<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
int result = 1;
	String msg = "Join Success";
if(result > 0){
	response.sendRedirect("../");	
	}else{
	msg = "Join Fail";		
	request.setAttribute("msg", msg);
	request.setAttribute("path", "../");
	RequestDispatcher view = request.getRequestDispatcher("../common/common_result.jsp");
	view.forward(request, response);
	}


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../layout/bootStrap.jsp" />
</head>
<body>
<c:import url="../layout/nav.jsp" />
<form action="../home.jsp" method="post">
	<h1>member Join Page</h1>
	<h1>${ id }</h1>
	<h1>${ pw }</h1>
	<h1>${ name }</h1>
	<h1>${ phone }</h1>
	<h1>${ email }</h1>
	<input type="submit" id="btn" value="Complete">
	</form>
</body>
</html>
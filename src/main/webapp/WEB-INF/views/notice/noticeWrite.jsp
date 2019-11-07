<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 쓰기</title>
<c:import url="../layout/bootStrap.jsp" />
</head>
<body>
<c:import url="../layout/nav.jsp" />
	
	<div class="container">
  <h2>공지사항 쓰기</h2>
  <form action="./noticeList" method=get>
    <div class="form-group">
      <label for="title">Title </label>
      <input type="text" class="form-control" id="title" placeholder="Enter Title" name="title">
   
    <%-- <input type="text" class="form-control" id="writer" name="writer" value="<%= memberDTO.getId() %>" readonly="readonly"> --%>
    <input type="text" class="form-control" id="writer" placeholder="Enter Writer" name="writer">
    </div>
    	<textarea rows="30" cols="154" id="contents" placeholder="Enter Contents" name="contents"></textarea>
    
    <button type="submit" class="btn btn-default">완료</button>
    &nbsp;<input type="reset" class="btn" value="취소" id="cancel">
    </form>
    </div>
</body>
</html>
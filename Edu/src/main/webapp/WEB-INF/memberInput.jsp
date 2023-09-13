<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
	<h3>회원가입</h3>
	<form action="memberProc.jsp" method ="post">
		ID : <input type ="text" name ="id"><br> 
		PW : <input type ="password" name ="psswd"><br> 
		NM : <input type ="text" name ="name"><br> 
		Email : <input type ="text" name ="mail"><br> 
		<input type ="submit" value ="가입">
	</form>
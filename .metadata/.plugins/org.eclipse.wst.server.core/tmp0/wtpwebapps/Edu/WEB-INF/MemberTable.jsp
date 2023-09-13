<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import = "java.sql.*" %>
<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ptm", "scott", "tiger");
	Statement stmt = con.createStatement();
	String sql = "create table edumember2(id varchar2(10) primary key, passwd varchar2(10), name varchar2(10), mail varchar2(20) )";
	stmt.executeUpdate(sql);
	out.print("member 테이블이 생성되었습니다");
	stmt.close();
	con.close();
%>
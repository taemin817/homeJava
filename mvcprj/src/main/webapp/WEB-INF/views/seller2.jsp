<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="Seller.*"%>
<%@ page import="Page.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script>
$(document).ready(function() {
    // 문서가 준비되면 send 함수를 호출합니다.
    
    console.log("call");
    
    function goodsList() {
    	console.log("start");
        $.ajax({
            type: "post",           
            dataType: "json",
            url: "/MVC/seller.do",
            success: function(data) {
                console.log(data);
               $("#result").empty(); // 기존 표 내용 제거
                
                let str1 = `<thead>
                                <tr>
                                    <th>순번</th>
                                    <th>상품번호</th>
                                    <th>상품브랜드</th>
                                    <th>상품명</th>
                                    <th>상품가격</th>
                                    <th>상품재고</th>
                                </tr>
                           </thead>
                           <tbody>`;

                for (let i = 0; i < data.length; i++) {
                    let item = data[i];
                    str1 += "<tr>";
                    str1 += "<td>" + item.num + "</td>";
                    str1 += "<td>" + item.goodsCode + "</td>";
                    str1 += "<td>" + item.goodsBrand + "</td>";
                    str1 += "<td>" + item.goodsName + "</td>";
                    str1 += "<td>" + item.goodsPrice + "</td>";
                    str1 += "<td>" + item.goodsStock + "</td>";
                    str1 += "</tr>";
                }
                str1 += ` </tbody>`;

                $("#result").append(str1);            
            },
            error: function() {
                alert("요청 실패");
            }
        });
        console.log("end");
    }
    
    function goodsList() {
    	console.log("start");
        $.ajax({
            type: "post",           
            dataType: "json",
            url: "/MVC/seller.do",
            success: function(data) {
                console.log(data);
               $("#result").empty(); // 기존 표 내용 제거
                
                let str1 = `<thead>
                                <tr>
                                    <th>순번</th>
                                    <th>상품번호</th>
                                    <th>상품브랜드</th>
                                    <th>상품명</th>
                                    <th>상품가격</th>
                                    <th>상품재고</th>
                                </tr>
                           </thead>
                           <tbody>`;

                for (let i = 0; i < data.length; i++) {
                    let item = data[i];
                    str1 += "<tr>";
                    str1 += "<td>" + item.num + "</td>";
                    str1 += "<td>" + item.goodsCode + "</td>";
                    str1 += "<td>" + item.goodsBrand + "</td>";
                    str1 += "<td>" + item.goodsName + "</td>";
                    str1 += "<td>" + item.goodsPrice + "</td>";
                    str1 += "<td>" + item.goodsStock + "</td>";
                    str1 += "</tr>";
                }
                str1 += ` </tbody>`;

                $("#result").append(str1);            
            },
            error: function() {
                alert("요청 실패");
            }
        });
        console.log("end");
    }
    goodsList();
});
</script>

</head>
<body>
<%
	PageHandler handler = (PageHandler) request.getAttribute("handler");
	%>
	판매자페이지
	<table id="result">
		<!-- 여기에 표가 삽입됩니다 -->
	</table>
	
	<div class="page-links">
		<%
		int index = handler.getGrpStartPage();

		if (handler.getCurrentGrp() > 1) {
		%>
		<a href="/MVC/seller2.do?p=<%=index - 1%>">[이전]</a>
		<%
		}
		while (index <= handler.getGrpEndPage()) {
		%>
		<a href="/MVC/seller2.do?p=<%=index%>">[<%=index%>]
		</a>
		<%
		index++;
		}
		if (handler.getGrpEndPage() < handler.getTotalPage()) {
		%>
		<a href="/MVC/seller2.do?p=<%=handler.getGrpEndPage() + 1%>">[다음]</a>
		<%
		}
		%>
	</div>
</body>
</html>
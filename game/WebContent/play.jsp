<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
    String[] imgs = new String[] {"scissors.png", "rock.png", "paper.png"};

    String choice = request.getParameter("choice");
    int choiceIdx = Integer.parseInt(choice);
    
    Random random = new Random(System.nanoTime());
    int comIdx = random.nextInt(3);
    
    String result = "";
    int diff = choiceIdx - comIdx;
    if(diff == 0) {
    	result = "비겼습니다.";
    } else if (diff == -1 || diff == 2) {
    	result = "이겼습니다.";
    } else {
    	result = "졌습니다.";
    }
    String myImg = imgs[choiceIdx];
    String comImg = imgs[comIdx];

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Play</title>
<style type="text/css">
#wrap {
width: 400px;
border: 1px solid #ff0000;
margin: auto;
text-align: center;
}
img {
width: 160px;
border: 1px dashed #dddd00;
}
.mine {
border-radius: 10px;
}
.other {
border-radius: 3px;
border: 1px dashed #000000;

}
</style>
</head>
<body>
<div id="wrap">
<img src="./images/<%= myImg %>" class="mine">
 vs 
<img src="./images/<%= comImg %>" class="other">
<img src="./images/<%= comImg %>" class="other">
<img src="./images/<%= comImg %>" class="other">
<img src="./images/<%= comImg %>" class="other">
<h2><%= result %></h2>
<a href="./game.jsp">다시 하기</a>
</div>
</body>
</html>
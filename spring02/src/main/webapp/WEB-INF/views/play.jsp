<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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
<img src="./images/${game.myImg}" class="mine">
 vs 
<img src="./images/${game.comImg}" class="other">
<h2>${game.result}</h2>
<a href="./game.do">다시 하기</a>
</div>
</body>
</html>
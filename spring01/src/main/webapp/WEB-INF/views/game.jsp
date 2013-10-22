<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>가위, 바위, 보</title>
<style type="text/css">
body {
text-align: center;
}
button {
width: 80px;
height: 60px;
font-size: 1.5em;
border-radius: 5px;
margin: 20px 30px;
}
</style>
<script type="text/javascript">
function play(c) {
	location.href = './play.do?choice=' + c;
}
</script>
</head>
<body>
<button onclick="play(0)">가위</button>
<button onclick="play(1)">바위</button>
<button onclick="play(2)">보</button>
</body>
</html>
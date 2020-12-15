<%@ page language="java" contentType="text/html; charset=EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<!-- ��Ʈ��Ʈ�� CDN / jumbotron ���ø� CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<%@ include file="menu.jsp" %>

	<%!String greeting = "���� �� ���θ�";
	String tagline = "Welcome to Web Market!";%>

	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>

	<main role="main">
		<div class="container">
			<div class="text-center">
				<h3>
					<%=tagline%>
				</h3>
				<hr>
			</div>
		</div>
	</main>

	<%@ include file="footer.jsp" %>
	
</body>
</html>
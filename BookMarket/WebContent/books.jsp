<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Book"%>
<%@ page import="dao.BookRepository" %>

<html>
<head>
<meta charset="EUC-KR">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>도서 목록</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
		<div class="jumbotron">
			<div class="container">
				<h1 class="display-3">도서 목록</h1>
			</div>
		</div>

		<%
			BookRepository dao = BookRepository.getInstance();
			ArrayList<Book> listOfBooks = dao.getAllBooks();
		%>

		<div class="container">
			<div class="row" style="display: inline-block">
				<%
					for (int i = 0; i < listOfBooks.size(); i++) {
					Book book = listOfBooks.get(i);
				%>
				<div class="col-md-4" align="left" style="max-width: 100%; position: relative">
					<div style="float: left; margin-right: 60px; width: 120px"><img src="./resources/images/<%=book.getFilename() %>" style="height: 153px"></div>
					<div>
					<h3>[<%=book.getCategory()%>] <%=book.getName() %></h3><br>
					<p style="float: right; margin-left: 20px"> <a href="./book.jsp?id=<%=book.getBookid() %>" class="btn btn-secondary" role="button">상세 정보 &raquo;</a>
					<p><%=book.getDescription()%>
					<p><%=book.getAuthor()%> | <%=book.getPublisher()%> | <%=book.getUnitPrice()%>원
					</div>
				</div>
				<hr>
				<%
					}
				%>
			</div>
		</div>
		<jsp:include page="footer.jsp" />
</body>
</html>
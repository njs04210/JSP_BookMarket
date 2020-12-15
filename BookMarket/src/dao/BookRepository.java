package dao;

import java.util.ArrayList;

import dto.Book;

public class BookRepository {

private ArrayList<Book> listOfBooks = new ArrayList<Book>();
private static BookRepository instance = new BookRepository(); 

public static BookRepository getInstance() {
	return instance;
}
	
		public BookRepository() {
		
		Book HTML = new Book("P1234", "HTML5 + CSS3", 15000);
		HTML.setAuthor("황재호");
		HTML.setDescription("워드나 PPT 문서를 만들 수 있나요? 그러면 문제 없습니다. 지금 바로 웹페이지 제작에 도전해보세요. 지금 당장 컴퓨터가 없어도 괜찮습니다. 코드와 실행 화면이 바로 보여서 눈으...");
		HTML.setPublisher("한빛미디어");
		HTML.setCategory("Hello Coding");
		HTML.setUnitsInStock(1000);
		HTML.setTotalPages(288);
		HTML.setReleaseDate("2018/03");
		HTML.setCondition("New");
		HTML.setFilename("P1234.jpg");
		
		Book JAVA = new Book("P1235", "쉽게 배우는 자바 프로그래밍", 27000);
		JAVA.setAuthor("우종중");
		JAVA.setDescription("객체 지향의 핵심과 자바의 현대적 기능을 충실히 다루면서도 초보자가 쉽게 학습할 수 있게 구성했습니다. 시각화 도구를 활용한 개념 설명과 군더더기 없는 핵심 코드를 통해 개념과 구현...");
		JAVA.setPublisher("한빛아카데미");
		JAVA.setCategory("IT모바일");
		JAVA.setUnitsInStock(1000);
		JAVA.setTotalPages(692);
		JAVA.setReleaseDate("2017/8");
		JAVA.setCondition("Refurbished");
		JAVA.setFilename("P1235.jpg");
		
		Book Spring = new Book("P1236", "스프링4 입문", 27000);
		Spring.setAuthor("하세가와 유이치, 오오노 와타루, 토키 코헤이(권은철, 전민수)");
		Spring.setDescription("스프링은 단순히 사용 방법만 익히는 것보다 아키텍처를 어떻게 이해하고 설계하는지가 더 중요합니다. 예제를 복사해 붙여넣는 식으로는 실제 개발에서 스프링을 제대로 활용할 수 없습니다...");
		Spring.setPublisher("한빛미디어");
		Spring.setCategory("IT모바일");
		Spring.setUnitsInStock(1000);
		Spring.setTotalPages(520);
		Spring.setReleaseDate("2017/11");
		Spring.setCondition("Old");
		Spring.setFilename("P1236.jpg");
		
		listOfBooks.add(HTML);
		listOfBooks.add(JAVA);
		listOfBooks.add(Spring);
	}

	public ArrayList<Book> getAllBooks() {
		return listOfBooks;
	}
	
	public Book getBookById(String BookId) {
		Book BookById = null;
		
		for (int i = 0; i < listOfBooks.size(); i++) {
			Book book = listOfBooks.get(i);
			if (book != null && book.getBookid() != null && book.getBookid().equals(BookId)) {
				BookById = book;
				break;
			}
		}
		return BookById;
	}
	
	public void addBook(Book book) {
		listOfBooks.add(book);
	}
}

package day18; // 주제 : 생성자 - 생성자에서 다른 생성자 호출하기  
//this() 사용전
// 2016년 10월 27일 목요일 +18
public class Exam067_0 {
	static class Book {
		String title;
		String author;
		String press;
		int pages;
		boolean local;

		 public Book() {}

		public Book(String title) {
			this.title = title;
		}

		public Book(String title, String press) {
			this.title = title;
			this.press = press;
		}

		public Book(String title, String press, String author, int pages) {
			this.title = title;
			this.press = press;
			this.author = author;
			this.pages = pages;
		}

	}

	public static void main(String[] args) {
		Book book = new Book(); //기본값으로 초기화된 인스턴스 만들기
		Book book2 = new Book("자바 프로그래밍");
		Book book3 = new Book("자바 프로그래밍", "비트출판사");
		Book book4 = new Book("자바 프로그래밍", "비트출판사", "홍길동", 780);

	}
}

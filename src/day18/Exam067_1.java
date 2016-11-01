package day18; // 주제 : 생성자 - 생성자에서 다른 생성자 호출하기  
//this() 사용전
// 2016년 10월 27일 목요일 +18
public class Exam067_1 {
	static class Book {
		String title;
		String author;
		String press;
		int pages;
		boolean local;

		 public Book() {}

		public Book(String title) {
			this.title = title;
			System.out.println("Book(String");
		}

		public Book(String title, String press) {
			this(title);
			this.press = press;
			System.out.println("Book(String,String)");
		}

		public Book(String title, String press, String author, int pages) {
			this(title, press); // 현재 클래스의 다른 생성자를 호출한다.
			this.author = author;
			this.pages = pages;
			System.out.println("Book(String,String,String,int)");
		}

	}

	public static void main(String[] args) {
		Book book = new Book(); //기본값으로 초기화된 인스턴스 만들기
		System.out.println("-----------------------------------------");
		Book book2 = new Book("자바 프로그래밍");
		System.out.println("-----------------------------------------");
		Book book3 = new Book("자바 프로그래밍", "비트출판사");
		System.out.println("-----------------------------------------");
		Book book4 = new Book("자바 프로그래밍", "비트출판사", "홍길동", 780);
		System.out.println("-----------------------------------------");

	}
}

package day18; // 주제 : 스태틱 메서드와 인스턴스 메서드 - 레퍼런스와 스태틱 메서드 호출

// 2016년 10월 27일 목요일 +18
public class Exam063_3 {
	static class MyType {
		static void m1() {
			System.out.println("스태틱 메서드 호출...");
		}

		void m2() {
			System.out.println("인스턴스 메서드 호출...");
		}

	}

	public static void main(String[] args) {

		MyType obj = new MyType();
		obj.m1();  // xxxxxxxxxxxxx
		MyType.m1(); // ooooooooooo 가독성을 위해
		
	}
}
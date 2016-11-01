package day18; // 주제 : 생성

// 2016년 10월 27일 목요일 +18
public class Exam063_2 {
	static class MyType {
		static void m1() {
			System.out.println("스태틱 메서드 호출...");
		}

		void m2() {
			System.out.println("인스턴스 메서드 호출...");
		}

	}

	public static void main(String[] args) {

		MyType.m1();
//		MyType.m2(); 컴파일 오류
		
		MyType obj = new MyType();
		obj.m2();
	}
}
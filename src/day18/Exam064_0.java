package day18; // 주제 : 클래스 로딩

// 2016년 10월 27일 목요일 +18
public class Exam064_0 {
	static {
		System.out.println("Exam064_0: 스태틱 초기화 블록 실행");
	}

	static class MyType {
		static int a; // 스태틱 변수
		int b; // 인스턴스 변수

		static {
			System.out.println("MyType: 스태틱 초기화 블록 실행");
		}

		static void m1() {
			System.out.println("MyType: m1()");
		}
	}

	public static void main(String[] args) {
		System.out.println("main()....");
		MyType.m1();
		new MyType();
	}
}

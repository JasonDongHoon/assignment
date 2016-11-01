package day18; // 주제 : 스태틱 메서드와 인스턴스 메서드 - 레퍼런스와 스태틱 메서드 호출

// 2016년 10월 27일 목요일 +18
public class Exam063_4 {
	static class MyType {
		static int a; //스태틱 변수
		int b; //인스턴스 변수

		static void m1() {
			System.out.println("스태틱 메서드 호출...");
			MyType.a = 100;
			a = 200;

			// this.b = 300; 컴파일 오류!!
			// b=400; 컴파일 오류!!

		}

		void m2() { //로컬 변수
			System.out.println("인스턴스 메서드 호출...");
			MyType.a = 500;
			a = 600; // 로컬변수인지 찾아보고 -> this변수로 찾아보고 -> 클래스 이름으로 찾는다.
			this.b = 700;
			b = 800; // 로컬변수냐? -> 인스턴스 변수냐? -> 스태틱 변수냐?
					// 즉 b가 인스턴스 변수라면, b=800; 은 다음 코드로 바뀐다. this.b=800;
		}

	}

	public static void main(String[] args) {

		// MyType.m1(a);

	}
}
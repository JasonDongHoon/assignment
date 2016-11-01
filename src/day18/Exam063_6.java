package day18; // 주제 : 변수 선언의 의미

// 2016년 10월 27일 목요일 +18
public class Exam063_6 {
	static class MyType {
		static int a; // 스태틱 변수
		int b; // 인스턴스 변수

		static { // 스태틱 초기화 블록
			System.out.println("스태틱 초기화 블록");
			a = 20;
		}

		{ // 인스턴스 초기화 블록
			System.out.println("인스턴스 초기화 블록");
			this.b=20;
		}

		public MyType() {
			System.out.println("생성자 호출!!");
			this.b=30;
		}
	}

	public static void main(String[] args) {
		System.out.println(MyType.a);
		MyType.a = 100;
		System.out.println(MyType.a);
		System.out.println("--------------------------------------------------");

		MyType obj; // 레퍼런스는 인스턴스 블록 실행하고 상관없다.
		obj = new MyType();
		System.out.println(obj.b);
		
		MyType obj2; // 레퍼런스는 인스턴스 블록 실행하고 상관없다.
		obj2 = new MyType();
		System.out.println(obj2.b);

	}
}

/*
 * static int a; 정수 값을 저장할 4바이트 크기의 메모리를 Method Area 영역에 확보하라!!
 * 
 * int b; 정수 값을 저장할 4바이트 크기의 메모리를 Heap 영역에 확보하라!!
 * 
 * int c; 정수 값을 저장할 4바이트 크기의 메모리를 JVM 스택 영역에 확보하라!!
 */
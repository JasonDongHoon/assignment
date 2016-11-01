package day18; // 주제 : 

// 2016년 10월 27일 목요일 +18
public class Exam063_7 {
	static class MyType {
		static int a; // 스태틱 변수
		int b; // 인스턴스 변수

		static {System.out.println("스태틱 초기화 블록");}
		{System.out.println("인스턴스 초기화 블록");}

		static {System.out.println("스태틱 초기화 블록2");}
		{System.out.println("인스턴스 초기화 블록2");}

		
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

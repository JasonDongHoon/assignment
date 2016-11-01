package day18; // 주제 : 변수 선언의 의미

// 2016년 10월 27일 목요일 +18
public class Exam063_5 {
	static class MyType {
		static int a; // 스태틱 변수
		int b; // 인스턴스 변수

	}

	public static void main(String[] args) {

		int c; //로컬 변수
		c = 100;
		MyType.a = 100;

		MyType obj = new MyType();
		obj.b = 300;

	}
}

/* static int a; 정수 값을 저장할 4바이트 크기의 메모리를 Method Area 영역에 확보하라!!
 * 
 * int b; 정수 값을 저장할 4바이트 크기의 메모리를 Heap 영역에 확보하라!!
 * 
 * int c; 정수 값을 저장할 4바이트 크기의 메모리를 JVM 스택 영역에 확보하라!!
*/
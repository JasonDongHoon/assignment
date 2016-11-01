package day18;

// 2016년 10월 27일 목요일 +18
public class Exam063_0 {
	static class MyType {
		static int a;
		int b; // static 주소가 아닌 non-static 변수(인스턴스 변수)는 불러들일 수 없다.

	}

	public static void main(String[] args) {
		MyType.a = 100;
		System.out.println(MyType.a);

		// MyType.b = 100;
		// System.out.println(MyType.b);

		MyType obj = new MyType();
		obj.b = 200;

		MyType obj2 = new MyType();
		obj2.b = 300;
		System.out.println(obj.b);
		System.out.println(obj2.b);

	/* 인스턴스 생성과 메서드
	 * -인스턴스를 생성한다는 뜻은 Heap 영역에 인스턴스 변수를 준비한다는 의미이다.
	 * -인스턴스를 생성할 때 메서드를 준비하는 것은 아니다.
	 * 
	 */
		
	}

}

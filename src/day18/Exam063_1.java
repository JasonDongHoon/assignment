package day18;

// 2016년 10월 27일 목요일 +18
public class Exam063_1 {
	static class MyType {  //static 변수를 사용할 때는 클래스 이름으로 사용하라!!! ex) MyType.a (o), obj1.a(x)
		static int a;  //공통으로 사용할 변수를 명명할 때는 스태틱으로!!
		int b; // 개별적으로 사용할 인스턴스 변수를 사용할 때는 이렇게!!

	}

	public static void main(String[] args) {
		MyType.a = 100;
		System.out.println(MyType.a);

		// MyType.b = 100;
		// System.out.println(MyType.b);

		MyType obj1 = new MyType();
		MyType obj2 = new MyType();

		obj1.b = 200;
		obj2.b = 300;
		System.out.printf("MyType.a=%d, obj1.b=%d, obj2.b=%d\n", MyType.a, obj1.b, obj2.b);

		obj1.a = 500;
		System.out.printf("MyType.a=%d, obj1.b=%d, obj2.b=%d\n", MyType.a, obj1.b, obj2.b);
		obj2.a = 600;
		System.out.printf("MyType.a=%d, obj1.b=%d, obj2.b=%d\n", MyType.a, obj1.b, obj2.b);
		
	}

}

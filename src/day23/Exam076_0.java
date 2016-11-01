package day23; //주제 : Object 클래스 - 기본 메서드 toString()

//2016년 11월 1일 화요일
public class Exam076_0 {
	static class A {
		String name;
		int age;
		
	}

	static class B {
		String name;
		int age;
		
		@Override
		public String toString() {
			return "이것은 Object를 테스트하는 클래스입니다.";
		}
	}

	public static void main(String[] args) {
		A obj1 = new A();
		obj1.name = "홍길동";
		obj1.age = 20;
		
		A obj2 = new A();
		obj2.name = "홍길동";
		obj2.age = 20;
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}

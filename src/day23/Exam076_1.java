package day23; //주제 : Object 클래스 - 기본 메서드 toString()

//2016년 11월 1일 화요일
public class Exam076_1 {
	static class A {
		String name;
		int age;
		
	}

	static class B {
		String name;
		int age;
		
		@Override
		public int hashCode() {
			String str = name + "," + age;
			return str.hashCode();
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
		System.out.println("----------------------------");
		
		B obj3 = new B();
		obj3.name = "홍길동";
		obj3.age = 20;
		
		B obj4 = new B();
		obj4.name = "홍길동";
		obj4.age = 20;
		
		System.out.println(obj3.hashCode());
		System.out.println(obj4.hashCode());
	}
}
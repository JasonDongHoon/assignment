package day23; //주제 : Object 클래스 - 기본 메서드 equals()

//2016년 11월 1일 화요일
public class Exam076_3 {
	static class A {
		String name;
		int age;
		
		public void m1() {
		}

		public void m2() {
		}

		public void m3() {
		}

	}

	public static void main(String[] args) {
		A obj1 = new A();
		A obj2 = new A();

		Class ref1 = obj1.getClass();
		Class ref2 = obj2.getClass();

		if (ref1 == ref2)
			System.out.println("ref1==ref2");
		System.out.println(ref1.getName());
	}

}

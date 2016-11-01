package day23; //주제 : Class - 클래스 정보를 얻는 다양한 방법

//2016년 11월 1일 화요일
public class Exam077_0 {
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

	public static void main(String[] args) throws Exception {
//	1) 인스턴스를 통해 얻기
		A obj = new A();
		Class clazz1 = obj.getClass();
		
//		2) "class"라는 내장 스태틱 변수를 통해서 얻는 방법
		Class clazz2 = A.class;
		
//		3) Class의 forName() 메서드를 통해 얻는 방법
		Class clazz3 = Class.forName("day23.Exam077_0$A");
		
		if (clazz1 == clazz2) System.out.println("clazz1==clazz2");
		if (clazz1 == clazz3) System.out.println("clazz1==clazz3");

		
	}

}


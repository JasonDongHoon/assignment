package day23; //주제 : Class - 클래스 이름 알아내기

//2016년 11월 1일 화요일
public class Exam077_1 {
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

		A obj = new A();
		Class clazz1 = obj.getClass();

		String classNameWithPackageName = clazz1.getName();
		String classNameOnly = clazz1.getSimpleName();

		System.out.println(classNameWithPackageName);
		System.out.println(classNameOnly);
		System.out.println(clazz1.toString());
		
		System.out.println(clazz1.isMemberClass()); // 멤버 inner 클래스 여부
		System.out.println(clazz1.isLocalClass()); // 로컬 inner 클래스 여부
		System.out.println("----------------------");
		
		class B {}
		System.out.println(B.class.isMemberClass()); // inner 클래스 여부
		System.out.println(B.class.isLocalClass()); // 로컬 inner 클래스 여부 

	}

}

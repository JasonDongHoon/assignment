package day23; //주제 : Class - 메서드 정보 추출하기

import java.lang.reflect.Method;

//2016년 11월 1일 화요일
public class Exam077_3 {
	static class A {
		String name;
		int age;

		public void m1() {
			System.out.println("Hello");
		}

		protected void m2() {
		}

		void m3() {
		}
		
		private m4() {
			
		}

	}

	public static void main(String[] args) throws Exception {

		Class clazz = A.class;
		
		Method[] methods = clazz.getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("----------------");
			Method[] methods2 = clazz.getDeclaredMethods();
			for (Method method : methods2) {
				System.out.println(method.getName());
		}
		
	}

}

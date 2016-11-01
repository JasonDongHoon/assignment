package day23; //주제 : String 클래스 - 인스턴스를 Constants Pool에 생성하기

//2016년 11월 1일 화요일
public class Exam078_4 {

	public static void main(String[] args) throws Exception {
		String s1 = "Hello, world!";
		String s2 = s1.replace('o', 'x');
		System.out.println(s1);
		System.out.println(s2);

		StringBuffer buf1 = new StringBuffer("Hello, world");
		buf1.replace(2,4,"xx"); //2번부터 4번문자 전까지임
		System.out.println(buf1);
	}
}

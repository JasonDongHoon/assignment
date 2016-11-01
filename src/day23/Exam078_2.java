package day23; //주제 : String 클래스 - 문자열의 비교

//2016년 11월 1일 화요일
public class Exam078_2 {

	public static void main(String[] args) throws Exception {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		if (s1==s2) System.out.println("s1 != s2");
		System.out.println("-------------------");
		if(s1.equals(s2)) System.out.println(s1 == s2);
	}
}

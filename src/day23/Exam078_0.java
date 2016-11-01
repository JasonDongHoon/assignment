package day23; //주제 : String 클래스 - 인스턴스 생성

//2016년 11월 1일 화요일
public class Exam078_0 {

	public static void main(String[] args) throws Exception {
		String s1 = new String("ABC");
		String s2 = new String("ABC");

		if (s1 == s2)
			System.out.println("s1==s2");
	}
}

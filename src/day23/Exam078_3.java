package day23; //주제 : String 클래스 - 인스턴스를 Constants Pool에 생성하기

//2016년 11월 1일 화요일
public class Exam078_3 {

	public static void main(String[] args) throws Exception {
		String s1 = new String("Hello"); //Heap에 인스턴스 존재
		String s2 = s1.intern(); //상수풀에 스트링 인스턴스 생성
		String s3 = "Hello";	// 만약 이미 상수풀에 그 값을 갖는 스트링이 있다면
								// 기존 스트링의 인스턴스 주소를 리턴한다.
		
		
		if (s1!=s2) System.out.println("s1 != s2");
		System.out.println("-------------------");
		if(s1!=s2) System.out.println("s2 == s3");
	}
}

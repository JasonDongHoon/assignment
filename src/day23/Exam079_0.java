package day23; //주제 : 랩퍼 클래스 - primitive type(원시타입; byte, short,

//												int, long, double, boolean, char)
//						         의 값을 좀 더 다양하게 다룰 수 있는 클래스를 말한다. 

//2016년 11월 1일 화요일
public class Exam079_0 {

	public static void main(String[] args) throws Exception {
		Integer i1 = new Integer(20);
		Integer i2 = new Integer(20);

		if (i1 != i2)
			System.out.println("i1 != i2");
		if (i1.equals(i2))
			System.out.println("i1과 i2는 내용이 같다.");
		
	}
}

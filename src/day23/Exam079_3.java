package day23; //주제 : 랩퍼 클래스 - 오토박싱과 오토언박싱

//2016년 11월 1일 화요일
public class Exam079_3 {
	static void m1(Object value) {
		System.out.println(value);
	}

	static void m2(int value) {
		System.out.println(value);
	}

	public static void main(String[] args) throws Exception {
		m1(new Integer(100));
		m1(200); // 오토 박싱
		m2(300);
		Integer obj = new Integer(400);  
		m2(obj); // 오토 언박싱 = m2(obj.inValue());
//		m2("500"); String은 자동형변환 하지 않는다.
	}
}
 
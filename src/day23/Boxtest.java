package day23; //주제 : 랩퍼 클래스 - 오토박싱과 오토언박싱

//2016년 11월 1일 화요일
public class Boxtest {
	public static void main(String[] args) {
		Box b1 = new Box(100);
		Box b2 = new Box(200);
		Box b3 = new Box(300);

		b1.next = b2;
		b2.next = b3;

		Box cursor = b1;
		while (cursor != null) {
			System.out.println(cursor.toString());
			cursor = cursor.next;
		}

	}

}

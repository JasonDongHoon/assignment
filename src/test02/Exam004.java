package test02; // 

// 2016년 10월 24일 월요일
public class Exam004 {
	public static void main(String[] args) {

		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍길동";

		if (s1 == s2) {
			System.out.println("s1 == s2");
		}

		if (s1 == s3) {
			new String("홍길동");
			System.out.println("s1 == s3");
		}
		if (s2 == s3) {
			System.out.println("s2 == s3");
		}
	}
}

/*
 * ���� 3���� ������ char �迭�� ����� �� �迭�� ���� �ڵ带 �����Ѵ�. ���� length �޸𸮿�
 * ���� ������ �����Ѵ�. �׸��� �� �޸��� �ּҸ� �����Ѵ�. s1�� ���ڿ��� ����� �޸���
 * �ּҰ� ����ִ�. �ּҸ� �˰� �;��? �� : �ڹٴ� �˷����� �ʴ´�.
 */

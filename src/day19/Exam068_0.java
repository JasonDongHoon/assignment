package day19;

//2016년 10월 28일 금요일 +19
public class Exam068_0 {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		// 3 * 2 + 4 - 7
		calc.plus(3);
		calc.multiple(2);
		calc.plus(4);
		calc.mius(7);
		System.out.println(calc.result);
	}
}

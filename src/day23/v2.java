package day23; //주제 : 랩퍼 클래스 - 오토박싱과 오토언박싱

import java.util.Scanner;

//2016년 11월 1일 화요일
public class v2 {
	static Scanner keyScan = new Scanner(System.in);
	static int count;
	static Box head;
	static Box tail;

	public static void main(String[] args) {
		count = 0;
		head = new Box();
		tail = head;		
		
		loop: while (true) {
			System.out.print("명령> ");
			String command = keyScan.nextLine().toLowerCase();

			switch (command) {
			case "add": doAdd(); break;
			case "list": doList(); break;
			case "get": doGet(); break;
			case "quit": System.out.println("Good bye!"); break loop;
			default: System.out.println("지원하지 않는 명령어 입니다.");
			}
		}
	}

		static void doAdd() {
			System.out.print("입력할 값?" );
			String input = keyScan.nextLine();
			tail.value = Integer.parseInt(input);
			tail.next = new Box();
			tail = tail.next;
			count++;
		}
					
		static void doList() {
			Box cursor = head;
			if (cursor.next != null) {
				System.out.print(cursor);
				cursor = cursor.next;
			}
			while (cursor.next != null) {
				System.out.print(" - "+ cursor);
				cursor = cursor.next;
			}
			System.out.println();
		}
		static void doGet() {
			System.out.print("인덱스? ");
			String input = keyScan.nextLine();
			int index = Integer.parseInt(input);
			if (index >= count) {
				System.out.println("인덱스 범위를 넘었습니다.");
				return;
			} else {
				Box cursor = head;
				for (int i = 0; i < index; i++) {
					cursor = cursor.next;
				}
				System.out.println(cursor);
			}
}
		
/*
			Box b1 = new Box(100);
			Box b2 = new Box(200);
			Box b3 = new Box(300);

			b1.next = b2;
			b2.next = b3;

			Box cursor = b1;
			while (cursor != null) {
				System.out.println(cursor.toString());
				cursor = cursor.next;
*/
	}


/*
 * 실행 예
 * 명령> add 
 * 입력할 값? 100 
 * 명령> list 
 * Box(100) 
 * 명령> add 
 * 입력할 값? 200 
 * 명령> list
 * Box(100) - Box(200) 
 * 명령> get
 * 인덱스? 1 
 * Box(200)
 */
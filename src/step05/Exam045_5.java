// 주제: 명령어 흐름 제어 - 블록 별로 선언된 변수의 용어

package step05;

public class Exam045_5 {
  static int a = 20; // <--- 클래스 변수(스태틱 변수)
  int x = 100; // <--- 인스턴스 변수

  public static void main(
      String[] args // <--- 파라미터(로컬 변수)
    ) {
    // args도 메서드에 선언된 변수이기 때문에 메서드 안에서 중복 불가!
    //int args = 20; //컴파일 오류!

    int y = 300; // <--- 로컬 변수
  }

  static void m1(int a/* 파라미터(로컬 변수) */) {
    int b; // <--- 로컬 변수
    {
      int c; // <--- 로컬 변수
    }
  }

}

/*
# 클래스 변수(스태틱 변수)
- 클래스 블록에 static 으로 선언된 변수
- 클래스가 존재하는 동안 사용할 수 있다.

# 인스턴스 변수
- new 명령을 사용하여 만든다.
- 인스턴스 이름이 있어야만 사용할 수 있다.

# 로컬 변수
- 메서드 안에 선언된 변수
- 메서드 안에 블록에 선언된 변수도 모두 포함한다.
- 메서드 선언부에 선언된 파라미터도 포함한다.
- 따라서 파라미터는 로컬 변수이다.
- 메서드가 실행될 때 만들어져서 메서드 호출이 끝나면 제거된다.






*/

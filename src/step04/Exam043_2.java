// 주제: 연산자 - 비트 이동 연산자
// => 오른쪽 이동(>>), 오른쪽 이동(>>>), 왼쪽 이동(<<)

package step04;

public class Exam043_2 {
  public static void main(String[] args) {
    int a = 0b1100; // 12
    //오른쪽 이동                //      1100|      => 12
    System.out.println(a >>> 1); //       110|0     => 6
    System.out.println(a >>> 2); //        11|00    => 3
    System.out.println(a >>> 3); //         1|100   => 1

    int b = -12;
    System.out.println(b >>> 1); //
    System.out.println(b >>> 2); //
    System.out.println(b >>> 3); //

  }
}

/*
# 오른쪽 이동 (>>>)
- 2로 나눈 결과와 같다.
- 앞의 빈 자리가 무조건 0으로 채워진다.

# 양수일 경우
00000000_00000000_00000000_00001100
x0000000_00000000_00000000_0000110|0
- 빈자리는 0으로 채운다.
- 비트 이동한 후 부호가 바뀌지 않는다.

# 음수일 경우
00000000_00000000_00000000_00001100 (12)
11111111_11111111_11111111_11110011 (12의 1의 보수)
11111111_11111111_11111111_11110100 (12의 2의 보수 = -12)
x1111111_11111111_11111111_11111010|0 (오른쪽으로 1비트 밀고)
01111111_11111111_11111111_11111010 (빈자리는 0으로 채운다 = )

- 빈자리가 부호 비트인 0으로 채워진다.
- 비트 이동한 후에는 양수로 바뀐다.

*/

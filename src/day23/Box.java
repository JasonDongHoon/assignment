package day23; //주제 : 랩퍼 클래스 - 오토박싱과 오토언박싱

//2016년 11월 1일 화요일
public class Box  {
	  int value;
	  Box next;

	  public Box() {}

	  public Box(int value) {
	    this.value = value;
	  }

	  @Override
	  public String toString() {
	    return "Box(" + this.value + ")";
	  }
	}

package java05;

public class 휴대폰 {

//	휴대폰 => class
//-------------------------
//			-정적특징: 모양, 사이즈 =>변수
	String shape;
	int size;
//			-동적특징: 전화하다, 문자하다, 게임하다 =>메소드(함수)
	public void tel() {
		System.out.println("전화하다");
	}
	public void text() {
		System.out.println("문자하다");
	}
	public void game() {
		System.out.println("게임하다");
	}

}

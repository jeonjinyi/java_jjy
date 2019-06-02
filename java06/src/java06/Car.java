package java06;

public class Car {
	//정적특징
	String color;
	int price;
	
	//동적특징
	public void speedUp() {
		System.out.println("속도를 up");
		System.out.println("300까지 속도를 up");
	}
	 public int get() {
		 return 300;
	 }
}

//소괄호(): 메소드 입력값 지정
//중괄호{}: 클래스내용, 메소드 내용, 배열값 알고있을때 할당
//대괄호[]: 배열개수 정할때, 배열타입 쓸때, 제너릭프로그램
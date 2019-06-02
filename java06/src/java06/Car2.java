package java06;

public class Car2 {
	//정적특징
	String color;
	int price;
	
	//생성자: 객체생성(new)할 때 자동으로 초기화
	//객체 생성할 때, 자동으로 호출(실행)
	//클래스이름과 동일, 대문자로 시작하는 유일한 메소드
	//위에 Source 메뉴에서 generate contructor using field 메뉴를 이용해서 만들수있음
	public Car2(String color) {
		this.color = color;
	}
	public Car2(int price) {
		this.price = price;
	}
	public Car2(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	
	//동적특징(메소드)
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
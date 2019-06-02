package java06;

public class Caruser2 {

	public static void main(String[] args) {
		Car2 car1 = new Car2("빨강",100);
		//클래스를 복사해서 객체를 만드는것
		//객체 생성 (new가 객체 생성해주는 것)
		System.out.println(car1);
		
		Car2 car2 = new Car2("검정",200); //부품 여러개(차 여러개) 쓰고싶을땐 2개 만듦
		System.out.println(car2);
		
	}

}

//
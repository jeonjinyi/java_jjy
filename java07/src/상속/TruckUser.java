package 상속;

public class TruckUser { //Car를 상속받은 Truck을 사용하는 클래스. 구현/실행 프로그램

	public static void main(String[] args) {
		Truck truck = new Truck();
		truck.color="green";
		truck.speed=150;
		truck.weight=1;
		System.out.println(truck);
		
		truck.speedUp();
		System.out.println(truck.speedDown());
//		System.out.println(truck.move()); //println오류남. 이유: Truck클래스에서 move메소드 반환값을 void로 했기 때문에 아래처럼 해야됨.
		truck.move();
	}
}

//상속(재사용)
//집(1층)+1층=집(2층)
//extends(확장하다)
//부모클래스는 한개(단일상속만!)
//Car(부모클래스) <---- truck(자식클래스)
//super: 부모클래스, sub: 자식클래스

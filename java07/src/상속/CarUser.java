package 상속;

public class CarUser {

	public static void main(String[] args) {
		Car apple = new Car("red",100); //Car 클래스에 생성자에 있는 형식 그대로 넣어야 오류안남
		System.out.println(apple);
		
		Car banana = new Car("blue");
		System.out.println(banana);
	}

}

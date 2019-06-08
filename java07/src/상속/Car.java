package 상속;
public class Car {
	//자동차=> class
	//정적특징: 색, 속도=>멤버변수
	String color;
	int speed;
	
	//생성자1. 기본 생성자: 입력값 없는 생성자
	public Car() {
		super();
	}
	//생성자2. 다형성. 오버로딩(같은 메소드명을 여러번 쓰는것. 매개변수는 다름)
	public Car(String color) {
		this.color = color;
	}
	//생성자3. 다형성. 오버로딩. 보통 정적특징/동적특징 사이에 둠
	public Car(String color, int speed) { //어차피 void라서 반환값 안써줌. 클래스 Car랑 똑같은 메소드명 씀
		this.color = color; //String color 랑 변수 같은거 쓰면 this 써야함
		this.speed = speed; //int speed랑 변수 같으면 this써야함
	}
	//동적특징: 속도 up, 속도down =>멤버메소드
	public void speedUp() {
		System.out.println("속도를 Up.");
	}
	public int speedDown() {
		System.out.println("속도를 Down.");
		return 60; // int로 반환값 정했기 때문에 리턴값이 꼭 있어야함. 60 만큼 속도 내린다라는 뜻
	}
	//오버라이딩(재정의). 아래 오버라이딩 쓰면 CarUser클래스에서 println()에 따로 정의안해도 됨 (source 메뉴에 generate toString메뉴로 만들수있음)
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + "]";
	}
}

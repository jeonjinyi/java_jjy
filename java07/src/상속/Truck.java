package 상속;

//이 클래스 멤버변수 개수: 3개, 멤버메소드 개수: 3개임(부모 클래스에 이미 2개씩 있기 때문에)
public class Truck extends Car{ //Car클래스를 확장해서 Truck클래스를 만들겠다.(상속). 변수2개, 메소드2 개 갖고 시작함
	int weight; //멤버변수 추가
	
	public void move() { //멤버메소드 추가
		System.out.println("물건을 운반하다");
	}

	@Override //재정의는 상속을 받았을 떄 쓸 수 있다. ex)부모님에게 핑크 차를 받았는데, 색이 싫어서 블루 차로 바꾸는것 (그 외 기능은 그대로)
	public String toString() {
		return "Truck [weight=" + weight + ", color=" + color + ", speed=" + speed + "]";
	}
	
}

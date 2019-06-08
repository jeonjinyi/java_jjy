package 상속;

public class 자동차 {
	//정적 특징
	String color;
	String name;
	
	//중요: 기본 생성자 (를 만들어야 자식 클래스에서 기본 생성자를 꼭 같이 쓰기 때문에) 꼭 같이 만들어라. 
	public 자동차() {
	}
	//생성자
	public 자동차(String color, String name) {
		this.color = color;
		this.name = name;
	}
	//동적 특징
	public void start() {
		System.out.println("출발하다");
	}
	public void stop() {
		System.out.println("멈추다");
	}

	@Override
	public String toString() {
		return "자동차 [color=" + color + ", name=" + name + "]";
	}
}

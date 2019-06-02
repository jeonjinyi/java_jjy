package java06;

public class 공기청정기 {
	String shape;
	String company;
	int price;
	
	//생성자 3개 (shape, shape+price, shape+company+price)
	//같은 메소드 이름 쓰는것: overload(다형성)
	public 공기청정기(String shape) {
		this.shape = shape;
	}
	public 공기청정기(String shape, int price) {
		this.shape = shape;
		this.price = price;
	}
	public 공기청정기(String shape, String company, int price) {
		this.shape = shape;
		this.company = company;
		this.price = price;
	}
	//toString재정의(override, 오버라이드)
	public String toString() {
		return shape+" "+price+" "+company;

	}
}

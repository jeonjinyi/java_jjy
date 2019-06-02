package java06;

public class Computer {
	//정적특징
	int price;
	String company;
	public Computer(int price, String company) {
		this.price = price;
		this.company = company;
	}
	public Computer(int price) {
		this.price = price;
	}
	//재정의 computerUser2에서 sysoutprint에 보여줄
	public String toString() {
		return price+" "+company;
	}
	
	
	}


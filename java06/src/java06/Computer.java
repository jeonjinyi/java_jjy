package java06;

public class Computer {
	//����Ư¡
	int price;
	String company;
	public Computer(int price, String company) {
		this.price = price;
		this.company = company;
	}
	public Computer(int price) {
		this.price = price;
	}
	//������ computerUser2���� sysoutprint�� ������
	public String toString() {
		return price+" "+company;
	}
	
	
	}


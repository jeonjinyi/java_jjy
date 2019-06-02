package java06;

public class ComputerUser {

	public static void main(String[] args) {
		Computer c1 = new Computer(100,"samsung");
		System.out.println(c1.price);
		System.out.println(c1.company);
		
		Computer c2 = new Computer(100);
		System.out.println(c2.price);
	}

}

package java08;

public class 스레드유저 {

	public static void main(String[] args) {
		스레드1 스1 = new 스레드1();
		스레드2 스2 = new 스레드2();
		
		스1.start();
		스2.start();
		
	}
		

}

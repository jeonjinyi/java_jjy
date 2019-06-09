package java08;

public class ThreadUser {

	public static void main(String[] args) {
		RunThread1 r1 = new RunThread1();
		RunThread2 r2 = new RunThread2();
		
		r1.start();
		r2.start();
		
	}

}

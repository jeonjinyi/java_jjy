package java08;

public class RunThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("***: "+i);
			
		}
	
	}
	
	
	
}

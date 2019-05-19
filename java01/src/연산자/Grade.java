package 연산자;

public class Grade {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		
		int me = 3;
		
		if(a==me || c==me) {
			System.out.println("다른 반으로 가야해요.");
		} else {
			System.out.println("그냥 이 반에 있어도 돼요.");
		}
	}

}

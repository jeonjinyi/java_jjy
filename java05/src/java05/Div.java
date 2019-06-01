package java05;

public class Div {

	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		int div=cal2.나누다(33, 2);
		
		if(div>20) {
			System.out.println("결과가 크군요");
		}else {
			System.out.println("결과가 작군요 ");
		}
	}

}

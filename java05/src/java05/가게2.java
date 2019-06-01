package java05;

public class 가게2 {

	public static void main(String[] args) {
		계산기2 cal = new 계산기2();
		int sum=cal.곱하다(3000, 5);
		System.out.println(sum);
		if(sum>10000) {
			System.out.println(sum-1000);
		}else {
			System.out.println(sum);
		System.out.println("--------------------");
		
		System.out.println(cal.나누다(33, 2));
		int n4=cal.나누다(33,2);
		if(n4>=20) {
			System.out.println("결과가 크군요");
		}else {
			System.out.println("결과가 작군요");
		}
}
	}
}

package java05;

public class ����2 {

	public static void main(String[] args) {
		����2 cal = new ����2();
		int sum=cal.���ϴ�(3000, 5);
		System.out.println(sum);
		if(sum>10000) {
			System.out.println(sum-1000);
		}else {
			System.out.println(sum);
		System.out.println("--------------------");
		
		System.out.println(cal.������(33, 2));
		int n4=cal.������(33,2);
		if(n4>=20) {
			System.out.println("����� ũ����");
		}else {
			System.out.println("����� �۱���");
		}
}
	}
}

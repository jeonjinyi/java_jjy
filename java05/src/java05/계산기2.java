package java05;

public class 계산기2 {
	
	public void 더하다(int x, int y) { //void는 리턴값이 없을때.
		System.out.println(x+y);
	}
	public void 빼다(int x, int y) {
		System.out.println(x-y);
	}
	public int 곱하다(int price, int count) { //리턴값이 있을때 void 말고 리턴의 데이터타입을 써야함.
		int total =price * count;
		return total;
	}
	public int 나누다(int num1, int num2) {
		int total=num1/num2;
		return total;
	}
		
}

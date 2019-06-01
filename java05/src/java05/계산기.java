package java05;

public class 계산기 {
	//동적특징- 더하다.빼다.
	
	public void 더하다(int x, int y) { //void는 리턴값이 없을때. 
//		x,y는 입력값이 들어왔을때
//		저장해줄 수 있는 매개역할
//		매개역할 변수->매개변수
//		매개변수=파라메터
//		int x, int y 지역변수 {} 안에서만 쓰기 때문에 아래에서 똑같은 변수로 쓸수있음

		System.out.println(x+y);
	}
	public void 빼다(int x, int y) {
		System.out.println(x-y);
	}
		
}

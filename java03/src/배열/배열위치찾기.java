package 배열;

public class 배열위치찾기 {

	public static void main(String[] args) {
		int[] num= {11,22,33,44};
		for (int i = 0; i < num.length; i++) {  //배열에 있는 숫자 하나씩 꺼내서 보려고 for문 사용
			if(num[i]==33) {
			System.out.println("33의 위치값은 "+i);
			}
			
		}
	
	}

}

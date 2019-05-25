package 배열;

import java.util.Scanner;

public class 극장예매 {

	public static void main(String[] args) {
		System.out.println("-----------------------------");
		int[] seat=new int[10];
		Scanner sc = new Scanner(System.in);
		//0~9 index. length=10
		//while 문에서도 그 안에 문장에서도 쓰기 위해 while문 밖에 둠
		
		while(true) { //true면 보여주고, false면 안보여줌. 예매한다고 입력한 숫자를 1로 바꿔줌
			//좌석번호 보여주는 부분
			for (int i = 0; i < seat.length; i++) {
			System.out.print(i+1 +"  ");
			}
			System.out.println();
			System.out.println("-----------------------------");
			
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i]+"  ");
			}		
			System.out.println();
			//좌석 예매상황 보여주는 부분
			System.out.println("-----------------------------");
			System.out.print("예매할 좌석번호(종료는0번): ");
			
			int data=sc.nextInt(); //0번 입력 
			if(data==0) {
				System.out.println("예매 시스템을 종료합니다.");
				break;
			}
			if(seat[data-1] !=0) { //자리가 0이 아니면. 1이면
				System.out.println("이미 예매된 자리입니다.");
				System.out.println("다른 좌석을 예매해주세요.");
			}else {
			seat[data-1]=1;
			System.out.println("예매를 완료했습니다");
		}
		
		
		
	}

}
}
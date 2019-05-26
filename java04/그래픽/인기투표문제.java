package 배열;

import java.awt.Window.Type;
import java.util.Scanner;

public class 인기투표문제 {

	public static void main(String[] args) {
		String[] name= {"아이유","블랙핑크","김연우"};
		int[] count=new int[3];
		Scanner sc=new Scanner(System.in); //키보드에서 입력
		while(true) {
		System.out.print("가수이름선택: 0)"+name[0]+", 1)"
										  +name[1]+", 2)"
										  +name[2]+">> ");
		
		int data=sc.nextInt(); //String->int 로 변환
		if(data==0) { //아이유
			count[0]++; //아이유의 count 1증가
		}else if(data==1) {
			count[1]++;
		}else if(data==2) {
			count[2]++;
		}else {
			System.out.println("투표 시스템 종료");
			break;
		} //else end
	} //while end
		for (int i = 0; i < count.length; i++) {
			System.out.println(name[i]+" "+count[i]); //투표한 결과 보여주기
		}
	}
}

package 제어문;

import java.util.Scanner;

public class 입력테스트2 {

	public static void main(String[] args) {
		System.out.println("저기요!!!");
		System.out.println("----------------------");
		System.out.println("메뉴를 고르세요.");
		System.out.println("----------------------");
		System.out.println("1)짜장면, 2)짬뽕, 3)우동");
		System.out.println("----------------------");
		
		Scanner sc=new Scanner(System.in);
		  System.out.print("당신의 선택은? ");
		  int menu=sc.nextInt();
		  if(menu==1) {
			  System.out.println("당신은 짜장면을 주문하셨습니다.");
		  }else if(menu==2){
			  System.out.println("당신은 짬뽕을 주문하셨습니다.");
		  }else {
			  System.out.println("당신은 우동을 주문하셨습니다.");
			  
		  }


	}

}

//Scanner class
//sc.next() : String  // sc.nextInt() : String->int 로 변환 //sc.nextdouble() : String->double 로 변환  //
//
package 제어문;

import java.util.Scanner;

public class 제어문정리문제 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("학생의 이름을 입력: ");
		String name=sc.next();
		System.out.print("학생의 점수를 입력: ");
		int point=sc.nextInt();
		System.out.print(name+" 학생의 점수는 ");
		if(point>=90) {
			System.out.println("A학점입니다");
		}else if(point>=80) {
			System.out.println("B학점입니다");
		}else if(point>=70) {
			System.out.println("C학점입니다");
		}else if(point>=60) {
			System.out.println("D학점입니다");
		}else {
			System.out.println("F학점입니다");
			
		}

	
	}

}

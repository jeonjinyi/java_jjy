package 배열;

import java.util.Scanner;

public class 배열7 {

	public static void main(String[] args) {
		int[] point = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < point.length; i++) {
			System.out.print("점수 입력: ");
			point[i] = sc.nextInt();
		}
		for (int points : point) {
			System.out.println();
		}
		int sum=point[0]+point[1]+point[2]+point[3]+point[4]; //합계,평균 내기위해 sum변수를 한개 더 만듦
		System.out.println("전체 합계는: "+sum+"점입니다.");
		System.out.println("전체 평균은: "+sum/5 +"점입니다.");
		
		System.out.println("----------------------------");
		
		int total=0; //위에처럼 한개씩 다 꺼내기 너무 많을떄
		for (int i = 0; i < point.length; i++) {
			total= total + point[i]; //위에처럼 한개씩 꺼내기 너무 여러개일때, for문으로 만들어서 total이라는 변수에
		}
		System.out.println("총 합계는: "+total);
		System.out.println("평균은: "+total/5);
	}
}
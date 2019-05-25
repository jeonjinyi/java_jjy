package 배열;

import java.util.Scanner;

public class 정수배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //system.in ->키보드로 입력받는다는 뜻
		int[] num=new int[5];
		for (int i = 0; i < num.length; i++) {
		System.out.print("100부터 104까지 입력해주세요 ");
		num[i]=sc.nextInt();
	}
		for(int x:num) {
			System.out.println(x);
		}
}
}

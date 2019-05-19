package 제어문;

import java.util.Scanner;

public class 입력테스트11 {

	public static void main(String[] args) {
		System.out.print("좋아하는 과목은?");
		Scanner sc = new Scanner(System.in);
		int sub = sc.nextInt();

		if (sub == 1) {
			System.out.println("-파이썬은 쉽고 강해요");
		} else if (sub == 2) {
			System.out.println("-자바는 실무에서 쓰여요");
		} else {
			System.out.println("-c++은 정교해요");
		}

	}

}

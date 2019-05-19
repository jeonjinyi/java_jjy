package 제어문;

import java.util.Scanner;

public class 입력테스트11 {

	public static void main(String[] args) {
		System.out.print("학생의 이름을 입력: ");
		Scanner sc = new Scanner(System.in);
		int name = sc.nextInt();
		System.out.print("학생의 점수를 입력: ");
		int point = sc.nextInt();

		if (point>=90) {
			System.out.println("학점 A입니다");
		} else if (point >= 80) {
			System.out.println("학점 B입니다");
		} else if (point >= 70) {
			System.out.println("학점 C입니다");
		} else {
			System.out.println("학점 D입니다");
		}

	}

}

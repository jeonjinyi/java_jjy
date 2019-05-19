package 제어문;

import java.util.Scanner;

public class 입력테스트7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 음식을 입력하세요.(분식, 한식, 일식, 집)");
		String food = sc.next();

		switch (food) {
		case "분식":
			System.out.println("분식집으로 가요.");
			break; // switch는 break를 꼭 넣어줘야함
		case "한식":
			System.out.println("한식집으로 가요.");
			break;
		case "일식":
			System.out.println("일식집으로 가요.");
			break;
		case "집":
			System.out.println("집밥으로 가요.");
			break;
		default:
			System.out.println("식사를 안하실건가요?"); // 모두 아닐때(if문에서 else와 같음). default 안써도됨
//			break; (default에는 break안걸어도됨)

		}

	}

}

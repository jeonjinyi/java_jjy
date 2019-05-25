package 배열;

import java.util.Scanner;

public class 취미 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] hobby = new String[5];
		for (int i = 0; i < hobby.length; i++) {
			System.out.print("취미"+i+":");
			hobby[i] = sc.next();

		}
		for (String hob : hobby) {
			System.out.println(hob);
	}
}
}


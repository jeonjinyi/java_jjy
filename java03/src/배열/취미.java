package �迭;

import java.util.Scanner;

public class ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] hobby = new String[5];
		for (int i = 0; i < hobby.length; i++) {
			System.out.print("���"+i+":");
			hobby[i] = sc.next();

		}
		for (String hob : hobby) {
			System.out.println(hob);
	}
}
}


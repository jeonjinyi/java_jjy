package �迭;

import java.util.Scanner;

public class �����迭 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //system.in ->Ű����� �Է¹޴´ٴ� ��
		int[] num=new int[5];
		for (int i = 0; i < num.length; i++) {
		System.out.print("100���� 104���� �Է����ּ��� ");
		num[i]=sc.nextInt();
	}
		for(int x:num) {
			System.out.println(x);
		}
}
}

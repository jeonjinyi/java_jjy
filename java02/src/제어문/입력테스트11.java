package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ11 {

	public static void main(String[] args) {
		System.out.print("�л��� �̸��� �Է�: ");
		Scanner sc = new Scanner(System.in);
		int name = sc.nextInt();
		System.out.print("�л��� ������ �Է�: ");
		int point = sc.nextInt();

		if (point>=90) {
			System.out.println("���� A�Դϴ�");
		} else if (point >= 80) {
			System.out.println("���� B�Դϴ�");
		} else if (point >= 70) {
			System.out.println("���� C�Դϴ�");
		} else {
			System.out.println("���� D�Դϴ�");
		}

	}

}

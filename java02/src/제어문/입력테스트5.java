package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ð��� ");
		int time = sc.nextInt();
		if (time <= 10) {
			System.out.println("�¸��");
		} else if (time <= 14) {
			System.out.println("�¾����ʹ�");
		} else if (time <= 20) {
			System.out.println("���̺��");
		} else {
			System.out.println("�³���");

			//1~10���� �¸��, 10��1�к���~14���� �¾����ʹ�, 14��1�к���~20���� ���̺��, 20��1�к���~ �� �³���
		}

	}

}

//Scanner class
//sc.next() : String  // sc.nextInt() : String->int �� ��ȯ //sc.nextdouble() : String->double �� ��ȯ  //
//
package �迭;

import java.util.Scanner;

public class �迭7 {

	public static void main(String[] args) {
		int[] point = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < point.length; i++) {
			System.out.print("���� �Է�: ");
			point[i] = sc.nextInt();
		}
		for (int points : point) {
			System.out.println();
		}
		int sum=point[0]+point[1]+point[2]+point[3]+point[4]; //�հ�,��� �������� sum������ �Ѱ� �� ����
		System.out.println("��ü �հ��: "+sum+"���Դϴ�.");
		System.out.println("��ü �����: "+sum/5 +"���Դϴ�.");
		
		System.out.println("----------------------------");
		
		int total=0; //����ó�� �Ѱ��� �� ������ �ʹ� ������
		for (int i = 0; i < point.length; i++) {
			total= total + point[i]; //����ó�� �Ѱ��� ������ �ʹ� �������϶�, for������ ���� total�̶�� ������
		}
		System.out.println("�� �հ��: "+total);
		System.out.println("�����: "+total/5);
	}
}
package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����ϴ� ������ �Է��ϼ���.(�н�, �ѽ�, �Ͻ�, ��)");
		String food = sc.next();

		switch (food) {
		case "�н�":
			System.out.println("�н������� ����.");
			break; // switch�� break�� �� �־������
		case "�ѽ�":
			System.out.println("�ѽ������� ����.");
			break;
		case "�Ͻ�":
			System.out.println("�Ͻ������� ����.");
			break;
		case "��":
			System.out.println("�������� ����.");
			break;
		default:
			System.out.println("�Ļ縦 ���Ͻǰǰ���?"); // ��� �ƴҶ�(if������ else�� ����). default �Ƚᵵ��
//			break; (default���� break�Ȱɾ��)

		}

	}

}

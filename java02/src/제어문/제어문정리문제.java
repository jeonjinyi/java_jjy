package ���;

import java.util.Scanner;

public class ����������� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�л��� �̸��� �Է�: ");
		String name=sc.next();
		System.out.print("�л��� ������ �Է�: ");
		int point=sc.nextInt();
		System.out.print(name+" �л��� ������ ");
		if(point>=90) {
			System.out.println("A�����Դϴ�");
		}else if(point>=80) {
			System.out.println("B�����Դϴ�");
		}else if(point>=70) {
			System.out.println("C�����Դϴ�");
		}else if(point>=60) {
			System.out.println("D�����Դϴ�");
		}else {
			System.out.println("F�����Դϴ�");
			
		}

	
	}

}

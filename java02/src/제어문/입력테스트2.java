package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ2 {

	public static void main(String[] args) {
		System.out.println("�����!!!");
		System.out.println("----------------------");
		System.out.println("�޴��� ������.");
		System.out.println("----------------------");
		System.out.println("1)¥���, 2)«��, 3)�쵿");
		System.out.println("----------------------");
		
		Scanner sc=new Scanner(System.in);
		  System.out.print("����� ������? ");
		  int menu=sc.nextInt();
		  if(menu==1) {
			  System.out.println("����� ¥����� �ֹ��ϼ̽��ϴ�.");
		  }else if(menu==2){
			  System.out.println("����� «���� �ֹ��ϼ̽��ϴ�.");
		  }else {
			  System.out.println("����� �쵿�� �ֹ��ϼ̽��ϴ�.");
			  
		  }


	}

}

//Scanner class
//sc.next() : String  // sc.nextInt() : String->int �� ��ȯ //sc.nextdouble() : String->double �� ��ȯ  //
//
package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ12 {

	public static void main(String[] args) {
				
		Scanner sc=new Scanner(System.in);
		System.out.println("------------------");
		System.out.print("����1 �Է�: ");
		int a=sc.nextInt();
		System.out.print("����2 �Է�: ");
		int b=sc.nextInt();
		System.out.println("������ �Է�: ");
		String oper=sc.next(); //"+" 
		char op=oper.charAt(0);
		
		switch(op) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		}
		
		
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		
//		System.out.println();
		
		}
		
	}



package ���;

import java.util.Scanner;

public class �Է��׽�Ʈ3 {

	public static void main(String[] args) {
	//�Է� ����
	//�Է��� �� �ִ� ��ǰ(scanner) ����ؾ���
		  Scanner sc=new Scanner(System.in);
		  System.out.print("����� ���̴� ");
		  int age=sc.nextInt(); 
		  //next();�� �Է��ϴ� ĭ�� �����, age���ں����� ����. next()�ϸ� String���� �޾ƿͼ� error��. �׷��� nextInt(); int�� �ٲ��ִ°��� ���
		  //Scanner�� nextInt()�� String->int�� ��ȯ
		  System.out.println("����� ���̴� "+age+ "�� �ñ���.");
		  
		  //�̸� �Է�, ���
		  System.out.print("����� �̸��� ");
//		  Scanner scan=new Scanner(System.in); //Scanner�� ������ �ѹ��� �����
		  String name=sc.next(); //String���� �ޱ� ������ next() ��.next()�� ���� ���� name�̶�� ������ ����
		  System.out.println("����� �̸��� "+name+"�̱���.");
		  
	}

}

//Scanner class
//sc.next() : String  // sc.nextInt() : String->int �� ��ȯ //sc.nextdouble() : String->double �� ��ȯ  //
//
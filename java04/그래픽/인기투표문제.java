package �迭;

import java.awt.Window.Type;
import java.util.Scanner;

public class �α���ǥ���� {

	public static void main(String[] args) {
		String[] name= {"������","����ũ","�迬��"};
		int[] count=new int[3];
		Scanner sc=new Scanner(System.in); //Ű���忡�� �Է�
		while(true) {
		System.out.print("�����̸�����: 0)"+name[0]+", 1)"
										  +name[1]+", 2)"
										  +name[2]+">> ");
		
		int data=sc.nextInt(); //String->int �� ��ȯ
		if(data==0) { //������
			count[0]++; //�������� count 1����
		}else if(data==1) {
			count[1]++;
		}else if(data==2) {
			count[2]++;
		}else {
			System.out.println("��ǥ �ý��� ����");
			break;
		} //else end
	} //while end
		for (int i = 0; i < count.length; i++) {
			System.out.println(name[i]+" "+count[i]); //��ǥ�� ��� �����ֱ�
		}
	}
}

package �迭;

import java.util.Scanner;

public class �迭6 {

	public static void main(String[] args) {
		String[] names=new String[5];
		Scanner sc = new Scanner(System.in); //system.in ->Ű����� �Է¹޴´ٴ� ��
		for (int i = 0; i < names.length; i++) {
		System.out.print(i+ ": ���� ��Ͱ� �� ģ�� �̸�: ");
		names[i]=sc.next(); //next()�� �޾Ƽ� sc �� ���������� data ������ ����
	}
		for (String name : names) {
			System.out.println(name);
		}
}
}

//
// ������ �Է�(�Է�)-->�ڹ� ���α׷�(java)(ó��)--> ó����� ������(���)
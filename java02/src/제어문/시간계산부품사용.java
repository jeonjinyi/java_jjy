package ���;

import java.util.Date;

public class �ð�����ǰ��� {

	public static void main(String[] args) {
		Date date=new Date(); //���� �ð� �˷��ִ� ��ǰ
		int hour=date.getHours(); //������ ��ǰ�ε� ���� ����� �� �׾��ִµ� �������
		System.out.println("���� �ð��� "+hour);
		int m=date.getMinutes();
		System.out.println("���� ���� "+m);
		int s=date.getSeconds();
		System.out.println("���� �ʴ� "+s);
		int y=date.getYear()+1900; //1900�⵵�� �����ϰ� ���� 1900�� ���ؾ���
		System.out.println("���� �⵵�� "+y);
		int mo=date.getMonth()+1;  //+1�� ����� ���� ���� ����(��ǰ�� Ư¡��)
		System.out.println("���� ���� "+mo);

	}

}

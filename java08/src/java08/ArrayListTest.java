package java08;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //Ÿ�� ������� �ٵ�
		list.add("�ڽ�Ű");
		list.add("�۽�Ű");
		list.add("�轺Ű");
		list.add("����Ű");
//		list.add(100);
		System.out.println(list.size()); //list�� � ����ִ��� ����. 4 ����
		System.out.println(list); //ArraList��ǰ���� toString�� ���ǵǾ��־ [�ڽ�Ű, �۽�Ű, �轺Ű, ����Ű]�� ����
		list.remove(1); //2���� ��Ģ�߱� ������ ��
		System.out.println(list); //2�� �۽�Ű ���� [�ڽ�Ű, �轺Ű, ����Ű] ����
		System.out.println(list.size()); //3 ����
		
	}

}

//��� �ű�°�
package java08;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		//�ߺ����X
		bag.add("�޴���");
		bag.add("����");
		bag.add("����");
		System.out.println(bag); //[����,����,�޴���]
		bag.add("����");
		System.out.println(bag); //[����,����,�޴���]   //hashset�� �ߺ����� X
		
		
		
	}

}

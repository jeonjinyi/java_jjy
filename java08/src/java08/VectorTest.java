package java08;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector list = new Vector();
		list.add("ȫ�浿");
		list.add('��');
		list.add(true);
		list.add(11.22);
		list.add(100);
		System.out.println(list);
	}

}

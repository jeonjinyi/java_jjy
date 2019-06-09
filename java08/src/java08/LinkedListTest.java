package java08;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList milk = new LinkedList();
		milk.add("어제우유");
		milk.add("오늘우유");
		milk.add("내일우유");
		milk.remove(); 
		System.out.println(milk); //오늘우유, 내일우유만 나옴. remove에 순서 안정해줘도 먼저 들어온것 먼저 지움
		
	}

}

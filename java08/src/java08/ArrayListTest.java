package java08;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //타입 상관없이 다들어감
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
//		list.add(100);
		System.out.println(list.size()); //list에 몇개 들어있는지 보기. 4 나옴
		System.out.println(list); //ArraList부품에는 toString이 정의되어있어서 [박스키, 송스키, 김스키, 정스키]로 나옴
		list.remove(1); //2등이 반칙했기 때문에 뺌
		System.out.println(list); //2등 송스키 빠진 [박스키, 김스키, 정스키] 나옴
		System.out.println(list.size()); //3 나옴
		
	}

}

//등수 매기는것
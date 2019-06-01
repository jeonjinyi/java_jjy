package java05;

public class Person {
	//정적특징- 이름,나이(변수로 만듦)
	String name;
	int age;
	
	//동적특징- 잠자다, 먹다
	public void 잠자다() {
		System.out.println("잠자다");
	}
	public void 먹다() {
		System.out.println("먹다");
	}
}

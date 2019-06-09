package java08;

public class 직원Test {

	public static void main(String[] args) {
		직원 emp1 = new 직원("홍길동","남",20);
		직원 emp2 = new 직원("김길순","여",22);
		직원 emp3 = new 직원("이길식","남",25);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		System.out.println(직원.ageSum/직원.count);
		System.out.println(직원.count);
		
	}

}

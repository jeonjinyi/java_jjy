package 상속;

public class ManagerUser {

	public static void main(String[] args) {
		Manager manage = new Manager();
	
		manage.address="서울";
		manage.bonus=100;
		manage.name="홍길동";
		manage.rrn=800808;
		manage.salary=1000;
		
		System.out.println(manage); //toString manage클래스에서 불러오는것
		manage.test();
		
		
	}

}

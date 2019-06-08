package 상속;

public class 자동차사용 {

	public static void main(String[] args) {
		트럭 car = new 트럭();   //호출할때 자식 class명을 호출한다
		car.color="blue";
		car.name="트럭";
		System.out.println(car);
		
		
		세단 car2 = new 세단();
		car2.color="green";
		car2.name="세단";
		System.out.println(car2);
	}
}


package java08;

public class 형변환1 {
			//형변환(캐스팅)
	public static void main(String[] args) {
		byte b=127;
		int i=b;
		//작->큰(자동형변환)
		
		int i2=127;
		byte b2=(byte)i2;
		//큰->작(강제형변환) ->(타입) 추가
		
	}

}

//참조형(상속관계에 있는 클래스만) 캐스팅됨

//부모 클래스: 큰
//자식 클래스: 작은
//자식=>부모: 자동형변환, 업캐스팅
//Car car=new Truck(); (가능)
//Car car=new Sedan(); (가능)

//부모=>자식: 강제형변환, 다운캐스팅
//Car car=new Car();	
//Truck t=(Truck)Car(); 부모클래스를 자식클래스에 맞춤(Truck)
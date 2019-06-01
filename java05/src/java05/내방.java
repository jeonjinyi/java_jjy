package java05;

public class 내방 {

	public static void main(String[] args) {
		
		Person me = new Person(); //Person 부품을 하나만 만들면 me와 dad를 같은 속성을 가진 class를 갖고와서 다른 특성 가진 것으로 만들수있음
		Person dad = new Person();
		me.name="홍길동";
		me.age=15;
		me.잠자다();
		dad.name="홍두식";
		dad.age=50;
		dad.먹다();
		System.out.println(me.name);
		System.out.println(me); //me에 저장된값 보기 (주소 있음)
		
		강아지 dog = new 강아지();
		dog.color="brown";
		dog.size="small";
		dog.sleep=false;
		dog.bark();  //. 뒤에() 가 있으면 메소드
		dog.run();
		System.out.println("-------------");
		
		TV tv1 = new TV();
		tv1.ch=100;
		tv1.color="검정색";
		tv1.onOff=true;
		tv1.채널바꾸다();
		tv1.볼륨을조절하다();
		System.out.println("-------------");
	
		TV tv2 = new TV();
		tv2.ch=50;
		tv2.color="빨간색";
		tv2.onOff=true;
		tv2.채널바꾸다();
		System.out.println("-------------");
		
		휴대폰 phone1 = new 휴대폰();
		phone1.shape="네모";
		phone1.size=11;
		
		System.out.println(phone1.shape);
		System.out.println(phone1.size);
		phone1.tel(); //call(tel메소드를 호출한다)
		phone1.text();
		
		휴대폰 phone2 = new 휴대폰();
		phone2.shape="동그라미";
		phone2.size=15;
		phone2.game();
	}

}

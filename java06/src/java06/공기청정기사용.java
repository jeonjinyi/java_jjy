package java06;

public class 공기청정기사용 {

	public static void main(String[] args) {
		//생성자 shape,company,price 있는것 자동으로 선택해서 가져옴
		//null, 0 나오는 이유: 멤버변수 초기화해주기 때문에
		공기청정기 air1 = new 공기청정기("네모");
		공기청정기 air2 = new 공기청정기("네모",100);
		공기청정기 air3 = new 공기청정기("네모","삼성",100);
		System.out.println(air1);
		System.out.println(air2);
		System.out.println(air3);
	}

}

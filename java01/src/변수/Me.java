package 변수;

public class Me {

	public static void main(String[] args) {
	//변수를 만들어 봅시다.
	int age=100;  //올해 나이. int는 음수는 -21억, 양수는 21억까지 들어감. 더 큰 숫자는 long 변수로 함
	byte count=127;//byte는 -128~127까지만 저장됨
	short count2=30000;//short는 -30000~30000까지만 쓸수있음
	long count3=2000000000L;//long은 -20억~20억
	
	float eye2=0.9f; //f넣어줘야함. 소수점 8글자까지
	int last=age-1; //작년 나이
	double eye=0.5;
	char gender='여';
	boolean food=true; //또는 false
	String name="전진이";
	
	System.out.println("내 이름은 "+name+" 입니다.");
	System.out.println("내 나이는 "+age+"세 입니다.");
	System.out.println("내 작년 나이는 "+last+"세 였습니다.");
	System.out.println("내 시력은 "+eye+"입니다.");
	System.out.println("내 성별은 "+gender+"입니다.");
	System.out.println("아침을 먹었나요?"+food);
	
	}

}

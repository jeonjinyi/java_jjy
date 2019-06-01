package java05;


public class 정보사용 {

	public static void main(String[] args) {
		정보 info = new 정보();
		info.info("전진이");
		info.bye();
		int h=info.hour(); //return값이 있으면 데이터유형 int 있어야함
		System.out.println(h+"시입니다");
	}
		

}

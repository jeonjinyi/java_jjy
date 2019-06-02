package java06;

public class 에러처리 {

	public static void main(String[] args) {  //오류(exception) 발생하면 main으로 던져라.
		try {
			System.out.println(10/0); //에러나는 부분을 try-catch안으로 넣으면 에러안나고 다음으로 넘어감
		}catch (Exception e) {
		}
		System.out.println("내가 처리 될까요..");
		
	}

}

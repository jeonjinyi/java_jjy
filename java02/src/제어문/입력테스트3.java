package 제어문;

import java.util.Scanner;

public class 입력테스트3 {

	public static void main(String[] args) {
	//입력 연습
	//입력할 수 있는 부품(scanner) 사용해야함
		  Scanner sc=new Scanner(System.in);
		  System.out.print("당신의 나이는 ");
		  int age=sc.nextInt(); 
		  //next();로 입력하는 칸을 만들고, age숫자변수에 넣음. next()하면 String으로 받아와서 error남. 그래서 nextInt(); int로 바꿔주는것을 사용
		  //Scanner의 nextInt()는 String->int로 변환
		  System.out.println("당신의 나이는 "+age+ "세 시군요.");
		  
		  //이름 입력, 출력
		  System.out.print("당신의 이름은 ");
//		  Scanner scan=new Scanner(System.in); //Scanner는 위에서 한번만 쓰면됨
		  String name=sc.next(); //String으로 받기 때문에 next() 씀.next()로 받은 값을 name이라는 변수에 저장
		  System.out.println("당신의 이름은 "+name+"이군요.");
		  
	}

}

//Scanner class
//sc.next() : String  // sc.nextInt() : String->int 로 변환 //sc.nextdouble() : String->double 로 변환  //
//
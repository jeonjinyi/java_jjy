package 배열;

import java.util.Scanner;

public class 배열6 {

	public static void main(String[] args) {
		String[] names=new String[5];
		Scanner sc = new Scanner(System.in); //system.in ->키보드로 입력받는다는 뜻
		for (int i = 0; i < names.length; i++) {
		System.out.print(i+ ": 새로 사귀게 된 친구 이름: ");
		names[i]=sc.next(); //next()로 받아서 sc 에 넣은다음에 data 변수에 넣음
	}
		for (String name : names) {
			System.out.println(name);
		}
}
}

//
// 데이터 입력(입력)-->자바 프로그램(java)(처리)--> 처리결과 보여줌(출력)
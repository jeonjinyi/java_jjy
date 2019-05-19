package 제어문;

public class 반복문테스트2 {

	public static void main(String[] args) {
		int count=1; //시작값
		while (count<=10) { //조건
			System.out.println(count+": 반갑습니다."); 
			count=count+1;//증감값 . 없으면 무한loop돈다
		}

	}
}

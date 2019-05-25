package 배열;

public class 배열5 {

	public static void main(String[] args) {
		//배열은 변수있는 메모리를 자동 초기화 시킴
		int[] ages=new int[5];
		System.out.println(ages[0]); //배열 0번째 들어가있는 값을 볼수있음
		System.out.println(ages); //5개 배열의 주소가 들어가있는것을 볼수있음
		System.out.println("------------------");
		//1~5까지 값을 넣어보자
		for (int i = 0; i < ages.length; i++) {
			ages[i]=i+1;
		}
		for (int i : ages) {
			System.out.print(i+" ");
		}
		
	}

}


//int num; 4바이트 크기를 할당 하지만 메모리 안에 남아있는 쓰레기값이 있음
//num=0; 그래서 0으로 초기화 시켜줌 //배열은 자동 초기화해줌
//num++; 값을 할당
//변수의 2가지 종류 : 
//기본형 (값이 저장) - 정수,실수,문자,논리
//참조형(주소가 저장)- 나머지 다. (배열변수, String, 클래스, 콜렉션, ...)
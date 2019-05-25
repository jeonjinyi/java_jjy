package 배열;

public class 배열3 {

	public static void main(String[] args) {
		int[] ages= {100, 40, 20, 30};
//		int ages[]= {100, 40, 20, 30}; //두개 같은 배열 선언
		
		System.out.println(ages.length); //배열 몇개인지
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		System.out.println(ages[3]);
		System.out.println("----------------------------"); //이 기준으로 위아래 같음
		
		for (int i = 0; i < ages.length; i++) { //ages.length 는 4(배열 갯수)이기 때문에
		System.out.println(i+": "+ages[i]);
		}
		
		//for-each문
		for(int i : ages) {
			System.out.println(i);
		}
	}

}

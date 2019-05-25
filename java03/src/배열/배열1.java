package 배열;

public class 배열1 {

	public static void main(String[] args) {
		int[] ages= {100, 50, 30, 15, 23};
					//0	  1   2   3   4
					//배열의 값을 가져올때는
					//배열명[위치값], 위치값=index
		System.out.println(ages[0]);
		System.out.println(ages[4]);
		//배열의 값을 넣을때는
		//배열명[인덱스]=값;
		ages[0]=200;
		System.out.println(ages[0]);
	}

}

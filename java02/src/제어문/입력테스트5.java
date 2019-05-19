package Á¦¾î¹®;

import java.util.Scanner;

public class ÀÔ·ÂÅ×½ºÆ®5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Áö±Ý ½Ã°¢Àº ");
		int time = sc.nextInt();
		if (time <= 10) {
			System.out.println("±Â¸ð´×");
		} else if (time <= 14) {
			System.out.println("±Â¾ÖÇÁÅÍ´«");
		} else if (time <= 20) {
			System.out.println("±ÂÀÌºê´×");
		} else {
			System.out.println("±Â³ªÀÕ");

			//1~10±îÁö ±Â¸ð´×, 10½Ã1ºÐºÎÅÍ~14±îÁö ±Â¾ÖÇÁÅÍ´«, 14½Ã1ºÐºÎÅÍ~20±îÁö ±ÂÀÌºê´×, 20½Ã1ºÐºÎÅÍ~ ´Â ±Â³ªÀÕ
		}

	}

}

//Scanner class
//sc.next() : String  // sc.nextInt() : String->int ·Î º¯È¯ //sc.nextdouble() : String->double ·Î º¯È¯  //
//
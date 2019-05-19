package 제어문;

import java.util.Date;

public class 입력테스트6 {

	public static void main(String[] args) {
		 Date date=new Date(); //오류나면 import에 java.sql.Date (최근것)으로 import돼있던 것임. java.util로 바꿔야함
		 int month=date.getMonth()+1;
		 if(month==3||month==4||month==5) {
			 System.out.println("봄");
		 }else if(month==6||month==7||month==8) {
				 System.out.println("여름");
		 }else if(month==9||month==10||month==11) {
			 System.out.println("가을");
		 }else {
			 System.out.println("겨울");
		 }
	}

}

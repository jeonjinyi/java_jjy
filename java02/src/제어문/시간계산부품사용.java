package 제어문;

import java.util.Date;

public class 시간계산부품사용 {

	public static void main(String[] args) {
		Date date=new Date(); //현재 시간 알려주는 부품
		int hour=date.getHours(); //오래된 부품인데 새거 쓰라고 줄 그어주는데 상관없음
		System.out.println("현재 시각은 "+hour);
		int m=date.getMinutes();
		System.out.println("현재 분은 "+m);
		int s=date.getSeconds();
		System.out.println("현재 초는 "+s);
		int y=date.getYear()+1900; //1900년도만 생각하고 만들어서 1900을 더해야함
		System.out.println("현재 년도는 "+y);
		int mo=date.getMonth()+1;  //+1을 해줘야 현재 월이 나옴(부품의 특징임)
		System.out.println("현재 월은 "+mo);

	}

}

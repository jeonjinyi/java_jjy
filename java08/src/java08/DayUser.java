package java08;

public class DayUser {

	public static void main(String[] args) {
		
		
		Day day1 = new Day("�ڹٰ���",10,"����");
		System.out.println(day1.count);
		Day day2 = new Day("����",15,"������");
		System.out.println(day2.count);
		Day day3 = new Day("�",11,"��Ʈ�Ͻ�"); 
		System.out.println(day3.count);
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		//static������ Ŭ������ �Ѱ��� ����
		//Ŭ�����̸�.Ŭ��������  <-�� ���
		System.out.println(Day.count);
		System.out.println(Day.get());
		System.out.println(Day.total);
		System.out.println(Day.total/3);
		
	}

}

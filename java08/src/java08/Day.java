package java08;

public class Day {
	//�ν��Ͻ� ����
	String doing;
	int time;
	String location;
	
	//Ŭ���� ����, Ŭ������ �Ѱ��� ����
	//��ü ������ ���� ������� ����
	//��ü ������ ��� ���� ����
	//������ ��ü���� ������ ���� ����, ����
	static int count;
	static int total;
	static int avg;
	
	
	public static int get() {
		return count;
	}
	
	//�������߰�
	public Day(String doing, int time, String location) {
	
		total=total+time;
		count++;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}
	
	//toString�߰�
	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	
	
	
}

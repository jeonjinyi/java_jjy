package java06;

public class Car2 {
	//����Ư¡
	String color;
	int price;
	
	//������: ��ü����(new)�� �� �ڵ����� �ʱ�ȭ
	//��ü ������ ��, �ڵ����� ȣ��(����)
	//Ŭ�����̸��� ����, �빮�ڷ� �����ϴ� ������ �޼ҵ�
	//���� Source �޴����� generate contructor using field �޴��� �̿��ؼ� ���������
	public Car2(String color) {
		this.color = color;
	}
	public Car2(int price) {
		this.price = price;
	}
	public Car2(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	
	//����Ư¡(�޼ҵ�)
	public void speedUp() {
		System.out.println("�ӵ��� up");
		System.out.println("300���� �ӵ��� up");
	}

	public int get() {
		 return 300;
	 }

	}
	




//�Ұ�ȣ(): �޼ҵ� �Է°� ����
//�߰�ȣ{}: Ŭ��������, �޼ҵ� ����, �迭�� �˰������� �Ҵ�
//���ȣ[]: �迭���� ���Ҷ�, �迭Ÿ�� ����, ���ʸ����α׷�
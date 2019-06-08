package ���;
public class Car {
	//�ڵ���=> class
	//����Ư¡: ��, �ӵ�=>�������
	String color;
	int speed;
	
	//������1. �⺻ ������: �Է°� ���� ������
	public Car() {
		super();
	}
	//������2. ������. �����ε�(���� �޼ҵ���� ������ ���°�. �Ű������� �ٸ�)
	public Car(String color) {
		this.color = color;
	}
	//������3. ������. �����ε�. ���� ����Ư¡/����Ư¡ ���̿� ��
	public Car(String color, int speed) { //������ void�� ��ȯ�� �Ƚ���. Ŭ���� Car�� �Ȱ��� �޼ҵ�� ��
		this.color = color; //String color �� ���� ������ ���� this �����
		this.speed = speed; //int speed�� ���� ������ this�����
	}
	//����Ư¡: �ӵ� up, �ӵ�down =>����޼ҵ�
	public void speedUp() {
		System.out.println("�ӵ��� Up.");
	}
	public int speedDown() {
		System.out.println("�ӵ��� Down.");
		return 60; // int�� ��ȯ�� ���߱� ������ ���ϰ��� �� �־����. 60 ��ŭ �ӵ� �����ٶ�� ��
	}
	//�������̵�(������). �Ʒ� �������̵� ���� CarUserŬ�������� println()�� ���� ���Ǿ��ص� �� (source �޴��� generate toString�޴��� ���������)
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + "]";
	}
}

package ���;

//�� Ŭ���� ������� ����: 3��, ����޼ҵ� ����: 3����(�θ� Ŭ������ �̹� 2���� �ֱ� ������)
public class Truck extends Car{ //CarŬ������ Ȯ���ؼ� TruckŬ������ ����ڴ�.(���). ����2��, �޼ҵ�2 �� ���� ������
	int weight; //������� �߰�
	
	public void move() { //����޼ҵ� �߰�
		System.out.println("������ ����ϴ�");
	}

	@Override //�����Ǵ� ����� �޾��� �� �� �� �ִ�. ex)�θ�Կ��� ��ũ ���� �޾Ҵµ�, ���� �Ⱦ ��� ���� �ٲٴ°� (�� �� ����� �״��)
	public String toString() {
		return "Truck [weight=" + weight + ", color=" + color + ", speed=" + speed + "]";
	}
	
}

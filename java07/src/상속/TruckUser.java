package ���;

public class TruckUser { //Car�� ��ӹ��� Truck�� ����ϴ� Ŭ����. ����/���� ���α׷�

	public static void main(String[] args) {
		Truck truck = new Truck();
		truck.color="green";
		truck.speed=150;
		truck.weight=1;
		System.out.println(truck);
		
		truck.speedUp();
		System.out.println(truck.speedDown());
//		System.out.println(truck.move()); //println������. ����: TruckŬ�������� move�޼ҵ� ��ȯ���� void�� �߱� ������ �Ʒ�ó�� �ؾߵ�.
		truck.move();
	}
}

//���(����)
//��(1��)+1��=��(2��)
//extends(Ȯ���ϴ�)
//�θ�Ŭ������ �Ѱ�(���ϻ�Ӹ�!)
//Car(�θ�Ŭ����) <---- truck(�ڽ�Ŭ����)
//super: �θ�Ŭ����, sub: �ڽ�Ŭ����

package java08;

public class ����ȯ1 {
			//����ȯ(ĳ����)
	public static void main(String[] args) {
		byte b=127;
		int i=b;
		//��->ū(�ڵ�����ȯ)
		
		int i2=127;
		byte b2=(byte)i2;
		//ū->��(��������ȯ) ->(Ÿ��) �߰�
		
	}

}

//������(��Ӱ��迡 �ִ� Ŭ������) ĳ���õ�

//�θ� Ŭ����: ū
//�ڽ� Ŭ����: ����
//�ڽ�=>�θ�: �ڵ�����ȯ, ��ĳ����
//Car car=new Truck(); (����)
//Car car=new Sedan(); (����)

//�θ�=>�ڽ�: ��������ȯ, �ٿ�ĳ����
//Car car=new Car();	
//Truck t=(Truck)Car(); �θ�Ŭ������ �ڽ�Ŭ������ ����(Truck)
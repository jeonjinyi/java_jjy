package ���;

public class �ڵ��� {
	//���� Ư¡
	String color;
	String name;
	
	//�߿�: �⺻ ������ (�� ������ �ڽ� Ŭ�������� �⺻ �����ڸ� �� ���� ���� ������) �� ���� ������. 
	public �ڵ���() {
	}
	//������
	public �ڵ���(String color, String name) {
		this.color = color;
		this.name = name;
	}
	//���� Ư¡
	public void start() {
		System.out.println("����ϴ�");
	}
	public void stop() {
		System.out.println("���ߴ�");
	}

	@Override
	public String toString() {
		return "�ڵ��� [color=" + color + ", name=" + name + "]";
	}
}

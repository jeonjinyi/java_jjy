package java05;

public class ���� {

	public static void main(String[] args) {
		
		Person me = new Person(); //Person ��ǰ�� �ϳ��� ����� me�� dad�� ���� �Ӽ��� ���� class�� ����ͼ� �ٸ� Ư�� ���� ������ ���������
		Person dad = new Person();
		me.name="ȫ�浿";
		me.age=15;
		me.���ڴ�();
		dad.name="ȫ�ν�";
		dad.age=50;
		dad.�Դ�();
		System.out.println(me.name);
		System.out.println(me); //me�� ����Ȱ� ���� (�ּ� ����)
		
		������ dog = new ������();
		dog.color="brown";
		dog.size="small";
		dog.sleep=false;
		dog.bark();  //. �ڿ�() �� ������ �޼ҵ�
		dog.run();
		System.out.println("-------------");
		
		TV tv1 = new TV();
		tv1.ch=100;
		tv1.color="������";
		tv1.onOff=true;
		tv1.ä�ιٲٴ�();
		tv1.�����������ϴ�();
		System.out.println("-------------");
	
		TV tv2 = new TV();
		tv2.ch=50;
		tv2.color="������";
		tv2.onOff=true;
		tv2.ä�ιٲٴ�();
		System.out.println("-------------");
		
		�޴��� phone1 = new �޴���();
		phone1.shape="�׸�";
		phone1.size=11;
		
		System.out.println(phone1.shape);
		System.out.println(phone1.size);
		phone1.tel(); //call(tel�޼ҵ带 ȣ���Ѵ�)
		phone1.text();
		
		�޴��� phone2 = new �޴���();
		phone2.shape="���׶��";
		phone2.size=15;
		phone2.game();
	}

}

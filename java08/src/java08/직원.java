package java08;

public class ���� {
	String name;
	String gender;
	int age;
	
	//��ճ���, ������
	static int ageSum;
	static int count;
	
	
	public ����(String name, String gender, int age) {
		 
		ageSum=ageSum+age; //���� ���
		count++; //������ �Ѹ� �ö�����
		
		this.name = name;
		this.gender = gender;
		this.age = age;
	}


	@Override
	public String toString() {
		return "���� [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}

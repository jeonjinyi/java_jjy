package �迭;

public class �迭3 {

	public static void main(String[] args) {
		int[] ages= {100, 40, 20, 30};
//		int ages[]= {100, 40, 20, 30}; //�ΰ� ���� �迭 ����
		
		System.out.println(ages.length); //�迭 �����
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		System.out.println(ages[3]);
		System.out.println("----------------------------"); //�� �������� ���Ʒ� ����
		
		for (int i = 0; i < ages.length; i++) { //ages.length �� 4(�迭 ����)�̱� ������
		System.out.println(i+": "+ages[i]);
		}
		
		//for-each��
		for(int i : ages) {
			System.out.println(i);
		}
	}

}

package �迭;

public class �迭5 {

	public static void main(String[] args) {
		//�迭�� �����ִ� �޸𸮸� �ڵ� �ʱ�ȭ ��Ŵ
		int[] ages=new int[5];
		System.out.println(ages[0]); //�迭 0��° ���ִ� ���� ��������
		System.out.println(ages); //5�� �迭�� �ּҰ� ���ִ°��� ��������
		System.out.println("------------------");
		//1~5���� ���� �־��
		for (int i = 0; i < ages.length; i++) {
			ages[i]=i+1;
		}
		for (int i : ages) {
			System.out.print(i+" ");
		}
		
	}

}


//int num; 4����Ʈ ũ�⸦ �Ҵ� ������ �޸� �ȿ� �����ִ� �����Ⱚ�� ����
//num=0; �׷��� 0���� �ʱ�ȭ ������ //�迭�� �ڵ� �ʱ�ȭ����
//num++; ���� �Ҵ�
//������ 2���� ���� : 
//�⺻�� (���� ����) - ����,�Ǽ�,����,��
//������(�ּҰ� ����)- ������ ��. (�迭����, String, Ŭ����, �ݷ���, ...)
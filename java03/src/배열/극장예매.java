package �迭;

import java.util.Scanner;

public class ���忹�� {

	public static void main(String[] args) {
		System.out.println("-----------------------------");
		int[] seat=new int[10];
		Scanner sc = new Scanner(System.in);
		//0~9 index. length=10
		//while �������� �� �ȿ� ���忡���� ���� ���� while�� �ۿ� ��
		
		while(true) { //true�� �����ְ�, false�� �Ⱥ�����. �����Ѵٰ� �Է��� ���ڸ� 1�� �ٲ���
			//�¼���ȣ �����ִ� �κ�
			for (int i = 0; i < seat.length; i++) {
			System.out.print(i+1 +"  ");
			}
			System.out.println();
			System.out.println("-----------------------------");
			
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i]+"  ");
			}		
			System.out.println();
			//�¼� ���Ż�Ȳ �����ִ� �κ�
			System.out.println("-----------------------------");
			System.out.print("������ �¼���ȣ(�����0��): ");
			
			int data=sc.nextInt(); //0�� �Է� 
			if(data==0) {
				System.out.println("���� �ý����� �����մϴ�.");
				break;
			}
			if(seat[data-1] !=0) { //�ڸ��� 0�� �ƴϸ�. 1�̸�
				System.out.println("�̹� ���ŵ� �ڸ��Դϴ�.");
				System.out.println("�ٸ� �¼��� �������ּ���.");
			}else {
			seat[data-1]=1;
			System.out.println("���Ÿ� �Ϸ��߽��ϴ�");
		}
		
		
		
	}

}
}
package �迭;

import javax.swing.JOptionPane;

public class ����â���� {

	public static void main(String[] args) {
		//�Է¿�
		String name=JOptionPane.showInputDialog("����� �̸��� �Է����ּ���");
		//��¿�
		JOptionPane.showMessageDialog(null,"����� �̸��� "+name+"�̱���");
		//Ȯ�ο� (0:��, 1:�ƴϿ�, 2:���)
		int result=JOptionPane.showConfirmDialog(null, "������ ����� �̸��� "+name+"�ΰ���?");
		System.out.println(result); 
		
	}

}

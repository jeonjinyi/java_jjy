package java06;

import java.io.File;

public class ���ϴٷ�� {

	public static void main(String[] args) {
//		String file="c:/temp";
		//��ǻ�ʹ�  String�� ���Ϸ� �νľ���
		File f = new File("c:/temp"); //�������� �νĽ����ִ� ��ǰ
		System.out.println(f.exists()); //������? yes->true
		System.out.println(f.isDirectory()); //���丮��? yes->true
		System.out.println(f.isFile()); //�����̾�? no->false
		
		
	}

}

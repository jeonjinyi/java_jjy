package java06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ���ϴٷ��2 {

	public static void main(String[] args) throws Exception {   //throw Exception�� new FileWriter�κ� �������� �߰� �� ���� ������
		FileWriter file = new FileWriter("c:/temp/20190602.txt"); //������ ����ͼ� ���� ��ǰ
		file.write("hi~\r\n");  // \r\n�� .txt�� ���� ���� ������
		file.write("�ȳ�~\r\n");
		file.close();
		
		
		
	}

}

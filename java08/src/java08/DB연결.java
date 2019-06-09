package java08;

import java.sql.*;

import javax.swing.JOptionPane;

public class DB���� {
											//����ó�� exception�� �θ�Ŭ����?
	public static void main(String[] args)  throws Exception {
		//1. Ŀ���� ����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. Ŀ���� ���� ����");
		
		//2. DB����(db��, user, pw) *jdbc:java db connectivity
		String url="jdbc:mysql://localhost:3366/bigdata";
		String user="root";
		String password="1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db���� ����");
		
		//3. sql�� ����
		String id=JOptionPane.showInputDialog("���̵� �Է�");
		String pw=JOptionPane.showInputDialog("�н����� �Է�");
		String name=JOptionPane.showInputDialog("�̸� �Է�");
		String tel=JOptionPane.showInputDialog("��ȭ��ȣ �Է�");
		
		String sql="insert into member values (?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql); //PreparedStatment�� sql���̶�� �ϴ� ��ǰ
		ps.setString(1, id);//1�� ����ǥ�� id
		ps.setString(2, pw);//2�� ����ǥ�� pw
		ps.setString(3, name);//3�� ����ǥ�� name
		ps.setString(4, tel);//4�� ����ǥ�� tel
		System.out.println("3. sql�� ���� ����");

		//4. sql�� ����(�����û) mysql�� ��û
		ps.executeUpdate();
		System.out.println("4. sql�� ���� ����");
	}
} 
//�ܺ��� �ڿ��� ������ ���� ������ �߻��� ������ �����Ƿ�,
//�ݵ�� ����ó���� �ϰ� �Ǿ�����
//�ܺ��� �ڿ�: ����, db, ��Ʈ��ũ(ä��) ��
//����ó���ϴ� ���: 1. �ش� �޼ҵ忡�� ó�� (try~catch) 2. �ش� �޼ҵ带 ȣ���ϴ� ������ ó��(throws)
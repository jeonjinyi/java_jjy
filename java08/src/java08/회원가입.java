package java08;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

//jframe������ jframe�� �θ�Ŭ������ �θ��
public class ȸ������ extends JFrame {
	private JTextField id;
	private JTextField pw;
	private JTextField name;
	private JTextField tel;

	public ȸ������() {
		getContentPane().setBackground(Color.PINK);
		getContentPane().setForeground(Color.MAGENTA);
		setTitle("ȸ������");
		setSize(500, 500);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514:");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 22));
		getContentPane().add(lblNewLabel);

		id = new JTextField();
		id.setBackground(Color.YELLOW);
		id.setForeground(Color.BLACK);
		id.setFont(new Font("����", Font.PLAIN, 20));
		getContentPane().add(id);
		id.setColumns(30);

		JLabel lblNewLabel_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC:");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 22));
		getContentPane().add(lblNewLabel_1);

		pw = new JTextField();
		pw.setBackground(Color.CYAN);
		pw.setForeground(Color.BLACK);
		pw.setFont(new Font("����", Font.PLAIN, 20));
		getContentPane().add(pw);
		pw.setColumns(30);

		JLabel lblNewLabel_2 = new JLabel("\uC774  \uB984:");
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 22));
		getContentPane().add(lblNewLabel_2);

		name = new JTextField();
		name.setBackground(Color.YELLOW);
		name.setForeground(Color.BLACK);
		name.setFont(new Font("����", Font.PLAIN, 20));
		getContentPane().add(name);
		name.setColumns(30);

		JLabel lblNewLabel_3 = new JLabel("\uC804\uD654\uBC88\uD638:");
		lblNewLabel_3.setFont(new Font("����", Font.PLAIN, 22));
		getContentPane().add(lblNewLabel_3);

		tel = new JTextField();
		tel.setBackground(Color.CYAN);
		tel.setForeground(Color.BLACK);
		tel.setFont(new Font("����", Font.PLAIN, 20));
		getContentPane().add(tel);
		tel.setColumns(30);

		JButton b = new JButton("\uD68C\uC6D0\uAC00\uC785");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				try {
					// 1. Ŀ���� ����
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1. Ŀ���� ���� ����");

					// 2. DB����(db��, user, pw) *jdbc:java db connectivity
					String url = "jdbc:mysql://localhost:3366/bigdata";
					String user = "root";
					String password = "1234";

					Connection con = DriverManager.getConnection(url, user, password);
					System.out.println("2. db���� ����");

					// 3. sql�� ����
					String gid = id.getText(); //jframe�� id~tel �̶�� ������  gid�� �־���
					String gpw = pw.getText();
					String gname = name.getText();
					String gtel = tel.getText();

					String sql = "insert into member values (?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(sql); // PreparedStatment�� sql���̶�� �ϴ� ��ǰ
					ps.setString(1, gid);// 1�� ����ǥ�� id
					ps.setString(2, gpw);// 2�� ����ǥ�� pw
					ps.setString(3, gname);// 3�� ����ǥ�� name
					ps.setString(4, gtel);// 4�� ����ǥ�� tel
					System.out.println("3. sql�� ���� ����");

					// 4. sql�� ����(�����û) mysql�� ��û
					ps.executeUpdate();
					System.out.println("4. sql�� ���� ����");
					
					//��� �Է��ϰ� ȸ������ ������(db�� �����ϰ���) ���� �ؽ�Ʈ �����
					id.setText("");
					pw.setText("");
					name.setText("");
					tel.setText("");
					
				} catch (Exception e) {
					System.out.println(e.getMessage()); // try catch���� ���� �����޼��� ����� �����
				}
			}
		});
		b.setFont(new Font("����", Font.PLAIN, 20));
		getContentPane().add(b);
		setVisible(true);
	}

	public static void main(String[] args) {
		ȸ������ name = new ȸ������();
	}
}

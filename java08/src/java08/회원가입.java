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

//jframe쓰려면 jframe을 부모클래스로 두면됨
public class 회원가입 extends JFrame {
	private JTextField id;
	private JTextField pw;
	private JTextField name;
	private JTextField tel;

	public 회원가입() {
		getContentPane().setBackground(Color.PINK);
		getContentPane().setForeground(Color.MAGENTA);
		setTitle("회원가입");
		setSize(500, 500);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514:");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 22));
		getContentPane().add(lblNewLabel);

		id = new JTextField();
		id.setBackground(Color.YELLOW);
		id.setForeground(Color.BLACK);
		id.setFont(new Font("굴림", Font.PLAIN, 20));
		getContentPane().add(id);
		id.setColumns(30);

		JLabel lblNewLabel_1 = new JLabel("\uD328\uC2A4\uC6CC\uB4DC:");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 22));
		getContentPane().add(lblNewLabel_1);

		pw = new JTextField();
		pw.setBackground(Color.CYAN);
		pw.setForeground(Color.BLACK);
		pw.setFont(new Font("굴림", Font.PLAIN, 20));
		getContentPane().add(pw);
		pw.setColumns(30);

		JLabel lblNewLabel_2 = new JLabel("\uC774  \uB984:");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 22));
		getContentPane().add(lblNewLabel_2);

		name = new JTextField();
		name.setBackground(Color.YELLOW);
		name.setForeground(Color.BLACK);
		name.setFont(new Font("굴림", Font.PLAIN, 20));
		getContentPane().add(name);
		name.setColumns(30);

		JLabel lblNewLabel_3 = new JLabel("\uC804\uD654\uBC88\uD638:");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 22));
		getContentPane().add(lblNewLabel_3);

		tel = new JTextField();
		tel.setBackground(Color.CYAN);
		tel.setForeground(Color.BLACK);
		tel.setFont(new Font("굴림", Font.PLAIN, 20));
		getContentPane().add(tel);
		tel.setColumns(30);

		JButton b = new JButton("\uD68C\uC6D0\uAC00\uC785");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				try {
					// 1. 커넥터 설정
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1. 커넥터 설정 성공");

					// 2. DB연결(db명, user, pw) *jdbc:java db connectivity
					String url = "jdbc:mysql://localhost:3366/bigdata";
					String user = "root";
					String password = "1234";

					Connection con = DriverManager.getConnection(url, user, password);
					System.out.println("2. db연결 성공");

					// 3. sql문 결정
					String gid = id.getText(); //jframe에 id~tel 이라는 변수를  gid에 넣어줌
					String gpw = pw.getText();
					String gname = name.getText();
					String gtel = tel.getText();

					String sql = "insert into member values (?,?,?,?)";
					PreparedStatement ps = con.prepareStatement(sql); // PreparedStatment는 sql문이라고 하는 부품
					ps.setString(1, gid);// 1번 물음표에 id
					ps.setString(2, gpw);// 2번 물음표에 pw
					ps.setString(3, gname);// 3번 물음표에 name
					ps.setString(4, gtel);// 4번 물음표에 tel
					System.out.println("3. sql문 결정 성공");

					// 4. sql문 전송(실행요청) mysql에 요청
					ps.executeUpdate();
					System.out.println("4. sql문 전송 성공");
					
					//모두 입력하고 회원가입 누르면(db에 전송하고나면) 기존 텍스트 지우기
					id.setText("");
					pw.setText("");
					name.setText("");
					tel.setText("");
					
				} catch (Exception e) {
					System.out.println(e.getMessage()); // try catch에서 잡은 에러메세지 어떤건지 찍어줌
				}
			}
		});
		b.setFont(new Font("굴림", Font.PLAIN, 20));
		getContentPane().add(b);
		setVisible(true);
	}

	public static void main(String[] args) {
		회원가입 name = new 회원가입();
	}
}

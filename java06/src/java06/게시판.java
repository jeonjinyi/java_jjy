package java06;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class �Խ��� {
	private JTextField t1;
	private JTextField t2;
	private JTextField t4;
	private JTextField t3;

	public �Խ���() {
		JFrame f = new JFrame("���� �Խ���");
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(414, 763);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_4 = new JLabel("");
		f.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("D:\\workspace_jjy\\java06\\\uAC8C\uC2DC\uD3102.PNG"));
		f.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel = new JLabel("\uB0A0\uC9DC");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 30));
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setForeground(Color.GREEN);
		t1.setFont(new Font("����", Font.PLAIN, 30));
		f.getContentPane().add(t1);
		t1.setColumns(13);
		
		JLabel lblNewLabel_1 = new JLabel("\uC81C\uBAA9");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 30));
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setForeground(Color.GREEN);
		t2.setFont(new Font("����", Font.PLAIN, 30));
		f.getContentPane().add(t2);
		t2.setColumns(13);
		
		JLabel lblNewLabel_3 = new JLabel("\uB0B4\uC6A9");
		lblNewLabel_3.setFont(new Font("����", Font.PLAIN, 30));
		f.getContentPane().add(lblNewLabel_3);
		
		t3 = new JTextField();
		t3.setForeground(Color.GREEN);
		t3.setFont(new Font("����", Font.PLAIN, 30));
		f.getContentPane().add(t3);
		t3.setColumns(13);
		
		JLabel lblNewLabel_2 = new JLabel("\uAE00\uC4F4\uC774");
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 30));
		f.getContentPane().add(lblNewLabel_2);
		
		t4 = new JTextField();
		t4.setForeground(Color.GREEN);
		t4.setFont(new Font("����", Font.PLAIN, 30));
		f.getContentPane().add(t4);
		t4.setColumns(13);
		
		JButton btnNewButton = new JButton("\uAE00 \uC62C\uB9AC\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String day=t1.getText();
				String ����=t2.getText();
				String ����=t3.getText();
				String �۾���=t4.getText();
				
				//try�ȿ��� ������ �߻��ϸ�, catch���� ��ƶ�
				try {
					FileWriter file = new FileWriter(day+".txt");
					file.write(day+"\r\n");
					file.write(����+"\r\n");
					file.write(����+"\r\n");
					file.write(�۾���+"\r\n");
					file.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				
				
				System.out.println(day);
				System.out.println(����);
				System.out.println(����);
				System.out.println(�۾���);
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("����", Font.PLAIN, 20));
		f.getContentPane().add(btnNewButton);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		�Խ��� bbs = new �Խ���(); //����  public �Խ���() ������ ȣ����. static�Ⱦ��� ���ؼ�.static�� �޸𸮸� ���� �����
		
		
		
	}

}

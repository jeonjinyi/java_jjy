package java06;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class °Ô½ÃÆÇ2 {
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	public static void main(String[] args) {
		°Ô½ÃÆÇ2 bbs = new °Ô½ÃÆÇ2();
		
	}
		public °Ô½ÃÆÇ2() {
			JFrame f = new JFrame("³ªÀÇ °Ô½ÃÆÇ");
			f.setSize(296, 547);
			f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			
			JLabel lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setIcon(new ImageIcon("D:\\workspace_jjy\\java06\\naver.PNG"));
			f.getContentPane().add(lblNewLabel_4);
			
			JLabel lblNewLabel = new JLabel("ID");
			lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 35));
			f.getContentPane().add(lblNewLabel);
			
			t1 = new JTextField();
			t1.setBackground(Color.YELLOW);
			t1.setForeground(Color.BLUE);
			t1.setFont(new Font("±¼¸²", Font.PLAIN, 35));
			f.getContentPane().add(t1);
			t1.setColumns(8);
			
			JLabel lblNewLabel_1 = new JLabel("PW");
			lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 35));
			f.getContentPane().add(lblNewLabel_1);
			
			t2 = new JTextField();
			t2.setBackground(Color.YELLOW);
			t2.setForeground(Color.BLUE);
			t2.setFont(new Font("±¼¸²", Font.PLAIN, 35));
			f.getContentPane().add(t2);
			t2.setColumns(8);
			
			JLabel lblNewLabel_2 = new JLabel("NAME");
			lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 35));
			f.getContentPane().add(lblNewLabel_2);
			
			t3 = new JTextField();
			t3.setBackground(Color.YELLOW);
			t3.setForeground(Color.BLUE);
			t3.setFont(new Font("±¼¸²", Font.PLAIN, 35));
			f.getContentPane().add(t3);
			t3.setColumns(8);
			
			JLabel lblNewLabel_3 = new JLabel("TEL");
			lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 35));
			f.getContentPane().add(lblNewLabel_3);
			
			t4 = new JTextField();
			t4.setBackground(Color.YELLOW);
			t4.setForeground(Color.BLUE);
			t4.setFont(new Font("±¼¸²", Font.PLAIN, 35));
			f.getContentPane().add(t4);
			t4.setColumns(8);
			
			JButton button = new JButton("\uC785\uB825\uC644\uB8CC");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String id=t1.getText();
					String pw=t2.getText();
					String name=t3.getText();
					String tel=t4.getText();
					
					try {
						FileWriter file = new FileWriter(id+".txt");
						file.write(id+"\r\n");
						file.write(pw+"\r\n");
						file.write(name+"\r\n");
						file.write(tel+"\r\n");
						file.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
					
					
				}
			});
			f.getContentPane().add(button);
			f.setVisible(true);
		
	}

}

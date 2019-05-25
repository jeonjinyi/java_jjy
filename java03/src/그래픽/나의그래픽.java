package 그래픽;

import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500, 500);
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("\uC67C\uCABD");
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("\uB098\uC758 \uC568\uBC94");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 14));
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		JButton btnNewButton_2 = new JButton("\uC624\uB978\uCABD");
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("\uC804\uC9C4\uC774\uC758 \uAC24\uB7EC\uB9AC");
		f.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("\uADF8\uB9BC\uC774 \uB4E4\uC5B4\uAC08 \uC790\uB9AC");
		f.getContentPane().add(btnNewButton_4, BorderLayout.CENTER);
		f.setVisible(true);
	}
}

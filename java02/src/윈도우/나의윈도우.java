package 윈도우;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class 나의윈도우 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setTitle("나의 윈도우 프로그램");
		
		JButton btnNewButton = new JButton("\uB098\uB97C \uB20C\uB7EC\uC694");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 14));
		btnNewButton.setBackground(Color.PINK);
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uB098\uB294 \uC704\uBC84\uD2BC");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		f.getContentPane().add(btnNewButton_1, BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea();
		f.getContentPane().add(textArea, BorderLayout.SOUTH);
		f.setVisible(true); //이 옵션 꼭 넣어줘야 보임
	}

}

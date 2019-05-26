package ¹è¿­;

import javax.swing.JFrame;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ¿µÈ­¾Ù¹ü3 {

	public static void main(String[] args) {
		String[] movies= {"m1.PNG","m2.PNG","m3.PNG","m4.PNG","m5.PNG"};
		
		
		JFrame f=new JFrame();
		f.setSize(300, 700);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton b1 = new JButton("");
		f.getContentPane().add(b1);
		ImageIcon icon=new ImageIcon(movies[0]);
		b1.setIcon(icon);
		
		JButton b2 = new JButton("<< \uC0DD\uC77C >>");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon=new ImageIcon(movies[0]);
				b1.setIcon(icon);
			}
		});
  		b2.setBackground(Color.YELLOW);
		b2.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		f.getContentPane().add(b2);

		
		JButton b3 = new JButton("<<\uD5EC\uBCF4\uC774>>");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon=new ImageIcon(movies[1]);
				b1.setIcon(icon);
			}
		});
		b3.setBackground(Color.YELLOW);
		b3.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		f.getContentPane().add(b3);
		
		
		JButton b4 = new JButton("<<\uB3C8(money)>>");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon=new ImageIcon(movies[2]);
				b1.setIcon(icon);
			}
		});
		b4.setBackground(Color.YELLOW);
		b4.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		f.getContentPane().add(b4);
		
		
		JButton b5 = new JButton("<<\uD30C\uC774\uD504\uD53C\uD2B8>>");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon=new ImageIcon(movies[3]);
				b1.setIcon(icon);
			}
		});
		b5.setBackground(Color.YELLOW);
		b5.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		f.getContentPane().add(b5);
		
		
		JButton b6 = new JButton("<< \uC5B4\uC2A4 >>");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon=new ImageIcon(movies[4]);
				b1.setIcon(icon);
			}
		});
		b6.setBackground(Color.YELLOW);
		b6.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		f.getContentPane().add(b6);
		
		f.setVisible(true);
		
	}

}

package java05;

//import java.awt.Frame;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 주문판 {
	private static JTextField text;
	static int count1;  //전역변수
	static int count2;  //전역변수
	static int count3;  //전역변수
	//개수 세는 변수(멤버변수, 자동으로 0)
	//선언(메모리가 할당)
	//선언의 위치가 사용할 수 있는 범위
	//클래스 바로 선언된 변수는 클래스 전체에서
	//사용 가능(전역변수)
	//- 전역변수: 클래스 전체에서 사용 가능. 자동으로 초기화
	//- 지역변수: 메소드 내에서만 사용 가능. 자동으로 초기화 X
	//변수의 사용 범위에 따라 구분=>선언의 위치(메모리 할당)
	static int total1; //전체 계산 금액변수.(전역변수)
	static int total2; //전체 계산 금액변수.(전역변수)
	static int total3; //전체 계산 금액변수.(전역변수)

	static int num1;
	static int num2;
	static int num3;
	
	private static JTextField text2;
	private static JTextField text3;
	private static JTextField text4;
	private static JTextField text5;

	public static void main(String[] args) {
		JLabel img = new JLabel("");
		text = new JTextField();
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton b1 = new JButton("\uC9EC\uBF55");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짬뽕.png");
				img.setIcon(icon);
				count1++;
				text.setText(count1+"개"); //setText가 String이기 때문에 +""해야함
				total1=count1*6000;
				text2.setText(total1+"원");
				num1++;
				text3.setText(num1+"개");
			}
		});
		b1.setBackground(Color.ORANGE);
		b1.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("\uC6B0\uB3D9");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("우동.png");
				img.setIcon(icon);
				count2++;
				text.setText(count2+"개"); //setText가 String이기 때문에 +""해야함
				total2=count2*4000;
				text2.setText(total2+"원");
				num2++;
				text4.setText(num2+"개");
			}
		});
		b2.setBackground(Color.PINK);
		b2.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("\uC9DC\uC7A5");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon("짜장면.png");
				img.setIcon(icon);
				count3++;
				text.setText(count3+"개"); //setText가 String이기 때문에 +""해야함
				total3=count3*5000;
				text2.setText(total3+"원");
				num3++;
				text5.setText(num3+"개");
			}
		});
		b3.setBackground(Color.CYAN);
		b3.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(b3);
		
		JLabel label = new JLabel("\uAC1C\uC218");
		label.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(label);
		
		
		text.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(text);
		text.setColumns(8);
		
		
		img.setIcon(new ImageIcon("D:\\workspace_jjy\\java05\\\uBA54\uC778.PNG"));
		f.getContentPane().add(img);
		
		JLabel lblNewLabel = new JLabel("\uC9C0\uBD88\uD560 \uCD1D \uAE08\uC561");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(lblNewLabel);
		
		text2 = new JTextField();
		text2.setForeground(Color.RED);
		text2.setFont(new Font("궁서", Font.PLAIN, 50));
		f.getContentPane().add(text2);
		text2.setColumns(7);
		
		
		JLabel label_1 = new JLabel("\uC9EC\uBF55 \uC8FC\uBB38 \uAC1C\uC218");
		label_1.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(label_1);
		
		text3 = new JTextField();
		text3.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(text3);
		text3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uC6B0\uB3D9 \uC8FC\uBB38 \uAC1C\uC218");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(lblNewLabel_1);
		
		text4 = new JTextField();
		text4.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(text4);
		text4.setColumns(10);
		
		JLabel label_2 = new JLabel("\uC9DC\uC7A5 \uC8FC\uBB38 \uAC1C\uC218");
		label_2.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(label_2);
		
		text5 = new JTextField();
		text5.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(text5);
		text5.setColumns(10);
		f.setTitle("나의 중국집 메뉴판");
		f.setSize(792, 714);
		f.setVisible(true);
		
	}

}

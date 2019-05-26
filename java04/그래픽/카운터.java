package 배열;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 카운터 {
	static int counter=0; //시작값 0
	
	public static void main(String[] args) {
		JFrame f=new JFrame();
		f.setSize(500, 700);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel count = new JLabel("0");
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter--; //-누르면 하나씩 줄어듦
				count.setText(counter+"");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 70));
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("0");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter=0; //0누르면 0으로 만들어줌
				count.setText(counter+"");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 70));
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				counter++; //+누르면 하나씩 늘어남
				count.setText(counter+"");
				
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 70));
		f.getContentPane().add(btnNewButton_2);
	//	JLabel count = new JLabel("0");
		
		count.setFont(new Font("굴림", Font.PLAIN, 99));
		f.getContentPane().add(count);
		
		JLabel img = new JLabel("");
		f.getContentPane().add(img);
		ImageIcon icon=new ImageIcon("카운터.PNG"); //이미지 첨부하는 부품
		img.setIcon(icon);
	
		f.setVisible(true);
	}

}

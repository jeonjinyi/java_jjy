package 연산자;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의윈도우 {

	public static void main(String[] args) {
		JFrame f1=new JFrame();
		f1.setTitle("전진이의 윈도우 화면");
		f1.setSize(500, 500);
		JButton b1=new JButton("나를 눌러요");
		f1.add(b1); //버튼을 frame안에 넣음
		f1.setVisible(true); //꼭 맨 끝에 넣어야함.  true값으로.
	}

}

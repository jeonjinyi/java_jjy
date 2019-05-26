package 배열;

import javax.swing.JOptionPane;

public class 작은창연습 {

	public static void main(String[] args) {
		//입력용
		String name=JOptionPane.showInputDialog("당신의 이름을 입력해주세요");
		//출력용
		JOptionPane.showMessageDialog(null,"당신의 이름은 "+name+"이군요");
		//확인용 (0:예, 1:아니오, 2:취소)
		int result=JOptionPane.showConfirmDialog(null, "정말로 당신의 이름은 "+name+"인가요?");
		System.out.println(result); 
		
	}

}

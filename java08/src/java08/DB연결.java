package java08;

import java.sql.*;

import javax.swing.JOptionPane;

public class DB연결 {
											//에러처리 exception은 부모클래스?
	public static void main(String[] args)  throws Exception {
		//1. 커넥터 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 성공");
		
		//2. DB연결(db명, user, pw) *jdbc:java db connectivity
		String url="jdbc:mysql://localhost:3366/bigdata";
		String user="root";
		String password="1234";
		
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. db연결 성공");
		
		//3. sql문 결정
		String id=JOptionPane.showInputDialog("아이디 입력");
		String pw=JOptionPane.showInputDialog("패스워드 입력");
		String name=JOptionPane.showInputDialog("이름 입력");
		String tel=JOptionPane.showInputDialog("전화번호 입력");
		
		String sql="insert into member values (?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql); //PreparedStatment는 sql문이라고 하는 부품
		ps.setString(1, id);//1번 물음표에 id
		ps.setString(2, pw);//2번 물음표에 pw
		ps.setString(3, name);//3번 물음표에 name
		ps.setString(4, tel);//4번 물음표에 tel
		System.out.println("3. sql문 결정 성공");

		//4. sql문 전송(실행요청) mysql에 요청
		ps.executeUpdate();
		System.out.println("4. sql문 전송 성공");
	}
} 
//외부의 자원을 연결할 때는 에러가 발생할 여지가 많으므로,
//반드시 에러처리를 하게 되어있음
//외부의 자원: 파일, db, 네트워크(채팅) 등
//에러처리하는 방법: 1. 해당 메소드에서 처리 (try~catch) 2. 해당 메소드를 호출하는 곳에서 처리(throws)
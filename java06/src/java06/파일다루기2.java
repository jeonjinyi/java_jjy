package java06;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class 파일다루기2 {

	public static void main(String[] args) throws Exception {   //throw Exception이 new FileWriter부분 에러나서 추가 후 에러 없어짐
		FileWriter file = new FileWriter("c:/temp/20190602.txt"); //파일을 갖고와서 쓰는 부품
		file.write("hi~\r\n");  // \r\n이 .txt에 내용 들어갈때 엔터임
		file.write("안녕~\r\n");
		file.close();
		
		
		
	}

}

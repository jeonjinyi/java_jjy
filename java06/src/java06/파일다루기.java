package java06;

import java.io.File;

public class 파일다루기 {

	public static void main(String[] args) {
//		String file="c:/temp";
		//컴퓨터는  String을 파일로 인식안함
		File f = new File("c:/temp"); //파일인지 인식시켜주는 부품
		System.out.println(f.exists()); //존재해? yes->true
		System.out.println(f.isDirectory()); //디렉토리야? yes->true
		System.out.println(f.isFile()); //파일이야? no->false
		
		
	}

}

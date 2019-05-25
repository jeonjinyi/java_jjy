package 배열;

import java.util.Scanner;

public class 배열비교 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] study= new String[3];
			for (int i = 0; i < study.length; i++) {

//선생님 코드
				System.out.println("과목 입력: ");
			study[i]=sc.next();
		System.out.println(study[0]+"보다는"+study[1]);
	}
}
}
// 과목 입력할거 몇개 없을때	
//		System.out.print("첫번째 과목 입력");
//		study[i] = sc.next();
//		System.out.print("두번째 과목 입력");
//		study[i+1] = sc.next();
//		System.out.print("세번째 과목 입력");
//		study[i+2] = sc.next();
//		System.out.println(study[0]+"보다는"+study[1]);
//		break;
//	}
//		
//	}
//}
package java08;

public class 직원 {
	String name;
	String gender;
	int age;
	
	//평균나이, 직원수
	static int ageSum;
	static int count;
	
	
	public 직원(String name, String gender, int age) {
		 
		ageSum=ageSum+age; //나이 평균
		count++; //직원수 한명 늘때마다
		
		this.name = name;
		this.gender = gender;
		this.age = age;
	}


	@Override
	public String toString() {
		return "직원 [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
}

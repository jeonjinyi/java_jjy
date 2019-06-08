package 상속;

public class Employee {
	String name; //소속된 패키지 안에서만 접근할 수 있는 변수. (public 등등 없는것)
	String address;
	int salary;
	int rrn;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
	
	
}

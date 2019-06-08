package 상속;

public class BankUser {

	public static void main(String[] args) {
		GoodBank good = new GoodBank();
		BadBank bad = new BadBank();
		NormalBank normal = new NormalBank();
		
		good.대출이자를받다();
		bad.대출이자를받다();
		normal.대출이자를받다();
	}
}

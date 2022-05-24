package Projects;
abstract class atm{
	abstract void withdraw();
}

public class Day1_p3_Abstraction extends atm {
	void withdraw()
	{
		System.out.println("withdraw successful");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1_p3_Abstraction ob = new Day1_p3_Abstraction();
		ob.withdraw();

	}

}

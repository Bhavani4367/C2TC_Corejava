package Projects;
class withdraw{
	int amt_withdraw=2000;
}

public class Day1_p2_Inheritance extends withdraw {
	int amt_left=5000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day1_p2_Inheritance ob1 = new Day1_p2_Inheritance();
		System.out.println("Amount Withdrawn"+ob1.amt_withdraw);
		System.out.println("Amount Balance"+ob1.amt_left);


	}

}

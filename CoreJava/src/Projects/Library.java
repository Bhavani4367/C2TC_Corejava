package Projects;
import java.util.Scanner;

public class Library {
	int Acc_Num;
	String Title;
	String Author;
public void input( )
{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Title");
		Title= sc.nextLine();
		System.out.println();
		
		
		System.out.println("Enter the Author name");
		Author = sc.nextLine();
		System.out.println("Enter the account number");
		Acc_Num = sc.nextInt();
		
	}
public void compute()
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of days late:");
	int days = sc.nextInt();
	int fine = (days*5);
	System.out.println("Fine = Rs:"+fine );
		
	}
public void display()
{
	System.out.println("Acc_Num\tTitle\tAuthor");
	System.out.println(Acc_Num + "\t"+Title+"\t" +Author);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		lib.input();
		lib.compute();
		lib.display();

	}

}

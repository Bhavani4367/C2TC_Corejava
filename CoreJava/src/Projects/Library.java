package Projects;
import java.util.Scanner;

public class Library {
	int AccNum;
	String Title;
	String Author;
	void input( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter accession number:");
		AccNum = sc.nextInt();
		System.out.println("Enter Book Title:");
		Title = sc.nextLine();
		
		System.out.println("Enter Book Author:");
		Author = sc.nextLine();
		
	}
	void compute()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

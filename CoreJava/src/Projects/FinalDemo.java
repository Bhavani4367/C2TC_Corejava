package Projects;
final class A{
	final void run()
	{
		
	}
}

public class FinalDemo extends A {
	final int speedlimit=90;//Final variable
	void run() 
	{
	speedlimit = 50;
	}
	
//void run gives error bcoz Final value cannot be changed
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalDemo fd = new FinalDemo();
		fd.run();
		A ob = new A();
		A.run();
		
	}

}

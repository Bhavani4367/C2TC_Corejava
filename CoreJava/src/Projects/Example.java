package Projects;

public class Example {
	Example()
	{
		System.out.println("Default Constructor");
	}
	Example(int i, int j)
	{
		System.out.println("Constructor with two parameters");
	}
	Example(int i, int j, int k)
	{
		System.out.println("Constructor with three parameters");
	}
	Example(int i, String name)
	{
		System.out.println("Constructor with int and string");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example e = new Example();
		Example ob = new Example(2,3);
		Example obj = new Example(2,5,8);
		Example obj1 = new Example(1,"Maanya");

	}

}

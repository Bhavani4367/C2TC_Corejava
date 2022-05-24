package Projects;

public class Polymorphism {
	void add(int x, int y)
	{
		System.out.println("Add 2 nos"+ (x+y));
	}
	void add(int x, int y, int z)
	{
		System.out.println("Add 3 nos" + (x+y+z));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism ob = new Polymorphism();
		ob.add(3,5);
		ob.add(2,5,7);
		

	}

}

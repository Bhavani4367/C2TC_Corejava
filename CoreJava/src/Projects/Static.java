package Projects;

public class Static {
	static int a;
	static int b;
	static {
		a = 10;
		b = 20;
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		//Static sta = new Static();
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
		

	}

}

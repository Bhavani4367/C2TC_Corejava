package Projects;

public class Var {
	static int j = 100;
	int n= 200;
	//static method
	static void a()
	{
		int a = 200;
		System.out.println("Print from a");
		//System.out.println(Super.j);
	}
	//instance method
	void a2() {
		System.out.println("Inside a2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Var v = new Var();
		v.a2();
		Var.a();
		

	}

}

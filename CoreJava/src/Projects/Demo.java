package Projects;
interface MyInterface
{
	public void method1();
	public void method2();

}

public class Demo implements MyInterface
{
	public void method1()
	{
		System.out.println("implementation of method1");
	}
	public void method2()
	{
		System.out.println("implementation of method2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface obj = new Demo();
		obj.method1();

	}

}

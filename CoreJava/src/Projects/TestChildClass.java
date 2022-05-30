package Projects;
class TestParentclass{
	int var = 100;
}

public class TestChildClass extends TestParentclass {
	int var = 50;
	
	void display() {
		System.out.println("The var value of child: "+var);
		System.out.println("The var value of parent: "+super.var);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestChildClass tcc = new TestChildClass();
		tcc.display();

	}

}

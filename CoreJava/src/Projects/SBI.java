package Projects;
interface rbi
{
	float rateofIntrest();
}
interface worldbank
{
	float roi();
}
public class SBI implements rbi,worldbank {
	public float rateofIntrest()
	{
		return 9.15f;
	}
	public float roi()
	{
		return 10.25f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI ob = new SBI();
		System.out.println("RBI "+ob.rateofIntrest());
		System.out.println("World Bank "+ob.roi());

	}

}

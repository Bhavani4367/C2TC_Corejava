package Projects;

public class Volume {
	void vol(int s)
	{
		System.out.println("volume of cube " + s + " is " +s*s*s);
	}
	void vol(float l, float b, float h)
	{
		System.out.println("Volume of cuboid is " +l*b*h );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume v = new Volume();
		v.vol(4);
		v.vol(5,3,4);

	}

}

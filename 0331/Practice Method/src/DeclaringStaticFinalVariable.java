
public class DeclaringStaticFinalVariable {
	public static final int johansAge = 37;
	public static final int katesAge = 55;
	public static final int mikesAge = 31;
	
	public static void main(String[] args) {
		printAge(mikesAge);
	}

	public static void printAge(int personsAge)
	{
	
		System.out.println("Age : " + personsAge);
	}
}

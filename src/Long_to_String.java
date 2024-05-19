
public class Long_to_String {

	public static void main(String[] args) {
		long a=989888787;
		long b=232443435;
		long c=248382389;
		String res1=a+"";
		String res2=Long.toString(b);
		String res3=String.valueOf(c);
		System.out.println(res1.getClass().getSimpleName());
		System.out.println("Converted String Value is "+res1);
		System.out.println("Converted String Value is "+res2);
		System.out.println("Converted String Value is "+res3);
		

	}

}

public class Double_to_String {
	public static void main(String[] args) {
		double a=122.9879;
		double b=122.908080;
		double c=9877.09879;
		String res1=Double.toString(a);
		String res2=b+"";
		String res3=String.valueOf(c);
		System.out.println("Type of Data is "+(Object)res1.getClass().getSimpleName());
		System.out.println("Converted String Value is "+res1);
		System.out.println("Converted String Value is "+res2);
		System.out.println("Converted String Value is "+res3);
		

	}

}

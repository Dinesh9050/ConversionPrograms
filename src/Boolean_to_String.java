public class Boolean_to_String {
	public static void main(String[] args) {
		boolean a=true;
		String out=Boolean.toString(a);
		boolean b=false;
		String out1=Boolean.toString(b);
		Boolean c=new Boolean(true);
		String out2=c.toString();
		Boolean d=new Boolean(false);
		String out3=d.toString();
		System.out.println("Converted String value is "+out);
		System.out.println("Converted String value is "+out1);
		System.out.println("Converted String value is "+out2);
		System.out.println("Converted String value is "+out3);
		
		
	}

}

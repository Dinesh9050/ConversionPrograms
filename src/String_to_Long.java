
public class String_to_Long {

	public static void main(String[] args) {
		String a="1898999898";
		String b="9997867768";
		String c="9898878787";
		long res1=Long.parseLong(a);
		long res2=Long.valueOf(b);
		long res3=new Long(c);
		System.out.println("Converted Long Digit is "+res1);
		System.out.println("Converted Long Digit is "+res2);
		System.out.println("Converted Long Digit is "+res3);
	

	}

}


public class String_to_Double {

	public static void main(String[] args) {
		String a="109.98939";
		String b="1093.823";
		String c="1219.9897";
		Double res1=Double.parseDouble(a);
		Double res2=Double.valueOf(b);
		Double res3=new Double(c);
		System.out.println("Converted Double Value is "+res1);
		System.out.println("Converted Double Value is "+res2);
		System.out.println("Converted Double Value is "+res3);
		

	}

}

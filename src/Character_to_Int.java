
public class Character_to_Int {

	public static void main(String[] args) {
		char name='a';
		char section='1';
		char value='5';
		int a=Character.getNumericValue(name);
		int b=Integer.parseInt(String.valueOf(section));
		int c=value-'0';
		System.out.println("Converted Integer Value is "+a);
		System.out.println("Converted Integer Value is "+b);
		System.out.println("Converted Integer Value is "+c);
	}

}

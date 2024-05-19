
public class Int_to_Character {

	public static void main(String[] args) {
		int dec=10;
		int hex=16;
		int a=97;
		int b=64;
		int c=6;
		int i=1;
		char d=(char)a;
		char e=(char)(b+'0');
		char f=Character.forDigit(c,dec);
		System.out.println("Converted Integer Number is "+d);
		System.out.println("Converted Integer Number is "+e);
		System.out.println("Converted Integer Number is "+f);
		while(i<16)
		{
		char g=Character.forDigit(i, 16);
		i++;
		System.out.print(g+" ");
		}
		
	}

}

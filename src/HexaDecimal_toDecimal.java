import java.util.Scanner;

public class HexaDecimal_toDecimal {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
		int base=1;
		int sum=0;
		for(int i=a.length()-1;i>=0;i--)
		{
			if(a.charAt(i)>='0' && a.charAt(i)<='9')
			{
				sum=sum+(a.charAt(i)-48)*base;
				base=base*16;
			}
			else if(a.charAt(i)>='A' && a.charAt(i)<='F')
			{
				sum=sum+(a.charAt(i)-55)*base;
				base=base*16;
			}
		}
		System.out.println("Decimal Number of Given Hexadecimal Number is "+sum);
		

	}

}

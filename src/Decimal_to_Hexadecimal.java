import java.util.Scanner;

public class Decimal_to_Hexadecimal {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int i=0;
		int rem;
		int hex[]=new int[100];
		while(a!=0)
		{
			hex[i]=a%16;
			a=a/16;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			if(hex[j]>9)
			{
				System.out.print((char)(55+hex[j]));
			}
			else
			{
				System.out.print(hex[j]);
			}
		}

	}

}

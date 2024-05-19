import java.util.Scanner;
public class Octal_to_Decimal {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int sum=0;
		int rem;
		int i=0;
		int a=in.nextInt();
		while(a!=0)
		{
			rem=a%10;
			a=a/10;
			sum=(int)(sum+rem*Math.pow(8, i));
			i++;
		}
		System.out.println("Decimal Number of Given Octal Number "+sum);

	}

}

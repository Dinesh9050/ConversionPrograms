import java.util.Scanner;
public class Binary_to_Decimal {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int rem;
		int i=0;
		int sum=0;
		while(a!=0)
		{
			rem=a%10;
			sum=(int) (sum+rem*Math.pow(2,i));
			a=a/10;
			i++;			
		}
		System.out.println("Decimal Number for Given Number is "+sum);
	}
}
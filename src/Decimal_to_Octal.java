import java.util.Scanner;

public class Decimal_to_Octal {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int sum=0;
		int result=1;
		while(a!=0)
		{
			int rem=a%8;
			a=a/8;
			sum=sum+rem*result;
			result=result*10;						
		}
		System.out.println("Octal Number for Given Decimal Number is "+sum);

	}

}

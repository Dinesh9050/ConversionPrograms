import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int sum=0;
		int place=1;
		while(a!=0)
		{
			int rem=a%2;
			a=a/2;
			sum=sum+rem*place;
			place=place*10;
		}
		System.out.println(sum);

	}

}


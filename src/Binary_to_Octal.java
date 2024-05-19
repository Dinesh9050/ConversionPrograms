import java.util.Scanner;
public class Binary_to_Octal {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int a=in.nextInt();
		int rem;
		int i=0;
		int sum=0;
		int result=0;
		while(a!=0)
		{
			rem=a%10;
			sum=(int) (sum+rem*Math.pow(2, i));
			a=a/10;
			i++;	
		}
		System.out.println("Decimal value for Given Number is "+sum);
		
      int place=1;
      while(sum!=0)
      {
    	  int rem1=sum%8;
    	  sum=sum/8;
    	  result=result+rem1*place;
    	  place=place*10;
    			  
        }
        System.out.println("Octal value for given binary number is " + result);
	}

}

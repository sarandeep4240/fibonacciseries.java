import java.util.Scanner;
public class Fibonacci_Series
{
	public static void main(String[] args) 
	{
	    int i,n,a=1,b=1,c;
	    System.out.println("enter a number");
	    Scanner s = new Scanner(System.in);
	    n = s.nextInt();
	    for(i=1;i<=n;i++)
	    {
	        c=a+b;
	        a=b;
	        b=c;
	        System.out.println(+a);
	    }
		
	}
}

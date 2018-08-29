import java.util.Scanner;
public class sumofnnumbers
{
	public static void main(String[] args)
	{
		int sum= 0 , n;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n value");
	    n = scan.nextInt();
		for(int i = 1; i<= n; i++)
		{
			sum = sum+i;
			
		}
		System.out.println(sum);
	}
}

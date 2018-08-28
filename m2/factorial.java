import java.util.Scanner;
public class factorial
{
	public static void main(String[] args)
	{
		int n, mul;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		n = scan.nextInt();
		//mul = scan.nextInt();
        //fact1 = scan.nextInt();
        System.out.println(fact(n));
	}
	static int fact(int n)
	{
		int fact1;
		if(n==0)
		{
			return 1;
		}
		else
		{
			fact1= n*fact(n-1);
			return fact1;
		}
	}
}
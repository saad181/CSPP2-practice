import java.util.Scanner;
public class average
{
	public static void main(String[] args)
	{
		int sum =0, avg;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the numbers");
		int num = scan.nextInt();
		
		int arr[] = new int[num];
		for(int i = 0; i<arr.length; i++)
		{
			
			arr[i]=scan.nextInt();
			sum = sum+arr[i];
		}
		avg =  sum/arr.length;
		System.out.println(avg);
		
		

	}
}

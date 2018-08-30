import java.util.Scanner;
public class firstlast6
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i<arr.length; i++)
		{
			arr[i]= scan.nextInt();
			

		}
		if(arr[0] == 6 || arr[size-1] == 6)
			{
				System.out.println("true");

			}
			else
			{
				System.out.println("false");
			}

	}
}

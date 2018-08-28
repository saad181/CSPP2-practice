import java.util.Scanner;
public class area_of_circle
 {
 	public static void main(String[] args)
 	{
 		Scanner scan = new Scanner(System.in);
 		System.out.println("enter the radius");
 		int s = scan.nextInt();
 		System.out.println(area(s));
 	}
 		static double pi ()
 		{
 			double pi = 3.14;
 			return pi;
 		}

 		//int r = scan.nextInt();

 		static double area (int r)
 		{
 			double area1 = pi()*(r*r);
 			return area1 ;
 		}
 		
 		//System.out.println("area of circle is:" +area);
 	}
 
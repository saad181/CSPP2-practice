import java.util.Scanner;
 class student {
	String name ; //class varaibles or members or attributes
	String rolnum;
	double m1,m2,m3;

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);
		// String name = scan.nextLine();
		// // int rollNo = scan.nextInt();
		// float m1 = scan.nextFloat();
		// float m2 = scan.nextFloat();
		// float m3 = scan.nextFloat();

		student obj = new student();

		student s1 = new student("Sangay", "IT201985001", 7.5, 7.0, 8.0);
		student s2 = new student("Bidhya", "IT201985003", 8.5, 6.0, 7.5);
		student s3 = new student("Kelzanga", "IT201985065", 7.5, 8.0, 9.0);
		s1.CGPA();
		s2.CGPA();
		s3.CGPA();

  //       double gpa;
		// int s1, s2, s3;
		// gpa = ((m1+m2+m3)/3);
		// System.out.println(name + rollNo+ gpa);

	}
	void CGPA(){
	 double gpa = ((this.m1+m2+m3)/3);
	 System.out.println(gpa);
	System.out.println(name  +   rolnum   + gpa);

	}

	 student() {
		
	}

	student(String name1 ,String rolm,double m11,double m22, double m33){
		name = name1;
		rolnum = rolm;
		m1=m11;
		m2=m22;
		m3=m33;



	}
}
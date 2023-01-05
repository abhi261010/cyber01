package day2.basic;

public class abhi {

	 

		static int empId=1001;
		static double salary;
		public static void main(String[] args) 
		{
			System.out.println("Program Starts");
			//local variable
			int age=15;
			System.out.println("Local Variable age: "+age);
			//accessing global variable directly
			System.out.println("SGV empId: "+empId);
			System.out.println("SGV salary: "+salary);
			System.out.println("********************************");
			//accessing global variable with standard
			System.out.println("SGV empId: "+abhi.empId);
			System.out.println("SGV salary:"+abhi.salary);
			System.out.println("**************Updated SGV******************");
			empId=1002;
			abhi.salary=25000.26;
			System.out.println("SGV empId: "+abhi.empId);
			System.out.println("SGV salary: "+abhi.salary);
			System.out.println("Program Ends");
		}
	

	}



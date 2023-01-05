package Day8Methods;

import javax.swing.plaf.synth.SynthSeparatorUI;

import com.sun.scenario.effect.impl.prism.PrImage;

public class Method1 {
   
  // salary  variable is a static variable
   static double salary=10000.67;
   static int empId=1001;   
   public static int getEmpID(){
	   System.out.println("printEmpID is running..");
	   return empId;
   }   
   public static void printEmpSal(){
	   System.out.println("printEmpSal is running.."+salary);
   }   
   public static void main(String args[]) {
	
	   int age=30;
	  System.out.println("Accessing local variable: "+age);
	  System.out.println("SGV salary: "+salary);
	  System.out.println("SGV empId: "+empId);
	  
	  getEmpID();//executes method body but won't print return value
	  System.out.println(getEmpID());//executes method body and also print return value
	  
	  int res=getEmpID();//executes method body and stores return value for future use
	  System.out.println("Result: "+res);
	 
	  printEmpSal();
	  //System.out.println(printEmpSal());//compile time error
   }
}
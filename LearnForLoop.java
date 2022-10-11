package week1.day1;

public class LearnForLoop {

	public static void main(String[] args) {
	
		
		 for(int i = 1; i <= 10; i++)
		 {
			 System.out.println( i + ": MyFirstLoop statement" );
		 }
			 
		 System.out.println("------------------------------------");
		 
		 for (int j = 10; j >= 1; j--)
		 {
			 System.out.println(j);
		 }
		 
		 // Day 1 = Home work //
		 
		 System.out.println("***********Factorial*************");
		 
		 int fact = 1;
	
		 for (int i = 1; i<=5; i++)
		 {
			 fact = fact*i;
			 System.out.println(" Fatorial:" +fact);
		 }
	     }

}

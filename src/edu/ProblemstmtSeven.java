package edu;
import java.util.Scanner;

public class ProblemstmtSeven {
	
	
	public ProblemstmtSeven(int number1, int number2)
	{
		Scanner input = new Scanner(System.in);

		int i = 0;
		  int n = 0;

		   System.out.print("Enter i :");
		    i = input.nextInt();

		    System.out.print("\nEnter n :");
		    n = input.nextInt();


		  System.out.print(n + " multiples of " + i + " are: ");

		  for (int counter = 0 ; counter < n ; counter++) {
		    System.out.print(i*(2 + counter) + " ");
		  }
}

	public static void main(String args[])
	{
		ProblemstmtSeven obj = new ProblemstmtSeven(0, 0);
		
	}
}
	
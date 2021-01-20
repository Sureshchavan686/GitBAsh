package edu;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProblemStmtSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks[] = new int[4];
		List<String> subjects = Arrays.asList("English", "Mathematics", "Science", "Social Science");
		int maxScore = 100;
		int minScore = 0;
		int i;
		float total = 0;

		Scanner sc = new Scanner(System.in);
		for (i = 0; i < subjects.size(); i++) {
			System.out.print("Enter Marks of Subject " + subjects.get(i) + ": ");
			marks[i] = sc.nextInt();

			if(marks[i] == minScore)
			{
				System.out.print(" Marks should be greater than 0 \n");
				System.out.print("Enter Marks of Subject " + subjects.get(i) + ": ");
				marks[i] = sc.nextInt();
			}
			
			else if (marks[i] > maxScore)
			{
				System.out.print(" Marks should be less than or equal to 100\n");
				System.out.print("Enter Marks of Subject " + subjects.get(i) + ": ");
				marks[i] = sc.nextInt();
			}
			
			total = total + marks[i];

		}
		

		float percentile = (total / 4);

		if (percentile < 40) {
			System.out.println("Performance Grade: Poor ");
		}

		else if (percentile > 40 && percentile < 59) {
			System.out.println("Performance Grade: Average ");
		}

		else if (percentile > 60 && percentile < 79) {
			System.out.println("Performance Grade: Good ");
		}

		else if (percentile > 80 && percentile < 89) {
			System.out.println("Performance Grade: Very Good ");
		}

		else if (percentile >= 90) {
			System.out.println("Performance Grade: Excellent ");
		}
		
		
	}

}

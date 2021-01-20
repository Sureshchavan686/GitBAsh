package edu;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ModuleOneAssgnmt {

	public static void main(String args[]) {
		/*
		 * This program assumes that the student has 4 subjects, thats why I
		 * have created the array of size 4.
		 */
		int marks[] = new int[4];
		int i;
		float total = 0, avg;
		List<String> subjects = Arrays.asList("English", "Mathematics", "Science", "Social Science");
		Scanner scanner = new Scanner(System.in);

		for (i = 0; i < subjects.size(); i++) {
			System.out.print("Enter Marks of Subject " + subjects.get(i) + ": ");
			marks[i] = scanner.nextInt();
			total = total + marks[i];
		}

		scanner.close();
		// Calculating average here
		avg = total / 4;
		System.out.print("The student Grade is: ");
		if (avg >= 90) {
			System.out.print("Excellent");
		} else if (avg >= 80 && avg <= 89) {
			System.out.print("Very Good");
		} else if (avg >= 60 && avg <= 79) {
			System.out.print("Good");
		} else if (avg >= 40 && avg <= 59) {
			System.out.print("Average");
		}

		else if (avg <= 40) {
			System.out.print("Poor");

		}

	}

}

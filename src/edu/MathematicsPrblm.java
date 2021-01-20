package edu;

import java.util.Scanner;

public class MathematicsPrblm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		int num1 = scn.nextInt();
		
		System.out.println("Enter number 2");
		int num2 = scn.nextInt();
		
		
		int addRes = num1+num2;
		int mulRes = num1*num2;
		int subRes = num1-num2;
		
		System.out.println("Addition of two given numbers " + addRes);
		System.out.println("Multiplication of two given numbers " + mulRes);
		System.out.println("Subtraction of two given numbers " + subRes);
		
	}

}

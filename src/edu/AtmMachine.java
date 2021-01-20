package edu;


import java.util.Scanner;

public class AtmMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		
		int counter = 3;
		int attempt = 3;
		int enteredPIN;
		int pin = 8547;
		System.out.println("Enter PIN: ");
		enteredPIN = scn.nextInt();

		//String pass = String.valueOf(enteredPIN);
		int pass = Integer.valueOf(enteredPIN);
		if (pin == Integer.valueOf(enteredPIN)) {
			System.out.println("Correct PIN entered!");
		}
		while (!(pin == Integer.valueOf(enteredPIN)) && attempt != 0) {
			System.out.println("Invalid PIN entered!. " + --attempt + " attempts remaining.");
			counter--;
			if (attempt != 0) {

				System.out.println("Enter PIN: ");
				enteredPIN = scn.nextInt();

				pass = Integer.valueOf(enteredPIN);
				if (pin == Integer.valueOf(enteredPIN)) {
					System.out.println("Correct PIN entered!");
				}
			} else {
				System.out.println("your card has been blocked!");
				break;
			}
		}
	}
}

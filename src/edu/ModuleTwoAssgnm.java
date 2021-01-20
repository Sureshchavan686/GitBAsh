package edu;

import java.util.Scanner;

public class ModuleTwoAssgnm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cardNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hey Jack select the card from deck of 10 cards");
		cardNumber = scanner.nextInt();
		
		switch (cardNumber) {

		case 1:
			System.out.println("message: Hey jack, Glad you selected first card ");
			break;
		case 2:
			System.out.println("message: Hey jack, Glad you selected second card ");
			break;
		case 3:
			System.out.println("message: Hey jack, Glad you selected third card ");
			break;
		case 4:
			System.out.println("message: Hey jack, Glad you selected fourth card ");
			break;
		case 5:
			System.out.println("message: Hey jack, Glad you selected fifth card ");
			break;
		case 6:
			System.out.println("message: Hey jack, Glad you selected sixth card ");
			break;
		case 7:
			System.out.println("message: Hey jack, Glad you selected seventh card ");

		case 8:
			System.out.println("message: Hey jack, Glad you selected eighth card ");
			break;
		case 9:
			System.out.println("message: Hey jack, Glad you selected nineth card ");
			break;
		case 10:
			System.out.println("message: Hey jack, Glad you selected tenth card ");
			break;
		}
		
	}

}

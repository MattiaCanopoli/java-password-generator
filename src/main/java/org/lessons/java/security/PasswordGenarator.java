package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenarator {

	// da chiedere:
	// 1. la somma deve essere castata in short perchè sommando le variabili il
	// typo diventa int
	// 2. scanner is never closed
	// 3. project ha no explicit encoding

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // Initialize a scanner variable

		// Ask for name
		System.out.print("Inserisci il tuo nome: "); // print string to system default output
		String name = input.nextLine(); // initialize a variable to store scanner input

		// Ask for last name
		System.out.print("Inserisci il tuo cognome: ");
		String lastName = input.nextLine();

		// Ask for favorite color
		System.out.print("Inserisci il tuo colore preferito: ");
		String color = input.nextLine();

		// Ask for birth year
		System.out.print("in che anno sei nato/a?: ");
		short year = input.nextShort();

		// Ask for birth month
		System.out.print("in che mese sei nato/a? (da 1 a 12): ");
		byte month = input.nextByte();

		// Ask for birth day
		System.out.print("che giorno sei nato/a?: ");
		byte day = input.nextByte();

		input.close();

		// initialize a type short variable to store the sum day, month and
		// year, casted to short
		short sum = (short) (day + month + year);

		// initialize a String variable to store the password
		String pwd = name + '-' + lastName + '-' + color + '-' + sum;

		// print pwd to system output
		System.out.println("la tua nuova password è: " + pwd);
	}
}

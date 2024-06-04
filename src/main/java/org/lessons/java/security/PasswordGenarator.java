package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenarator {
	
	/*da chiedere:
	 * 1. la somma deve essere castata in short perchè sommando le variabili il typo diventa int
	 * 2. scanner is never closed
	 * 3. project ha no explicit encoding*/

	public static void main(String[] args) {
		// Ask for name
		System.out.println("Inserisci il tuo nome"); //print string to system default output
		Scanner nameInput = new Scanner(System.in); //Initialize a scanner variable
		String name = nameInput.nextLine(); //initialize a variable to store scanner input
		// Ask for last name
		System.out.println("Inserisci il tuo cognome");
		Scanner lastNameInput = new Scanner(System.in);
		String lastName = lastNameInput.nextLine();
		// Ask for favorite color
		System.out.println("Inserisci il tuo colore preferito");
		Scanner colorInput = new Scanner(System.in);
		String color = colorInput.nextLine();
		// Ask for birth year
		System.out.println("in che anno sei nato/a?");
		Scanner yearInput = new Scanner(System.in);
		short year = yearInput.nextShort();
		// Ask for birth month
		System.out.println("in che mese sei nato/a? (da 1 a 12)");
		Scanner monthInput = new Scanner(System.in);
		byte month = monthInput.nextByte();
		// Ask for birth day
		System.out.println("che giorno sei nato/a?");
		Scanner dayInput = new Scanner(System.in);
		byte day = dayInput.nextByte();
		
		//initialize a type short variable to store the sum day, month and year, casted to short
		short sum = (short) (day + month + year);
		
		//initialize a String variable to store the password
		String pwd = name + '-' + lastName + '-' + color + '-' + sum;
		
		//print pwd to system output
		System.out.println("la tua nova password è: " + pwd);

	}
}

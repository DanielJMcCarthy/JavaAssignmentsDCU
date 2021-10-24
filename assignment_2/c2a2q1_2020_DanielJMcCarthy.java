/*
---------------------------------------------------------------------------------
---------------------------------------------------------------------------------
 Write a Java program that displays six random colours of the rainbow and
then prompts the user to enter the missing colour of the rainbow. If the user
guesses correctly the program should display “Correct Answer!”, and exit. If
the user types in an incorrect answer, the program should inform the user of
the correct answer and start again with a new set of six random colours, from
which the user is to guess the missing colour.

The program should store the colours of the rainbow in an array, and use a for
loop to iterate through the array when displaying the colours on screen.
---------------------------------------------------------------------------------
---------------------------------------------------------------------------------
 */


package assignment_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


//see constants pg 63 for rainbow
//see linear search pg 66 for colourToFind
//pg 67 removing an element from an array


public class c2a2q1_2020_DanielJMcCarthy {

	public static void main(String[] args) {

		//--------------------------------------------------------
		//Create constant for the standard 7 colours in a rainbow.
		//--------------------------------------------------------
		//final int NUM_COLOURS_IN_RAINBOWS = 7;
		int numColoursInGame = 7;
		boolean correctAnswer = false;

		Scanner input = new Scanner(System.in);
		String guess = "";


		//Create String array to hold the names of each colour.
		String[] colourNames = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};


		while(correctAnswer == false){


			//Display beginning message
			System.out.println("-----------------------------------------------------");
			System.out.println("What colour of the rainbow is missing from this list?");
			System.out.println("-----------------------------------------------------");

			//--------------------------------------------------------
			//Make a copy of the list(before removal of elements)
			//--------------------------------------------------------
			String[] positionOfColour = Arrays.copyOf(colourNames, colourNames.length);// might be needed to reset original array if answer incorrect


			//--------------------------------------------------------
			//Get random element from the 
			//--------------------------------------------------------
			Random randomColour = new Random(); 
			int n = randomColour.nextInt(7); 


			//--------------------------------------------------------
			//Set missingColour as n
			//--------------------------------------------------------
			String missingColour = colourNames[n];


			//--------------------------------------------------------
			//Remove element from the array
			//--------------------------------------------------------
			colourNames[n] = colourNames[numColoursInGame -1];
			numColoursInGame--;


			//--------------------------------------------------------
			//Display array
			//--------------------------------------------------------
			for(int i=0; i<6; i++){
				System.out.println(colourNames[i]);
			}

			//--------------------------------------------------------
			//Get user input
			//--------------------------------------------------------
			guess = input.nextLine();

			//--------------------------------------------------------
			//Validate user input
			//--------------------------------------------------------
			if(guess.equalsIgnoreCase(missingColour)){
				System.out.println("You guessed correctly!");
				correctAnswer = true;
			}
			else{
				System.out.println("Wrong. Try again..");
				colourNames = positionOfColour;

				continue;
			}

			input.close();

			//System.out.println("the missing colour is " + missingColour);


		}
		//TODO this will probably require ordered array removal and addition of elements 

	}

}

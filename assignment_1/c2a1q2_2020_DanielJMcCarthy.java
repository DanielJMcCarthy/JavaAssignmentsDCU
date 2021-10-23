package assignment_1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class c2a1q2_2020_DanielJMcCarthy {

	static class die{ //A die class with a maximum value of 6 (number of sides on the die)

		private final static int FACE_VALUE_MAX = 6;  // maximum face value
		private static int faceValue;  // current value showing on the die

		//-----------------------------------------------------------------
		//  Constructor: Sets the initial face value.
		//-----------------------------------------------------------------
		public die()
		{
			faceValue = 1;
		}


		//-----------------------------------------------------------------
		//  Rolls the die and returns the result.
		//-----------------------------------------------------------------
		public static int roll()
		{
			faceValue = (int)(Math.random() * FACE_VALUE_MAX) + 1;

			return faceValue;
		}


	}


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userInput;
		int currentGuess = 0;
		int guessCounter = 0;
		int numOfWins = 0;



		//-----------------------------------------------------------------
		//  Loop for 5 rolls.
		//-----------------------------------------------------------------
		for(int i=0; i<5; i++ ){


			//-----------------------------------------------------------------
			//  Random Die toss. (+ answer for the sake of testing code)
			//-----------------------------------------------------------------
			die.roll();
			System.out.println("(GENEROUS HINT) The correct answer is: " + die.faceValue);


			//-----------------------------------------------------------------
			//  Keep track of the guess the user is on.
			//-----------------------------------------------------------------
			guessCounter++;
			System.out.println("Guess Number: " + guessCounter );


			//-----------------------------------------------------------------
			//  User input validation loop.
			//-----------------------------------------------------------------
			{
				do{


					//-----------------------------------------------------------------
					//  Get user input for guess.
					//-----------------------------------------------------------------
					System.out.println("Guess the next dice throw (1-6): ");
					userInput = input.nextLine();


					System.out.println("Number must be between 1 and 6 inclusive, please try again");

					try{

						currentGuess = Integer.parseInt(userInput);

					}catch(NumberFormatException ex){

						System.out.println("Number must be an integer, please try again");

					}

				}while(currentGuess <1 || currentGuess >6);

			}




			//-----------------------------------------------------------------
			//  Check if guess is correct or incorrect + Modify numOfWins
			//-----------------------------------------------------------------
			if(currentGuess == die.faceValue){
				System.out.println("Congratulations, you guessed right!");
				numOfWins++;
			}
			else 
				System.out.println("Hard luck, last throw was " + die.faceValue);



		}

		//-----------------------------------------------------------------
		//  Display the users score
		//-----------------------------------------------------------------
		System.out.println("\n"  + "You got " + numOfWins + " right out of 5");


		//-----------------------------------------------------------------
		//  Close the scanner
		//-----------------------------------------------------------------
		input.close();
	}

}
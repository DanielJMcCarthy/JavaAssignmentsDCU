package assignment_1;

import java.util.Scanner;


public class c2a1q1_2020_DanielJMcCarthy {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String userIn;
		int userInt = 0;


		//-----------------------------------------------------------------
		//  Ask for user input in loop
		//-----------------------------------------------------------------
		do{
			System.out.println("Enter an integer between 1,000 and 999,999: ");

			userIn = in.nextLine();



			//-----------------------------------------------------------------
			//  Parse String to userInt
			//-----------------------------------------------------------------

			try{

				userInt = Integer.parseInt(userIn);

			}catch (NumberFormatException numEx) {

				System.out.println("Invalid entry");

			}


			//-----------------------------------------------------------------
			//  Validate the number is within range
			//-----------------------------------------------------------------

			if(userInt < 1000){
				System.out.println("number entered is too low.");
			}
			else if(userInt >999999){
				System.out.println("number entered is too high.");
			}


		}while(userInt < 1000 || userInt > 999999);


		//-----------------------------------------------------------------
		//  Display number without a comma
		//-----------------------------------------------------------------
		System.out.println("The number entered (without a comma) is: " + userInt);
		in.close();

	}

}

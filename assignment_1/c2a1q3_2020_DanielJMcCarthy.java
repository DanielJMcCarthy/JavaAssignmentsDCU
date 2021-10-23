package assignment_1;

import java.util.Scanner;


public class c2a1q3_2020_DanielJMcCarthy {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		int i,j = 0;
		int n = 0;
		String userInput;


		//-----------------------------------------------------------------
		//  User input validation do-while loop.
		//-----------------------------------------------------------------
		{
			do{


				//-----------------------------------------------------------------
				//  Get user input of an odd integer.
				//-----------------------------------------------------------------
				System.out.println("Enter an integer that is odd, in the range of 3 to 15 (inclusive): ");
				userInput = input.nextLine();


				//-----------------------------------------------------------------
				//  Error handling for parsing integer.
				//-----------------------------------------------------------------
				try {

					n = Integer.parseInt(userInput);

				}catch (NumberFormatException numEx) {

					System.out.println("Invalid entry, number must be an integer.");

				}


				if((n < 3 || n > 15) || (n % 2 == 0)){
					System.out.println("Invalid entry, number must be in range, and must be odd.");
				}


			}while(n != 3 && n != 5 && n != 7 && n != 9 &&
					n != 11 && n != 13 && n != 15);
		}
		//-----------------------------------------------------------------
		//  Create diamond shape given (n) number of rows.
		//-----------------------------------------------------------------
		n = n/2+1;


		//-----------------------------------------------------------------
		//  Top segment of the diamond.
		//-----------------------------------------------------------------

		{
			for(i=1; i<=n; i++){
				for(j=n; j>i; j--){
					System.out.print(" ");
				}
				System.out.print("@");
				for(j=1; j<(i-1)*2; j++){
					System.out.print(" ");
				}
				if(i==1){
					System.out.print("\n");
				}
				else{
					System.out.print("@" + "\n");
				}
			}
		}
		//-----------------------------------------------------------------
		//  Bottom segment of the diamond.
		//-----------------------------------------------------------------
		{
			for(i=n-1; i>=1; i--){
				for(j=n; j>i; j--){
					System.out.print(" ");
				}
				System.out.print("@");
				for(j=1; j<(i-1)*2; j++){
					System.out.print(" ");
				}
				if(i==1){
					System.out.print("\n");
				}
				else{
					System.out.print("@" + "\n");
				}
			}
		}

		input.close();
	}

}
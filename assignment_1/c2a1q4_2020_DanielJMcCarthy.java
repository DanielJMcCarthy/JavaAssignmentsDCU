package assignment_1;

import java.util.Scanner;



public
class c2a1q4_2020_DanielJMcCarthy {

	public static void main(String[] args) {

		final int MIN_CODE_LENGTH = 5;
		final int MAX_CODE_LENGTH = 10;

		Scanner input = new Scanner(System.in);

		String code = "";
		int codeLength = code.length();

		//char ch;

		boolean invalidCode = true;


		//-----------------------------------------------------------------
		//  Display rules for a valid code.
		//-----------------------------------------------------------------
		System.out.println("The rules for the code you may enter are as follows: ");
		System.out.print("1. Code must contain no spaces" + "\n"
				+ "2. Code must have between 5 and 10 characters" + "\n"
				+ "3. Code must begin with \\ and must end with \\" + "\n"
				+ "4. Code must contain at least one lower-case letter and at least one upper-case letter"
				+"\n");


		//-----------------------------------------------------------------
		// Validation loop.
		//-----------------------------------------------------------------
		while(invalidCode = true){
			boolean a = true,b = true,c = true,d = true;//e =true,f =true;

			//-----------------------------------------------------------------
			//  Ask user to enter a code.
			//-----------------------------------------------------------------
			System.out.println("Please enter a code: ");
			code = input.next();


			//-----------------------------------------------------------------
			// Validate the code entered.
			//-----------------------------------------------------------------
			//-----------------------------------------------------------------
			// Code must start and end with '\'
			//-----------------------------------------------------------------
			if(code.charAt(0) == '\\') {
				a = false;
			}
			else{
				System.out.println("Code must start with \\");
			}


			if(code.charAt(codeLength) == '\\'){
				b = false;
			}
			else{
				System.out.println("Code must end with \\");
			}


			//-----------------------------------------------------------------
			// Code is between 5 and 10 characters in length
			//-----------------------------------------------------------------
			if((codeLength >= MIN_CODE_LENGTH) || (codeLength <= MAX_CODE_LENGTH)){
				c = false;
			}
			else{
				System.out.println("Code must be between 5 and 10 characters in length.");
			}


			//-----------------------------------------------------------------
			// Blank spaces.
			//-----------------------------------------------------------------
			if(code.contains(" ")){
				System.out.println("Code must contain no spaces");
			}
			else{ 
				d = false;
			}


			//-----------------------------------------------------------------
			// Uppercase and lowercase. [TODO] Having trouble with this.
			//-----------------------------------------------------------------
			/*
			 	for(int i=0;i < code.length();i++) {
				ch = code.charAt(i);
				if (Character.isUpperCase(ch)) {
					e = false;
				}
				else{
					System.out.println("Code must contain at least one uppercase letter.");
				}


				if (Character.isLowerCase(ch)) {
					f = false;
				} 
				else{
					System.out.println("Code must contain at least one lowercase letter.");
				}
			}
			 */



			//-----------------------------------------------------------------
			// Check if code is successfully validated.
			//-----------------------------------------------------------------
			if(a == false && b == false && c == false && 
					d == false){// && e == false && f == false
				invalidCode = false;
			}


			//-----------------------------------------------------------------
			// Display the code and validation.
			//-----------------------------------------------------------------
			if(invalidCode = false){
				System.out.println("Your code is " + code);
				System.out.println("Code is valid.");
			}
		}


		input.close();
	}

}

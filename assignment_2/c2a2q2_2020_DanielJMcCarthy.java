package assignment_2;

import java.util.Scanner;

public class c2a2q2_2020_DanielJMcCarthy {

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);

		int firstInt, secondInt, thirdInt, fourthInt;

		String userStringInput = "";
		//TODO : note, the math element of this should work perfectly, tweaking needed with user validation.

		do
		{
			//get user input for character selected
			System.out.println("Enter a character in the range of A-E : ");
			userStringInput = in.next();

		}while(userStringInput != "A" || userStringInput != "B"|| userStringInput != "C"|| userStringInput != "D"|| userStringInput != "E");


		String letter = userStringInput;



		//get user input for four number variables
		System.out.println("(1)Enter a number between 1-9 :");
		firstInt =  in.nextInt();

		System.out.println("(2)Enter a number between 1-9 :");
		secondInt =  in.nextInt();

		System.out.println("(3)Enter a number between 1-9 :");
		thirdInt =  in.nextInt();

		System.out.println("(4)Enter a number between 1-9 :");
		fourthInt =  in.nextInt();


		//calculate answer
		int answer;
		int x = firstInt + secondInt + thirdInt + fourthInt;



		if(letter == "A"){
			answer = 1*x;
			System.out.println("The total is: " + answer);
		}
		else if(letter == "B"){
			answer = 2*x;
			System.out.println("The total is: " + answer);
		}
		else if(letter == "C"){
			answer = 3*x;
			System.out.println("The total is: " + answer);
		}
		else if(letter == "D"){
			answer = 4*x;
			System.out.println("The total is: " + answer);
		}
		else if(letter == "E"){
			answer = 5*x;
			System.out.println("The total is: " + answer);
		}



		in.close();


	}

}

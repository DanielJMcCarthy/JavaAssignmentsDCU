package assignment_3_Recursion;

import java.util.Arrays;
import java.util.Scanner;

//Return sum of elements in A[0..N-1]
// using recursion.

public class c2a3q3_2021_DanielMcCarthy {
	
	//Method to find total of array
	static int findSum(int recursiveArray[], int n)
	{
	    if (n <= 0)
	        return 0;
	    return (findSum(recursiveArray, n - 1) + recursiveArray[n - 1]);
	}


	public static void main(String[] args){

		Scanner userIn = new Scanner(System.in);
		int[] array = new int[4];
		int[] modifiedArray = new int[4];
		int arrayElement;
		int numberOfElements = 0;
		int arrayPosition = 0;


		//While loop until 4 elements are added to the array.
		while(numberOfElements < 4){
			//Prompt for user input
			System.out.println("Enter an integer in the range of 1 to 9 (inclusive): ");
			arrayElement = userIn.nextInt();

			if((arrayElement < 0) || (arrayElement > 9)) {

				System.out.println("Invalid entry, number must be in range.");


			}
			else{
				//Add arrayElement to array at next position. Then increment arrayPosition.
				array[arrayPosition] = arrayElement;
				arrayPosition++;
				numberOfElements++; //Count the number of user added elements for while loop.
			}
		}
		//Print out the original array.
		System.out.println("Original array: " + Arrays.toString(array));
		
		

			
		//Generate the recursive array.
		int sumOfArray = (findSum(array, array.length));
		
		for(int i = 0; i < 4; i++){
			
			modifiedArray[i] = sumOfArray - array[i];
			
		}
		
		//Print out the new array.
		System.out.println("Modified array: " + Arrays.toString(modifiedArray));
		userIn.close();
	}

}

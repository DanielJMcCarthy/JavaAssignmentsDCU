package assignment_3_calculate_game;

import java.util.Random;
import java.util.Scanner;

public class c2a3q2_2021_DanielMcCarthy {




	public static void main(String[] args) {


		boolean running = true;
		int currentLevel = 1;
		int sum;
		int answer;
		int a,b;
		int numberOfTries = 0;
		Random rand = new Random();
		Scanner userIn = new Scanner(System.in);
		int totalCorrectInLevel = 0;



		//Print welcome message.
		System.out.println("Starting the test, there are 3 levels");
		System.out.println("To advance to each level, "
				+ "you must get 3 questions right in the previous level");


		//while loop to contain the game.
		while(running){

			//Level = 1
			while(currentLevel == 1){
				a = rand.nextInt(5);
				b = rand.nextInt(4);

				System.out.println(a + " + " + b + " = ");
				answer = userIn.nextInt();
				sum = a + b;

				//do-while loop to check answer. Repeat same sum while there are less than two tries.
				do{

					if((answer == sum) && (totalCorrectInLevel < 2)){
						System.out.println("Correct answer");

						totalCorrectInLevel++;

					}

					else if(answer == sum){
						System.out.println("Correct answer");
						System.out.println("Congratulations, advancing to level 2");

						//Increment currentLevel. Reset numberOfTries and totalCorrectInLevel.
						currentLevel++;
						numberOfTries = 0;
						totalCorrectInLevel = 0;
					}

					//If answer is incorrect, ask user to try again.
					else{
						System.out.println("Oops, that is not right, try again:");
						answer = userIn.nextInt();

						//if answer is correct increment toatalCorrectInLevel.
						if(answer == sum){
						totalCorrectInLevel++;
						}
						numberOfTries++;
					}
				}while((answer != sum) && (numberOfTries < 2));

			}

			//level 2
			while(currentLevel == 2){
				a = rand.nextInt(9);
				b = rand.nextInt(9);

				System.out.println(a + " + " + b + " = ");
				answer = userIn.nextInt();
				sum = a + b;

				do{

					if((answer == sum) && (totalCorrectInLevel < 2)){
						System.out.println("Correct answer");

						totalCorrectInLevel++;

					}

					else if(answer == sum){
						System.out.println("Correct answer");
						System.out.println("Congratulations, advancing to level 3");

						//Increment currentLevel. Reset numberOfTries and totalCorrectInLevel.
						currentLevel++;
						numberOfTries = 0;
						totalCorrectInLevel = 0;
					}

					else{
						System.out.println("Oops, that is not right, try again:");
						answer = userIn.nextInt();
						
						if(answer == sum){
							totalCorrectInLevel++;
							}
						numberOfTries++;
					}
				}while((answer != sum) && (numberOfTries < 2));

			}


			//level 3
			while(currentLevel == 3){

				do{
					a = rand.nextInt(9);
					b = rand.nextInt(9);
				}while(a - b <= 0);

				System.out.println(a + " - " + b + " = ");
				answer = userIn.nextInt();
				sum = a - b;

				do{

					if((answer == sum) && (totalCorrectInLevel < 2)){
						System.out.println("Correct answer");

						totalCorrectInLevel++;

					}

					//On the last correct answer set running to false and ensure game ends.
					else if(answer == sum){
						System.out.println("Correct answer");
						System.out.println("You completed the test, thank you!");

						currentLevel++; //This line breaks out of the while loop for level 3.
						running = false; 
						userIn.close();//close scanner.
						break;
					}

					else{
						System.out.println("Oops, that is not right, try again:");
						answer = userIn.nextInt();

						if(answer == sum){
							totalCorrectInLevel++;
							}
						numberOfTries++;
					}
				}while((answer != sum) && (numberOfTries < 2));

			}

		}
		
	}

}



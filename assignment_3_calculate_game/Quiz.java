package assignment_3_calculate_game;

//This class isn't implemented, I was having trouble getting the boolean condition to work.
//The code needed for this class is largely written out in main.

public class Quiz {

	boolean answer;
	int numberOfTries = 0;
	int currentLevel = 1;
	


	public boolean askQuestion(){

				if((answer = true) && (numberOfTries <= 2)){

					currentLevel++;
					return true;
				}
				else{

					return false;
				}
	
	}


}
/*
 * Although I don't implement this class, for the sake of attempt marks;
 * 
 * 	You would first create a constructor for the class in main.
 * 
 * 		Quiz q = new Quiz();
 * 
 *  Then you could call a method of this class as follows:
 * 		
 * 		q.askQuestion;
 * 
 * I recognise that there would be a lot less repetition had I gotten this class working.
 */



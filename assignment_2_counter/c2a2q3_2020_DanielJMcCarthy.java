


package assignment_2_counter;

import java.util.Random;

public class c2a2q3_2020_DanielJMcCarthy {




	public static void main(String[] args) {


		final int MAX_CAPACITY_VENUE = 15;
		int currentNumberOfCustomers = 0;

		//create venueCounter object
		CustomerCounter venueCounter = new CustomerCounter();


		//loop until max capacity of the venue is reached
		do{
			//Implements random entry and exit of people at the venue. 33.3%chance of leaving, 66.6% of entering.
			int result;
			Random randomNum = new Random();
			result = randomNum.nextInt(3);


			//calls the method personEnters from CustomerCounter class
			if(result == 1 || result == 2 ){//person enters
				currentNumberOfCustomers++;
				venueCounter.personEnters(currentNumberOfCustomers);

			}

			//calls the method personLeaves from CustomerCounter class
			else if(result == 0){//person leaves
				currentNumberOfCustomers--;
				venueCounter.personLeaves(currentNumberOfCustomers);

			}

			result = 0;

		}while(currentNumberOfCustomers != MAX_CAPACITY_VENUE);
		//calls the method maxCapacity from CustomerCounter class
		venueCounter.maxCapacity(MAX_CAPACITY_VENUE);

	}



}

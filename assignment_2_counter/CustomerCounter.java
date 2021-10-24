package assignment_2_counter;

public class CustomerCounter {




	//method for when a person enters the venue
	public void personEnters(int currentAmountOfPeople) {
		System.out.println("One person entered the venue");
		System.out.println("Current amount of people in the venue: " + currentAmountOfPeople + "\n");

	}

	//method for when a person leaves the venue
	public void personLeaves(int currentNumberOfCustomers)
	{
		System.out.println("One person left the venue");
		System.out.println("Current amount of people in the venue: " + currentNumberOfCustomers + "\n");

	}
	//method for when the venue is reaches max capacity
	public void maxCapacity(int MAX_CAPACITY_VENUE)
	{
		System.out.println(" “Alarm: Maximum number of " + MAX_CAPACITY_VENUE +  " customers reached, please ask next customer to wait“ ");

	}






}

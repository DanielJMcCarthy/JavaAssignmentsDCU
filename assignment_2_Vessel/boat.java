package assignment_2_Vessel;

public class boat extends vessel{



	public String[] steeringType = new String[] {"WHEEL","TILLER","OARS"};

	public boat(String[] steeringType, String name, String model, double length, int yearOfManufacture) {
		super(name, model, length, yearOfManufacture);


		this.steeringType = steeringType;

	}


	public String toString() 
	{ 
		return steeringType + " " + name + " " + model + " " + length + " " + yearOfManufacture;
	}

}

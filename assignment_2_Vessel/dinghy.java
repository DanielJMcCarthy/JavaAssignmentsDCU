package assignment_2_Vessel;

public class dinghy extends vessel{


	public boolean inflatable = true;


	//create a dinghy object and pass through variables from dinghy class and superclass

	dinghy(boolean inflatable, String name, String model, double length, int yearOfManufacture){
		super(name, model, length, yearOfManufacture);
		this.inflatable = inflatable;


	}

	public String toString() 
	{ 
		return inflatable + " " + name + " " + model + " " + length + " " + yearOfManufacture;
	}


}

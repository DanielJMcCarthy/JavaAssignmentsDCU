package assignment_2_Vessel;



public class vessel  {

	public String name;
	public double length;
	public String model;//=make
	public int yearOfManufacture;


	//create vessel object and identify variables with the 'this.' keyword.
	public vessel(String name, String model, double length, int yearOfManufacture){

		this.name = name;
		this.model = model;
		this.length = length;
		this.yearOfManufacture = yearOfManufacture;
	}

	//create toString method to return values as string
	public String toString() 
	{ 
		return name + " " + model + " " + length + " " + yearOfManufacture;
	}





}

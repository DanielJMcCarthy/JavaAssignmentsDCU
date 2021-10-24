package assignment_2_Vessel;

public class c2a2q4_2020_DanielJMcCarthy {

	public static void main(String[] args) {


		//Creates vessel object and call method.
		vessel v1 = new vessel("The Codfather", "Bertram", 42.42, 1997);

		System.out.println(v1.name);
		System.out.println(v1.yearOfManufacture);
		System.out.println(v1.length);
		System.out.println(v1.model);

		System.out.println(v1);
		System.out.println(v1.toString());

		System.out.println("\n\n");

		//Creates dinghy object and call method.
		dinghy d1 = new dinghy(true, "Unsinkable II", "AquaGlide", 4.60, 2021 );


		System.out.println(d1.inflatable);
		System.out.println(d1.name);
		System.out.println(d1.yearOfManufacture);
		System.out.println(d1.length);
		System.out.println(d1.model);

		System.out.println(d1);
		System.out.println(d1.toString());


		System.out.println("\n\n");

		//Creates boat object and call method.
		boat b1 = new boat(args, "abc", "xyz", 7.20, 2014);
		//steeringType

		System.out.println(b1.name);
		System.out.println(b1.yearOfManufacture);
		System.out.println(b1.length);
		System.out.println(b1.model);

		System.out.println(b1);
		System.out.println(b1.toString());

		try{
			System.out.println(b1.steeringType[0]);
		}catch(Exception e){
			System.out.println("ArrayIndexOutOfBoundsException   ->   I can't figure out why this happens");
		}
	}

}

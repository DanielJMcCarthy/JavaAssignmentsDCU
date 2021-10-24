package assignment_3_Tutorials;


//My notes:
//Dynamic bonding differs from static bonding due to the object being determined at runtime.

public class dynamicBinding {


class Bird{  //Superclass
	void sing(){System.out.println("chirp,chirp,chirp.");}  
}  

class Robin extends Bird{ //Subclass 
	void sing(){System.out.println("tweet,tweet,tweet.");}  //Overriding method as it is not static,final or private.


	public void main(String args[]){  
		Bird b=new Robin();  //Creating a new instance of bird of type robin.
		b.sing();  //Robin overrides Bird 
	}  
}  

}
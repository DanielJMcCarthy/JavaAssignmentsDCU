package assignment_3_Tutorials;

public class dataAbstraction {

	abstract class Bird {
		public abstract void sing();
	}


	public class Robin extends Bird{
		
		public void sing(){
			System.out.println("tweet,tweet,tweet.");
		}
	}
	


		public void main(String args[]){
			Bird r = new Robin();
			r.sing();
	
		}

	}


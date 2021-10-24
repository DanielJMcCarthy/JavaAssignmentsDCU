package assignment_3_Tutorials;


public class inheritance {

	class Bird {
		String specias = "Bird";
		void sing(){
			System.out.println("chirp,chirp,chirp");
		}
	}

	public class Robin extends Bird{
		String name = "Robin";

	public class Thrush extends Bird{
		
	}

		public void main(String args[]){
			Robin r = new Robin();
			System.out.println(r.specias);
			System.out.println(r.name);
			r.sing();
		}
	}

}

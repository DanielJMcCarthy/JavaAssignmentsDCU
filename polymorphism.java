package assignment_3_Tutorials;


public class polymorphism {

	class Bird {
		void sing(){
			System.out.println("chirp,chirp,chirp");
		}
	}


	public class Robin extends Bird{
		@Override
		void sing(){
			System.out.println("tweet,tweet,tweet.");
		}
	}
	public class Owl extends Bird{
		@Override
		void sing(){
			System.out.println("hoot,hoot.");
		}



		public void main(String args[]){
			Robin r = new Robin();
			r.sing();
			Owl o = new Owl();
			o.sing();
		}

	}
}

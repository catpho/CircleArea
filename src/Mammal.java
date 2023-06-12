public class Mammal extends Animal{
	String sound = "Mammal Chaos Music";
	void count() {
		System.out.println("IDEALLY COUNT WOULD GO THROUGH LIST OF ANIMALS TO CONFIRM AND REPORT HOW MANY WERE MAMMALS.");
	}
	}
	
	 class Cat extends Mammal{
		String sound = "meow meow";
		private String name = "Cici"; 
		
		
		public void catname(String meowers) {
		 meowers = name;
		 System.out.println("My furry friend is named: " + meowers);
	 }
	}
	 class Dog extends Mammal{
		String sound = "woof woof";
		private int jumpheight = 12;
				
		public void height() {
				int high = jumpheight;
				System.out.print("My goodest pupper jumps " + high + "feet!" );
    }
	}
	


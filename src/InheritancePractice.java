import java.util.Scanner;

public class InheritancePractice {
	public static void main(String[]args) {
	    System.out.println("Welcome to my Program! Would you like to continue? Enter 'y' for yes, 'n' for no.");
		Scanner scnr =new Scanner(System.in);
	    String answer = scnr.nextLine();
		
	    if(answer.equalsIgnoreCase("y"))
	    {
	    System.out.println("Which animal would you like to see?");
	    answer = scnr.nextLine();
	    
	    if(answer.equalsIgnoreCase("cat")) 
	    {	
	    Cat Cici = new Cat();
		Cici.catname("Cici");
		System.out.println("Cici is our new addition to our farm! Introduce yourself!");
		Cici.speak();
		System.out.println(Cici.sound);
	    }
	    
	    else if (answer.equalsIgnoreCase("fish"))
	    {
		System.out.println("Nemo is our new addition to our farm! Say Hello!");
		Fish nemo = new Fish();
		System.out.println(nemo.sound);
		nemo.move();
	    }
		
	    else if (answer.equalsIgnoreCase("dog"))
	    {
		System.out.println("Don't forget Fido!");
		Dog fido = new Dog();
		fido.speak();
		System.out.println(fido.sound);
		System.out.println("Would user like to see Fido do a trick?");
		answer = scnr.nextLine();
		if(answer.equalsIgnoreCase("yes"))
		{
		fido.height();
		}
		else if(answer.equalsIgnoreCase("no")) {
		fido.whine();
		}
		else {
		System.out.println("Fido seems distracted today");	
		}}
	    
	    else {
	    	System.out.println("Oops! I guess they are not in today!");
	    }
	    }
		
		else 
		{
		System.out.println("That's okay! Goodbye then! Comeby another time!");	
		}
			
		
		
	}
}

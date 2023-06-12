import java.util.Scanner;

public class InheritancePractice {
	public static void main(String[]args) {
	    System.out.println("Welcome to my Program! Would you like to continue? Enter 'y' for yes, 'n' for no.");
		Scanner scnr =new Scanner(System.in);
	    String answer = scnr.nextLine();
		
		
		
		Cat Cici = new Cat();
		Cici.catname("Cici");
		System.out.println("Cici is our new addition to our farm! Introduce yourself!");
		Cici.speak();
		System.out.println(Cici.sound);
		
		System.out.println("Nemo is our new addition to our farm! Say Hello!");
		Fish nemo = new Fish();
		System.out.println(nemo.sound);
		nemo.move();
		
		
		System.out.println("Don't forget Fido!");
		Dog fido = new Dog();
		fido.speak();
		System.out.println(fido.sound);
		fido.height();
		
		
	}
}

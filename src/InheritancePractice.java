

public class InheritancePractice {
	public static void main(String[]args) {
		Cat Cici = new Cat();
		Cici.catname("Cici");
		System.out.println("Cici is our new addition to our farm! Introduce yourself!");
		Cici.speak();
		System.out.println(Cici.sound);
		
		System.out.println("Nemo is our new addition to our farm! Say Hello!");
		Fish nemo = new Fish();
		nemo.move();
		System.out.println(nemo.sound);
		
		System.out.println("Don't forget Fido!");
		Dog fido = new Dog();
		fido.speak();
		System.out.println(fido.sound);
		
		
	}
}

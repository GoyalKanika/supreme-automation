package oopsConcept;

public class ConstructorMain {

	public static void main(String[] args) {
		
		Constructor c1= new Constructor();
		c1.setMake("AUDI");
		System.out.println(c1.getMake());
		System.out.println(c1.gear);
		System.out.println(c1.speed);
		
		Constructor c2 = new Constructor(122,4);
		c2.setMake("Volks");
		System.out.println(c2.getMake());
		System.out.println(c2.speed);
		System.out.println(c2.gear);
	}
}

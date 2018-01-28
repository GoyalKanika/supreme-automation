package oopsConcept;

public class CarRefactor {

	public static void main(String[] args) {


		Car c1 = new Car();
		c1.setMake("Audi");
		System.out.println(c1.getMake());
		c1.setModel("X series");
		System.out.println(c1.getModel());
		c1.setColor("White");
		System.out.println(c1.getColor());
		c1.setYear(1888);
		System.out.println(c1.getYear());
	}

}

package oopsConcept;

public class CarMain {
	
	static Car c1 = new Car();
	public static void main(String[] args) {		
		c1.setMake("BMW");
		c1.setModel("X Series");
		c1.setColor("Blue");
		c1.setYear(1880);
		displayCar();
	
		
		c1.setMake("Benz");
		c1.setModel("A Class");
		c1.setYear(1890);
		c1.setColor("White");
		displayCar();
		
	}	
	public static void displayCar(){
		System.out.println("**********************");
		System.out.println(c1.getMake());
		System.out.println(c1.getModel());
		System.out.println(c1.getColor());
		System.out.println(c1.getYear());
		System.out.println("**********************");		
	}

}

package oopsConcept;

public class Constructor {
	
	private String make;
	int speed; int gear;

	public Constructor() {
		this(123, 2); 
		/*This is called -- Calling a constructor from a constructor
		 * This would print - Constructor with arguement. It will not
		print 123 and 2 values now. Coz in 11th and 12th lines we are setting the 
		values as 0 and 0.*/
		this.speed = 0;
		this.gear = 0;
		System.out.println("Constructor without arguement");
	}
	public Constructor(int speed, int gear) {
		this.speed = speed;
		this.gear = gear;
		System.out.println("Constructor with arguement");
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	public String getMake() {
		return make;
	}

	
	
	
	
}

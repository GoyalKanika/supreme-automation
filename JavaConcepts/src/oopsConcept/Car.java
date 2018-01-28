package oopsConcept;

public class Car {
	
	private String model;
	private String make;
	private String color;
	private int year;
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setYear(int year) {
		if(year > 1900){
				this.year = year;}
		else{			
			System.out.println("Year is not valid");}
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public String getColor() {
		return color;
	}
	public String getMake() {
		return make;
	}	
	public void increaseSpeed(){
		System.out.println("Speed is increasing");
	}

}

package staticPackage;

public class StaticDemo {

	public static void main(String[] args) {
		
		StaticExampleClass s1 = new StaticExampleClass("bmw");
		System.out.println("Instance of the car: "+StaticExampleClass.getNumber());
		System.out.println("Make of the car: "+s1.getName());
		
		
		StaticExampleClass s2 = new StaticExampleClass("benz");
		System.out.println("Instance of the car: "+StaticExampleClass.getNumber());
		//System.out.println("Instance of the car: " +StaticExampleClass.getInstance);
		//System.out.println("Instance of the car: "+s2.getInstance);
		System.out.println("Make of the car: "+s2.make);		
	}
}
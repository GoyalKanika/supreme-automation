package staticPackage;

public class StaticExampleClass {
	
	String make;
	static int getInstance=0;
	
	public StaticExampleClass(String make){
		this.make =make;
		getInstance++;
	}
	
	public String getName(){
		return make;
	}
	
	//get Number is made as static method so that it can directly be accessed by 
	//StaticExampleClass.getNumber() and StaticExampleClass.getInstance
	public static int getNumber(){
		return getInstance;
	}

}

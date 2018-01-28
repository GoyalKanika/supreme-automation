package oopsConcept;

public class AddingMethodsRefactor {

	
	/* By refactoring the previous code, I have made return type as String for 
	 * getGrades method. It is returning Grades which I am using in grade=getGrades(score) and in displayResults method
	 */
	public static void main(String[] args) {
	String grade;
	String studentName;	
	int score; 
	
	studentName = "Tom";
	score = 90;	
	grade=getGrades(score);
	displayResult(studentName,grade);	
	
	studentName = "Tim";
	score = 89;	
	grade=getGrades(score);
	displayResult(studentName,grade);
	
	studentName = "Josh";
	score = 45;	
	grade=getGrades(score);
	displayResult(studentName,grade);
	}
	
	public static String getGrades(int score){
		String grade;
		if(score>=90 && score <=100)
			grade = "A";
		else if(score >= 80 && score <90)
			grade = "B";
		else if(score >=70 && score <80)
			grade = "C";
		else
			grade = "D";		
		return grade;
	}	
	public static void displayResult(String studentName, String grade){
		System.out.println("Grades of " + studentName + " are: " + grade);
	}
}
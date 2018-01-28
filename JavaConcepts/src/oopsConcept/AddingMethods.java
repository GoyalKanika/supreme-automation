package oopsConcept;

public class AddingMethods {

	public static void main(String[] args) {
		getGrade("Tim",79);
		getGrade("Josh",89);
	}
	public static void getGrade(String studentName, int score){
		String grade;
		if(score>=90 && score <=100)
			grade = "A";
		else if(score >= 80 && score <90)
			grade = "B";
		else if(score >=70 && score <80)
			grade = "C";
		else
			grade = "D";
		System.out.println("Grades of " +studentName + " are : " +grade);
	}
}

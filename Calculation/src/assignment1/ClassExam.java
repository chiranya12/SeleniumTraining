package assignment1;

public class ClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student student1 = new student();
		student1.subject1 = 100;
		student1.subject2 = 30;
		student1.subject3 = 40;
		student1.subject4 = 50;
		
		student1.totalmark =  student1.CalculateTotalMark(student1.subject1, student1.subject2, student1.subject3, student1.subject4);
		student1.avg = student1.CalculateAverage(student1.totalmark);
		student1.grade = student1.Calculategrade(student1.avg);
		
		System.out.println("Total mark is: " + student1.totalmark);
		System.out.println("Average is: " + student1.avg);
		System.out.println("Grade is: " + student1.grade);
	}

}

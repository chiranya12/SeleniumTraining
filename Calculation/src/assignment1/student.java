/**
 * 
 */
package assignment1;

/**
 * @author chira
 *
 */
public class student {

	public int subject1;
	public int subject2;
	public int subject3;
	public int subject4;
	
	public int totalmark;
	public int avg;
	public String grade;

	public int CalculateTotalMark(int subject1, int subject2, int subject3, int subject4) {
		// TODO Auto-generated method stub
		int total = subject1 + subject2 + subject3 + subject4;
		return total;
	}
	
	public int CalculateAverage(int totalmark) {
		int avg = totalmark / 4;
		return avg;
	}
	
	public String Calculategrade(int avg) {
		if(avg <33) 
			grade = "Fail";
		if(avg <60 && avg > 33) 
			grade = "Good";
		if(avg <80 && avg >60) 
			grade = "Very Good";
		if(avg <=100 && avg>80) 
			grade = "Awesome";
		
		return grade;
	}

}

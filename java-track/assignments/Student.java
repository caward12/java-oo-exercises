
public class Student {
	private String name;
	private int StudentID;
	private int credits;
	private double gpa;
	
	public Student (String firstName, String lastName, int id, int credits, double gpa){
		this.name = firstName + " " + lastName;
		this.StudentID = id;
		this.credits = credits;
		this.gpa = gpa;
	}
	
	public Student(String firstName, String lastName, int id){
		this.name = firstName + " " + lastName;
		this.StudentID = id;
		this.credits = 0;
		this.gpa = 0.0;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getStudentID(){
		return this.StudentID;
	}
	
	public int getCredits(){
		return this.credits;
	}
	
	public double getGPA(){
		return this.gpa;
	}
	
	public String getClassStanding(){
		if (getCredits() < 30){
			return "Freshman";
		}else if (getCredits() >= 30 && getCredits() <60){
			return "Sophomore";
		}else if (getCredits() >= 60 && getCredits() < 90){
			return "Junior";
		}else{
			return "Senior";
		}
	}
	
	public void submitGrade(double grade, int classCredits){
		//compute quality score for class
		double qualityScore = grade * classCredits;
		//compute quality score for existing gpa
		double currentQuality = this.gpa * this.credits;
		//adding this class' credits to all credits
		this.credits = this.credits + classCredits;
		//adding quality scores together
		currentQuality = currentQuality + qualityScore;
		//unrounded gpa - divide quality score by number of credits 
		double gpaUnround = currentQuality / this.credits;
		//rounding gpa to 3 decimals - using math.round and casting
		this.gpa = (double) Math.round(gpaUnround*1000.0) / 1000.0;
		
	}
	
	public double computeTuition(){
		//cost of each credit
		double creditCost = 1333.33;
		//calculate semesters
		int semesters = this.credits / 15;
		//calculate leftover credits
		int leftoverCredits = this.credits % 15;
		return semesters*20000.00 + leftoverCredits*creditCost;
	}
	
	public Student createLegacy(Student a, Student b){
		return new Student (a.getName(), b.getName(), a.StudentID + b.StudentID, Math.max(a.credits, b.credits), (a.getGPA()+b.getGPA())/2.0);
	}
	
	public String toString(){
		return this.name + "(" + this.StudentID + ")";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

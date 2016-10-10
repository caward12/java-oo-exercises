

public class Course {
	
	private String name;
	private int credits;
	private int availSeats;
	private Student[] roster;
	
	public Course(String name, int credits, int numSeats){
		this.name = name;
		this.credits = credits;
		this.availSeats = numSeats;
		this.roster = new Student[numSeats];
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getCredits(){
		return this.credits;
	}
	
	public int getRemainingSeats(){
		return this.availSeats;
	}
	
	public Student[] getRoster(){
		return this.roster;
	}
	
	public boolean addStudent(Student a){
		//is class full?
		if (availSeats ==0){
			return false;
		}
		//if already enrolled - that roster not empty and if student not already on the roster
		for (int i=0; i < roster.length; i++ ){
			if (roster[i] != null && roster[i].getName() == a.getName()){
				return false;
			}
		}
		//add student to roster - in location of length of array minus how many seats left
		roster[roster.length - this.availSeats] = a;
		//updated number of seats
		this.availSeats = this.availSeats -1;
		return true;
	}
	
	public String generateRoster(){
		//empty string
		String classRoster = "";
		//iterate through roster array 
		for(int i = 0; i<roster.length; i++){
			//if roster spot not empty
			if (roster[i]!= null){
				//add name in roster to string with enter on the end of line
				classRoster = classRoster + roster[i].getName() +"\n";
			}
		}
		//return string
		return classRoster;
	}
	
	public double averageGPA(){
		//create gpa sum variable to hold sum of gpas
		double sum = 0.0;
		//create number of students variable to hold total number of students 
		int numStudents = 0;
		//iterate through roster
		for (int i = 0; i<roster.length; i++){
			//if spot in roster is not empty
			if (roster[i] != null){
				//add that student's gpa to sum
				sum = sum + roster[i].getGPA();
				//add student to total number of students 
				numStudents = numStudents +1;
			}
		}
		//return the sum of all gpas divided by the total number of students 
		return sum / numStudents;
	}
	
	public String toString(){
		return this.getName() + this.getCredits();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

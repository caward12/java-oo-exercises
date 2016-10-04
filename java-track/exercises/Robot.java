
public class Robot {
	
	//fields
	
	//name
	//Position
	//Speed
	//Orientation
	
	private String Name;
	private double x;
	private double y;
	private int speed;
	private int orientation;
	
	//Behaviors
	
	//get orientation
	//get position
	//get speed
	//change orientation
	//change position
	//change speed
	//figure distance from another robot
	
	//create a robot
	public Robot (String Name, double x, double y, int speed, int orientation)
	{
		this.Name = Name;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.orientation = orientation;
	}
	
	public String getName()
	{
		return this.Name;
	}

	public double getX()
	{
		return this.x;
	}
	
	public double getY()
	{
		return this.y;
	}
	
	public String getLocation()
	{
		return "(getX(), getY())";
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public String getOrientation()
	{
		if (this.orientation == 1){
			return "North";
		}
		else if (this.orientation ==2){
			return "East";
		}
		else if (this.orientation ==3){
			return "South";
		}
		else {
			return "West";
		}
				
	}
	
	public void rotate90left()
	{ 
		if (this.orientation == 1){
			this.orientation = 4;
		}
		else if (this.orientation == 2){
			this.orientation = 1;
		}
		else if (this.orientation == 3){
			this.orientation = 2;
		}
		else{
			this.orientation = 3;
		}
	}
	
	public void rotate90right()
	{
		if (this.orientation == 1){
			this.orientation = 2;
		}
		else if (this.orientation == 2){
			this.orientation = 3;
		}
		else if (this.orientation == 3){
			this.orientation = 4;
		}
		else{
			this.orientation = 1;
		}
	}
	
	public void newSpeed( int newSpeed)
	{
		this.speed = newSpeed;
	}
	
	public String toString()
	{
		return "Name: " + this.Name + " Position: " + this.x + ","+ this.y + " Speed: " + this.speed + " Orientation: " + getOrientation();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

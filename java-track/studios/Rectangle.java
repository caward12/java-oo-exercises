
public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	
	public double area(){
		return this.length * this.width;
	}
	
	public double perimeter(){
		return (this.length *2) + (this.width*2);
	}
	
	public String compare(Rectangle secondRectangle){
		if (this.area() > secondRectangle.area()){
			return "The first rectangle is larger";
		}
		else if (this.area() == secondRectangle.area()){
			return "The rectangles are the same";
		}
		else{
			return "The second rectangle is larger";
		}
	}
	
	public boolean square(){
		if (this.length==this.width){
			System.out.println("This is a square!");
			return true;
		}
		else{
			System.out.println("This is not a square!");
			return false;
		}
	}

	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(3,4);
		
		System.out.println(rectangle1.length);
		System.out.println(rectangle1.area());
		System.out.println(rectangle1.perimeter());
		System.out.println(rectangle1.square());
		
		Rectangle rectangle2 = new Rectangle(5, 5);
		
		System.out.println(rectangle2.area());
		System.out.println(rectangle2.perimeter());
		System.out.println(rectangle2.square());
		
		System.out.println(rectangle1.compare(rectangle2));

	}

}

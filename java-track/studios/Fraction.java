
public class Fraction {
	
	private int numerator;
	private int denominator;

	
	public Fraction(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public int getNum(){
		return this.numerator;
	}
	
	public int getDen(){
		return this.denominator;
	}
	
	public Fraction add(Fraction other){
		int newDen = this.denominator * other.denominator;
		int num1 = this.numerator * other.denominator;
		int num2 = other.numerator * this.denominator;
		int newNum = num1 +num2;
		return new Fraction(newNum, newDen);
	}
	
	public Fraction multiply(Fraction other){
		int newNum = this.numerator * other.numerator;
		int newDen = this.denominator * other.denominator;
		return new Fraction(newNum, newDen);
	}
	
	public Fraction recip(){
		int num = this.denominator;
		int den = this.numerator;
		return new Fraction(num, den);
	}
	
	public int gcd() {
	    int x;
	    if (this.numerator > this.denominator)
	        x = this.denominator;
	    else
	        x = this.numerator;
	    for (int i = x; i > 0; i--) {
	        if ((this.numerator % i == 0) && (this.denominator % i == 0))
	            return i;
	    }
	   return 1;
	}
	
	public Fraction simplify(){
		int gcd = this.gcd();
		 if (gcd > 1) {
			 this.numerator = this.numerator / gcd;
	         this.denominator = this.denominator / gcd;
	         return new Fraction(numerator, denominator);
	        }	
		 else{
			 return new Fraction (numerator, denominator);
		 }
	}
	
	public String toString(){
		return this.numerator + "/" + this.denominator;
	}
	

	public static void main(String[] args) {
		Fraction fraction1 = new Fraction(2, 3);
		Fraction fraction2 = new Fraction(1, 4);
		System.out.println(fraction1);
		System.out.println(fraction1.add(fraction2));
		System.out.println(fraction1.multiply(fraction2).simplify());
	
		Fraction fraction3 = new Fraction(2, 12);
		System.out.println(fraction3.gcd());
		
		System.out.println(fraction1.recip());

	}

}

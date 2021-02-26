package model;
/*
 * A template for a member objects
 */
public class Member {
	/*
	 * Attributes (class- level variables; all methods can access them)
	 */
	//private variables are only accessible within the current class
	// for other classes to access these variables, call a public accessor method (encapsulation).
	private int id;
	private char type; // eg, 's' for silver member; 'b' for bronze (10% discount); 'g' for gold (15% discount)
	private double balance;
	
	private String name;
	
	private double weight;
	private double height;
	
	/*
	 * Constructors (create instances of the current class
	 */
	// without declaring any constructor explicitly, a default constructor is available
	// every constructor should be public
	
	//as soon as a customized constructor is declared, the default constructor ineffective
	public Member(){//an explicitly declared default constructor
		
	}
	public Member(int id, char type, double balance) {
		this.id = id; //LHS: this.id denotes the attribute 'id'; whereas RHS 'id' denotes the input parameter
		this.type = type;
		this.balance = balance;
	}
	public Member(String name, int id, char type, double balance) {
		this(id, type, balance);// calling another constructor Member(int, char, double)
		this.name = name;
	}
	public Member(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}
	/*
	 * Accessor Methods (returning some useful info)
	 */
	public double getWeight() {
		return this.weight;
	}
	public double getHeight() {
		return this.height;
	}
	public String getBMIReport() {
		String result = "";
		double heightInMeters = this.height/100;
		double bmi = this.weight/(heightInMeters * heightInMeters);
		
		String interpretation = "";
		if(bmi < 18.5) {
			interpretation = "Underweight";
		} 
		else if(bmi < 25.0) {
			interpretation = "Normal";
		}
		else if(bmi < 30.0) {
			interpretation = "Overweight";
		}
		else {
			interpretation = "Obese";
		}
		
		result = interpretation + " (" + String.format("%.1f" , bmi) + ")";
		
		return result;
	}
	/*
	 * Mutator Methods (not returning anything; modifying attributes)
	 */
	public void changeWeightBy(double units) {
		this.weight += units;
	}

}

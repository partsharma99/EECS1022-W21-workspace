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
	 * Single valued, reference-typed attributes
	 */
	private Trainer trainer;// stores a single Trainer object's address
	/*
	 * Multi-valued, reference-typed attributes
	 */
	private final int MAX_NUMBER_OF_FACILITIES = 6; /*Assumption: each member can book upto 6 facilities*/
	private Facility[] facilities; // stores an array of Facility objects' addresses
	private int nof; /*number of facilities*/
	/*
	 * There are 2 purposes of 'nof' attribute:
	 * 1. Records how many facility addresses have been stored in 'facilities' array so far
	 * 2. Indicates tge index into 'facilities' array for storing the next Facility object's address
	 */
	/*
	 * Constructors (create instances of the current class
	 */
	// without declaring any constructor explicitly, a default constructor is available
	// every constructor should be public
	public double getPaymentDue() {
		//go over to the facilities of the member, and ass up the price * unit of each booked facility
		double result = 0.0;
		for(int i = 0; i<this.nof; i++) {
			/*
			 * Alternatively:
			 * Faciility f = this.facilities[i];
			 * result += f.getPaymentDue();		 */
			result += this.facilities[i].getPaymentDue();
			
		}
		return result;
	}
	
	
	//as soon as a customized constructor is declared, the default constructor ineffective
	public Member(){//an explicitly declared default constructor
		// defaults actions applicable to all other versions of constructor
		this.facilities = new Facility[MAX_NUMBER_OF_FACILITIES];
		this.nof = 0;
	}
	public Member(String name) {
		this(); //calling the constructor performing default actions
		this.name = name;
	}
	public Member(int id, char type, double balance) {
		this(); //calling the constructor performing default actions
		this.id = id; //LHS: this.id denotes the attribute 'id'; whereas RHS 'id' denotes the input parameter
		this.type = type;
		this.balance = balance;
	}
	//You cam only call a maximum of 1 helper constructor
	public Member(String name, int id, char type, double balance) {
		//Calling this helper construction will call the default helper constructor too i.e. this()
		this(id, type, balance);// calling another constructor Member(int, char, double)
		this.name = name;
	}
	public Member(double weight, double height) {
		this(); //calling the constructor performing default actions
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
	public Trainer getTrainer() {//return the address of some Trainer object
		return this.trainer;
		
	}
	
	public int getNumberOfFacilities() {
		return this.nof;
	}
	public int getFacilityUnits(String name) {//Assumption: facility names are unique
		Facility f = this.getFacility(name);
		
		int units = -1;
		if(f!=null) {
			units = f.getUnits();
		}
		return units;
//		if(f == null) {
//			//the input 'name' does not denote any added facilities
//			return -1;
//		}
//		else {
//			return.getFacilityUnits();
//		}
	}
	private Facility getFacility(String name) {
		Facility f = null;
		boolean hasFound = false;
		for(int i = 0; !hasFound && i < this.nof ; i++) {
			if(this.facilities[i].getName().equals(name)) {
				f = this.facilities[i];
				hasFound = true;
			}
		}
		return f;
	}
	/*
	 * Mutator Methods (not returning anything; modifying attributes)
	 */
	public void changeWeightBy(double units) {
		this.weight += units;
	}
	/* Version where there is no clash between parameter 't' and attribute 'trainer
	 * Therefore, the 'this' keyword is not necessary
	 * */
//	public void registerTrainer(Trainer t) {
//		trainer = t;
//	}

	public void registerTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	/*
	 * Refer input member 'm's to the context object
	 */
	public void referTrainer(Member m) {
		this.trainer = m.getTrainer();
	}
	
	public void swapTrainer(Member m) {
		//this.trainer should become m.trainer
		//m.trainer should become this.trainer
		Trainer t = m.getTrainer();
		m.trainer = this.trainer;
		this.trainer = t;
		
	}
	//Add a new facility object to the end of the 'facilities array'
	public void addFacility(Facility f) {
		this.facilities[this.nof] = f;
		this.nof++;
	}
	public void addFacility(String name, double price, int units) {
		Facility f = new Facility(name, price, units);
		this.addFacility(f);
//		this.facilities[this.nof] = f;
//		this.nof++;
	}
	public void extendFacilityUnits(String name, int howMany) {
		Facility f = this.getFacility(name);
		if(f!= null){/*hasFound == true*/
			f.setUnits(f.getUnits() + howMany);
		}
		else {
			
		}
	}
}

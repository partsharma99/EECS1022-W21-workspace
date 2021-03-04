package model;

public class VendingMachine {
	private int coke_count;
	private int juice_count;
	private int kitkat_count;
	private int lays_count;
	String vmstatus;
	

	public VendingMachine() {
		this.coke_count= 0;
		this.juice_count = 0;
		this.kitkat_count = 0;
		this.lays_count = 0;
		this.vmstatus = "Empty VM Started";
	}
	public String checkStock(String item) {
		String result = "";
		if(item.equals("Coke")) {
			result = "Coke " + "(" + this.coke_count + ")";
			}
		else if(item.equals("Orange Juice")) {
			result = "Orange Juice " + "(" + this.juice_count + ")";
			} 
		else if(item.equals("Kitkat Chunky Bar")) {
			result = "Kitkat Chunky Bar " + "(" + this.kitkat_count + ")";
			}
		else if(item.equals("Lay's Classic Chips")) {
			result = "Lay's Classic Chips " + "(" + this.lays_count + ")";
			}
		else{
			result = "Invalid product: " + item;
		}
		
		
		return result;
	}
	public String checkStock() {
		String result = "";
		result = "Stock: Coke (" + this.coke_count + "), Orange Juice ("+ this.juice_count + "), Kitkat Chunky Bar (" + this.kitkat_count + "), Lay's Classic Chips (" + lays_count + ")";
		
		return result;
	}
	public String checkStatus() {
		String result = "";
		result= this.vmstatus;
		
		return result;
	}
	public void add(String item, int number) {
		if(item.equals("Coke")) {
			this.coke_count += number;
			this.vmstatus = "Product added: Coke (" + number + ")";
		}
		else if(item.equals("Orange Juice")) {
			this.juice_count += number;
			this.vmstatus = "Product added: Orange Juice (" + number + ")";
		}
		else if(item.equals("Kitkat Chunky Bar")) {
			this.kitkat_count += number;
			this.vmstatus = "Product added: Kitkat Chunky Bar (" + number + ")";
		}
		else if(item.equals("Lay's Classic Chips")) {
			this.lays_count += number;
			this.vmstatus = "Product added: Lay's Classic Chips (" + number + ")";
			
		}
		else {
			this.vmstatus = "Invalid product: " + item;
		}
		

		
	}
	public void dispense(String item, int number) {
		if(item.equals("Coke")) {
			this.coke_count -= number;
			this.vmstatus = "Product removed: Coke (" + number + ")";
		}
		else if(item.equals("Orange Juice")) {
			this.juice_count -= number;
			this.vmstatus = "Product removed: Orange Juice (" + number + ")";
		}
		else if(item.equals("Kitkat Chunky Bar")) {
			this.kitkat_count -= number;
			this.vmstatus = "Product removed: Kitkat Chunky Bar (" + number + ")";
		}
		else if(item.equals("Lay's Classic Chips")) {
			this.lays_count -= number;
			this.vmstatus = "Product removed: Lay's Classic Chips (" + number + ")";
		}
		else {
			this.vmstatus = "Invalid product: " + item;
		}
		
	}

	
	
}

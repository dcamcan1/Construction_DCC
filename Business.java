//Subclass of Building
//Uses: Office/Professional or Service  Transactions

public class Business extends Building{

	//Instance Variables
	protected int numRentableUnits;

	//Constructors
	public Business() {
		super();
		super.setOccupanyGroup("Business");
		super.setSubgroup("B");
		this.numRentableUnits = 0;
	}//end empty-argument constructor

	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupanyGroup, 
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupanyGroup, subgroup);
		this.numRentableUnits = 0;
	}//end preferred constructor

	
	//Getters and Setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	
	//toString
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ",\n\ttotalSquareFeet=" + totalSquareFeet + ", occupanyGroup=" + occupanyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end class

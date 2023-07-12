//Subclass of Residential
//More than one family can live

public class Apartment extends Residential {

	//Instance Variables
	private int numRentableUnits;  //number of units that can be rented
	private double avgUnitSize;  //average size of the apartments (square footage)
	private boolean parkingAvailable;  //indicates if onsite parking is available
	
	
	//Constructors
	public Apartment() {
		super();
		setOccupanyGroup("Residential");
		setSubgroup("R-");
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable = false;
	}//end empty-argument constructor
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupanyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupanyGroup, subgroup);
		this.numRentableUnits = 0;
		this.avgUnitSize = 0.0;
		this.parkingAvailable = false;
	}//end preferred constructor

	
	//Methods
	public void draw() { //eventually will be used to draw object to the screen
		System.out.println("Drawing code for Apartment.");
	}//end draw
	
	public String displayData() { //formatted String that contains all info about the object
		StringBuilder sb3 = new StringBuilder("Number of Rentable Units: "+getNumRentableUnits()+"\n");
		sb3.append("Average Unit Size: "+getAvgUnitSize()+" square feet\n");
		if (parkingAvailable) {
			sb3.append("Parking Available: Y\n");
		}//end if false
		else {
			sb3.append("Parking Available: N\n");
		}//end else
		sb3.append("==================================\n");
		return super.displayData() + "\n" + sb3.toString();
	}//end displayData
	
	
	//Getters and Setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	public double getAvgUnitSize() {
		return avgUnitSize;
	}//end getAvgUnitSize

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//end isParkingAvailable

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable

	
	//toString
	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", numBedrooms=" + numBedrooms + ", numBathrooms="
				+ numBathrooms + ",\n\tlaundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ",\n\ttotalSquareFeet=" + totalSquareFeet + ", occupanyGroup=" + occupanyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end class

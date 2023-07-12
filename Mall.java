//Subclass of Business

public class Mall extends Business {

	//Instance Variables
	private int numRentedUnits; //the number of units in the building that are currently being rented
	private double medianUnitSize; //the mall contains rentable units of different size
	private int numParkingSpaces; //total number of parking spaces around the mall


	//Constructors
	public Mall() {
		super();
	}//end empty-argument constructor
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupanyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupanyGroup, subgroup);
		this.numRentedUnits = 0;
		this.medianUnitSize = 0.0;
		this.numParkingSpaces = 0;
	}//end preferred constructor

	
	//Methods
	public void draw() { //eventually will be used to draw object to the screen
		System.out.println("Drawing code for Mall.");
	}//end draw
	
	public String displayData() { //formatted String that contains all info about the object
		StringBuilder sb2 = new StringBuilder("Number of Rentable Units: "+getNumRentableUnits()+"\n");
		sb2.append("Number of Rented Units: "+getNumRentedUnits()+"\n");
		sb2.append("Median Unit Size: "+getMedianUnitSize()+" square feet\n");
		sb2.append("Number of Parking Spaces: "+getNumParkingSpaces()+"\n");
		sb2.append("==================================\n");
		return super.displayData() + "\n" + sb2.toString();
	}//end displayData

	
	//Getters and Setters
	public int getNumRentedUnits() {
		return numRentedUnits;
	}//end getNumRentedUnits

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits

	public double getMedianUnitSize() {
		return medianUnitSize;
	}//end getMedianUnitSize

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//end getNumParkingSpaces

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces

	
	//toString
	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ",\n\tprojectName=" + projectName
				+ ", completeAddress=" + completeAddress + ",\n\ttotalSquareFeet=" + totalSquareFeet + ", occupanyGroup="
				+ occupanyGroup + ", subgroup=" + subgroup + "]";
	}//end toString

}//end class

//Uses: Housing/Apartments/Hotels
//Building where people can live (bedrooms, bathrooms)

public class Residential extends Business{

	//Instance Variables
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;

	
	//Constructors
	public Residential() {
		super();
		super.setOccupanyGroup("Residential");
		super.setSubgroup("R-");
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}//end empty-argument constructor
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupanyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupanyGroup, subgroup);
		this.numBedrooms = 0;
		this.numBathrooms = 0;
		this.laundryRoom = false;
	}//end preferred constructor

	
	//Getters and Setters
	public int getNumBedrooms() {
		return numBedrooms;
	}//end getNumBedrooms

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	public int getNumBathrooms() {
		return numBathrooms;
	}//end getNumBathrooms

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	public boolean isLaundryRoom() {
		return laundryRoom;
	}//end isLaundryRoom

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom

	
	//toString
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", numRentableUnits=" + numRentableUnits + ",\n\tprojectName=" + projectName
				+ ", completeAddress=" + completeAddress + ",\n\ttotalSquareFeet=" + totalSquareFeet + ", occupanyGroup="
				+ occupanyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end class

/*Subclass of Residential
* Building where one family lives
* Limit on number of people who can live there*/

public class SingleFamilyHome extends Residential{

	//Instance Variables
	private boolean garage;

	public SingleFamilyHome() {
		super();
		setOccupanyGroup("Residential");
		setSubgroup("R-");
		this.garage = false;
	}//end empty-argument constructor

	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupanyGroup,
			String subgroup) {
		super(projectName, completeAddress, totalSquareFeet, occupanyGroup, subgroup);
		this.garage = false;
	}//end preferred constructor

	
	//Methods
	public void draw() { //eventually will be used to draw object to the screen
		System.out.println("Drawing code for Single Family Home.");
	}//end draw
	
	public String displayData() { //formatted String that contains all info about the object
		StringBuilder sb4 = new StringBuilder("Number of Bedrooms: "+super.getNumBedrooms()+"\n");
		sb4.append("Number of Bathrooms: "+getNumBathrooms()+"\n");
		if (laundryRoom) {
			sb4.append("Laundry Room: Y\n");
		}//end if laundry room
		else {
			sb4.append("Laundry Room: N\n");
		}//end else laundry room
		if (garage) {
			sb4.append("Garage: Y\n");
		}//end if garage
		else {
			sb4.append("Garage: N\n");
		}//end else garage
		sb4.append("==================================\n");
		return super.displayData() + "\n" + sb4.toString();
	}//end displayData

	
	//Getters and Setters
	public boolean isGarage() {
		return garage;
	}//end isGarage

	public void setGarage(boolean garage) {
		this.garage = garage;
	}//end setGarage


	//toString
	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", numRentableUnits=" + numRentableUnits + ",\n\tprojectName="
				+ projectName + ", completeAddress=" + completeAddress + ",\n\ttotalSquareFeet=" + totalSquareFeet
				+ ", occupanyGroup=" + occupanyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end class

//Base Building object

public class Building {

	//Instance Variables
	protected String projectName;  //name of the building project
	protected String completeAddress;  //complete address of the project
	protected double totalSquareFeet;  //square footage of the building
	protected String occupanyGroup;  //group code according to Table 1
	protected String subgroup;  //group code according to Table 1
	
	//Constructors
	public Building() {
		this.projectName = "";
		this.completeAddress = "";
		this.totalSquareFeet = 0.0;
		this.occupanyGroup = "";
		this.subgroup = "";
	}//and empty-argument constructor

	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupanyGroup,
			String subgroup) {
		super();
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupanyGroup = occupanyGroup;
		this.subgroup = subgroup;
	}//end preferred constructor

	
	//Methods
	public void draw() {  //eventually will be used to draw object to the screen
		System.out.println("Drawing code for Building.");
	}//end draw
	
	public String displayData() {  //returns formatted String with all object info
		StringBuilder sb1 = new StringBuilder("==================================\n");
		sb1.append("Project Name: "+getProjectName()+"\n");
		sb1.append("Complete Address: "+getCompleteAddress()+"\n");
		sb1.append("Total Square Feet: "+getTotalSquareFeet()+"\n");
		sb1.append("Occupany Group: "+getOccupanyGroup()+"\n");
		sb1.append("Occupancy Subgroup: "+getSubgroup());
		return sb1.toString();
	}//end displayData
	
	
	//Getters and Setters
	public String getProjectName() {
		return projectName;
	}//end getProjectName

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//end setProjectName

	public String getCompleteAddress() {
		return completeAddress;
	}//end getCompleteAddress

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//end setCompleteAddress

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//end getTotalSquareFeet

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//end setTotalSquareFeet

	public String getOccupanyGroup() {
		return occupanyGroup;
	}//end getOccupanyGroup

	public void setOccupanyGroup(String occupanyGroup) {
		this.occupanyGroup = occupanyGroup;
	}//end setOccupanyGroup

	public String getSubgroup() {
		return subgroup;
	}//end getSubgroup

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//end setSubgroup

	
	//toString
	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ",\n\ttotalSquareFeet="
				+ totalSquareFeet + ", occupanyGroup=" + occupanyGroup + ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end class

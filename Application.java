
public class Application {

	public static void main(String[] args) {
		
		System.out.println("************************************************************************");
		//BUILDING TESTS
		//Empty-argument constructor test & setter tests for Building
		System.out.println("Empty-argument constructor test for Building (b1):");
		Building b1 = new Building();
		System.out.println(b1.displayData());
		System.out.println("==================================");
		//Preferred constructor test & displayData test for Building
		System.out.println("\nPreferred constructor & displayData tests for Building (b2):");
		Building b2 = new Building("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 2540, "Residential", "R1");
		System.out.println(b2.displayData());
		System.out.println("==================================");
		//Setter tests for Building
		System.out.println("\nSetter tests for Building (b3): ");
		Building b3 = new Building();
		b3.setProjectName("Three House");
		b3.setCompleteAddress("456 Main Street | Louisville, Kentucky 40201");
		b3.setTotalSquareFeet(2789);
		b3.setOccupanyGroup("Residential");
		b3.setSubgroup("R3");
		System.out.println(b3.displayData());
		System.out.println("==================================");
		//Getter tests for Building
		System.out.println("\n----------------------------------\nGetter tests for Building (b2): ");
		System.out.println("projectName: "+b2.getProjectName());
		System.out.println("completeAddress: "+b2.getCompleteAddress());
		System.out.println("totalSquareFeet: "+b2.getTotalSquareFeet());
		System.out.println("occupanyGroup: "+b2.getOccupanyGroup());
		System.out.println("subgroup: "+b2.getSubgroup());
		System.out.println("----------------------------------\n");
		//Draw test for Building
		System.out.println("----------------------------------\nDraw test for Building: ");
		b1.draw();
		System.out.println("----------------------------------\n");
		//toString test for Building
		System.out.println("----------------------------------\ntoString test for Building (b2): ");
		System.out.println(b2.toString());
		System.out.println("----------------------------------\n");
		
		
		System.out.println("************************************************************************");
		//BUSINESS TESTS
		//Empty-argument constructor test for Business
		System.out.println("==================================");
		System.out.println("Empty-argument constructor test for Business (bus1):");
		Business bus1 = new Business();
		System.out.println("Constructor test passed. No displayData method in Business.");
		System.out.println("==================================\n");
		//Preferred constructor and setter tests for Business
		System.out.println("==================================");
		System.out.println("Preferred constructor & setter tests for Business (bus2):");
		Business bus2 = new Business("Two Mall", "1122 Main Street | Louisville, Kentucky 40201", 10234, "Business", "B");
		bus2.setNumRentableUnits(12);
		System.out.println("Constructor test passed. No displayData method in Business.");
		System.out.println("==================================\n");
		//Getter tests for Business
		System.out.println("----------------------------------\nGetter tests for Business (bus2): ");
		System.out.println("numRentableUnits: "+bus2.getNumRentableUnits());
		System.out.println("----------------------------------\n");
		//toString test for Business
		System.out.println("----------------------------------\ntoString test for Business (bus2): ");
		System.out.println(bus2.toString());
		System.out.println("----------------------------------\n");
		
		
		System.out.println("************************************************************************");
		//MALL TESTS
		//Empty-argument constructor test & setter tests for Mall
		System.out.println("Empty-argument constructor test for Mall (m1):");
		Mall m1 = new Mall();
		System.out.println(m1.displayData());
		//Preferred constructor test, setter tests, & displayData test for Mall
		System.out.println("Preferred constructor, setter, & displayData tests for Mall (m2):");
		Mall m2 = new Mall("Gaines Mall", "122 Main Street | Louisville, Kentucky 40201", 9001, "Business", "B");
		m2.setNumRentedUnits(3);
		m2.setMedianUnitSize(600.5);
		m2.setNumParkingSpaces(220);
		System.out.println(m2.displayData());
		//Getter tests for Mall
		System.out.println("----------------------------------\nGetter tests for Mall (m2): ");
		System.out.println("numRentedUnits: "+m2.getNumRentedUnits());
		System.out.println("medianUnitSize: "+m2.getMedianUnitSize());
		System.out.println("numParkingSpaces: "+m2.getNumParkingSpaces());
		System.out.println("----------------------------------\n");
		//Draw test for mall
		System.out.println("----------------------------------\nDraw test for Mall: ");
		m1.draw();
		System.out.println("----------------------------------\n");
		//toString test for Mall
		System.out.println("----------------------------------\ntoString test for Mall (m2): ");
		System.out.println(m2.toString());
		System.out.println("----------------------------------\n");
		
		
		System.out.println("************************************************************************");
		//RESIDENTIAL TESTS
		//Empty-argument constructor test for Residential
		System.out.println("==================================");
		System.out.println("Empty-argument constructor test for Residential (r1):");
		Residential r1 = new Residential();
		System.out.println("Constructor test passed. No displayData method in Residential.");
		System.out.println("==================================\n");
		//Preferred constructor and setter tests for Residential
		System.out.println("==================================");
		System.out.println("Preferred constructor & setter tests for Residential (r2):");
		Residential r2 = new Residential("Three House", "456 Main Street | Louisville, Kentucky 40201", 2789, "Residential", "R3");
		r2.setNumBedrooms(2);
		r2.setNumBathrooms(1);
		r2.setLaundryRoom(false);
		System.out.println("Constructor test passed. No displayData method in Residential.");
		System.out.println("==================================\n");
		//Getter tests for Residential
		System.out.println("----------------------------------\nGetter tests for Residential (r2): ");
		System.out.println("numBedrooms: "+r2.getNumBedrooms());
		System.out.println("numBathrooms: "+r2.getNumBathrooms());
		System.out.println("laundryRoom: "+r2.isLaundryRoom());
		System.out.println("----------------------------------\n");
		//toString test for Residential
		System.out.println("----------------------------------\ntoString test for Residential (r2): ");
		System.out.println(r2.toString());
		System.out.println("----------------------------------\n");
		
		
		System.out.println("************************************************************************");
		//APARTMENT TESTS
		//Empty-argument constructor test for Apartment
		System.out.println("Empty-argument constructor test for Apartment:");
		Apartment a1 = new Apartment();
		System.out.println(a1.displayData());
		//Preferred constructor test, setter tests, & displayData test for Apartment
		System.out.println("Preferred constructor, setter, & displayData tests for Apartment (a2):");
		Apartment a2 = new Apartment("Gaines Apartment", "124 Main Street | Louisville, Kentucky 40201", 2540, "Residential", "R1");
		a2.setNumRentableUnits(5);
		a2.setAvgUnitSize(800.7);
		a2.setParkingAvailable(true);
		System.out.println(a2.displayData());
		//Getter tests for Apartment
		System.out.println("----------------------------------\nGetter tests for Apartment (a2): ");
		System.out.println("numRentableUnits: "+a2.getNumRentableUnits());
		System.out.println("avgUnitSize: "+a2.getAvgUnitSize());
		System.out.println("parkingAvailable: "+a2.isParkingAvailable());
		System.out.println("----------------------------------\n");
		//Draw test for Apartment
		System.out.println("----------------------------------\nDraw test for Apartment: ");
		a1.draw();
		System.out.println("----------------------------------\n");
		//toString test for Apartment
		System.out.println("----------------------------------\ntoString test for Apartment (a2): ");
		System.out.println(a2.toString());
		System.out.println("----------------------------------\n");
		
		
		System.out.println("************************************************************************");
		//SINGLE FAMILY HOME TESTS
		//Empty-argument constructor test for SFH
		System.out.println("Empty-argument constructor test for Single Family Home (sfh1):");
		SingleFamilyHome sfh1 = new SingleFamilyHome();
		System.out.println(sfh1.displayData());
		/*Preferred constructor test, setter tests, & displayData test for SFH
		 *garage is SFH's only instance variable */
		System.out.println("Preferred constructor, setter, & displayData tests for Single Family Home (sfh2):");
		SingleFamilyHome sfh2 = new SingleFamilyHome("Gaines House", "123 Main Street | Louisville, Kentucky 40201", 2540, "Residential", "R1");
		sfh2.setGarage(true);
		System.out.println(sfh2.displayData());
		//Getter tests for SFH
		System.out.println("----------------------------------\nGetter tests for Single Family Home (sfh2): ");
		System.out.println("garage: "+sfh2.isGarage());
		System.out.println("----------------------------------\n");
		//Draw test for SFH
		System.out.println("----------------------------------\nDraw test for Single Family Home: ");
		sfh1.draw();
		System.out.println("----------------------------------\n");
		//toString test for SFH
		System.out.println("----------------------------------\ntoString test for Single Family Home (sfh2): ");
		System.out.println(sfh2.toString());
		System.out.println("----------------------------------\n");
		
	}//end main

}//end class

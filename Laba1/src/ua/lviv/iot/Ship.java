package ua.lviv.iot;

public class Ship {
	private static int totalNumberOfSeamen = 0;
	
	private int massInTons;
	private int numberOfSeamen;
	private boolean isMilitary;
	private String shipName;
	private String captainName = "Not assigned";
	
	public Ship() {
		massInTons = 100;
		numberOfSeamen = 50;
		isMilitary = false;
		shipName = "Unnamed";
		captainName = "Not assigned";
		
		totalNumberOfSeamen += numberOfSeamen;
	}
	
	public Ship(int massInTons, int numberOfSeamen, boolean isMilitary, String shipName) {
		this.massInTons = massInTons;
		this.numberOfSeamen = numberOfSeamen;
		this.isMilitary = isMilitary;
		this.shipName = shipName;

		totalNumberOfSeamen += numberOfSeamen;
	}

	public Ship(int massInTons, int numberOfSeamen, boolean isMilitary, String shipName, String captainName) {
		this.massInTons = massInTons;
		this.numberOfSeamen = numberOfSeamen;
		this.isMilitary = isMilitary;
		this.shipName = shipName;
		this.captainName = captainName;

		totalNumberOfSeamen += numberOfSeamen;
	}
	
	public String toString() {
		return "Ship: " + shipName + "\nMass: " + massInTons + "\nCrew quantity: " + numberOfSeamen + "\nMilitary: " + isMilitary + "\nCaptain name: " + captainName + "\n==============";
	}
	
	public static void printStaticSum() {
		System.out.println("Total number of seamen on all ships is " + totalNumberOfSeamen);
	}
	
	public void printSum() {
		System.out.println("Total number of seamen on all ships is " + totalNumberOfSeamen);
	}
	
	public void resetValues(int massInTons, int numberOfSeamen, boolean isMilitary, String shipName, String captainName) {
		totalNumberOfSeamen -= this.numberOfSeamen;
		totalNumberOfSeamen += numberOfSeamen;
		
		this.massInTons = massInTons;
		this.numberOfSeamen = numberOfSeamen;
		this.isMilitary = isMilitary;
		this.shipName = shipName;
		this.captainName = captainName;
	}

	//==========================Getters and Setters==========================
	
	public int getMassInTons() {
		return massInTons;
	}
	
	public void setMassInTons(int massInTons) {
		this.massInTons = massInTons;
	}
	
	public int getNumberOfSeamen() {
		return numberOfSeamen;
	}
	
	public void setNumberOfSeamen(int numberOfSeamen) {
		totalNumberOfSeamen -= this.numberOfSeamen;
		totalNumberOfSeamen += numberOfSeamen;
		
		this.numberOfSeamen = numberOfSeamen;		
	}
	
	public boolean getIsMilitary() {
		return isMilitary;
	}
	
	public void setIsMilitary(boolean isMilitary) {
		this.isMilitary = isMilitary;
	}
	
	public String getShipName() {
		return shipName;
	}
	
	public void setShipName(String shipName) {
		this.shipName = shipName;
	}
	
	public String getCaptainName() {
		return captainName;
	}
	
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	
	
}

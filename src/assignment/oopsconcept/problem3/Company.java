package assignment.oopsconcept.problem3;

public class Company extends ShipmentEntity {

	private String identifier;
	private String iata;
	private String fmc;

	public Company(String shipmentEntityName, String identificationNumber, String identifier, String iata, String fmc) {
		super(shipmentEntityName, identificationNumber);
		this.identifier = identifier;
		this.iata = iata;
		this.fmc = fmc;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getIata() {
		return iata;
	}

	public void setFmc(String fmc) {
		this.fmc = fmc;
	}

	public String getFmc() {
		return fmc;
	}
	
	public void display() {
		System.out.format("%-15s %-25s %-15s %-15s %-15s\n", getShipmentEntityName(), getIdentificationNumber(),
				getIdentifier(), getIata(), getFmc());
	}

}

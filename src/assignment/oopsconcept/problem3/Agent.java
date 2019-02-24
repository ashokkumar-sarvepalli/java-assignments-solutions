package assignment.oopsconcept.problem3;

public class Agent extends ShipmentEntity {

	String name;
	String iata;
	String fmc;

	public Agent(String shipmentEntityName, String identificationNumber, String name, String iata, String fmc) {
		super(shipmentEntityName, identificationNumber);
		this.name = name;
		this.iata = iata;
		this.fmc = fmc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
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
				getName(), getIata(), getFmc());
	}
}

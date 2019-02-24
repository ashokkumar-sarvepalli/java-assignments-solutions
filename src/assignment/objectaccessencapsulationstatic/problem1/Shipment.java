package assignment.objectaccessencapsulationstatic.problem1;

public class Shipment {

	private int id;
	private String shipperName;
	private String modeofTransportation;
	private float totalWeight;
	private String arrivalPort;
	private String departurePort;
	static int nextShipmentid = 1000;

	private Shipment(int id, String shipperName, String modeofTransportation, float totalWeight, String arrivalPort,
			String departurePort) {
		this.id = id;
		this.shipperName = shipperName;
		this.modeofTransportation = modeofTransportation;
		this.totalWeight = totalWeight;
		this.arrivalPort = arrivalPort;
		this.departurePort = departurePort;
	}

	@Override
	public String toString() {
		return String.format("%-15s%-15s%-25s%-20s%-20s%-15s", this.id, this.shipperName, this.modeofTransportation,
				this.totalWeight + "Kg", this.arrivalPort, this.departurePort);
	}

	public static Shipment createNewShipment(String shipperName, String modeOfTransportation, Float totalWeight,
			String arrivalPort, String departurePort) {
		
		return new Shipment(nextShipmentid++,shipperName,modeOfTransportation,totalWeight,arrivalPort,departurePort);
		
	}
		

}
package assignment.oopsconcept.problem4;

public abstract class WaterCarrier {
	protected String carrierName;
	protected String carrierCode;
	protected String carrierType;
	protected String iataCode;
	protected String carrierAddress;

	public WaterCarrier() {

	}

	public WaterCarrier(String carrierName, String carrierCode, String iataCode, String carrierAddress,
			String carrierType) {
		this.carrierName = carrierName;
		this.carrierCode = carrierCode;
		this.iataCode = iataCode;
		this.carrierAddress = carrierAddress;
		this.carrierType = carrierType;
	}

	public String getCarrierType() {
		return carrierType;
	}

	public void setCarrierType(String carrierType) {
		this.carrierType = carrierType;
	}

	public String getCarrierAddress() {
		return carrierAddress;
	}

	public void setCarrierAddress(String carrierAddress) {
		this.carrierAddress = carrierAddress;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public String getCarrierCode() {
		return carrierCode;
	}

	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}

	public String getIataCode() {
		return iataCode;
	}

	public void setIataCode(String iataCode) {
		this.iataCode = iataCode;
	}

	public abstract void displayShipDetails();

	public static WaterCarrier createShip(String carrierName, String carrierCode, String iataCode,
			String carrierAddress, String carrierType, Integer capacity) {

		if (carrierType == null)
			return null;
		WaterCarrier waterCarrier = null;
		if (carrierType.equalsIgnoreCase("BulkShip")) {
			waterCarrier = new BulkShips(carrierName, carrierCode, iataCode, carrierAddress, carrierType, capacity);
		} else if (carrierType.equalsIgnoreCase("ContainerShip")) {
			waterCarrier = new ContainerShips(carrierName, carrierCode, iataCode, carrierAddress, carrierType,
					capacity);
		} else if (carrierType.equalsIgnoreCase("Ferries")) {
			waterCarrier = new Ferries(carrierName, carrierCode, iataCode, carrierAddress, carrierType, capacity);
		}

		return waterCarrier;
	}

	public static String retunOwner(WaterCarrier waterCarrier) {
		if (waterCarrier == null)
			return null;
		if (waterCarrier.getCarrierType() == null)
			return null;

		if (waterCarrier.getCarrierType().equalsIgnoreCase("BulkShip")
				|| waterCarrier.getCarrierType().equalsIgnoreCase("ContainerShip")) {
			return "Company";
		}
		if (waterCarrier.getCarrierType().equalsIgnoreCase("Ferries")) {
			return "Agent";
		}

		return null;
	}

}

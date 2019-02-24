package assignment.oopsconcept.problem4;

public class BulkShips extends WaterCarrier {
	Integer noOfcargoes;

	public BulkShips() {

	}

	public BulkShips(String carrierName, String carrierCode, String iataCode, String carrierAddress, String carrierType,
			Integer noOfcargoes) {
		super(carrierName, carrierCode, iataCode, carrierAddress, carrierType);
		this.noOfcargoes = noOfcargoes;
	}

	public Integer getNoOfcargoes() {
		return noOfcargoes;
	}

	public void setNoOfcargoes(Integer noOfcargoes) {
		this.noOfcargoes = noOfcargoes;
	}

	@Override
	public void displayShipDetails() {
		System.out.format("%-20s%-15s%-15s%-15s%-15s%-25s%s\n", getCarrierType(), getCarrierName(), getCarrierCode(),
				getIataCode(), getCarrierAddress(), getNoOfcargoes() + " cargoes", retunOwner(this));

	}

}
package assignment.exceptionhandling.problem3;

public class ShipmentBO {
	public boolean Validate(String p1, String p2, Port[] ports) throws InvalidPortException {

		boolean isArrivalPortNotExists = true;
		boolean isDestinationPortNotExists = true;
		for (Port port : ports) {
			if (port.getName().equalsIgnoreCase(p1)) {
				isArrivalPortNotExists = false;
			}

			if (port.getName().equalsIgnoreCase(p2)) {
				isDestinationPortNotExists = false;
			}
		}

		if (p1.equalsIgnoreCase(p2) || isArrivalPortNotExists || isDestinationPortNotExists) {
			throw new InvalidPortException("InvalidPortException:The port name is invalid");
		}

		return true;

	}

	public void displayShipmentDetails(Shipment shipmentObj, Port[] ports, String p1, String p2) {

		System.out.println("Shipment Details");
		System.out.format("%-15s%-15s%-15s%-15s\n", "Shipment Id", "Shipment Name", "ArrivalPlace", "DeparturePlace");
		System.out.format("%-15s%-15s%-15s%-15s\n", shipmentObj.getId(), shipmentObj.getName(),
				shipmentObj.getArrivalport().getName() + "/" + shipmentObj.getArrivalport().getCountry(), shipmentObj.getDepartureport().getName() + "/" + shipmentObj.getDepartureport().getCountry());

	}

	
}

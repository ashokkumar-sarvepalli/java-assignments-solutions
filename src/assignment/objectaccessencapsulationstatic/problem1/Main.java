package assignment.objectaccessencapsulationstatic.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of shipments:");
		int n = Integer.parseInt(buff.readLine());

		Shipment[] shipmentArray = new Shipment[n];
		String shipperName = null;
		String modeOfTransportation = null;
		Float totalWeight = null;
		String arrivalPort = null;
		String departurePort = null;

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the shipment " + (i + 1) + "  details");
			System.out.println("Enter the shipper name:");
			shipperName = buff.readLine();
			System.out.println("Enter the mode of transportation:");
			modeOfTransportation = buff.readLine();
			System.out.println("Enter the total weight:");
			totalWeight = Float.parseFloat(buff.readLine());
			System.out.println("Enter the arrival port:");
			arrivalPort = buff.readLine();
			System.out.println("Enter the departure port:");
			departurePort = buff.readLine();

			shipmentArray[i] = Shipment.createNewShipment(shipperName, modeOfTransportation, totalWeight, arrivalPort,
					departurePort);
		}

		System.out.println("Shipment details are ");
		System.out.format("%-15s%-15s%-25s%-20s%-20s%-15s\n", "Id", "Shippername", "Mode of transportation",
				"Total weight", "Arrival port", "Departure port");
		for (int i = 0; i < n; i++) {
			System.out.println(shipmentArray[i]);
		}

	}

}
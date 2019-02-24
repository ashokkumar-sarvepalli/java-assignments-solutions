package assignment.exceptionhandling.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Shipment Id ");
		Integer shipId = Integer.parseInt(buff.readLine());
		System.out.println("Enter the Shipment Name ");
		String name = buff.readLine();

		Port ports[] = new Port[4];
		ports[0] = new Port(1, "India", "Chennai");
		ports[1] = new Port(2, "America", "California");
		ports[2] = new Port(3, "England", "London");
		ports[3] = new Port(4, "Australia", "Melbourne");

		System.out.println("Available ports are");
		System.out.format("%-15s %-15s %s\n", "ID", "Country", "PortName");
		for (int i = 0; i < 4; i++) {
			System.out.println(ports[i]);
		}

		System.out.println("\nEnter the arrival port name");
		String p1 = buff.readLine();

		System.out.println("Enter the departure port name");
		String p2 = buff.readLine();

		ShipmentBO shipmentBO = new ShipmentBO();
		try {
			shipmentBO.Validate(p1, p2, ports);
			Port port1 = findPort(ports, p1);
			Port port2 = findPort(ports, p2);
			Shipment shipment = new Shipment(shipId, name, port1, port2);
			shipmentBO.displayShipmentDetails(shipment, ports, p1, p2);
		} catch (InvalidPortException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static Port findPort(Port[] ports, String p1) {
		for (Port port : ports) {
			if (port.getName().equalsIgnoreCase(p1)) {
				return port;
			}
		}

		return null;
	}

	
}

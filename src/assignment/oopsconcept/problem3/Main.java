package assignment.oopsconcept.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of shipment entity");
		int n = Integer.parseInt(buff.readLine());

		ShipmentEntity[] shipmentArray = new ShipmentEntity[n];
		String line = null;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Shipment entity "+(i+1) +" details");
			System.out.println("Select the shipment entity type");
			System.out.println("1)Customer\n2)Company\n3)Agent\n4)Carrier");
			int choice = Integer.parseInt(buff.readLine());
			line = buff.readLine();
			String str[] = line.split(",");
			if (choice == 1) {
				shipmentArray[i] = new Customer(str[0], str[1], Integer.parseInt(str[2]), str[3]);
			} else if (choice == 2) {
				shipmentArray[i] = new Company(str[0], str[1], str[2], str[3], str[4]);
			} else if (choice == 3) {
				shipmentArray[i] = new Agent(str[0], str[1], str[2], str[3], str[4]);
			} else if (choice == 4) {
				shipmentArray[i] = new Carrier(str[0], str[1], str[2], str[3]);
			} else {
				System.out.println("wrong option entered");
				i--;
			}

		}

		System.out.println("Shipment details are");
		System.out.println("Enter the shipment entity type to display");
		String name = buff.readLine();

		
		if (name.equalsIgnoreCase("Customer")) {
			System.out.format("%-15s %-25s %-15s %-15s\n", "Name", "Identification Number", "Customer Id",
					"Customer Name");
			
			for (int i = 0; i < n; i++) {
				if (shipmentArray[i] instanceof Customer) {
					shipmentArray[i].display();
				}
			}
		} else if (name.equalsIgnoreCase("Company"))

		{
			System.out.format("%-15s %-25s %-15s %-15s\n", "Name", "Identification Number", "Company Name", "IATA",
					"FMC");
			for (int i = 0; i < n; i++) {
				if (shipmentArray[i] instanceof Company) {
					shipmentArray[i].display();
				}
			}

		}

		else if (name.equalsIgnoreCase("Agent"))

		{
			System.out.format("%-15s %-25s %-15s %-15s %-15s\n", "Name", "Identification Number ", "Agent Name", "IATA",
					"FMC");
			for (int i = 0; i < n; i++) {
				if (shipmentArray[i] instanceof Agent) {
					shipmentArray[i].display();
				}
			}

		}

		else if (name.equalsIgnoreCase("Carrier")) {
			System.out.format("%-15s %-25s %-15s %-15s\n", "Name", "Identification Number", "Code Name", "IATA");
			for (int i = 0; i < n; i++) {
				if (shipmentArray[i] instanceof Carrier) {
					shipmentArray[i].display();
				}
			}
		}
		
		else
		{
			System.out.println("Invalid shipment entity type");
		}

	}

}

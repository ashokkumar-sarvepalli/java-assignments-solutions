package assignment.oopsconcept.problem4;

import java.io.*;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of carriers");
		int n = Integer.parseInt(buff.readLine());

		WaterCarrier[] waterCarrier = new WaterCarrier[n];
		String line = null;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the carrier " + (i + 1) + " details");
			line = buff.readLine();
			String str[] = line.split(",");
			waterCarrier[i] = WaterCarrier.createShip(str[0], str[1], str[2], str[3], str[4], Integer.parseInt(str[5]));
		}

		System.out.println("Ship details are");
		System.out.format("%-20s%-15s%-15s%-15s%-15s%-25s%s\n", "Carrier type", "Name", "Code", "IATAcode", "Location",
				"Capacity", "OwnedBy");

		for (int i = 0; i < n; i++) {
			waterCarrier[i].displayShipDetails();
		}
	}
}

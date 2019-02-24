package assignment.collections.problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String args[]) throws IOException {
		String choice = "yes";
		List<ShipmentEntity> shipmentList = new ArrayList<>();
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

		do {
			System.out.println("Enter the shipment entity details");
			String input = buff.readLine();
			String[] str = input.split(",");
			ShipmentEntity shipmentEntity = new ShipmentEntity(Integer.parseInt(str[0]), str[1],
					Integer.parseInt(str[2]));
			shipmentList.add(shipmentEntity);
			System.out.println("Do you want to continue [yes/no]");
			choice = buff.readLine();

		} while (choice.equalsIgnoreCase("yes"));

		Collections.sort(shipmentList);

		System.out.println("After sorting the shipment entity details");
		System.out.format("%-15s %-15s %-15s\n", "Id", "Name", "Number");
		for (ShipmentEntity shipment : shipmentList) {
			System.out.println(shipment);
		}
		System.out.println("Enter the shipment entity details to be searched");
		String search = buff.readLine();
		String[] str = search.split(",");
		ShipmentEntity shipmentEntity = new ShipmentEntity(Integer.parseInt(str[0]), str[1], Integer.parseInt(str[2]));

		int index = Collections.binarySearch(shipmentList, shipmentEntity);

		System.out.println("Shipment entity found in index:" + index);

	}

}

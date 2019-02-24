package assignment.stringhandling.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws IOException, ParseException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of shipments");
		int size = Integer.parseInt(br.readLine());
		String[] shipmentNames = new String[size];
		String[] dispatchedDates = new String[size];
		String[] deliveredDates = new String[size];
		int index = 0;

		System.out.println("Enter the shipment details");
		for(int i=0;i<size;i++) {
			String[] shipmentDetails = br.readLine().split(",");
			shipmentNames[index] = shipmentDetails[0];
			dispatchedDates[index] = shipmentDetails[1];
			deliveredDates[index] = shipmentDetails[2];
			index++;
		}

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Shipments that are arrived on same day:");

		for (int i = 0; i < shipmentNames.length;) {
			String shipmentName = shipmentNames[i];
			Date dispatchedDate = formatter.parse(dispatchedDates[i]);
			Date deliveredDate = formatter.parse(deliveredDates[i]);

			if (dispatchedDate.compareTo(deliveredDate) == 0) {
				System.out.println(shipmentName);
			}
			i++;
			
		}
		
	}

	

}
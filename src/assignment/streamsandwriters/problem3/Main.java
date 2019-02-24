package assignment.streamsandwriters.problem3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Fill your code
public class Main {

	public static void main(String args[]) throws FileNotFoundException, IOException, ParseException {

		List<Shipment> shipmentList = new ArrayList<Shipment>();
		File file = new File("C:/Users/KartheekVadlamani/Desktop/input.txt");
		BufferedReader brReader = new BufferedReader(new FileReader(file));
		String regEx = ".*55.*55";
		Pattern patt = Pattern.compile(regEx);
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String input = null;
		while ((input = brReader.readLine()) != null) {
			String[] values = input.split(",");
			String shipmentId = values[0];
			String bookingNumber = values[1];
			Date departureDate = format.parse(values[2]);
			Date arrivalDate = format.parse(values[3]);
			String totalWeight = values[4];
			Shipment shipment = new Shipment(shipmentId, bookingNumber, departureDate, arrivalDate, totalWeight);
			shipmentList.add(shipment);
		}
			brReader.close();
			findPatternMatch(shipmentList, patt);
	}
	
	public static void findPatternMatch(List<Shipment> shipmentList, Pattern pattern) {
			for (Shipment shipment : shipmentList) {
			    Matcher matcher = pattern.matcher(shipment.getBookingNumber());
		        if (matcher.find()) {
		        	System.out.println(shipment.getShipmnetId());
		        }
			}
	}
}

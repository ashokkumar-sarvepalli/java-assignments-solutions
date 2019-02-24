package assignment.collections.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
	public static void main(String args[]) throws IOException {
		String choice = "yes";
		List<Port> portList = new ArrayList<>();
		do {
			System.out.println("Enter the port details");
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			String input = buff.readLine();
			String []str = input.split(",");
			Port port = new Port(Integer.parseInt(str[0]),str[1],str[2]);
			portList.add(port);
			
			System.out.println("Do you want to continue[Yes/No]");
			choice = buff.readLine();

		} while (choice.equalsIgnoreCase("yes"));

		
		Collections.sort(portList);
		
		System.out.println("Port details in sorted order");
		System.out.format("%-15s %-15s %-15s\n", "Port Id", "Name", "Country");
		for(Port port : portList) {
			System.out.println(port);
		}
		
	}

}

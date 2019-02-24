package assignment.collections.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws IOException {

		List<Port>  portList = new ArrayList<>();

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of port details:");
		int n = Integer.parseInt(buff.readLine());
		// fill your code
		System.out.println("Enter the port details");
		String input=null;
		for(int i=0;i<n;i++) {
			input = buff.readLine();
			String [] str = input.split(",");
			Port port = new Port(Integer.parseInt(str[0]),str[1],str[2]);
			portList.add(port);
			
		}
		System.out.format("%-15s %-15s %-15s\n", "Port Id", "Name", "Location");
		
		for(Port port : portList) {
			System.out.println(port);
		}
		
		System.out.println("Enter the position");
		int pos = Integer.parseInt(buff.readLine());
		
		input = buff.readLine();
		String [] str = input.split(",");
		Port port = new Port(Integer.parseInt(str[0]),str[1],str[2]);
		
		portList.add(pos-1, port);
		
		System.out.println("After the insertion of port details");
		System.out.format("%-15s %-15s %-15s\n", "Port Id", "Name", "Location");
		for(Port prt : portList) {
			System.out.println(prt);
		}

	}
}

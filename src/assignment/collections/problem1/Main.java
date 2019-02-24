package assignment.collections.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) throws IOException {
		
		List<Commodity>  commodityList = new ArrayList<>();

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of commodities:");
		int n = Integer.parseInt(buff.readLine());
		// fill your code
		System.out.println("Enter the commodity details");
		String input=null;
		for(int i=0;i<n;i++) {
			input = buff.readLine();
			String [] str = input.split(",");
			Commodity commodity = new Commodity(str[0],str[1],str[2],str[3],str[4]);
			commodityList.add(commodity);
			
		}
		System.out.println("Commodity details are:");
		System.out.println(String.format("%-15s%-15s%-15s%-15s%s", "Commodity Name", "Quantity", "TotalValue",
				"TotalWeight", "Hazardous"));
		
		for(Commodity comm : commodityList) {
			System.out.println(comm);
		}
		
	}
}

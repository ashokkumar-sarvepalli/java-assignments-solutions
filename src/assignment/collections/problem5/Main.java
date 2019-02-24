package assignment.collections.problem5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String args[]) throws IOException {

		Map<String, Integer> paymentMap = new HashMap<String, Integer>();

		System.out.println("Enter the number of payments:");
		System.out.println("Enter the number of purchases:");

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buff.readLine());
		System.out.println("Enter all the purchases: (Order id, Item name, Price)");
		for (int i = 0; i < n; i++) {
			String input = buff.readLine();
			String[] str = input.split(",");

			if (paymentMap.containsKey(str[1])) {
				paymentMap.put(str[1], paymentMap.get(str[1]) + 1);
			} else {
				paymentMap.put(str[1], 1);
			}
		}
		
		System.out.format("%-15s %-15s\n","itemname","count");
		for(Map.Entry<String, Integer> map : paymentMap.entrySet()) {
			System.out.format("%-15s %-15s\n",map.getKey(),map.getValue());
		}
	}

}

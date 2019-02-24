package assignment.exceptionhandling.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("Enter the total number of items");
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buff.readLine());
		double totalCost = 0.0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the shipping price of the item " + (i + 1) + ":");
			try {
				arr[i] = Integer.parseInt(buff.readLine());

			} catch (NumberFormatException nx) {
				solveNumberFormatException(arr,buff,i);
				
			}
			
			totalCost = totalCost + arr[i];
		}
		
		System.out.println("The total cost of the container is "+totalCost);
	}

	private static int solveNumberFormatException(int[] arr, BufferedReader buff, int i) throws IOException {
		System.out.println("Exception :java.lang.NumberFormatException");
		System.out.println("Re-enter the item price");
		try {
			arr[i] = Integer.parseInt(buff.readLine());
			return arr[i];
		} catch (NumberFormatException e) {
			// recursive call until entered correctly.
			solveNumberFormatException(arr,buff,i);
			return 0;
		} 

		
	}
}

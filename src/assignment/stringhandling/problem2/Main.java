package assignment.stringhandling.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String regex = "\\d+";
		System.out.println("Enter the generated booking id");

		String input = reader.readLine();

		if (input.matches(regex)) {
			System.out.println("Generated booking id is valid");
		} else {
			System.out.println("Generated booking id is not valid");
		}

	}
}


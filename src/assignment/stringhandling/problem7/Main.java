package assignment.stringhandling.problem7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the username");
		String userName = reader.readLine();
		System.out.println("Formatted username");
		System.out.println(userName.toLowerCase());
	}
}


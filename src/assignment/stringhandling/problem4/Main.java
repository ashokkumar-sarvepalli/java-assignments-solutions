package assignment.stringhandling.problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file content:");
		String fileContent = reader.readLine();
		System.out.println("Enter the virus keyword:");
		String virusEntered = reader.readLine();
		
		String virusTrimmed = virusEntered.trim();
		
		
		if(fileContent.contains(virusTrimmed)) {
			System.out.println("Virus "+virusTrimmed+" is present");
		}else {
			System.out.println("Virus "+virusTrimmed+" is not present");

		}
	}
}

package assignment.stringhandling.problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String args[]) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<String> validDomainList = Arrays.asList("com","biz","net","org");
		
		System.out.println("Enter the email id");
		String input = reader.readLine();
		
		String expectedDomain = input.substring(input.length()-3);
		
		if(validDomainList.contains(expectedDomain)) {
			System.out.println("Valid domain");
		}
		else {
			System.out.println("Not a Valid domain");
		}
	}
}


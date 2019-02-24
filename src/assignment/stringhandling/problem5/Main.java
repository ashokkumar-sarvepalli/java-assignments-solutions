package assignment.stringhandling.problem5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Map<String,String> invoiceMap = new HashMap<String,String>();
		
		invoiceMap.put("CU", "CUR");
		invoiceMap.put("AT", "AGT");
		invoiceMap.put("CY", "CMY");
		System.out.println("Enter the invoice code");
		String input = reader.readLine();
		
		String code = input.substring(0, 2);
		String digit = input.substring(2, input.length());
		
		StringBuilder sb = new StringBuilder(invoiceMap.get(code));
		
		int numberOfDigitsNeeded = 5-digit.length();
		
		if(numberOfDigitsNeeded>0) {
			for(int i=0;i<numberOfDigitsNeeded;i++) {
				sb.append("0");
			}
		}
		
		sb.append(digit);
		
		System.out.println("Formatted Code");
		System.out.println(sb);
	}
}


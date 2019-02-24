package assignment.stringhandling.problem8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	public static int number = 1001;
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of username to be verified:");
		int n = Integer.parseInt(reader.readLine());
		System.out.println("Enter the usernames:");
		List<String> userNames = new ArrayList<String>();
		for(int i=0;i<n;i++) {
			String str = reader.readLine();
			userNames.add(str);
		}
		System.out.println("Usernames after recovering:");
		
		for(String string : userNames) {
			System.out.println(removeSpecialChars(string));
		}
	}

	private static String removeSpecialChars(String name) {
		Pattern pt = Pattern.compile("[^a-zA-Z0-9]");
		Matcher match = pt.matcher(name);
		while (match.find()) {
			String s = match.group();
			name = name.replaceAll("\\" + s, "");
		}

		if(name.equalsIgnoreCase("")) {
			name =  "IV"+(number++);
		}
		return name;
	}
}

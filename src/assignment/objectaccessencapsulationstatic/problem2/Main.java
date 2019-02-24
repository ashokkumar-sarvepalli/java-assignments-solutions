package assignment.objectaccessencapsulationstatic.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of companies :");
		int n = Integer.parseInt(buff.readLine());

		Company[] companyArray = new Company[n];
		String companyId = null;
		String iata = null;
		String fmc = null;
		String state = null;
		String country = null;

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the company " + (i + 1) + "  details");
			System.out.println("Enter the company id:");
			companyId = buff.readLine();
			System.out.println("Enter the company's IATA code:");
			iata = buff.readLine();
			System.out.println("Enter the company's FMC code :");
			fmc = buff.readLine();
			System.out.println("Enter the company's state :");
			state = buff.readLine();
			System.out.println("Enter the company's country :");
			country = buff.readLine();
			Address address = new Address(state, country);
			companyArray[i] = new Company(companyId, iata, fmc, address);
		}

		CompanyBO companyBO = new CompanyBO();
		companyBO.displayCompanyDetails(companyArray);

	}
}
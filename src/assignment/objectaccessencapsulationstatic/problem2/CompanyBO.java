package assignment.objectaccessencapsulationstatic.problem2;

public class CompanyBO {
	
	
	public void displayCompanyDetails(Company[] companies) {

		boolean isIndia = true;
		boolean isFirst = true;
		for (Company company : companies) {

			if (!company.getAddress().getCountry().equalsIgnoreCase("India")) {
				if (isFirst) {
					System.out.println("Companies outside India:");
					System.out.format("%-15s %-15s %-15s %-15s %s\n", "COMPANY ID", "IATA CODE", "FMC CODE", "State", "Country");
					isFirst = false;
				}
				isIndia = false;
				System.out.println(company);
			}
		}

		if (isIndia) {
			System.out.println("All companies are inside India");
		}

	}
}
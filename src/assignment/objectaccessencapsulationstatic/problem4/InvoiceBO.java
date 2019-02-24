package assignment.objectaccessencapsulationstatic.problem4;

public class InvoiceBO {
	public void displayUserDetailsByStatus(String status, Invoice[] invoiceArray) {
		
		boolean isAtleastOnceNotFound = true;

		for (Invoice invoice : invoiceArray) {
			if (invoice.getStatus() != null && invoice.getStatus().equalsIgnoreCase(status)) {
				System.out.println(invoice.getCustomer());
				isAtleastOnceNotFound = false;
			}
		}
		
		if(isAtleastOnceNotFound) {
			System.out.println("No invoice availabel for the given status");
		}
	}

	public double getTotalInvoiceValue(String userName, Invoice[] invoiceArray) {
		double sum = 0.0;

		for (Invoice invoice : invoiceArray) {
			if (invoice.getCreatedBy() != null && invoice.getCreatedBy().equalsIgnoreCase(userName)) {
				sum = sum + invoice.getTotal();
			}
			
		}
		return sum;
	}
}

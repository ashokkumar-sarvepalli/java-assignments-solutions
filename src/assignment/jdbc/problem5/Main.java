package assignment.jdbc.problem5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String ags[]) throws Exception {
		int choice = 0;
		InvoiceDAO dao = new InvoiceDAO();


		while (true) {
			
		System.out.println("Select your choice");
		System.out.println("1.Invoices greater than $1000");
		System.out.println("2.Invoices which are pending for payment");
		System.out.println("3.Invoices which did not receive any payment");
		System.out.println("4.Group invoice based on the customer and print summary");

			BufferedReader brReader = new BufferedReader(new InputStreamReader(System.in));
			choice = Integer.parseInt(brReader.readLine());

			switch (choice) {
			case 1:
				System.out.println("List of the Invoices more than $1000");
				System.out.println(String.format("%-5s %-15s %-17s %-15s %-10s %s", "Id", "Customer Name",
						"Payment Attempts", "Total Amount", "Balance", "Status"));
				int amount = 1000;
				dao.findInvoiceByAmount(amount);
				break;
			case 2:
				System.out.println("List of the Invoices which are pending for payment");
				System.out.println(String.format("%-5s %-15s %-17s %-15s %-10s %s", "Id", "Customer Name",
						"Payment Attempts", "Total Amount", "Balance", "Status"));
				dao.findPendingInvoice();
				break;
			case 3:
				System.out.println("List of the Invoices which did not receive any payment");
				System.out.println(String.format("%-5s %-15s %-17s %-15s %-10s %s", "Id", "Customer Name",
						"Payment Attempts", "Total Amount", "Balance", "Status"));
				dao.findNoPaymentInvoice();
				break;
			case 4:
				System.out.println("Invoice Summary");
				System.out.println(String.format("%-17s %-15s %s", "Customer Name", "Total Amount", "Total Balance"));
				dao.invoiceGroupByCustomer();
				break;
			}

			System.out.println("Do you want to continue");
			String input = brReader.readLine();
			if (input.equalsIgnoreCase("No")) {
				System.exit(0);
			}
		}
	}

}

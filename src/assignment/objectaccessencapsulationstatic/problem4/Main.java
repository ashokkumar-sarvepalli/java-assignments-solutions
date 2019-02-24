package assignment.objectaccessencapsulationstatic.problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of invoices :");
		int n = Integer.parseInt(buf.readLine());

		Invoice[] invoice = new Invoice[n];
		String line = null;

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the invoice " + (i + 1) + " details");
			line = buf.readLine();
			String[] str = line.split(",");
			User user = new User(str[0], str[1], str[2]);
			invoice[i] = new Invoice(user, Double.parseDouble(str[3]), str[4], str[5]);
		}
		
		System.out.println("Customer details with status cleared invoices:");

		InvoiceBO invoiceBO = new InvoiceBO();
		invoiceBO.displayUserDetailsByStatus("Cleared", invoice);
		
		System.out.println("Enter the invoice Creator Name:");
		String name = buf.readLine();
		
		System.out.println("The total invoice value:");
		double total = invoiceBO.getTotalInvoiceValue(name, invoice);
		if(total==0.0) {
			System.out.println("No invoice available");
		}
		else {
			System.out.println(total);
		}
	}

}

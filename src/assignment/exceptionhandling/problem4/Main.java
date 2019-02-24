package assignment.exceptionhandling.problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the invoice number :");
		String invoiceNumber = buf.readLine();
		System.out.println("Enter the total invoice amount :");
		Double totalAmount = Double.parseDouble(buf.readLine());

		Invoice invoice = new Invoice(invoiceNumber, totalAmount, 0);

		System.out.println("Enter the credit card number :");
		String cardNumber = buf.readLine();
		System.out.println("Enter the credit limit :");
		Double cardLimit = Double.parseDouble(buf.readLine());

		CreditCard cc = new CreditCard(cardNumber, cardLimit);

		String ch;
		try {
			do {
				System.out.println("Do you want to process invoice payment?(yes/no)");
				ch = buf.readLine();
				System.out.println("Enter the amount :");
				Double amount = Double.parseDouble(buf.readLine());
				InvoiceBO.processPayment(invoice, cc, amount);
				
				if(invoice.getTotalAmount()==0) break;

			} while (ch.equalsIgnoreCase("yes"));

			System.out.println("Payment Succesfully done in " + invoice.getAttempts() + " attempt");
		} catch (CreditLimitException e) {
			System.out.println("Exception occured :" + e.toString());
		}

	}
}

package assignment.exceptionhandling.problem4;

public class InvoiceBO {

	public static void processPayment(Invoice invoice, CreditCard creditCard, Double amount)
			throws CreditLimitException {

		if (amount > creditCard.getCardLimit()) {
			throw new CreditLimitException("Credit Limit Exceeded");
		}

		if (invoice.getTotalAmount() - amount < 0) {
			throw new CreditLimitException("Credit Limit Exceeded");
		}

		creditCard.setCardLimit(creditCard.getCardLimit() - amount);
		invoice.setTotalAmount(invoice.getTotalAmount() - amount);

		invoice.setAttempts(invoice.getAttempts() + 1);

	}
}

package assignment.thread.problem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

	public static void main(String args[]) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of payment:");
		int numberOfPayments = Integer.parseInt(reader.readLine());

		System.out.println("Enter all the payment details");

		CreditCardProcessingThread cc = new CreditCardProcessingThread(new ArrayBlockingQueue<String>(10));
		ChequeProcessingThread cq = new ChequeProcessingThread(new ArrayBlockingQueue<String>(10));

		Thread t1 = new Thread(cc);
		Thread t2 = new Thread(cq);

		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();

		for (int i = 0; i < numberOfPayments; i++) {
			String str = reader.readLine();
			String strarray[] = str.split(",");

			if (strarray[2].equalsIgnoreCase("CHEQ")) {
				cq.addCheque(str);
			} else if (strarray[2].equalsIgnoreCase("CC")) {
				cc.addCreditCard(str);
			}

		}

		// make sure wait for both queues to empty
		while (!cc.getQueue().isEmpty() || !cq.getQueue().isEmpty()) {
			// do Nothing
		}

	}

}

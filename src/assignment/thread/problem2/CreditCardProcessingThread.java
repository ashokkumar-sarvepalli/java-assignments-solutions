package assignment.thread.problem2;

import java.util.concurrent.ArrayBlockingQueue;

public class CreditCardProcessingThread implements Runnable {

	ArrayBlockingQueue<String> queue;

	public CreditCardProcessingThread(ArrayBlockingQueue<String> queue) {
		this.queue = queue;
	}

	public void run() {

		while (true) {

			while (queue.isEmpty()) {
				// do nothing
			}

			String str[] = queue.peek().split(",");
			if (str[2].equalsIgnoreCase("CC")) {
				System.out.println("Credit card processing completed for payment id " + str[0]);
				queue.poll();

			}
		}

	}

	public void addCreditCard(String val) {
		queue.add(val);
	}

	public ArrayBlockingQueue<String> getQueue() {
		return queue;
	}

	public void setQueue(ArrayBlockingQueue<String> queue) {
		this.queue = queue;
	}

}

package assignment.thread.problem2;

import java.util.concurrent.ArrayBlockingQueue;

public class ChequeProcessingThread implements Runnable {

	ArrayBlockingQueue<String> queue;

	public ChequeProcessingThread(ArrayBlockingQueue<String> queue) {
		this.queue = queue;
	}

	public void run() {

		while (true) {

			while (queue.isEmpty()) {
				// do nothing
			}
			String str[] = queue.poll().split(",");
			if (str[2].equalsIgnoreCase("CHEQ")) {
				System.out.println("Cheque processing completed for payment id " + str[0]);
				queue.poll();
			}
		}

	}

	public void addCheque(String val) {
		queue.add(val);
	}

	public ArrayBlockingQueue<String> getQueue() {
		return queue;
	}

	public void setQueue(ArrayBlockingQueue<String> queue) {
		this.queue = queue;
	}

}

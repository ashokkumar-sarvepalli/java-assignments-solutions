package assignment.thread.problem3;

import java.util.List;

public class NotificationThread implements Runnable {

	private List<String> notification;

	public NotificationThread(List<String> notification) {
		this.notification = notification;
	}

	public void run() {

		for (String str : notification) {
			String array[] = str.split(",");
			NotificationManager.getInstance().sendMessage(array[0], Integer.parseInt(array[1]));
		}
	}

}

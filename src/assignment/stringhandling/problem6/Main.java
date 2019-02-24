package assignment.stringhandling.problem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Main.Invoice> invoiceList = new ArrayList<Main.Invoice>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Enter the number of transaction made:");
		int n = Integer.parseInt(reader.readLine());
		System.out.println("Enter the transaction details:");

		for (int i = 0; i < n; i++) {
			String input = reader.readLine();
			String str[] = input.split(",");
			Main.Invoice invoice = new Main().new Invoice(str[0], Integer.parseInt(str[1]),
					LocalDate.parse(str[2], formatter));
			invoiceList.add(invoice);
		}

		System.out.println("Enter the date:");
		String enteredDate = reader.readLine();
		LocalDate enteredLocalDate = LocalDate.parse(enteredDate, formatter);

		WeekFields weekFields = WeekFields.of(Locale.getDefault());
		int weekNumber = enteredLocalDate.get(weekFields.weekOfWeekBasedYear());

		System.out.println("This date falls on week " + weekNumber + " of this year");

		int revenueDay = 0;
		for (Main.Invoice invoice : invoiceList) {
			if (invoice.getDate().equals(enteredLocalDate)) {
				revenueDay = revenueDay + invoice.getRevenue();
			}
		}

		System.out.println("Revenue on " + enteredDate + ":" + revenueDay);

		DayOfWeek dayOfWeek = enteredLocalDate.getDayOfWeek();
		LocalDate firstWorkingDay = enteredLocalDate;

		switch (dayOfWeek) {
		case FRIDAY:
			firstWorkingDay = firstWorkingDay.minusDays(5);
			break;
		case SATURDAY:
			firstWorkingDay = firstWorkingDay.minusDays(6);
			break;
		case MONDAY:
			firstWorkingDay = firstWorkingDay.minusDays(1);
			break;
		case TUESDAY:
			firstWorkingDay = firstWorkingDay.minusDays(2);
			break;
		case WEDNESDAY:
			firstWorkingDay = firstWorkingDay.minusDays(3);
			break;
		case THURSDAY:
			firstWorkingDay = firstWorkingDay.minusDays(4);
			break;
		}

		LocalDate lastWorkingDay = firstWorkingDay.plusDays(6);

		int revenueWeek = 0;
		for (Main.Invoice invoice : invoiceList) {
			if (invoice.getDate().isAfter(firstWorkingDay.minusDays(1))
					&& invoice.getDate().isBefore(lastWorkingDay.plusDays(1))) {
				revenueWeek = revenueWeek + invoice.getRevenue();
			}
		}
		System.out.println("Revenue for week" + weekNumber + " is " + revenueWeek);

	}

	private class Invoice {
		private String name;
		private int revenue;
		private LocalDate date;

		public Invoice(String name, int revenue, LocalDate date) {
			this.name = name;
			this.revenue = revenue;
			this.date = date;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRevenue() {
			return revenue;
		}

		public void setRevenue(int revenue) {
			this.revenue = revenue;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

	}

}

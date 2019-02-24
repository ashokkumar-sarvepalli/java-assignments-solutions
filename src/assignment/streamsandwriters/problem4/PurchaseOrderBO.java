package assignment.streamsandwriters.problem4;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class PurchaseOrderBO {

	public void createPurchaseOrder(String customername, List<Item> items, List<Integer> quantity,
			String outputfilename) {
		try {

			BufferedWriter brWriter = new BufferedWriter(new FileWriter(outputfilename));
			System.out.println("Name :" + customername);
			brWriter.write("Name : " + customername);

			for (Item item : items) {
				System.out.println(item.toString() + "\n");
			}
			Double amount = 0.00;
			for (Item item : items) {
				Double price = item.getPrice();
				amount = amount + price;
			}

			System.out.println("Total Amount : " + amount);
			brWriter.write("Total Amount : " + amount);
		} catch (Exception e) {

		}
	}
}

package assignment.streamsandwriters.problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String outputfilename = "C:/Users/KartheekVadlamani/Desktop/output.txt";
		List<Item> items = new ArrayList<Item>();

		try {
			BufferedReader brReader = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Item details");
			System.out.println("Item id" + "  " + "Itemname" + "  " + "Item price");

			for (int i = 0; i < 4; i++) {
				int id = Integer.parseInt(brReader.readLine());
				String itemName = brReader.readLine();
				Double price = Double.parseDouble(brReader.readLine());
				Item item = new Item(id, itemName, price);
				items.add(item);
			}

			for (Item item : items) {
				System.out.println(item.toString());
			}

			System.out.println("Enter the customer name");
			String customerName = brReader.readLine();
			System.out.println(customerName);
			System.out.println("Enter the required items");
			String[] items1 = brReader.readLine().split(",");

			Integer Itemone = Integer.parseInt(items1[0]);
			Integer Itemtwo = Integer.parseInt(items1[1]);
			Integer Itemthree = Integer.parseInt(items1[2]);
			Integer Itemfour = Integer.parseInt(items1[3]);
			List<Integer> itemIds = new ArrayList<>();
			itemIds.add(Itemone);
			itemIds.add(Itemtwo);
			itemIds.add(Itemthree);
			itemIds.add(Itemfour);
			
			List<Item> inputItems = new ArrayList<>();
			for (Item item : items) {
				if (itemIds.contains(item.getId()) == true) {
					inputItems.add(item);
				}
			}
			System.out.println(items1);
			System.out.println("Enter the required items");
			String[] quantity = brReader.readLine().split(",");
			Integer one = Integer.parseInt(quantity[0]);
			Integer two = Integer.parseInt(quantity[1]);
			Integer three = Integer.parseInt(quantity[2]);
			Integer four = Integer.parseInt(quantity[3]);

			List<Integer> quantityList = new ArrayList<>();
			quantityList.add(one);
			quantityList.add(two);
			quantityList.add(three);
			quantityList.add(four);

			System.out.println(quantity);

			PurchaseOrderBO po = new PurchaseOrderBO();
			po.createPurchaseOrder(customerName, inputItems, quantityList, outputfilename);

		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

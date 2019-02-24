package assignment.exceptionhandling.problem1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the container number :");
		String containerNumber = buff.readLine();
		System.out.println("Enter the capacity of container :");
		int n = Integer.parseInt(buff.readLine());
		System.out.println("Enter the number of commodities :");
		int num = Integer.parseInt(buff.readLine());
		System.out.println("Enter the commodities :");
		String line = null;
		Commodity comm[] = new Commodity[num];
		for (int i = 0; i < num; i++) {
			line = buff.readLine();
			String str[] = line.split(",");
			comm[i] = new Commodity(str[0], Float.parseFloat(str[1]), Integer.parseInt(str[2]));

		}

		Container container = new Container(containerNumber, n, comm);

		ShipmentBO sbo = new ShipmentBO();

		try {
			sbo.validate(container, container.getCommidities());
		} catch (ContainerOverloadedException e) {
			System.out.println(e.getMessage());
		}

	}
}

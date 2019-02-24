package assignment.exceptionhandling.problem1;

public class ShipmentBO {
	public void validate(Container container, Commodity[] commodities) throws ContainerOverloadedException {

		float commWeight = 0;

		for (Commodity comm : commodities) {
			commWeight = commWeight + comm.getTotalWeight();
		}

		if (commWeight > container.getContainerWeight()) {
			throw new ContainerOverloadedException("ContainerOverloadedException: Container is Overloaded");
		}

		container.displayDetails();
	}
}

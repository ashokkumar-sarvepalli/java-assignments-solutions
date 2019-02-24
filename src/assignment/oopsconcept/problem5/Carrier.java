package assignment.oopsconcept.problem5;

public class Carrier implements ICarrier, MenuDrivenEntity {
	private String id;
	private Double expense;
	private String modeOfTransport;
	private String[] listOfPorts;

	public Carrier() {
	}

	public Carrier(String values) {

		String[] str = values.split(",");

		this.setId(str[0]);
		this.setExpense(Double.parseDouble(str[1]));
		this.setModeOfTransport(str[2]);

		listOfPorts = new String[str.length-3];
		for(int i=3;i<str.length;i++) {
			listOfPorts[i-3] = str[i];
		}
		

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getExpense() {
		return expense;
	}

	public void setExpense(Double expense) {
		this.expense = expense;
	}

	public String getModeOfTransport() {
		return modeOfTransport;
	}

	public void setModeOfTransport(String modeOfTransport) {
		this.modeOfTransport = modeOfTransport;
	}

	public String[] getListOfPorts() {
		return listOfPorts;
	}

	public void setListOfPorts(String[] listOfPorts) {
		this.listOfPorts = listOfPorts;
	}

	@Override
	public void listPorts() {
		System.out.println("List of ports:");

		for (String str : listOfPorts) {
			System.out.println(str);
		}
	}

	@Override
	public void noOfPort() {
		System.out.println("Number of Ports :" + listOfPorts.length);
	}

	public void displayMenu() {
		System.out.println("Carrrier Menu\n1.List the Ports\n2.Calculate number of ports");
	}

	@Override
	public void choiceAction(int choice) {
		if(choice==1) {
			this.listPorts();
		}else if(choice==2) {
			this.noOfPort();
		}else {
			System.out.println("Invalid optionß");
		}
	}
}
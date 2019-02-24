package assignment.oopsconcept.problem5;


public class Agent implements MenuDrivenEntity,TaxPayer {
	private String id;
	private Double expense;
	private Double commision;
	public Agent(){
	}
	public Agent(String values) {
		
		String [] str = values.split(",");
		this.setId(str[0]);
		this.setExpense(Double.parseDouble(str[1]));
		this.setCommision(Double.parseDouble(str[2]));
		
		
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
	public Double getCommision() {
		return commision;
	}
	public void setCommision(Double commision) {
		this.commision = commision;
	}
	@Override
	public Double calculateRevenue() {
		return expense+commision;
	}
	@Override
	public Double calculateTax() {
		return commision * 0.05;
	}
	@Override
	public void displayMenu() {
		System.out.println("Agent Menu\n1.Calculate agent revenue\n2.Calculate agent tax");
	}
	@Override
	public void choiceAction(int choice) {
		if(choice==1) {
			System.out.println("Revenue for "+id+" is "+this.calculateRevenue());
		}else if(choice==2) {
			System.out.println("Tax for "+id+" is "+this.calculateTax());
		}else {
			System.out.println("Invalid optionß");
		}
	}
}
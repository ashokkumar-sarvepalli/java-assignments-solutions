package assignment.oopsconcept.problem5;


public class Company implements MenuDrivenEntity,TaxPayer {
	private String id;
	private Double expense;
	private Double profit;
	public Company(){
	}
	public Company(String values) {
		String [] str = values.split(",");
		
		this.setId(str[0]);
		this.setExpense(Double.parseDouble(str[1]));
		this.setProfit(Double.parseDouble(str[2]));
		
		
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
	public Double getProfit() {
		return profit;
	}
	public void setProfit(Double profit) {
		this.profit = profit;
	}
	@Override
	public Double calculateRevenue() {
		return profit + expense;
	}
	@Override
	public Double calculateTax() {
		return profit * 0.08;
	}
	@Override
	public void displayMenu() {
		System.out.println("Company Menu\n1.Calculate company revenue\n2.Calculate company tax");

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
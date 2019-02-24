package assignment.jdbc.problem5;

public class Invoice {
    private int id;
    private String customerName;
    private int paymentAttempts;
    private Double totalAmount;
    private Double balance;
    private String status;

    public Invoice(int id, String customerName, int paymentAttempts, Double totalAmount, Double balance, String status) {
        this.id = id;
        this.customerName = customerName;
        this.paymentAttempts = paymentAttempts;
        this.totalAmount = totalAmount;
        this.balance = balance;
        this.status = status;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPaymentAttempts() {
        return paymentAttempts;
    }

    public void setPaymentAttempts(int paymentAttempts) {
        this.paymentAttempts = paymentAttempts;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
    	return  String.format("%-5s %-15s %-17s %-15s %-10s %s", id , customerName, paymentAttempts,
    			totalAmount, balance, status);
    			
    }
}

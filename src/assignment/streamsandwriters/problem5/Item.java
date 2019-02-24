package assignment.streamsandwriters.problem5;

public class Item {
	private Long id;
	private String internalNumber;
	private int deleted;
	private Long currencyId;
	private Double price;

	public Item(Long id, String internalNumber, int deleted, Long currencyId, Double price) {
		this.id = id;
		this.internalNumber = internalNumber;
		this.deleted = deleted;
		this.currencyId = currencyId;
		this.price = price;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getInternalNumber() {
		return internalNumber;
	}

	public void setInternalNumber(String internalNumber) {
		this.internalNumber = internalNumber;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public Long getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
}

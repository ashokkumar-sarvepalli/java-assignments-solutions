package assignment.jdbc.problem2;

public class Contact {

	private Integer id;
	private String street;
	private String city;
	private	String state;
	
	Contact(Integer id,String street,String city,String state){
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	
}

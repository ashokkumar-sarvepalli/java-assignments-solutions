package assignment.oopsconcept.problem1;

public class User {

	private String userName;
	private String firstName;
	private String lastName;
	private String contact;

	public User(String userName, String firstName, String lastName, String contact) {
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contact = contact;
	}

	User() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
	// fill your code

	public User findUser(User userArray[], String userName) {

		if (userArray == null || userArray.length == 0)
			return null;

		for (User user : userArray) {
			if (user.getUserName() != null && user.getUserName().equalsIgnoreCase(userName)) {
				return user;
			}
		}

		return null;

	}

	public User findUser(User userArray[], String firstName, String lastName) {

		if (userArray == null || userArray.length == 0)
			return null;

		for (User user : userArray) {
			if (user.getFirstName() != null && user.getLastName() != null
					&& user.getFirstName().equalsIgnoreCase(firstName)
					&& user.getLastName().equalsIgnoreCase(lastName)) {
				return user;
			}
		}

		return null;

	}
}

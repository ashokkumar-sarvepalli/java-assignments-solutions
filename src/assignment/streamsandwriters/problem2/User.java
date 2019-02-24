package assignment.streamsandwriters.problem2;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String mobileNumber;
    private Role role;

    public User(Long id,String firstName,String lastName,String username,String password,String mobileNumber,Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.role = role;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

	@Override
	public String toString() {
		return id+","+firstName+","+lastName+","+username+ "," + password+ "," + mobileNumber+ "," + role.getRoleId()+ "," + role.getName();
	}
    
    
    
}
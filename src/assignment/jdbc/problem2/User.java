package assignment.jdbc.problem2;

public class User {
    private Integer id;
    private String name;
    private Role role;
    private Contact contact;

    public User(Integer id, String name,Role role,Contact contact) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.contact = contact;
    }

    public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

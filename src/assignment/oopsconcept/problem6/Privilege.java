package assignment.oopsconcept.problem6;

public class Privilege {
	private Integer id;
	private String name;

	public Privilege(Integer id, String name) {
		this.id = id;
		this.name = name;
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

	public static Privilege getPrevilegeById(Privilege[] privilege, Integer id) {

		for (Privilege priv : privilege) {

			if (priv.getId() == id) {
				return priv;
			}
		}
		return null;
	}

}

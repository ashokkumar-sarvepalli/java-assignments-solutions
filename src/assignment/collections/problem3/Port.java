package assignment.collections.problem3;

class Port implements Comparable<Port>{

     
  Integer id;
  String name;
  String country;
  Port(){}
  public Port(Integer id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
		return String.format("%-15s %-15s %-15s", getId(), getName(), getCountry());
	}
	@Override
	public int compareTo(Port o) {
		return this.getCountry().compareTo(o.getCountry());
	}
}

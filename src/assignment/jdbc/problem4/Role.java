package assignment.jdbc.problem4;

import java.util.ArrayList;
public class Role {

    private Integer id;
    private String name;
    private ArrayList<Privilege> privilegeList;

    public Role(){}
    
    public Role(String name) {
        this.name = name;
    }

    public Role(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Role(Integer id, String name, ArrayList<Privilege> privilegeList) {
        this.id = id;
        this.name = name;
        this.privilegeList = privilegeList;
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

    public ArrayList<Privilege> getPrivilegeList() {
        return privilegeList;
    }

    public void setPrivilegeList(ArrayList<Privilege> privilegeList) {
        this.privilegeList = privilegeList;
    }
}

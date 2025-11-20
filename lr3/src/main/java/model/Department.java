package model;

import java.util.ArrayList;
import java.util.List;

public class Department extends AbstractUnit {

    private List<Group> groups = new ArrayList<>();

    public Department(String name, Human head) {
        super(name, head);
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Department{");
        sb.append(super.toString()).append('\n');
        for (Group g : groups) {
            sb.append("      ").append(g).append('\n');
        }
        sb.append('}');
        return sb.toString();
    }
}

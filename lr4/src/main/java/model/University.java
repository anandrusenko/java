package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University extends AbstractUnit {

    private List<Faculty> faculties = new ArrayList<>();

    public University(String name, Human head) {
        super(name, head);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        University that = (University) o;
        return Objects.equals(faculties, that.faculties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), faculties);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("University{");
        sb.append(super.toString()).append('\n');
        for (Faculty f : faculties) {
            sb.append("  ").append(f).append('\n');
        }
        sb.append('}');
        return sb.toString();
    }
}


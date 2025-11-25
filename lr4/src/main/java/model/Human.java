package model;

import java.util.Objects;

public class Human extends AbstractUnit {

    private String firstName;
    private String lastName;
    private String patronymic;
    private Sex sex;

    public Human(String firstName, String lastName, String patronymic, Sex sex) {
        // як name для Human беремо ПІБ
        super(lastName + " " + firstName + " " + patronymic, null);
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) && Objects.equals(lastName, human.lastName) && Objects.equals(patronymic, human.patronymic) && sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), firstName, lastName, patronymic, sex);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getFullName() {
        return lastName + " " + firstName + " " + patronymic;
    }

    @Override
    public String toString() {
        return "Human{" +
                "fullName='" + getFullName() + '\'' +
                ", sex=" + sex +
                '}';
    }
}


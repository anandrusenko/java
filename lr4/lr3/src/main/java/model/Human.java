package model;

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

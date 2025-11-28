package model;

public class Student {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String birthDate;
    private String gradebookNumber;

    public Student(int id, String lastName, String firstName, String middleName, String birthDate, String gradebookNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.gradebookNumber = gradebookNumber;
    }

    public int getId() { return id; }
    public String getLastName() { return lastName; }
    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getBirthDate() { return birthDate; }
    public String getGradebookNumber() { return gradebookNumber; }
}

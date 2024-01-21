

public class Employee {

    private String firstName;
    private String secondName;

    private Integer personalCode;

    public Employee(String firstName, String secondName, Integer personalCode) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.personalCode = personalCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getPersonalCode() {
        return personalCode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", personalCode=" + personalCode +
                '}';
    }
}

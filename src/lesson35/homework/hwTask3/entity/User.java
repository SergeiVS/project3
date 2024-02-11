package homework.hwTask3.entity;

public class User {
    Integer identifier;
    String firstName;
    String lastName;
    Double accountValue;

    public User(Integer identifier, String firstName, String lastName, Double accountValue) {
        this.identifier = identifier;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountValue = accountValue;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(Double accountValue) {
        this.accountValue = accountValue;
    }

    @Override
    public String toString() {
        return "User{" +
                "identifier=" + identifier +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", accountValue=" + accountValue +
                '}';
    }
}

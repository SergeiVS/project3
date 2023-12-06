package lesson12.students;

public class Address {

    private String plz;
    private String town;
    private String street;
    private int houseNumber;

    public Address(String plz, String town, String street, int houseNumber) {
        this.plz = plz;
        this.town = town;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public Address(String plz) {
        this.plz = plz;
    }

    public Address() {

    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    @Override
    public String toString() {
        return "Address{" +
                "plz='" + plz + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}

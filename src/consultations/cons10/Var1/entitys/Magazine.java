package entitys;

import entity.LibraryItem;

public class Magazine extends LibraryItem {
    private String issuedNumber;

    public Magazine(String title, int year) {
        super(title, year);
    }


    public String getIssuedNumber() {
        return issuedNumber;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "issuedNumber='" + issuedNumber + '\'' +
                "} " + super.toString();
    }
}

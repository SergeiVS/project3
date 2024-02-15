package entity;

public class MagazineWithCalculation extends Magazine{

    private Integer calculation;

    public MagazineWithCalculation(String title, int year, String issuedNumber, Integer calculation) {
        super(title, year, issuedNumber);
        this.calculation = calculation;
    }

    public Integer getCalculation() {
        return calculation;
    }

    @Override
    public String toString() {
        return "MagazineWithCalculation{" +
                "calculation=" + calculation +
                "} " + super.toString();
    }
}

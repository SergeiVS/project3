package lessonCode;

public class Transmission {
private Integer currentGear;
private String transmissionParameter;

    public Transmission(String transmissionParameter) {
        this.transmissionParameter = transmissionParameter;
    }

    public void setCurrentGear(Integer currentGear) {
        this.currentGear = currentGear;
    }

    public Integer getCurrentGear() {
        return currentGear;
    }

    public String getTransmissionParameter() {
        return transmissionParameter;
    }
}

package lessonCode.entitys;

public class Transmission {
private Integer currentGear;
private Integer maxGear;
private String transmissionType;

    public Transmission(Integer maxGear, String transmissionType, Integer currentGear) {
        this.maxGear = maxGear;
        this.transmissionType = transmissionType;
        this.currentGear = 0;
    }


    public void setCurrentGear(Integer currentGear) {
        this.currentGear = currentGear;
    }

    public Integer getCurrentGear() {
        return currentGear;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
}

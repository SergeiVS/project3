package lessonCode.entitys;

import lessonCode.vehicleUtils.UserInput;

public class Transmission {
    UserInput ui = new UserInput();
private Integer currentGear;
private Integer maxGear;
private String transmissionType;

    public Transmission(Integer maxGear, String transmissionType, Integer currentGear) {
        this.maxGear = maxGear;
        this.transmissionType = transmissionType;
        this.currentGear = 0;
    }


    public Integer setCurrentGear(Integer currentGear) {
        this.currentGear = currentGear;
        return currentGear;
    }

    public Integer getMaxGear() {
        return maxGear;
    }

    public Integer getCurrentGear() {
        return currentGear;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
}

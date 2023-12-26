package lessonCode.vehicleOperateInrefaces;

import lessonCode.entitys.Engine;

public interface GearBoxOperation {

    Integer gearBoxOperate(Integer currentGear, Integer currentSpeed, Integer maxGear);
}

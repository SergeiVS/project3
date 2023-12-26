package lessonCode.vehicleOperateInrefaces;

import lessonCode.entitys.Engine;

public interface ElgineOperation {
    default boolean startEngine(Engine engine, boolean isStarted) {
        isStartedCheck(isStarted);
        if (!isStarted){
            System.out.println("Engine starts");
            engine.setStarted(true);
        }
        return isStarted;
    }

    private static boolean isStartedCheck(boolean isStarted) {
        if (isStarted) {
            System.out.println("Engine is already started");
            return true;
        }
        return false;
    }

    default boolean stopEngine(Engine engine, boolean isStarted) {
        if (isStartedCheck(isStarted)) {
            System.out.println("engine is stopping");
            isStarted = false;
            return isStarted;
        } else {
            System.out.println("engine is already out");
            return isStarted;
        }
    }
}

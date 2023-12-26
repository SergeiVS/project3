package lessonCode.entitys;

public class Engine {
    private String engineParameters;
    private boolean isStarted;

    public Engine(String engineParameters, boolean isStarted) {
        this.engineParameters = engineParameters;
        this.isStarted = false;
    }

    public Engine() {
        super();
    }

    public String getEngineParameters() {
        return engineParameters;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

}

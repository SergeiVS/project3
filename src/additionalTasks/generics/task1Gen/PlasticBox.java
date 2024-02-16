package additionalTasks.generics.task1Gen;

public class PlasticBox extends Boxt1G<BoxContain>{
    int volume;

    public PlasticBox(Integer id, int volume) {
        super(id);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "PlasticBox{" +
                "volume=" + volume +
                "} " + super.toString();
    }
}

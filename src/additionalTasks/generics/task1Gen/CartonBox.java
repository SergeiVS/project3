package additionalTasks.generics.task1Gen;

public class CartonBox extends Boxt1G<BoxContain>{

    int volume;


    public CartonBox(Integer id, int volume) {
        super(id);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "CartonBox{" +
                "volume=" + volume +
                "} " + super.toString();
    }
}

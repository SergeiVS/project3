package additionalTasks.generics.task1Gen.boxes;

import additionalTasks.generics.task1Gen.contains.BoxContain;

public class CartonBox extends BoxT1G<BoxContain> {

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

    @Override
    public void putContain(BoxContain boxContain) {
        contains.add(boxContain);
    }

    @Override
    public void removeContain (BoxContain boxContain) {
        if (contains.contains(boxContain)) {
            contains.remove(boxContain);
        }
    }

}

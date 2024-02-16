package generics.task1Gen.boxes;


import generics.task1Gen.contains.BoxContain;

import java.util.List;

public class CartonBox extends BoxT1G<BoxContain> {
    public CartonBox(Integer id, int volume) {
        super(id, volume);
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

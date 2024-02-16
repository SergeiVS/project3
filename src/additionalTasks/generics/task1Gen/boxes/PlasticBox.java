package generics.task1Gen.boxes;


import generics.task1Gen.contains.BoxContain;

import java.util.List;

public class PlasticBox extends BoxT1G<BoxContain> {


    public PlasticBox(Integer id, int volume) {
        super(id, volume);
    }

    @Override
    public String toString() {
        return "PlasticBox{" +
                "volume=" + volume +
                "} " + super.toString();
    }

    @Override
    public void putContain(BoxContain boxContain) {
        contains.add(boxContain);
    }

    @Override
    public void removeContain(BoxContain boxContain) {
        if (contains.contains(boxContain)) {
            contains.remove(boxContain);
        }
    }
}

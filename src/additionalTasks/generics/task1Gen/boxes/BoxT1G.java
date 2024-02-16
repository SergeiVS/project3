package generics.task1Gen.boxes;



import java.util.ArrayList;
import java.util.List;

public abstract class BoxT1G<BoxContain>{
    Integer id;
    int volume;

    List<BoxContain> contains;

    public BoxT1G(Integer id, int volume) {
        this.id = id;
        this.volume = volume;
        this.contains = new ArrayList<>();
    }

    public int getVolume() {
        return volume;
    }

    public Integer getId() {
        return id;
    }

    public List<BoxContain> getContains() {
        return contains;
    }

    @Override
    public String toString() {
        return "BoxT1G{" +
                "id=" + id +
                ", contains=" + contains +
                '}';
    }

    public abstract void putContain (BoxContain contain);

    public abstract void removeContain(BoxContain contain);
}

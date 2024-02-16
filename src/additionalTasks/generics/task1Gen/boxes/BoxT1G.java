package additionalTasks.generics.task1Gen.boxes;

import additionalTasks.generics.task1Gen.contains.BookT1G;

import java.util.ArrayList;
import java.util.List;

public abstract class BoxT1G<BoxContain>{
    Integer id;

    List<BoxContain> contains;

    public BoxT1G(Integer id) {
        this.id = id;
        this.contains = new ArrayList<>();
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

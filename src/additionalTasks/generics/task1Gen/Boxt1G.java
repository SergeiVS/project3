package additionalTasks.generics.task1Gen;

import java.util.ArrayList;
import java.util.List;

public abstract class Boxt1G <BoxContain>{
    Integer id;

    List<BoxContain> contains;

    public Boxt1G(Integer id) {
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
        return "Boxt1G{" +
                "id=" + id +
                ", contains=" + contains +
                '}';
    }
}
